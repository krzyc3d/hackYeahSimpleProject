package tabletka.plus.Entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;

@Entity
@Data
public class Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int age;
    private int weight;
    private int hight;
    private char sex;
    private LocalTime breakfast;
    private LocalTime lunch;
    private LocalTime dinner;

    public Person() {
    }



    public Person(int age, int weight, int hight, char sex, LocalTime breakfast, LocalTime lunch, LocalTime dinner) {

        this.age = age;
        this.weight = weight;
        this.hight = hight;
        this.sex = sex;
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalTime getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(LocalTime breakfast) {
        this.breakfast = breakfast;
    }

    public LocalTime getLunch() {
        return lunch;
    }

    public void setLunch(LocalTime lunch) {
        this.lunch = lunch;
    }

    public LocalTime getDinner() {
        return dinner;
    }

    public void setDinner(LocalTime dinner) {
        this.dinner = dinner;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
