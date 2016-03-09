package fr.noop.creativework.video.model;

import fr.noop.creativework.video.Activity;

/**
 * Created by clebeaupin on 18/12/15.
 */
public interface Contribution {
    public Work getWork();
    public Contributor getContributor();
    public Activity getActivity();
}
