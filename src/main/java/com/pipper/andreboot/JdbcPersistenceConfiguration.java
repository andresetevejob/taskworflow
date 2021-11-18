package com.pipper.andreboot;

import com.pipper.andreboot.core.context.SimpleContextRepository;
import com.pipper.andreboot.core.job.JdbcJobRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name="piper.persistence.provider",havingValue="jdbc")
public class JdbcPersistenceConfiguration {
    @Bean
    JdbcJobRepository jdbcJobRepository () {
        return new JdbcJobRepository();
    }

    @Bean
    SimpleContextRepository simpleContextRepository () {
        return new SimpleContextRepository();
    }
}
