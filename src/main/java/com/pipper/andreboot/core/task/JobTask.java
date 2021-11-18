package com.pipper.andreboot.core.task;

import com.pipper.andreboot.core.Task;

import java.util.Date;

public interface JobTask extends Task {
    String getId ();

    TaskStatus getStatus ();

    Object getOutput ();

    Exception getException ();

    Date getCreationDate ();

    Date getCompletionDate ();

    Date getFailedDate ();

    long getExecutionTime ();
}
