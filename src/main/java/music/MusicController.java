package music;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/music")//единая точка входа
public class MusicController {

    @GetMapping("/classicMusic") //по новому формату Get запрос
    public String playClassicMusic(){
        return "classic_music";
    }

    @GetMapping("/popMusic") //по новому формату Get запрос
    public String playPopMusic(){
        return "pop_music";
    }

    @GetMapping("/jazMusic") //по новому формату Get запрос
    public String playJazMusic(){
        return "jaz_music";
    }


}
