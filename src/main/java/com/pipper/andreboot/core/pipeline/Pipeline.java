package com.pipper.andreboot.core.pipeline;

import com.pipper.andreboot.core.Task;

import java.util.List;

public interface Pipeline {
    /**
     * Returns the unique identifier of the pipeline.
     */
    String getId ();

    /**
     * Returns a descriptive name for the pipeline.
     */
    String getName ();

    /**
     * Returns the tasks that make up the pipeline.
     */
    List<Task> getTasks ();
}
