package isShopOpen;
//Проблема в том, что по заданию нужно, чтоб вазвращалось boolean, но значений больше, чем 2, поэтому было решено реализовывать вывод в консоль внутри метода
public class IsShopOpen {
    public static void main(String[] args) {
        Boolean isEdekaOpen = false, isReweOpen = false;
        canBuy(isEdekaOpen, isReweOpen);
    }
    public static void canBuy(boolean isEdekaOpen, boolean isReweOpen){
        String store ="";
        if (isEdekaOpen && isReweOpen) {
            store = "Edeka и в Rewe";
            System.out.println("Я могу купитть продукты в "+ store);

        }else  if (isReweOpen){
            store="Rewe";
            System.out.println("Я могу купитть продукты в "+ store);

        } else if (isEdekaOpen) {
            store="Edeka";
            System.out.println("Я могу купитть продукты в "+ store);

        } else {
            System.out.println("Магазины закрыты");
        }
    }
}
