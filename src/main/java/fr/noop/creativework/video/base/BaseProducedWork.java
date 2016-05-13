package fr.noop.creativework.video.base;

import fr.noop.creativework.video.model.Contributor;
import fr.noop.creativework.video.model.Country;
import fr.noop.creativework.video.model.Produced;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

abstract public class BaseProducedWork extends BaseWork implements Produced {
    protected String originalTitle;
    protected Integer productionYear;

    @Fetch(FetchMode.SELECT)
    protected List<Country> productionCountries = new ArrayList();

    @Fetch(FetchMode.SELECT)
    protected List<Contributor> directors = new ArrayList<>();
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

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public List<Country> getProductionCountries() {
        return this.productionCountries;
    }

    public void setProductionCountries(List<Country> productionCountries) {
        this.productionCountries = productionCountries;
    }
    public void addProductionCountry(Country country) {
        this.productionCountries.add(country);
    }


    public List<Contributor> getDirectors() {
        return this.directors;
    }

    public void setDirectors(List<Contributor> directors) {
        this.directors = directors;
    }

    public List<Contributor> getProducers() {
        return this.producers;
    }

    public void setProducers(List<Contributor> producers) {
        this.producers = producers;
    }

    public List<Contributor> getActors() {
        return this.actors;
    }

    public Date getReleaseDate() {
        return null;
    }
}
