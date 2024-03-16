package dependencyon.interfac;

/**
 * 인터페이스 : implements 구현에 의한 의존성
 */
public class ABMain {
    public static void main(String[] args) {
        B b = new B("classB");
        System.out.println(b.bField);
        System.out.println(b.method());
        System.out.println(b.FIELD_NAME);
    }
}

interface A {
    final static String FIELD_NAME ="FIELD_NAME";
    String method();
}
class B implements A{
    public String bField;
    public B(String bField)
    {
        this.bField = bField;
    }

    @Override
    public String method() {
        return "Bmethod() overriding";
    }
}
