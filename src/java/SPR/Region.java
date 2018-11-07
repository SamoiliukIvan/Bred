
package SPR;

public class Region {
    
    private int id;
    private int fk_country;
    private String name_ru;

    public void setId(int id) {
        this.id = id;
    }

    public void setFk_country(int fk_country) {
        this.fk_country = fk_country;
    }

    public void setName_ru(String name_ru) {
        this.name_ru = name_ru;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }
    private String name_en;

    public int getId() {
        return id;
    }

    public int getFk_country() {
        return fk_country;
    }

    public String getName_ru() {
        return name_ru;
    }

    public String getName_en() {
        return name_en;
    }
    
    
}
