package io.madrona

import kotlinx.html.*
import react.ReactComponentNoProps
import react.ReactComponentNoState
import react.ReactComponentSpec
import react.dom.ReactDOMBuilder
import react.dom.ReactDOMComponent

class MadMenu : ReactDOMComponent<ReactComponentNoProps, ReactComponentNoState>() {
    companion object : ReactComponentSpec<MadMenu, ReactComponentNoProps, ReactComponentNoState>

    init {
        state = ReactComponentNoState()
    }

    override fun ReactDOMBuilder.render() {
        div {
            nav(classes = "navbar navbar-inverse navbar-fixed-top") {
                div(classes = "navbar-header") {
                    button(classes = "navbar-toggle collapsed") {
                        attributes.put("type", "button")
                        attributes.put("data-toggle", "collapse")
                        attributes.put("data-target", "#navbar")
                        attributes.put("aria-expanded", "false")
                        attributes.put("aria-controls", "navbar")
                        for (i in 1..3) {
                            span(classes = "icon-bar")
                        }
                    }
                    a(classes = "navbar-brand") {
                        href = "/"
                        + "MADRONA SOFTWARE"
                    }
                }
                div(classes = "collapse navbar-collapse") {
                    id = "navbar"
                    ul(classes = "nav navbar-nav") {
                        li {
                            a(classes = "navbar-brand") {
                                href = "/"
                                + "KAMPALA HACK-A-THON"
                            }
                        }
                    }
                }
            }
        }
    }
}
