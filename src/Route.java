public class Route {
   // start pick up address, destination address, and trip price .
    private String pick_up_address;
    private String destination_address;
    private double trip_price;

    public Route(String pick_up_address, String destination_address, double trip_price) {
        this.pick_up_address = pick_up_address;
        this.destination_address = destination_address;
        this.trip_price = trip_price;
    }
//
//    public String getPick_up_address() {
//        return pick_up_address;
//    }
//
//    public void setPick_up_address(String pick_up_address) {
//        this.pick_up_address = pick_up_address;
//    }
//
//    public String getDestination_address() {
//        return destination_address;
//    }
//
//    public void setDestination_address(String destination_address) {
//        this.destination_address = destination_address;
//    }


    public double getTrip_price() {
        return trip_price;
    }

    public void setTrip_price(double trip_price) {
        this.trip_price = trip_price;
    }

    public String toString() {
        return pick_up_address + " to " + destination_address + "  Price: $" + trip_price;
    }

}
