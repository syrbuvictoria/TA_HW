package OOP_HW.Shapes.Vehicles;

public class Vehicle {
    private String licensePlate;
    public Vehicle()
    {}
    public Vehicle (String licensePlate)
    {
        this.licensePlate = licensePlate;
    }
    @Override
    public String toString(){
        return  "Vehicle{licensePlate=" + licensePlate + "}";
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("sss879");
        System.out.println(vehicle.toString());
    }
}
