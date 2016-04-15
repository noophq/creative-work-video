package fr.noop.creativework.video;

public class Country implements fr.noop.creativework.video.model.Country {
    // code
    private String code;

    public Country() {}
    public Country(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
