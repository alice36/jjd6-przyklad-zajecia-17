package pl.javastart.srpingmvcintro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Controller
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/users")
    @ResponseBody
    public String users() {
        List<User> users = userRepository.getUsers();

        String result  = "";

        for (User user : users) {
            result += user.toString() + "<br>";
        }
        return result;
    }

    @RequestMapping("/add")
    public String addUser(HttpServletRequest request) {
        String imie = request.getParameter("imie");
        String nazwisko = request.getParameter("nazwisko");
        String wiek = request.getParameter("wiek");

        User user = new User(imie, nazwisko, Integer.parseInt(wiek));
        userRepository.addUser(user);

        return "redirect:/success";
    }

    @RequestMapping("/success")
    public String success() {
        return "sukces.html";
    }
}
