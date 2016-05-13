package fr.noop.creativework.video;

public class Language implements fr.noop.creativework.video.model.Language {
    // code
    private String code;

    public Language() {}
    public Language(String code) {
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
