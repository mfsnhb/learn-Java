package class_instance;

public class Main {

    public static void main(String[] args) {

        // 类、成员与方法
        System.out.println("类、成员与方法：");
        City city1 = new City();
        City city2 = new City();    
        City city3 = new City();
        
        String [] names = {"New York", "Los Angeles", "Chicago"};
        double [] latitudes = {40.7128, 34.0522, 41.8781};
        double [] longitudes = {74.0060, 118.2437, 87.6298};
        
        City [] citys = {city1, city2, city3};

        for(int i = 0; i < citys.length; i++) {
            citys[i].setName(names[i]);
            citys[i].setLatitude(latitudes[i]);
            citys[i].setLongitude(longitudes[i]);

            System.out.println("city name: " + citys[i].getName() + " latitude: " + citys[i].getLatitude() + " longitude: " + citys[i].getLongitude());
        }   

        // 传参
        System.out.println("传参：");

        System.out.println("1. 基本类型传参");

        City city4 = new City();

        double latitude = 39.9042;
        city4.setLatitude(latitude);
        System.out.println("city latitude: " + city4.getLatitude());

        latitude = 31.2304;
        // 必须重新set实例内成员的值才能更改
        // city4.setLatitude(latitude);
        System.out.println("city latitude: " + city4.getLatitude());

        // 引用传参
        System.out.println("2.引用类型传参：");

        Group group = new Group();

        String[] city_names = new String[] {"New York", "Los Angeles", "Chicago"};
        group.setNames(city_names);
        names = group.getNames();
        System.out.println("group names: " + names[0] + " " + names[1] + " " + names[2]);

        city_names[0] = "Bei Jing"; 
        city_names[1] = "Nan Jing";
        // 有没有这行结果一样，因为传递的是引用
        // group.setNames(city_names);
        names = group.getNames();
        System.out.println("group names: " + names[0] + " " + names[1] + " " + names[2]);

        System.out.println("2.1：特殊的引用类型String");

        String name = "Bei Jing";
        city4.setName(name);
        System.out.println("city name: " + city4.getName());

        name = "Shang Hai";
        // 同上
        // city4.setName(name);
        System.out.println("city name: " + city4.getName());

        System.out.println("结果没变的原因是String不可变，重新赋值会改变原来String的内存位置，新增一个，而不是在原来的内存位置上更改。");

    }
}

class City {
    private String name;
    private double latitude;
    private double longitude;

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
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

class Group {
    private String[] names;

    public void setNames(String[] names) {
        this.names = names;
    }

    public String[] getNames() {
        return names;
    }
}