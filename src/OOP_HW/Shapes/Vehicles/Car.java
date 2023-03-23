package OOP_HW.Shapes.Vehicles;

public class Car extends Vehicle{
    private int nrOfSeats;
    public Car (String licensePlate, int nrOfSeats )
    {
        super(licensePlate);
        this.nrOfSeats = nrOfSeats;
    }
    @Override
    public String toString()
    {
        return  "Car{" + super.toString().substring(8,27) + ",numberOfSeats=" + nrOfSeats + "}";
    }

    public static void main(String[] args) {
        Car car = new Car("sss879",4);
        System.out.println(car.toString());

    }
}
