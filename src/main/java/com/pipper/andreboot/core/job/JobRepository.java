package com.pipper.andreboot.core.job;

public interface JobRepository {
    Job findOne (String aJobId);

    Job save (Job aJob);

    Job findJobByTaskId (String aTaskId);
}
