import java.time.LocalDate;

public class Vehicle {
    private static int totalVehiclesInstantiated = 0;
    private String name;
    private LocalDate dateOfManufacturing ;
    private int id = setId();     //Unique

    private int setId(){
        return ++totalVehiclesInstantiated;
    }

    public Vehicle() {}

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle(String name, LocalDate dateOfManufacturing) {
        this.name = name;
        this.dateOfManufacturing = dateOfManufacturing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfManufacturing() {
        return dateOfManufacturing;
    }

    public void setDateOfManufacturing(LocalDate dateOfManufacturing) {
        this.dateOfManufacturing = dateOfManufacturing;
    }

    public int getId() {
        return id;
    }

    public int getTotalVehiclesInstantiated() {
        return totalVehiclesInstantiated;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", dateOfManufacturing=" + dateOfManufacturing +
                ", id=" + id +
                '}';
    }
}
