package io.madrona

import kotlinx.html.Entities
import kotlinx.html.div
import kotlinx.html.h1
import react.ReactComponentNoProps
import react.ReactComponentNoState
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

class Application : ReactDOMComponent<ReactComponentNoProps, ReactComponentNoState>() {
    companion object : ReactComponentSpec<Application, ReactComponentNoProps, ReactComponentNoState>

    init {
        state = ReactComponentNoState()
    }

    override fun ReactDOMBuilder.render() {
        div {
            MadMenu {}
            MadHero(props = MadHero.Image("/images/madrona_logo-nq8.png"))
            MadHatHeader {}
            h1 { Entities.nbsp }
            MadSeattle {}
            MadAbout {}
            MadFooter {}
        }
    }
}
