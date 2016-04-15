package fr.noop.creativework.video;

import fr.noop.creativework.video.base.BaseFilm;

public class Film extends BaseFilm {
    public Film() {}
    public Film(String title) {
        super(title);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
