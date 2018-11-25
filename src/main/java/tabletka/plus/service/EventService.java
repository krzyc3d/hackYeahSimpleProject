package tabletka.plus.service;

import org.springframework.stereotype.Service;
import tabletka.plus.Entities.Person;
import tabletka.plus.Repository.IPersonRepository;

import java.time.LocalTime;

@Service
public class EventService implements IEventService {


    @Override
    public boolean isNotification(LocalTime time, Person person, IPersonRepository iPersonRepository) {


        if (time==person.getBreakfast() || time== person.getDinner() || time==person.getLunch()){
            return true;
        }
        return false;
    }
}
