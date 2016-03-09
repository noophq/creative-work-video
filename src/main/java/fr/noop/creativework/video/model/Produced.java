package fr.noop.creativework.video.model;

import java.util.Date;
import java.util.List;

/**
 * Created by clebeaupin on 18/12/15.
 */
public interface Produced {
    public List<Contributor> getDirectors();
    public List<Contributor> getProducers();
    public List<Contributor> getActors();
    public Date getReleaseDate();
}
