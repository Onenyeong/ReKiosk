package Kiosk;

public class Item extends Menu{
    public int menuPrice;


    public int getMenuPrice() {
        return menuPrice;
    }

    public Item(int menuNumber, String menuName, String menuDesc, int menuPrice) {
        super(menuNumber, menuName, menuDesc);
        this.menuPrice = menuPrice;
    }

    public void getMenuToString() {
        System.out.println(getMenuNumber() + ". " + getMenuName() + " | " + getMenuDesc() + " | " + getPrice());
    }
}
