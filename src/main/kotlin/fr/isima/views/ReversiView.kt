package fr.isima.views

import fr.isima.business.Case
import fr.isima.business.Game
import fr.isima.business.Point
import kotlinx.html.*

fun Game.toPartialHtml() = StringBuilder().partialDiv { toPartialHtml(this@toPartialHtml) }.toString()

fun DIV.toPartialHtml(game: Game) = game.apply {
    div {
        classes = setOf("container")
        div {
            table {
                div {
                    classes += "grid-container"


                    var grid = getGrid()
                    for (i in 0..7) {
                        for (j in 0..7) {
                            div{
                                classes += "tile"
                                id = i.toString() + "_" + j.toString()
                                if(grid[Point(i, j)] == Case.B){
                                    classes += "black"
                                }
                                else if(grid[Point(i, j)] == Case.W){
                                    classes += "white"
                                }
                                else{
                                    classes += "neutral"
                                }

                                + grid[Point(i, j)].toString()

                            }
                        }
                    }
                }
            }

        }
    }
}
