package io.madrona

import kotlinx.html.Entities
import kotlinx.html.div
import kotlinx.html.h1
import kotlinx.html.img
import react.RProps
import react.ReactComponentNoState
import react.ReactComponentSpec
import react.dom.ReactDOMBuilder
import react.dom.ReactDOMComponent

class MadHero : ReactDOMComponent<MadHero.Image, ReactComponentNoState>() {
    companion object : ReactComponentSpec<MadHero, Image, ReactComponentNoState>

    init {
        state = ReactComponentNoState()
    }

    override fun ReactDOMBuilder.render() {
        div(classes = "section-hero") {
            div(classes = "dark_layer") {
                div(classes = "container hero-heading") {
                    h1 {
                        Entities.nbsp
                    }
                    img(classes = "centered icon") {
                        src = props.image
                    }
                    h1 {
                        Entities.nbsp
                    }
                }
            }
        }
    }

    class Image(val image: String) : RProps()
}


