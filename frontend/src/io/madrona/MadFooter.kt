package io.madrona

import kotlinx.html.div
import kotlinx.html.p
import react.ReactComponentNoProps
import react.ReactComponentNoState
import react.ReactComponentSpec
import react.dom.ReactDOMBuilder
import react.dom.ReactDOMComponent

class MadFooter : ReactDOMComponent<ReactComponentNoProps, ReactComponentNoState>() {
    companion object : ReactComponentSpec<MadFooter, ReactComponentNoProps, ReactComponentNoState>

    init {
        state = ReactComponentNoState()
    }

    override fun ReactDOMBuilder.render() {
        val year: String = js("new Date().getFullYear()")
        div(classes = "mad_footer") {
            div(classes = "dark_layer") {
                div(classes = "container") {
                    p {
                        + "© $year Madrona Software"
                    }
                }
            }
        }
    }
}