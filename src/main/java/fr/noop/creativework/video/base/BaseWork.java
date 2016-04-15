package fr.noop.creativework.video.base;

import fr.noop.creativework.video.model.Contribution;
import fr.noop.creativework.video.model.Work;

import java.util.ArrayList;
import java.util.List;

abstract public class BaseWork implements Work {
    // Only used for inheritance
    protected Long id;

    protected String title;
    protected String description;
    protected Long duration; // Duration in seconds
    protected List<Contribution> contributions = new ArrayList();

    public BaseWork() {}

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getDuration() {
        return this.duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public List<Contribution> getContributions() {
        return this.contributions;
    }

    public void addContribution(Contribution contribution) {
        this.contributions.add(contribution);
    }
}
