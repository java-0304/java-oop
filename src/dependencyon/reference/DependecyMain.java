package dependencyon.reference;

/**
 * 의존성 : 상호참조
 */
public class DependecyMain {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.setA(b);
        b.setB(a);
        System.out.println(a + "\t" + b);
        System.out.println(a.setA(b) + "\t"+ b.setB(a));
    }
}
class A{
    private  B b;
    public B setA(B b){
        this.b = b;
        return b;
    }
}
class B{
    private A a;

    public A setB(A a) {
        this.a = a;
        return a;
    }
}
