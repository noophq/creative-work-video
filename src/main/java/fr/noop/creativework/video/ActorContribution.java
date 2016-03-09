package fr.noop.creativework.video;

import fr.noop.creativework.video.base.BaseContribution;
import fr.noop.creativework.video.model.Contributor;
import fr.noop.creativework.video.model.Contribution;
import fr.noop.creativework.video.model.Work;

/**
 * Created by clebeaupin on 18/12/15.
 */
public class ActorContribution extends WorkContribution {
    private String role;

    public ActorContribution() {
        this.setActivity(Activity.ACTOR);
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void setActivity(Activity activity) {
        if (activity != Activity.ACTOR) {
            throw new IllegalArgumentException("Activity value must be ");
        }

        this.activity = activity;
    }
}
