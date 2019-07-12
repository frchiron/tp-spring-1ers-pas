package org.esgi;

import java.util.Collection;

public class Guitarist {

    private Collection<Guitar> guitars;

    public Guitarist(Collection<Guitar> guitars) {
        this.guitars = guitars;
    }

    public int howManyGuitars()
    {
        return guitars.size();
    }

    public void play(){
        System.out.println(" Draalllallaaaa");
    }
}
