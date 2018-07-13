package pl.javastart.srpingmvcintro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController {

    @ResponseBody
    @RequestMapping("/abc")
    public String asdasdasdsasd() {
        System.out.println("Zadziałało!");

        return "Cześć!";
    }

}
