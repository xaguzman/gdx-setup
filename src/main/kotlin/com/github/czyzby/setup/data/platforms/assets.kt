package com.github.czyzby.setup.data.platforms

import com.github.czyzby.setup.data.gradle.GradleFile
import com.github.czyzby.setup.data.project.Project

/**
 * Mock-up platform. Represents assets folder.
 * @author MJ
 */
class Assets : Platform {
    companion object {
        const val ID = "assets"
    }

    override val id = ID
    override val isGraphical = false

    override fun createGradleFile(project: Project): GradleFile =
            throw UnsupportedOperationException("This is a mock-up project with no Gradle file.")

    override fun initiate(project: Project) =
            throw UnsupportedOperationException("This is a mock-up project which should not be initiated.")
}
