package tabletka.plus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


    @Controller
    @RequestMapping("/tabletka")
    public class TabletkaPlus {

        @GetMapping
        public String getDashboardPage(Model model) {
            model.addAttribute("machine4x2netProduction", 1);
            return "tabletka.html";
        }

}
