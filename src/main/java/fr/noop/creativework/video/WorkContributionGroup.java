package fr.noop.creativework.video;

import fr.noop.creativework.video.model.Contribution;
import fr.noop.creativework.video.model.Work;

import java.util.List;

public class WorkContributionGroup {
    private List<Contribution> contributions;

    public List<Contribution> getContributions() {
        return contributions;
    }

    public void setContributions(List<Contribution> contributions) {
        this.contributions = contributions;
    }
}
