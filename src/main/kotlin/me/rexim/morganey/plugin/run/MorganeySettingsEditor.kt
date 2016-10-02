/*
    The MIT License (MIT)
    
    morganey-intellij-plugin Copyright (c) 2016 thoma
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
*/

package me.rexim.morganey.plugin.run

import com.intellij.openapi.options.ConfigurationException
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.ui.ComponentWithBrowseButton
import com.intellij.openapi.ui.LabeledComponent
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.openapi.util.Factory
import javax.swing.JComponent
import javax.swing.JPanel

/**
 * Created by thoma on 20/09/2016.
 */
class MorganeySettingsEditor : SettingsEditor<MorganeyRunConfiguration> {
    private var myPanel : JPanel? = null
    private var myMainClass : LabeledComponent<ComponentWithBrowseButton<TextFieldWithBrowseButton>>? = null
    constructor() : super(){
        createUIComponents()
    }
    constructor(settingsFactory : Factory<MorganeyRunConfiguration>?) : super(settingsFactory){
        createUIComponents()
    }
    constructor(settingsFactory : (() -> MorganeyRunConfiguration)?) : super(settingsFactory){
        createUIComponents()
    }
    @Throws(ConfigurationException::class)
    override fun applyEditorTo(p0 : MorganeyRunConfiguration) {

    }

    override fun createEditor() : JComponent {
        if(myPanel == null)
            createUIComponents()
        return myPanel!!
    }

    override fun resetEditorFrom(p0 : MorganeyRunConfiguration) {

    }

    private fun createUIComponents() : Unit{
        myPanel = JPanel()
        myMainClass = LabeledComponent<ComponentWithBrowseButton<TextFieldWithBrowseButton>>()
        myMainClass?.component = ComponentWithBrowseButton<TextFieldWithBrowseButton>(TextFieldWithBrowseButton(), { e ->
            println("Browse Button Clicked")
        })
//        myPanel?.add(myMainClass)
//
   }
}