import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//• Create 2 routes and assign each of them to a different Car object. Note that one
//        of those cars should have a maximum capacity equal to zero .
//• Create an array of Passengers containing 1 Subscriber and 1 non-Subscriber.
//• Assign a different car object to each passenger and then display their
//        information

        //Create 2 routes


try {


    Route r1 = new Route("ALemam road", "ALnergs", 10.4);
    Route r2 = new Route("King Abdullah road", "Alnergs", 15.3);


    //      assign rout  to a different Car object  //Note that one of those cars should have a maximum capacity equal to zero
    Car c1 = new Car("AB21", r1, 3);
    Car c2 = new Car("GY76", r2, 0);

//        Create an array of Passengers containing 1 Subscriber and 1 non-Subscriber.

    Passenger sub = new Subscribers("Ebtehal", "345433", c1);
    Passenger non = new Non_Subscribers("Majed", "453453", c2, true);

    ArrayList<Passenger> pas = new ArrayList<>();
    pas.add(sub);
    pas.add(non);


    for (Passenger pp : pas) {
        pp.reservedCar(c1);
        System.out.println("____________________");
        pp.displayInfo();
    }



} catch (Exception e) {
    System.out.println(e.getMessage());
}

}}