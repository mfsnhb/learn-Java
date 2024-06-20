package class_instance;

public class Main {

    public static void main(String[] args) {

        Person xiaoming = new Person();

        xiaoming.name = "xiaoming";
        xiaoming.age = 18;
        
        Book book = new Book();
        book.name = "HelloWorld";
        book.price = 1.923;

        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);
    }
}