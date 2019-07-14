package org.esgi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
public class Pianist implements Artist {

    @Autowired
    @Qualifier("piano")
    private Instrument instrument;

    @Override
    public String perform() {
        return instrument.play();
    }
}
