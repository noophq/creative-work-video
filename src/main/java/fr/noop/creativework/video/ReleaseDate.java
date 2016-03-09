package fr.noop.creativework.video;

import java.util.Date;

/**
 * Created by clebeaupin on 18/12/15.
 */
public class ReleaseDate {
    ReleaseDateType releaseDateType;
    Date date;

    public ReleaseDateType getReleaseDateType() {
        return this.releaseDateType;
    }

    public void setReleaseDateType(ReleaseDateType releaseDateType) {
        this.releaseDateType = releaseDateType;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
