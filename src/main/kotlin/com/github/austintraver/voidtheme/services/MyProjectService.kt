package com.github.austintraver.voidtheme.services

import com.github.austintraver.voidtheme.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
