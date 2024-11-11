public class Subscribers extends Passenger{

   // Subscribers passengers: take 50% discount on trip cost when they reserve a
    //car .

    public Subscribers(String name, String id, Car reservedCar ) {
        super(name, id,reservedCar,0);


    }

//    Trip cost = car_object.route_object.price - (car_object.route_object.price 0.1) --> in
//case the non-subscribers passengers have a discount coupon.

    @Override
    public void reservedCar(Car car) throws Exception {

            if (getReservedCar().getMaximumcapacity() == 0) {
                throw new Exception("Car is fully booked!");
            }

           // Trip cost = car_object.route_object.price - (car_object.route_object.price 0.1)

   setReservedCar(car);
        setTrip_cost(car.getRoute().getTrip_price()-(car.getRoute().getTrip_price()*0.1));
        car.decreaseCapacity();

    }





    @Override
    public void displayInfo() {
        System.out.println("Subscriber Info:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Car Code: " + getReservedCar().getCode());
        System.out.println("Route: " + getReservedCar().getRoute());
        System.out.println("Trip Cost: $" + getTrip_cost() );
    }}



