package com.pipper.andreboot.core.pipeline;

import com.pipper.andreboot.core.Task;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class SimplePipeline implements Pipeline{
    private final String id;
    private final String name;
    private final List<Task> tasks;

    public SimplePipeline(String aId, String aName, List<Task> aTasks) {
        id = aId;
        name = aName;
        tasks = aTasks;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
