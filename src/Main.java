public class Main {
    public static void main(String[] args) {
        Map map = new MapImp("Home", "AstanaIT");
        Eats eats = new EatsImp("KFC", "Home");
        Map adapter = new AdapterEats(eats);

        System.out.println("Map Route:");
        map.getRoute();

        System.out.println("\nEats Route:");
        eats.driverRoute();

        System.out.println("\nAdapterEats Route:");
        adapter.getRoute();
    }
}
