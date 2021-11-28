public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Felix", "Tegal");
//        person1.name = "Felix Yunianto";
//        person1.address = "Tegal";
////        person1.country = "Amerika";


        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Ziyan");

        Person person2 = new Person("Ziyan");
        
        Person person3;
        person3 = new Person();
        person3.name = "Siapa Hayo";

        // Jika belum di assign maka akan null
        person3.sayHello("World");

    }
}
