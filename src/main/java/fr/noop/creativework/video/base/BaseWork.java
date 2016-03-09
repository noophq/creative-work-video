package fr.noop.creativework.video.base;

import fr.noop.creativework.video.Activity;
import fr.noop.creativework.video.model.Contribution;
import fr.noop.creativework.video.model.Contributor;
import fr.noop.creativework.video.model.Work;

import java.util.ArrayList;
import java.util.List;

abstract public class BaseWork implements Work {
    // Only used for inheritance
    protected long id;

    protected String title;
    protected List<Contribution> contributions;

    public BaseWork() {
        this.contributions = new ArrayList<>();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public List<Contribution> getContributions() {
        return this.contributions;
    }

    public void addContribution(Contribution contribution) {
        this.contributions.add(contribution);
    }
}