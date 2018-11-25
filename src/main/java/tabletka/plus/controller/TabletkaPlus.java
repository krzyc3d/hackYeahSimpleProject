package tabletka.plus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tabletka.plus.Repository.IPersonRepository;
import tabletka.plus.service.EventService;

import java.time.LocalDate;
import java.time.LocalTime;


@Controller

    @RequestMapping("/tabletka")
    public class TabletkaPlus {

        private final EventService eventService;

        @Autowired
        private IPersonRepository iPersonRepository;

    public TabletkaPlus(EventService eventService) {
        this.eventService = eventService;
    }


    @GetMapping
        public String getDashboardPage(Model model) {
        model.addAttribute("age", 25);
        model.addAttribute("breakfastTime", LocalTime.of(8,0));
        model.addAttribute("lunchTime", LocalTime.of(13,0));
        model.addAttribute("dinnerTime", LocalTime.of(18,0));
            return "tabletka.html";
        }

    @GetMapping("/notification")
    public String notifyUser(Model model) {
        model.addAttribute("age", 25);
        model.addAttribute("breakfastTime", LocalTime.of(8,0));
        model.addAttribute("lunchTime", LocalTime.of(13,0));
        model.addAttribute("dinnerTime", LocalTime.of(18,0));
        return "notification.html";
    }

}
