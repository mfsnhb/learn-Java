package class_instance;

public class Main {

    public static void main(String[] args) {
        City city1 = new City();
        City city2 = new City();    
        City city3 = new City();
        
        String [] names = {"New York", "Los Angeles", "Chicago"};
        double [] latitudes = {40.7128, 34.0522, 41.8781};
        double [] longitudes = {74.0060, 118.2437, 87.6298};

        City [] citys = {city1, city2, city3};

        for(int i = 0; i < citys.length; i++) {
            citys[i].name = names[i];
            citys[i].latitude = latitudes[i];
            citys[i].longitude = longitudes[i];

            System.out.println("city name: " + citys[i].name + " latitude:" + citys[i].latitude + " longitude:" + citys[i].longitude);
        }   

    }
}

class City {
    public String name;
    public double latitude;
    public double longitude;
}

class Book {
    public String name;
    public String author;
    public int no;
    public String compress;
    public double price;
    
}

class Person {

    public String name;
    public int age;
    
}