public class InheritTest extends Inherit{

    private String name = "aa";

    public static void main(String[] args) {
        InheritTest inheritTest = new InheritTest();
        String name = inheritTest.getName();
        System.out.println(name);
    }

}

class Inherit implements A,B{

    private String name;


    @Override
    public String getName() {
        return name;
    }
}


interface A {
    String getName();
}
interface B {
    String getName();
}