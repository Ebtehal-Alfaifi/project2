public class Non_Subscribers extends Passenger{

   // have boolean value named discount coupon
   // and gets a 10% discount on the trip cost if they have it.

private boolean discount_coupon;

    public Non_Subscribers(String name, String id,Car reservedCar,boolean discount_coupon) {
        super(name, id,reservedCar,0);
        this.discount_coupon=discount_coupon;
    }

    @Override
    public void reservedCar(Car car) throws Exception {

            if (getReservedCar().getMaximumcapacity() == 0) {
                throw new Exception("Car is fully booked!");
            }



        if (discount_coupon) {
            setReservedCar(car);
            setTrip_cost(car.getRoute().getTrip_price()-(car.getRoute().getTrip_price()*0.1));

        } else {
            setTrip_cost( getReservedCar().getRoute().getTrip_price());

        }
        car.decreaseCapacity();

    }


    @Override
    public void displayInfo() {
        System.out.println("Non-Subscriber Info:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Car Code: " + getReservedCar().getCode());
        System.out.println("Route: " + getReservedCar().getRoute());
        System.out.println("Trip Cost: $" + getTrip_cost());
    }
}
