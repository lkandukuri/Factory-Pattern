public class FactoryPatternTest {

   public static void main(String[] args) {
      VehicleFactory vehicleFactory = new VehicleFactory();

      //get an object of Car and call its weight method.
      Vehicle vehicle1 = vehicleFactory.getVehicle("CAR");

      //call weight method of Car
      vehicle1.weight();

      //get an object of Truck and call its weight method.
      Vehicle vehicle2 = vehicleFactory.getVehicle("TRUCK");

      //call weight method of truck
      vehicle2.weight();

      //get an object of Bicycle and call its weight method.
      Vehicle vehicle3 = vehicleFactory.getVehicle("BICYCLE");

      //call weight method of bicycle
      vehicle3.weight();
   }
}