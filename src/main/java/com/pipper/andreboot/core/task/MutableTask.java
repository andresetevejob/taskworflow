package com.pipper.andreboot.core.task;

import com.pipper.andreboot.core.MapObject;
import com.pipper.andreboot.core.Task;

import java.util.Map;

public class MutableTask extends MapObject implements Task {

    public MutableTask (Task aSource) {
        super(aSource.toMap());
    }

    public MutableTask (Map<String, Object> aSource) {
        super(aSource);
    }

    @Override
    public String getType() {
        return getString("type");
    }

    @Override
    public String getName() {
        return getString("name");
    }

    @Override
    public String getReturns() {
        return getString("returns");
    }

    @Override
    public String getNode() {
        return getString("node");
    }

}
