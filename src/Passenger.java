public abstract class Passenger {

 //   Passenger (parent class) has: name, ID, reserved Car object, trip cost. Also,
//    it has an abstract function that takes a car object to reserve it to the passenger
//    and compute the trip cost and a function that should be overridden to display
//    their information along with the car code and route price .

    private String name;
    private String id;
    private Car reservedCar;
    private double trip_cost;

    public Passenger(String name, String id, Car reservedCar , double trip_cost ) {
        this.name = name;
    this.id=id;
        this.reservedCar = reservedCar;
        this.trip_cost = trip_cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTrip_cost() {
        return trip_cost;
    }

    public void setTrip_cost(double trip_cost) {
        this.trip_cost = trip_cost;
    }


   // abstract function that takes a car object to reserve it to the passenger
//    and compute the trip cost and a function that should be overridden to display
//    their information along with the car code and route price .

    // abstract finction

    public abstract void reservedCar (Car car) throws Exception ;   //exeption if== to 0 show is fully book
    public abstract void displayInfo();




}
