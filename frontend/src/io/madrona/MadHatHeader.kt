package io.madrona

import kotlinx.html.*
import react.ReactComponentNoProps
import react.ReactComponentNoState
import react.ReactComponentSpec
import react.dom.ReactDOMBuilder
import react.dom.ReactDOMComponent

class MadHatHeader : ReactDOMComponent<ReactComponentNoProps, ReactComponentNoState>() {
    companion object : ReactComponentSpec<MadHatHeader, ReactComponentNoProps, ReactComponentNoState>

    init {
        state = ReactComponentNoState()
    }

    override fun ReactDOMBuilder.render() {
        div(classes = "container standard_margin") {
            h1 { +"Kampala, Uganda Hack-A-Thon" }
            div(classes = "row") {
                div(classes = "col-md-4 double_margin_bottom") {
                    h4 { +"Community, Competition, Discovery" }
                    img(classes = "img-responsive") { src = "/images/afwh.jpg" }
                }
                div(classes = "col-md-4 double_margin_bottom") {
                    h4 { +"Team Building" }
                    p {
                        +"""We are exploring the possibility of building a mobile focused, high performance developer team in Kampala, Uganda that is focused on lean & XP practices, continuous improvement, continual delivery, and test driven development. We are hosting a hack-a-thon to be able to engage the developer community and research this idea."""
                    }
                    p {
                        +"Please joing us "
                        strong { +"May 26-28, 2017" }
                        +"at "
                        strong { +"Innovation Village " }
                        +"in Kampala, Uganda - East Africa"
                    }
                }
                div(classes = "col-md-4 double_margin_bottom") {
                    h4 { +"Hack-A-Thon Theme: \"Mobile First\"" }
                    p {
                        +"""Traditionally applications were developed for the desktop and later adapted to mobile as an
                            after thought. Today, that trend has inverted. With 1.2 billion mobile devices, it isn't
                            merely a trend, niche or something in the future. """
                        strong { +"Mobile is the present." }
                    }
                    p {
                        +"The theme of this Hack-A-Thon is &quot;Mobile First&quot;. Lets see what you can build for \"Mobile First\" as an iOS app, Android app or Responsive Web App."
                    }
                    button(classes = "btn btn-danger") {
                        +"HACK-A-THON INTO"
                    }
                }
            }
        }
    }
}