package exam03;

public enum CruiseClass2 {

    LUXURY(3.0), FIRST(1.8), SECOND(1.0);

    private double multipier;

    CruiseClass2(double multipier) {
        this.multipier = multipier;
    }

    public double getMultipier() {
        return multipier;
    }

    // 3,0, 1,8 és 1,0
}
