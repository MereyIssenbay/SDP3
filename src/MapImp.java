public class MapImp implements Map{
    private String PlaceA;
    private String PlaceB;
    public MapImp(String PlaceA, String PlaceB){
        this.PlaceA = PlaceA;
        this.PlaceB = PlaceB;
    }
    @Override
    public void getRoute() {
        System.out.println("Route from " + PlaceA + " to " + PlaceB);
    }
}
