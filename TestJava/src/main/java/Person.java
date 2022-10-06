import java.io.Serializable;
import java.util.ArrayList;

public class Person  implements Cloneable, Serializable {

    private String name;

    private ArrayList<String> friends;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<String> friends) {
        this.friends = friends;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", friends=" + friends +
                '}';
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {

        Person person = (Person)super.clone();
        person.setFriends((ArrayList<String>)friends.clone());
        return person;
    }
}
