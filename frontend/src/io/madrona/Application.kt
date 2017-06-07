package io.madrona

import kotlinx.html.div
import react.RState
import react.ReactComponentNoProps
import react.ReactComponentSpec
import react.dom.ReactDOM
import react.dom.ReactDOMBuilder
import react.dom.ReactDOMComponent
import react.dom.render
import kotlin.browser.document

fun main(args: Array<String>) {
    runtime.wrappers.require("style.scss")

    ReactDOM.render(document.getElementById("content")) {
        div {
            Application {}
        }
    }
}

class Application : ReactDOMComponent<ReactComponentNoProps, ApplicationPageState>() {
    companion object : ReactComponentSpec<Application, ReactComponentNoProps, ApplicationPageState>

    init {
        state = ApplicationPageState(MainView.Home)
    }

    override fun componentWillUnmount() {
        super.componentWillUnmount()
    }

    override fun ReactDOMBuilder.render() {
        div {
            + "Hello Kotlin and React from Madrona.io"
        }
    }
}

enum class MainView {
    Home
}

class ApplicationPageState(var selected: MainView) : RState
