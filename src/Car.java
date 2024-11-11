public class Car {
   // • Car Class has: a code, a fixed route, a maximum capacity of passengers per
    //trip.

    private String code;
    private Route route;
    private int maximumcapacity;

    public Car(String code, Route route, int maximumcapacity) {
        this.code = code;
        this.route = route;
        this.maximumcapacity = maximumcapacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route fixedroute) {
        this.route = fixedroute;
    }

    public int getMaximumcapacity() {
        return maximumcapacity;
    }

    public void setMaximumcapacity(int maximumcapacity) {
        this.maximumcapacity = maximumcapacity;
    }

    public void decreaseCapacity() {
        if (maximumcapacity > 0) {
            maximumcapacity--;
        }}

    public String toString() {
        return "Car Code: " + code + ", Route: " + route + ", Max Capacity: " + maximumcapacity;
        }
    }


