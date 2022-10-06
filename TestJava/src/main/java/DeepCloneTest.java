import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.SerializationUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class DeepCloneTest {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, CloneNotSupportedException {


        Person person = new Person();

        ArrayList<String> f = new ArrayList<>();
        f.add("1");
        f.add("2");
        person.setName("person");
        person.setFriends(f);

        System.out.println(person);

        Person clone = new Person();

        // beanutils 浅拷贝
        BeanUtils.copyProperties(clone,person);

        System.out.println(clone);
        clone.setName("clone");

        System.out.println(clone);

        List<String> friends = clone.getFriends();
        friends.add("3");
        System.out.println(person);

        // clone 深拷贝
        Person cloneImpl = person.clone();
        System.out.println(cloneImpl);
        cloneImpl.getFriends().add("222");
        System.out.println(person);
        System.out.println(cloneImpl);

        // SerializationUtils 深拷贝
        Person serial = SerializationUtils.clone(person);
        System.out.println(serial);
        serial.getFriends().add("333");
        System.out.println(person);
        System.out.println(serial);

        // json 深拷贝

    }


}

