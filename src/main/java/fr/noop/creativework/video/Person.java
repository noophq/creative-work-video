package fr.noop.creativework.video;

import fr.noop.creativework.video.base.BasePerson;

public class Person extends BasePerson {
    public Person() {
        super();
    }

    public Person(String fullname) {
        super(fullname);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
