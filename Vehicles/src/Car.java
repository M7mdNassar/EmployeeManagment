public class Car extends Vehicle implements Comparable{

    private static int totalCarsMade = 0;
    private String brand;
    private String color;
    private double price;
    private int id = setId();     //Unique


    private int setId(){
        return ++totalCarsMade;
    }

    public Car (){}

    public Car(String name, String brand, String color, double price) {
        super(name);
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {return id;}
    public static int getTotalCarsMade() { return totalCarsMade;}

    @Override
    public String toString() {
        return "****Car Details****" + "\nName : "+getName()+ "\nDate Of Manufacturing : " + getDateOfManufacturing()+
                "\nBrand : " + brand + "\nColor :" + color + "\nPrice : " + price + "\nID : " + id ;
    }

    @Override
    public int compareTo(Object o) {
        Car object = (Car)o;
        if (object.getPrice() > this.getPrice())
            return -1;
        else if (object.getPrice() < this.getPrice())
            return 1;
        else
        return 0;
    }


    public static void main(String[] args) {
       /* Car c = new Car();
        Car c2 = new Car("AMG","Mercedes","Black",150000);
        System.out.println(c);
        System.out.println(c.compareTo(c2)); */
    }



}
