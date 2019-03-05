package fr.isima.business

class Game private constructor(private val grid: MutableMap<Point, Case>) {

    fun play(p: Point, state: Case) {
        grid[p] = state
    }


    fun getGrid():MutableMap<Point, Case> {
        return grid
    }


    companion object {

        fun createGrid(width: Int = 7, height: Int = 7): Game {
            val grid = mutableMapOf<Point, Case>()
            for (i in 0..width) {
                for (j in 0..height) {
                    if((i==4 && j ==4) || (i==3 && j==3)){
                        grid[Point(i, j)] = Case.W
                    } else if((i==4 && j ==3) || (i==3 && j==4)){
                        grid[Point(i, j)] = Case.B
                    } else {
                        grid[Point(i, j)] = Case.X
                    }
                }
            }

            return Game(grid = grid)
        }

    }

    fun updateGrid(p: Point, player: String) {
        if(player == "white") {
            grid[p] = Case.W
        }
        else {
            grid[p] = Case.B
        }
    }

}

data class Point(val x: Int, val y: Int)

enum class Case { X, B, W, O }