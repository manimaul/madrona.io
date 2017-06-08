package io.madrona

import kotlinx.html.*
import react.ReactComponentNoProps
import react.ReactComponentNoState
import react.ReactComponentSpec
import react.dom.ReactDOMBuilder
import react.dom.ReactDOMComponent

class MadAbout : ReactDOMComponent<ReactComponentNoProps, ReactComponentNoState>() {
    companion object : ReactComponentSpec<MadAbout, ReactComponentNoProps, ReactComponentNoState>

    init {
        state = ReactComponentNoState()
    }

    override fun ReactDOMBuilder.render() {
        div(classes = "container standard_margin") {
            h1 {
                + "We are a creative software studio in Seattle, Washington."
            }
            div(classes = "row") {
                div(classes = "col-md-6 double_margin_bottom") {
                    h4 {
                        + "Mobile and Cross Platform Software"
                    }
                    p {
                        + """Madrona Software has been creating software since 2008. We have our roots in a mobile, cross
                            platform and GIS. Mobile and responsive web is where we started, not merely where
                            we've landed. We are pioneers of this brave new mobility centered digital frontier. Let us
                            help you accomplish your goals as you set out to harness the power of digital mobility.
                          """
                    }
                }
                div(classes = "col-md-6 double_margin_bottom") {
                    h4 {
                        + "GIS Software"
                    }
                    p {
                        + """Madrona Software got it's start creating geographic information system (GIS) and navigation
                            software. GIS is such an important aspect of of everyone's life as it lets us analyze,
                            visualize, question, and interpret data to understand relationships, patterns, and trends
                            around us.
                          """
                    }
                }
            }
        }
    }
}


