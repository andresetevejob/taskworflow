package com.pipper.andreboot.core.context;

import com.pipper.andreboot.core.MapObject;

import java.util.Map;

public class SimpleContext extends MapObject implements Context {

    public SimpleContext(String aJobId,Map<String, Object> aSource) {
        super(aSource);
        put("__jobId",aJobId);
    }

    @Override
    public String getJobId() {
        return getString("__jobId");
    }
}
