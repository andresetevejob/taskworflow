package com.pipper.andreboot;

import com.pipper.andreboot.core.context.SimpleContextRepository;
import com.pipper.andreboot.core.job.SimpleJobRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name="piper.persistence.provider",havingValue="simple")
public class SimplePersistenceConfiguration {
    @Bean
    SimpleJobRepository simpleJobRepository () {
        return new SimpleJobRepository();
    }

    @Bean
    SimpleContextRepository simpleContextRepository () {
        return new SimpleContextRepository();
    }
}
