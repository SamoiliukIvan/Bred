
package SPR;

public class Hotel {
    
    private int id;
    private int fk_region;
    private String name_ru;
    private String name_en;
    private String short_description_ru;
    private String short_description_en;
    private String full_description_ru;
    private String full_description_en;
    private int stars;

    public void setId(int id) {
        this.id = id;
    }

    public void setFk_region(int fk_region) {
        this.fk_region = fk_region;
    }

    public void setName_ru(String name_ru) {
        this.name_ru = name_ru;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public void setShort_description_ru(String short_description_ru) {
        this.short_description_ru = short_description_ru;
    }

    public void setShort_description_en(String short_description_en) {
        this.short_description_en = short_description_en;
    }

    public void setFull_description_ru(String full_description_ru) {
        this.full_description_ru = full_description_ru;
    }

    public void setFull_description_en(String full_description_en) {
        this.full_description_en = full_description_en;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public int getFk_region() {
        return fk_region;
    }

    public String getName_ru() {
        return name_ru;
    }

    public String getName_en() {
        return name_en;
    }

    public String getShort_description_ru() {
        return short_description_ru;
    }

    public String getShort_description_en() {
        return short_description_en;
    }

    public String getFull_description_ru() {
        return full_description_ru;
    }

    public String getFull_description_en() {
        return full_description_en;
    }

    public int getStars() {
        return stars;
    }
    
    
    
}
