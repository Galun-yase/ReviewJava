import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_INPeer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class<Singleton> singletonClass = Singleton.class;
        Field[] declaredFields = singletonClass.getDeclaredFields();
        Method[] declaredMethods = singletonClass.getDeclaredMethods();

        Arrays.asList(declaredFields).forEach(f -> System.out.println(f.getName()));
        Arrays.asList(declaredMethods).forEach(m -> System.out.println(m.getName()));

        // 反射破坏单例
        Singleton singleton = Singleton.getSingleton();

        Constructor<Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);


        Singleton singleton1 = declaredConstructor.newInstance();

        if (singleton == singleton1){
            System.out.println(1);
        }

    }


}



