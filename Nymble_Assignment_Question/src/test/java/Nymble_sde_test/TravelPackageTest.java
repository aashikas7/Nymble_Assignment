package Nymble_sde_test;

import Nymble_Sde.Destination;
import Nymble_Sde.Passenger;
import Nymble_Sde.PassengerType;
import Nymble_Sde.TravelPackage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TravelPackageTest {
    @Test
    void testTravelPackageCreation() {
        TravelPackage travelPackage = new TravelPackage("Paris Tour", 50);
        assertEquals("Paris Tour", travelPackage.getName());
        assertEquals(50, travelPackage.getPassengerCapacity());
    }

    @Test
    void testAddDestination() {
        TravelPackage travelPackage = new TravelPackage("Paris Tour", 50);
        Destination destination = new Destination("Paris");
        travelPackage.addDestination(destination);
        assertEquals(1, travelPackage.getDestinations().size());
        assertTrue(travelPackage.getDestinations().contains(destination));
    }

    @Test
    void testAddPassenger() {
        TravelPackage travelPackage = new TravelPackage("Paris Tour", 2);
        Passenger passenger1 = new Passenger("John", 1, PassengerType.STANDARD);
        Passenger passenger2 = new Passenger("Alice", 2, PassengerType.GOLD);
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);
        assertEquals(2, travelPackage.getPassengers().size());
        assertTrue(travelPackage.getPassengers().contains(passenger1));
        assertTrue(travelPackage.getPassengers().contains(passenger2));
    }
}

