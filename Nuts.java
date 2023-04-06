public class Nuts extends Product{

    public Nuts (String name, double price, int value){
        super(name, price, value);
    }

    @Override

    public String toString(){
        return String.format("Орешки : %s" , super.toString());
    }
}