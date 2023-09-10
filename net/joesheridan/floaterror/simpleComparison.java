package net.joesheridan.floaterror;

public class simpleComparison {

    public static void main(String args[]) {
        System.out.println("===Comparison Examples===");

        System.out.println("constant evaluation: 0.1 + 0.2 == 0.3? " + (0.1 + 0.2 == 0.3 ? "true" : "false"));

        float f1 = 0.1f;
        float f2 = 0.2f;
        float f3 = f1 + f2;
        System.out.println("floats: 0.1 + 0.2 == 0.3? " + (f3 == 0.3f ? "true" : "false"));

        double d1 = 0.1f;
        double d2 = 0.2f;
        double d3 = d1 + d2;
        System.out.println("doubles: 0.1 + 0.2 == 0.3? " + (d3 == 0.3 ? "true" : "false"));

        System.out.println("doubels + floats: 0.1 + 0.2 == 0.3? " + (d3 == f3));

    }

}