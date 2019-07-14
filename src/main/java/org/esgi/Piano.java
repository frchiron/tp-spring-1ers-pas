package org.esgi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource({
        "classpath:application.properties"
})
@Component("piano")
public class Piano implements Instrument {

    @Value( "${piano.sound}" )
    private String sound;

    @Override
    public String play() {
        return sound;
    }
}
