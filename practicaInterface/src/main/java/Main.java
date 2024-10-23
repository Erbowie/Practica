public class Main {
    public static void main(String[] args) {
        var user = new User(new Multilplicacion());
        System.out.println(user.executeCalculo(5,5));
        user.setCalculo(new Suma());
        System.out.println(user.executeCalculo(5,5));
    }
}
