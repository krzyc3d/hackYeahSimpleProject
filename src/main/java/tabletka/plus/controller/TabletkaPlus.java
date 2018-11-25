package tabletka.plus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import tabletka.plus.Entities.Person;
import tabletka.plus.Repository.IPersonRepository;
import tabletka.plus.service.EventService;

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


//    @GetMapping
//    public String getDashboardPage(Model model) {
//           model.addAttribute("timeNotify", 1);
//        return "tabletka.html";
//    }
    @GetMapping
    public String message(Person person){
        if (eventService.isNotification(LocalTime.now(), person)){
            return "notification";
        }
        return "tabletka.html";
    }

}
