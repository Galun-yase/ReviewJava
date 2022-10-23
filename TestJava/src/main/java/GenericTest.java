import java.util.ArrayList;
import java.util.List;

public class GenericTest implements Parent<String> {
    @Override
    public void set(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        GenericTest genericTest = new GenericTest();
        genericTest.set("a");


        List<? extends AA> list1 = new ArrayList<>();
        list1.add(null);//add 特例
        AA aa = list1.get(0);

        List<? super BB> list2 = new ArrayList<>();
        list2.add(new CC());
        Object object = list2.get(0);//get 特例


    }
}

interface Parent<T> {
    public void set(T t);
}

class AA {
}

class BB extends AA {
}

class CC extends BB {
}
