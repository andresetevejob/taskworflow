package com.pipper.andreboot.core;

public interface Task extends Accessor{
    String getType ();

    String getName ();

    String getNode ();

    String getReturns ();
}
