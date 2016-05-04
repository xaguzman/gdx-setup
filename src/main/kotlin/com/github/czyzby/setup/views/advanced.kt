package com.github.czyzby.setup.views

import com.badlogic.gdx.scenes.scene2d.ui.Button
import com.github.czyzby.lml.annotation.LmlActor
import com.kotcrab.vis.ui.widget.VisSelectBox
import com.kotcrab.vis.ui.widget.VisTextField
import com.kotcrab.vis.ui.widget.spinner.Spinner

/**
 * Stores data from "advanced" tab.
 * @author MJ
 */
class AdvancedData {
    @LmlActor("version") private lateinit var versionField: VisTextField
    @LmlActor("gdxVersion") private lateinit var gdxVersionField: VisTextField
    @LmlActor("javaVersion") private lateinit var javaVersionField: Spinner
    @LmlActor("sdkVersion") private lateinit var sdkVersionField: Spinner
    @LmlActor("toolsVersion") private lateinit var toolsVersionField: VisTextField
    @LmlActor("gwtVersion") private lateinit var gwtVersionField: VisSelectBox<String>
    @LmlActor("gwtPlugin") private lateinit var gwtPluginVersionField: VisTextField
    @LmlActor("serverJavaVersion") private lateinit var serverJavaVersionField: Spinner
    @LmlActor("generateSkin") private lateinit var generateSkinButton: Button

    val version: String
        get() = versionField.text

    val gdxVersion: String
        get() = gdxVersionField.text

    val javaVersion: String
        get() = javaVersionField.model.text

    val androidSdkVersion: String
        get() = sdkVersionField.model.text

    val androidToolsVersion: String
        get() = toolsVersionField.text

    val gwtVersion: String
        get() = gwtVersionField.selected

    val gwtPluginVersion: String
        get() = gwtPluginVersionField.text

    val serverJavaVersion: String
        get() = serverJavaVersionField.model.text

    val generateSkin: Boolean
        get() = generateSkinButton.isChecked

    fun forceSkinGeneration() {
        generateSkinButton.isChecked = true
    }
}
