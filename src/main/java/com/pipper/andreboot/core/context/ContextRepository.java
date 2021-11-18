package com.pipper.andreboot.core.context;

public interface ContextRepository<T extends Context> {
    T getForJobId(String aJobId);
    T save(T aContext);
}
