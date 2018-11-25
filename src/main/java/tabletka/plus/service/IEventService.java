package tabletka.plus.service;

import tabletka.plus.Entities.Person;
import tabletka.plus.Repository.IPersonRepository;

import java.time.LocalTime;

public interface IEventService {

    boolean isNotification(LocalTime time, Person person, IPersonRepository iPersonRepository);
}
