package dependencyon.inhertance;

/**
 * 의존성 : 상속에 의한 의존성
 */
public class ABMain{
    public static void main(String[] args) {

        B b = new B("bClass");
        System.out.println(b.bField);
        System.out.println(b.bMethod());

        System.out.println(b.aField);
        System.out.println(b.aMethod());
    }
}
class A {
    String aField;
    public A(){}
    public A(String aField){
        this.aField = aField;
    }
    String aMethod(){
        return "A.aMethod";
    }
}
class B extends A{
    String bField;
    public B(String bField)
    {
        super("Aclass");
        this.bField = bField;
    }
    String bMethod(){
        return "B.bMethod";
    }
}