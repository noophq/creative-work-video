package fr.noop.creativework.video.base;

abstract public class BasePerson extends BaseContributor {
    protected String fullName;
    protected String familyName;
    protected String givenName;

    public BasePerson() {}

    public BasePerson(String fullName) {
        this.setFullName(fullName);
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return this.givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
}
