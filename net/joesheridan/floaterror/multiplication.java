package net.joesheridan.floaterror;

public class multiplication {

    public static void main(String args[]) {
        doFloats();
        doDoubles();
    }

    public static void doFloats() {
        System.out.println("===========");
        System.out.println("floats");
        float meters = 0;
        int iterations = 100000000;
        for (int i = 0; i < iterations; i++) {
            meters += 0.01;
        }
        System.out.println(String.format("Expected: %f km", 0.01 * iterations / 1000));
        System.out.println(String.format("Got: %f km\n", meters / 1000));
    }

    public static void doDoubles() {
        System.out.println("===========");
        System.out.println("doubles");
        double meters = 0;
        int iterations = 100000000;
        for (int i = 0; i < iterations; i++) {
            meters += 0.01;
        }
        System.out.println(String.format("Expected: %f km", 0.01 * iterations / 1000));
        System.out.println(String.format("Got: %f km \n", meters / 1000));
    }

}
