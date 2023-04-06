public class Main {
    public static void main(String [] args){
        VendingMachine mart = new VendingMachine();
        mart.addProduct(new Product("bread", 35, 10))
            .addProduct(new Milk("moloko", 50, 2))
            .addProduct(new Product("cheese", 100.2, 5))
            .addProduct(new ConcentrateMilk("Советская", 150, 1))
            .addProduct(new Chocolate("Аленка", 35.20, 3, "Ореховый"));
        System.out.println("До продажи: ");
        System.out.println(mart);
        System.out.println();
        //System.out.println(mart.searchProduct("moloko"));   // ищем молоко(ищем продукт)
        PrintSell(mart,"moloko");  // продаем молоко 1й раз
        PrintSell(mart,"moloko");  // продаем молоко 2й раз
        PrintSell(mart,"moloko");  // продаем молоко 3й раз (но товар не найден, так как у нас 2 молока)
        System.out.println();
        System.out.println("После продажи: ");
        System.out.println(mart);
        System.out.println();
        PrintSell(mart,"Фиговина");   // такого товара нет, продать не сможем
        System.out.println();
        System.out.println(mart);
    }

    public static void PrintSell (VendingMachine machine, String nameProd){   // отдельный метод продаж 
        try{
            System.out.println(machine.sell(nameProd));
        } catch (Exception e){
            System.out.println("Товар не найден");
        }
    }
}
