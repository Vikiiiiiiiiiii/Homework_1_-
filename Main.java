public class Main {
    public static void main(String [] args){

        VendingMachine mart = new VendingMachine();
        mart.addProduct(new Product("Хлеб", 35, 10))
            .addProduct(new Milk("Добрыня", 50, 2))
            .addProduct(new Product("Сыр", 100.2, 5))
            .addProduct(new ConcentrateMilk("Советская", 150, 1))
            .addProduct(new Chocolate("Аленка", 35.20, 3, "Ореховый"))
            .addProduct(new Nuts("Фисташки", 40.0, 5))
            .addProduct(new Marmalade("Фрутелла", 82.0, 2));
        System.out.println("Список товаров до продажи: ");
        System.out.println(mart);
        System.out.println();
        System.out.println("Список проданных товаров: ");
        // System.out.println(mart.searchProduct("Добрыня"));   // ищем молоко(ищем продукт)
        PrintSell(mart,"Добрыня");  // продаем молоко 1й раз
        PrintSell(mart,"Добрыня");  // продаем молоко 2й раз
        // PrintSell(mart,"Добрыня");  // продаем молоко 3й раз (но товар не найден, так как у нас 2 молока)
        PrintSell(mart,"Фисташки"); // продаем орешки
        PrintSell(mart,"Фрутелла"); // продаем мармелад
        PrintSell(mart,"Фрутелла"); // продаем мармелад
        System.out.println();
        System.out.println("Список товаров после продажи: ");
        System.out.println(mart);
        System.out.println();
        // PrintSell(mart,"Фиговина");   // такого товара нет, продать не сможем
        // System.out.println();
        // System.out.println(mart);
    }

    public static void PrintSell (VendingMachine machine, String nameProd){   // отдельный метод продаж 
        try{
            System.out.println(machine.sell(nameProd));
        } catch (Exception e){
            System.out.println("Товар не найден");
        }
    }
}