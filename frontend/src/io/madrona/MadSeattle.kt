package io.madrona

import kotlinx.html.div
import react.ReactComponentNoProps
import react.ReactComponentNoState
import react.ReactComponentSpec
import react.dom.ReactDOMBuilder
import react.dom.ReactDOMComponent

class MadSeattle : ReactDOMComponent<ReactComponentNoProps, ReactComponentNoState>() {
    companion object : ReactComponentSpec<MadSeattle, ReactComponentNoProps, ReactComponentNoState>

    init {
        state = ReactComponentNoState()
    }

    override fun ReactDOMBuilder.render() {
        div(classes = "section-seattle") {
            div(classes = "dark_layer seattle") {}
        }
    }
}


