package main.task1;
import java.util.Date;

/*Firstly, adding "final" to class and fields to make them immutable
* Moreover, It was necessary to use getTime() function for Date "birthday"
*
* Getters for "name" and "birthday" allow usage of these fields by external interfaces  */

/**
 * Person Class
 * fully immutable class, with a possibility to use of java,util.String ang
 * java.util.Date by external interface.
 */
public final class Person {
    private final String name;
    private final Date birthday;

    /**
    * Person Class constructor.
    */
    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = new Date(birthday.getTime());
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return new Date(birthday.getTime());
    }
}