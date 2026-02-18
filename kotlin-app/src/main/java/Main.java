public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Java!");

        Person person1 = new Person("Иван", 21);
        Person person2 = new Person("Семен", 25);
        System.out.println(person1.hashCode() == person2.hashCode()); // false

    }

}
