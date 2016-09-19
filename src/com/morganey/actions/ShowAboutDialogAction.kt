package com.morganey.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.morganey.dialogs.AboutDialog

/**
 * Created by thoma on 19/09/2016.
 */
class ShowAboutDialogAction : AnAction() {
    var form : AboutDialog? = null
    var itr : Long = 0L
    companion object ProjectInfo{
        var project : Project? = null
        var projectDirectory : String? = ""
        var isOpen : Boolean? = false
    }
    override fun actionPerformed(e : AnActionEvent) {
        project = InitialisationAction.project
        projectDirectory = InitialisationAction.project?.basePath
        isOpen = InitialisationAction.project?.isOpen
        form = AboutDialog()
    }

    override fun update(e : AnActionEvent?) {
        super.update(e)
        if(form != null){
            form?.repaint(itr,0,0,form?.width!!,form?.height!!)
            itr++
        }
        e?.presentation?.isEnabledAndVisible = true
    }
}
