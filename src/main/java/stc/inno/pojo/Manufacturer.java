package stc.inno.pojo;

public class Manufacturer {
    private Integer id;
    private String  name;
    private String  country;

    public Manufacturer(Integer id, String name, String country) {
        this.id      = id;
        this.name    = name;
        this.country = country;
    }

    public Manufacturer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", country='" + country + '\'' +
               '}';
    }
}
