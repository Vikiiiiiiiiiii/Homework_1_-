import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List <Product> products = new ArrayList<>();

    private double money = 0;   // сколько денег в автомате

    public VendingMachine addProduct (Product product){
        products.add(product);
        return this;
    }

    public Product searchProduct(String name){    // поиск товара
        for(Product item: products){
            if(item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }


    public Product sell (String name) throws Exception {    // продажа товара
        Product target = searchProduct(name);
        try{
            this.money += target.getPrice();
            if(!target.sellCounter()){
                products.remove(target);
            }
        } catch (NullPointerException e){
            // System.out.println("Товар не найден");
            throw new Exception("Товар не найден" , e);
        }
        return target;
    }

    @Override

    public String toString(){
        StringBuilder res = new StringBuilder();
        for (Product item : products) {
            res.append(item);
            res.append("\n");
        }
        res.append(String.format("В автомате сейчас %.2f рублей" , money));
        return res.toString();
    }
}
