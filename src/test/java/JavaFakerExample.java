import com.github.javafaker.Faker;

public class JavaFakerExample {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String fullname = faker.name().fullName();
        String firstName = faker.name().firstName();
        String dogName = faker.dog().name();

        System.out.println("Full name: " + fullname);
        System.out.println("First name: " + firstName);
        System.out.println("Dog name: " + dogName);
    }
}
