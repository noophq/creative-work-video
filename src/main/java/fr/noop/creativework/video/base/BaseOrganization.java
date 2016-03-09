package fr.noop.creativework.video.base;

abstract public class BaseOrganization extends BaseContributor {
    protected String name;

    public BaseOrganization() {}

    public BaseOrganization(String name) {
        this.setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}