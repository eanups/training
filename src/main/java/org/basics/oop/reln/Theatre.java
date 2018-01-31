package org.basics.oop.reln;


import org.basics.oop.reln.api.MovieProjector;

class Theatre extends Room implements MovieProjector{

    static final String theatreName = "Theatre";

    public void showCapacity() {
        System.out.println("100 people capacity..");
    }

    /**
     *  Overridden Specific behavior
     */
    @Override
    public void showLights() {
        System.out.println("Dim Lights for movie!");
    }

    public static void main(String[] args) {
        Room galaxy = new Theatre();
        Room rex = new Theatre();
        galaxy.showCapacity();
        rex.showCapacity();

    }


    public void showMovie() {
        System.out.println("Playing Movie on the projector");
    }

    public void project() {
        System.out.println("Projecting Film");
    }
}