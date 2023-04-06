public class ConcentrateMilk extends Milk{  // наследуется от класса Milk
    
    public ConcentrateMilk(String name, double price, int value){
        super(name, price, value);
    }

    @Override

    public String toString(){  // переопределение toString
        StringBuilder res = new StringBuilder();
        res.append("Сгуха: ")
            .append(super.toString());
        return res.toString();
        
    }
}
