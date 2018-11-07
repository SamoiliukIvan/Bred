
package Objects;

import java.util.List;


public class User {

    private int id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private List<Tour> history;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setHistory(List<Tour> history) {
        this.history = history;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public List<Tour> getHistory() {
        return history;
    }
    
    
    
    
}
