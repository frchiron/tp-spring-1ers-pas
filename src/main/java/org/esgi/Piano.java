package org.esgi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("piano")
public class Piano implements Instrument {
    @Override
    public String play() {
        return " PLINK PLINK PLINK";
    }
}
