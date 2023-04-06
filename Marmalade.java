public class Marmalade extends Product{

    public Marmalade (String name, double price, int value){
        super(name, price, value);
    }

    @Override

    public String toString(){
        return String.format("Мармелад : %s" , super.toString());
    }
}
