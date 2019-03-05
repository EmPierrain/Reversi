package fr.isima.controllers


import fr.isima.business.Game
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController

class GameRestController {

    @RequestMapping("/rest/gameUpdate")
    @GetMapping("/rest/gameUpdate")
    fun updateGame(@RequestParam(name = "caseId") caseId: String, @RequestParam(name = "player") player: String,  @RequestParam(name = "gameId") gameId: String) {
        val pos = caseId.split("_")
        val point = Point(pos[1].toInt(), pos[0].toInt())
        //Get game referenced by gameId
        //game.updateGrid(point, player)
        print("Hello $player you tried to play on tile $caseId. Game $gameId")
    }

}

data class Point(val x: Int, val y: Int)