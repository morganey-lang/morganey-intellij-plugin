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

package me.rexim.morganey.plugin

import com.intellij.ide.IdeEventQueue
import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.components.ApplicationComponent
import com.intellij.openapi.fileTypes.impl.FileTypeManagerImpl
import me.rexim.morganey.plugin.actions.InitialisationAction
import me.rexim.morganey.plugin.Constants.INITIALISATION_ACTION_KEY
import me.rexim.morganey.plugin.filetype.MorganeyFileType

/**
 * Created by thoma on 19/09/2016.
 */
class PluginRegistration : ApplicationComponent{
    val actionManager = ActionManager.getInstance()
    val init = InitialisationAction()
    val fileManager = FileTypeManagerImpl.getInstance()
    val eventQueue = IdeEventQueue.getInstance()

    override fun getComponentName() : String {
        return "Morganey-For-Intellij"
    }

    override fun disposeComponent() {
        println("Plugin Unloaded: ${this.componentName}")
        actionManager.unregisterAction(INITIALISATION_ACTION_KEY)
    }

    override fun initComponent() {
        println("Plugin Loaded: ${this.componentName}")
        actionManager.registerAction(INITIALISATION_ACTION_KEY,InitialisationAction())
        fileManager.registerFileType(MorganeyFileType(), *arrayOf("mgn"))

    }
}
