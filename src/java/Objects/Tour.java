
package Objects;

import SPR.Country;
import SPR.Hotel;
import SPR.Region;
import java.util.Calendar;
import java.util.List;


public class Tour {
    
    private int id;
    private int fk_country;
    private int fk_region;
    private int hotel;
    private Calendar fromDate;
    private Calendar toDate;
    private int fk_from_city;
    private String short_description_ru;
    private String short_description_en;
    private String full_descrption_ru;
    private String full_descrption_en;
    private int price_grn;
    private int price_usd;
    private int days_count;
    private List<Country> allCountries;
    private List<Region> allRegionsInCountryByIdCou;
    private List<Hotel> allHotelInRegionByIdReg;

    public void setId(int id) {
        this.id = id;
    }

    public void setFk_country(int fk_country) {
        this.fk_country = fk_country;
    }

    public void setFk_region(int fk_region) {
        this.fk_region = fk_region;
    }

    public void setHotel(int hotel) {
        this.hotel = hotel;
    }

    public void setFk_from_city(int fk_from_city) {
        this.fk_from_city = fk_from_city;
    }

    public void setShort_description_ru(String short_description_ru) {
        this.short_description_ru = short_description_ru;
    }

    public void setShort_description_en(String short_description_en) {
        this.short_description_en = short_description_en;
    }

    public void setFull_descrption_ru(String full_descrption_ru) {
        this.full_descrption_ru = full_descrption_ru;
    }

    public void setFull_descrption_en(String full_descrption_en) {
        this.full_descrption_en = full_descrption_en;
    }

    public void setPrice_grn(int price_grn) {
        this.price_grn = price_grn;
    }

    public void setPrice_usd(int price_usd) {
        this.price_usd = price_usd;
    }

    public int getId() {
        return id;
    }

    public int getFk_country() {
        return fk_country;
    }

    public int getFk_region() {
        return fk_region;
    }

    public int getHotel() {
        return hotel;
    }

    public Calendar getFromDate() {
        return fromDate;
    }

    public void setFromDate(Calendar fromDate) {
        this.fromDate = fromDate;
    }

    public Calendar getToDate() {
        return toDate;
    }

    public void setToDate(Calendar toDate) {
        this.toDate = toDate;
    }

    public int getFk_from_city() {
        return fk_from_city;
    }

    public String getShort_description_ru() {
        return short_description_ru;
    }

    public String getShort_description_en() {
        return short_description_en;
    }

    public String getFull_descrption_ru() {
        return full_descrption_ru;
    }

    public String getFull_descrption_en() {
        return full_descrption_en;
    }

    public int getPrice_grn() {
        return price_grn;
    }

    public int getPrice_usd() {
        return price_usd;
    }

    public List<Country> getAllCountries() {
        return allCountries;
    }

    public List<Region> getAllRegionsInCountryByIdCou() {
        return allRegionsInCountryByIdCou;
    }

    public List<Hotel> getAllHotelInRegionByIdReg() {
        return allHotelInRegionByIdReg;
    }

    public int getDays_count() {
        return days_count;
    }

    public void setDays_count(int days_count) {
        this.days_count = days_count;
    }
    
}
