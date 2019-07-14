package org.esgi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Guitarist implements Artist {

    @Autowired
    @Qualifier("guitar")
    private Instrument instrument;

    @Override
    public String perform() {
        return instrument.play();
    }
}
