package lesson4.entitty;

public class Country {

    private String title;
    private int zipCode;

    public Country(String title, int zipCode) {
        this.title = title;
        this.zipCode = zipCode;
    }

    public String getTitle() {
        return title;
    }

    public int getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Country{" +
                "title='" + title + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
