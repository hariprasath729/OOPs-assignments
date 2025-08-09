public class Main {
    public static void main(String[] args) {
        User u1 = new User("Hari", "hari@gmail.com");
        Course c1 = new Course("Java OOP", "Prof. Kumar");

        System.out.println(u1); // calls u1.toString()
        System.out.println(c1); // calls c1.toString()
    }
}

