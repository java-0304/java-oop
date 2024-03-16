package dependencyon.abstractclass;

/**
 * 의존성: 추상클래스를 상속받은 자식클래스
 */
public class ABMain{
    public static void main(String[] args) {

        B b = new B("bClass");
        System.out.println(b.bField);
        System.out.println(b.method());

        A a = new B("bClass");
        System.out.println(a.aField);
        System.out.println(a.method());
    }
}
abstract class A {
    String aField;
    public A(){}
    public A(String aField){
        this.aField = aField;
    }
    abstract String method();
}
class B extends A{
    String bField;
    public B(String bField)
    {
        super("Aclass");
        this.bField = bField;
    }
    String method(){
        return "B.bMethod";
    }
}
