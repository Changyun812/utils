package com.github.changyun812.utils.services

import com.intellij.openapi.project.Project
import com.github.changyun812.utils.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
