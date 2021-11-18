package com.pipper.andreboot.core.job;

import com.pipper.andreboot.core.task.JobTask;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SimpleJobRepository implements JobRepository{
    private final Map<String,Job> jobs = new ConcurrentHashMap<>();
    @Override
    public Job findOne(String aJobId) {
        return jobs.get(aJobId);
    }

    @Override
    public Job save(Job aJob) {
        return jobs.put(aJob.getId(), aJob);
    }

    @Override
    public Job findJobByTaskId(String aTaskId) {
        for(Job job : jobs.values()) {
            List<JobTask> tasks = job.getExecution();
            for(JobTask t : tasks) {
                if(t.getId().equals(aTaskId)) {
                    return job;
                }
            }
        }
        return null;
    }
}
