package com.morganey.actions

import com.intellij.ide.DataManager
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.actionSystem.DataConstants
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.ui.Messages
import com.intellij.openapi.ui.popup.JBPopupFactory
import com.intellij.openapi.util.Disposer
import com.intellij.openapi.util.TextRange
import com.morganey.ParseTermScala
import me.rexim.morganey.syntax.LambdaParser
import java.awt.Dimension
import java.awt.Font
import java.awt.GridLayout
import javax.swing.JLabel
import javax.swing.JPanel

/**
 * Created by thoma on 30/09/2016.
 */
class ViewRawTermAction : AnAction() {

    companion object Interface{
        val panel = JPanel(GridLayout(1,1))
        val field = JLabel("Raw Term: ")
    }
    override fun actionPerformed(e : AnActionEvent) {
        val disposer = Disposer.newDisposable()
        val editor = DataManager.getInstance().dataContext.getData(DataConstants.EDITOR) as Editor
        val document = editor.document
        val line = editor.caretModel.visualPosition.getLine()
        val startOffset = document.getLineStartOffset(line)
        val endOffset = document.getLineEndOffset(line)
        val text = document.getText(TextRange(startOffset, endOffset))
        val raw = "\n\n" + ParseTermScala.parse(text).get().toString() + "\n\n"
        val popupFactory = JBPopupFactory.getInstance()
        field.text += raw
        val font = field.font.deriveFont(16.0f)
        field.font = font
        panel.add(field)
        val popup = popupFactory.createComponentPopupBuilder(panel, field).setTitle("Raw Term")
                .setFocusable(true)
                .setRequestFocus(true)
                .setMayBeParent(true)
                .setMovable(true)
                .setMinSize(Dimension(75,75))
                .createPopup();
        Disposer.register(popup, disposer)
        val project = e.getRequiredData(CommonDataKeys.PROJECT)
        popup.showCenteredInCurrentWindow(project)
    }
}
