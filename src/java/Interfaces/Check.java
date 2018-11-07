
package Interfaces;

import Objects.Reservation;
import java.util.List;

public interface Check {
    
    List<Reservation> checkReservation (String code);
}
