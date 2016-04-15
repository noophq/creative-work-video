package fr.noop.creativework.video;

import fr.noop.creativework.video.base.BaseEpisode;

public class Episode extends BaseEpisode {

    public Episode(String title) {
        super(title);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
