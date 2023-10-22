public class EatsImp implements Eats{
    String service;
    String address;
    public EatsImp(String service, String address){
        this.address = address;
        this.service = service;
    }

    @Override
    public void driverRoute() {
        System.out.println("Driver's route from " + service + " to " + address);
    }
}
