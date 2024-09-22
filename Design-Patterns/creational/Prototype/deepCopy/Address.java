package creational.Prototype.deepCopy;

public class Address implements Cloneable{
    private String city;
    private String country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Address(String city, String country){
        this.city = city;
        this.country = country;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
