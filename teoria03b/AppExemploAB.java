public class AppExemploAB {
    public static void main(String[] args) {
        A var1 = new ExemploAB();
        System.out.println(var1.metodoA());
        System.out.println(((ExemploAB)var1).metodoB());
    }
}