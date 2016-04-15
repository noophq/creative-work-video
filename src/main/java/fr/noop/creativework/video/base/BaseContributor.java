package fr.noop.creativework.video.base;

import fr.noop.creativework.video.model.Contribution;
import fr.noop.creativework.video.model.Contributor;

import java.util.ArrayList;
import java.util.List;

abstract public class BaseContributor implements Contributor {
    protected List<Contribution> contributions = new ArrayList();

    // Only used for inheritance
    protected Long id;

    public BaseContributor() {
    }

    public List<Contribution> getContributions() {
        return this.contributions;
    }

    public void addContribution(Contribution contribution) {
        this.contributions.add(contribution);
    }
}
