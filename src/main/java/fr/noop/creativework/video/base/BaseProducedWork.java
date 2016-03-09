package fr.noop.creativework.video.base;


import fr.noop.creativework.video.model.Contribution;
import fr.noop.creativework.video.model.Contributor;
import fr.noop.creativework.video.model.Produced;
import fr.noop.creativework.video.model.Work;

import java.util.Date;
import java.util.List;

abstract public class BaseProducedWork extends BaseWork implements Produced {
    protected String originalTitle;
    protected int productionYear;
    protected List<Contributor> directors;
    protected List<Contributor> producers;
    protected List<Contributor> actors;

    public BaseProducedWork() {}
    public BaseProducedWork(String title) {
        this.title = title;
    }

    public String getOriginalTitle() {
        return this.originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public int getProductionYear() {
        return this.productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public List<Contributor> getDirectors() {
        return this.directors;
    }

    public List<Contributor> getProducers() {
        return this.producers;
    }

    public List<Contributor> getActors() {
        return this.actors;
    }

    public Date getReleaseDate() {
        return null;
    }
}
