public enum CarburantEnum {

    DIESEL("diesel"),
    SP95("SP95"),
    SP98("SP98"),
    GPL("GPL"),
    ESSENCE("essence");

    private String carburant;

    CarburantEnum(String carburant) {
        this.carburant = carburant;
    }

    public String getCarburant() {
        return carburant;
    }
}
