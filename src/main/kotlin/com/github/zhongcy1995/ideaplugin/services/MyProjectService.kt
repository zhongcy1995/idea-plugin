package com.github.zhongcy1995.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.zhongcy1995.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
