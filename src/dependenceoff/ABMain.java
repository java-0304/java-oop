package dependenceoff;

/**
 * A클래스와 B 클래스는 의존성 없음
 */
public class ABMain{
    public static void main(String[] args) {
        A a = new A("Aclass");
        System.out.println(a.aField );
        System.out.println(a.aMethod());

        B b = new B("Bclass");
        System.out.println(b.bField);
        System.out.println(b.bMethod());
    }
}
class A {
    String aField;
    public A(String aField){
        this.aField = aField;
    }
    String aMethod(){
        return "A.aMethod";
    }
}
class B{
    String bField;
    public B(String bField){
        this.bField = bField;
    }
    String bMethod(){
        return "B.bMethod";
    }
}

