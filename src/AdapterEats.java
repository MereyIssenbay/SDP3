public class AdapterEats implements Map {
    private Eats eats;

    public AdapterEats(Eats eats) {
        this.eats = eats;
    }

    @Override
    public void getRoute() {
        eats.driverRoute();
    }
}