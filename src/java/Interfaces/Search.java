
package Interfaces;

import Objects.Tour;
import SPR.Country;
import SPR.Hotel;
import SPR.Region;
import java.util.Calendar;
import java.util.List;

public interface Search {
    
    List<Tour> searchTour(Country country);
    List<Tour> searchTour(Country country, Region region);
    List<Tour> searchTour(Country country, Region region, Calendar fromDate, Calendar toDate);
    List<Tour> searchTourByStars(Hotel hotel);    
}
