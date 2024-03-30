package Nymble_sde_test;

import Nymble_Sde.Activity;
import Nymble_Sde.Destination;
import Nymble_Sde.Passenger;
import Nymble_Sde.PassengerType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    @Test
    void testPassengerCreation() {
        Passenger passenger = new Passenger("John", 1, PassengerType.STANDARD);
        assertEquals("John", passenger.getName());
        assertEquals(1, passenger.getPassengerNumber());
        assertEquals(1000, passenger.getBalance());
        assertEquals(PassengerType.STANDARD, passenger.getType());
    }

    @Test
    void testDeductBalance() {
        Passenger passenger = new Passenger("John", 1, PassengerType.GOLD);
        passenger.deductBalance(50.0);
        assertEquals(950.0, passenger.getBalance());
    }

    @Test
    void testAddActivity() {
        Passenger passenger = new Passenger("John", 1, PassengerType.PREMIUM);
        Destination destination = new Destination("Paris");
        Activity activity = new Activity("Eiffel Tower Visit", "Visit the iconic Eiffel Tower", 20.0, 100, destination);
        passenger.addActivity(activity);
        assertEquals(1, passenger.getActivities().size());
        assertTrue(passenger.getActivities().contains(activity));
    }
}
