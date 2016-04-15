package fr.noop.creativework.video.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import fr.noop.creativework.video.Activity;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.CLASS,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@class")
public interface Contribution {
    public Work getWork();
    public Contributor getContributor();
    public Activity getActivity();
}
