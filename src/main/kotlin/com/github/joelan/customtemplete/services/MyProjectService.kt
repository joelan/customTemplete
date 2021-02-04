package com.github.joelan.customtemplete.services

import com.github.joelan.customtemplete.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
