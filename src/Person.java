class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // Constructor
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    // Constructor Overloading
    Person(String paramName){
//        name = paramName;
        this(paramName, null);
    }

    Person(){

    }


    // Method
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is "+ name);
    }
}
