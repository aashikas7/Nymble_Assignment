package Nymble_sde_test;

import Nymble_Sde.Activity;
import Nymble_Sde.Destination;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ActivityTest {
    @Test
    void testActivityCreation() {
        Destination destination = new Destination("Paris");
        Activity activity = new Activity("Eiffel Tower Visit", "Visit the iconic Eiffel Tower", 20.0, 100, destination);
        assertEquals("Eiffel Tower Visit", activity.getName());
        assertEquals("Visit the iconic Eiffel Tower", activity.getDescription());
        assertEquals(20.0, activity.getCost());
        assertEquals(100, activity.getCapacity());
        assertEquals(destination, activity.getDestination());
    }
}
