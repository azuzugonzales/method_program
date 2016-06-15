package by.bsu.com._inet_example.docsoracle.planet;

import by.bsu.com._inet_example.docsoracle.planet.*;

public class RunPlanet extends Planet{

    public static void main(String[] args) {

        double earthWeight = Double.parseDouble(args[0]);
        double mass = earthWeight/EARTH.surfaceGravity();

        for (Planet p : Planet.values())
            System.out.printf("Your weight on %s is %f%n",
                    p, p.surfaceWeight(mass));
    }
}
