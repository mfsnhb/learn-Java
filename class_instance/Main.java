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

        // 构造函数测试
        System.out.println("构造函数测试：");
        City city5 = new City("Shang Hai", 31.2304, 121.4737);
        System.out.println("city name: " + city5.getName() + " latitude: " + city5.getLatitude() + " longitude: " + city5.getLongitude());

        City city6 = new City("Bei Jing");
        System.out.println("city name: " + city6.getName() + " latitude: " + city6.getLatitude() + " longitude: " + city6.getLongitude());

        City city7 = new City();
        System.out.println("city name: " + city7.getName() + " latitude: " + city7.getLatitude() + " longitude: " + city7.getLongitude());

        // 重载测试
        System.out.println("重载：");
        City city8 = new City();

        city8.setLocation();
        System.out.println("city latitude: " + city8.getLatitude() + " longitude: " + city8.getLongitude());

        city8.setLocation(31.2304);
        System.out.println("city latitude: " + city8.getLatitude() + " longitude: " + city8.getLongitude());

        city8.setLocation(31.2304, 121.4737);
        System.out.println("city latitude: " + city8.getLatitude() + " longitude: " + city8.getLongitude());
    }
}

class City {
    private String name;
    private double latitude;
    private double longitude;

    // 添加构造函数

    public City(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }  

    public City(String name) {
        this.name = name;
        this.latitude = 0.0;
        this.longitude = 0.0;

        // this(name, 0.0, 0.0);
    }

    public City() {
        this.name = "Unamed";
        this.latitude = 0.0;
        this.longitude = 0.0;

        // this("Uname", 0.0, 0.0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    // 重载
    public void setLocation() {
        this.latitude = 0.0;
        this.longitude = 0.0;
    }

    public void setLocation(double latitude) {
        this.latitude = latitude;
        this.longitude = 0.0;
        System.out.println("缺少维度");
    }

    public void setLocation(double latitude, double longitude) {
        this.latitude = latitude;
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

class Group {
    private String[] names;

    public void setNames(String[] names) {
        this.names = names;
    }

    public String[] getNames() {
        return names;
    }
}