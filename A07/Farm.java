public class Farm {
    String owner;
    String city;

    public Farm(String owner, String city){
        this.owner = owner;
        this.city = city;
    }

    @Override
    public String toString(){
        return String.format("Farm in %s, owned by %s.", city, owner);
    }
}
