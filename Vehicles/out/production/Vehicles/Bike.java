public class Bike extends Vehicle implements Comparable<Bike> , Cloneable{
    private static int totalBikesMade = 0;
    private int gears ;
    private int id = setId();     //Unique

    private int setId(){
        return ++totalBikesMade;
    }

    public Bike(){}

    public Bike(String name, int gears) {
        super(name);
        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "****Car Details****" + "\nName : "+getName()+ "\nDate Of Manufacturing : " + getDateOfManufacturing()
                + "\ngears : " + gears + "\nID : " + id+"\n" ;
    }

    public int compareTo(Bike b){

        return Integer.compare(this.getGears() , b.getGears());
    }

    public Bike clone() throws CloneNotSupportedException {
        return (Bike)super.clone(); // call clone in Object class and make casting :)
    }


}
