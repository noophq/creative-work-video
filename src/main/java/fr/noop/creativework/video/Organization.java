package fr.noop.creativework.video;

import fr.noop.creativework.video.base.BaseOrganization;
import fr.noop.creativework.video.model.Contributor;
import fr.noop.creativework.video.model.Contribution;

import java.util.List;

/**
 * Created by clebeaupin on 18/12/15.
 */
public class Organization extends BaseOrganization {
    private Long id;

    public Organization(String name) {
        super(name);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
            this.id = id;
        }
}
