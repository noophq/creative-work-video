package fr.noop.creativework.video.base;

import fr.noop.creativework.video.Activity;
import fr.noop.creativework.video.model.Contribution;
import fr.noop.creativework.video.model.Contributor;
import fr.noop.creativework.video.model.Work;

abstract public class BaseContribution implements Contribution {
    protected Contributor contributor;
    protected Work work;
    protected Activity activity;

    // Only used for inheritance
    protected long id;

    public void setContributor(Contributor contributor) {
        this.contributor = contributor;
    }

    public Contributor getContributor() {
        return (Contributor) this.contributor;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public Work getWork() {
        return this.work;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Activity getActivity() {
        return this.activity;
    }
}
