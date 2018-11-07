
package Interfaces;

import Objects.Order;
import Objects.Reservation;
import Objects.Tour;
import java.util.Calendar;

public interface Buy {
    
    Reservation buyTour(Order order);
}
