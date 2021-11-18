package com.pipper.andreboot;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class PersistenceProperties {
    @Getter
    @Setter
    private String provider;
}
