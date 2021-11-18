package com.pipper.andreboot.core.pipeline;

import java.util.List;

public interface PipelineRepository {
    Pipeline findOne (String aId);

    List<Pipeline> findAll ();
}
