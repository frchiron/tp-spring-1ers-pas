package org.esgi;

public class Artist {

    private Instrument instrument;

    public Artist(Instrument instrument) {
        this.instrument = instrument;
    }

    public String perform(){
        return instrument.play();
    }
}
