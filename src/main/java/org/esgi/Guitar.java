package org.esgi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("guitar")
public class Guitar implements Instrument {
    @Override
    public String play() {
        return "PLOP PLOP PLOP";
    }
}
