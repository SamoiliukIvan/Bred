
import businesslogic.Util;
import entity.Country;
import entity.Region;
import java.sql.SQLException;
import service.CountryService;
import service.HotelService;
import service.OrderService;
import service.RegionService;


public class MainClass {
    
    public static void main(String[] args) {
        Util util = new Util();
        util.getConnection();
        
        CountryService countryService = new CountryService();
        HotelService hotelService = new HotelService();
        OrderService orderService = new OrderService();
        RegionService regionService = new RegionService();
        
        Country country = new Country();
        country.setId(5L);
        country.setName("Бельгия");
        
        try {
            countryService.create(country);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        Region region = new Region();
        region.setId(5L);
        region.setName("Фломанс");
        region.setIdCountry(5L);
        
        try {
            regionService.create(region);
        } catch (SQLException e) {
            e.printStackTrace();
        }        
    }
}
