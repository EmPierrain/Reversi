package fr.isima.views

import fr.isima.business.Game
import kotlinx.html.*


fun Game.toCompleteHtml() = html {
    head { imports() }
    body {
        div {
            classes += setOf("container")
            nav {
                classes += setOf("navbar", "navbar-default")
                div {
                    classes += setOf("container-fluid")
                    div {
                        classes += setOf("navbar-header")
                        button {
                            classes += setOf("navbar-toggle", "collapsed")
                            attributes["data-toogle"] = "collapse"
                            attributes["data-target"] = "#bs-example-navbar-collapse-1"
                            span {
                                classes += setOf("sr-only")
                                +"Toggle navigation"
                            }
                            span { classes += setOf("icon-bar") }
                            span { classes += setOf("icon-bar") }
                        }
                        a {
                            classes += setOf("navbar-brand")
                            href = "#"
                            +"Reversi"
                        }
                    }
                    div {
                        id = "bs-example-navbar-collapse-1"
                        classes += setOf("collapse", "navbar-collapse")
                        ul {
                            classes += setOf("nav", "navbar-nav")
                            li {
                                classes += setOf("active")
                                a {
                                    href = "#"
                                    id = "game-link"
                                    classes += setOf("action-link")
                                    +"Game"
                                    span {
                                        classes += setOf("sr-only")
                                        +("selectionne")
                                    }

                                }
                            }
                            li {
                                a {
                                    href = "#"
                                    classes += setOf("action-link")
                                    attributes["alt"] = "/stats"
                                    +"Stats"
                                }
                            }
                        }
                        ul {
                            classes += setOf("nav", "navbar-nav", "navbar-right")
                            li {
                                a {
                                    href = "login?logout"
                                    +"Logout"
                                }
                            }
                        }
                    }
                }
            }
            div {
                id = "content-displayed"
                toPartialHtml(this@toCompleteHtml)
            }
            input(type = InputType.hidden) {
                id = "last-displayed-quote"
                value = "1"
            }
            input(type = InputType.hidden) {
                id = "save-unquoted-url"
                value = "/main/"
            }
            script {
                type = "text/javascript"
                src = "/resources/js/main-menu.js"
            }
        }

    }
}
