package fr.noop.creativework.video;

import fr.noop.creativework.video.base.BaseContribution;
import fr.noop.creativework.video.model.Contribution;
import fr.noop.creativework.video.model.Contributor;
import fr.noop.creativework.video.model.Work;

/**
 * Created by clebeaupin on 18/12/15.
 */
public class WorkContribution extends BaseContribution {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
