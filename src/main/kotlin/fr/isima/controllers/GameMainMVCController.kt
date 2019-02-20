package fr.isima.controllers

import fr.isima.business.Game
import fr.isima.views.toCompleteHtml
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/main")
class GameMainMVCController {

    @GetMapping
    @ResponseBody
    fun main() = Game.createGrid().toCompleteHtml()

}
