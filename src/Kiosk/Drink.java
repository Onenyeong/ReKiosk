package Kiosk;

public class Drink extends Menu {
    public int menuPrice;

    public int getPrice() {
        return menuPrice;
    }

    public Drink(int menuNumber, String menuName, String menuDesc, int menuPrice) {
        super(menuNumber, menuName, menuDesc);
        this.menuPrice = menuPrice;
    }

    public void getMenuToString() {
        System.out.println(getMenuNumber() + ". " + getMenuName() + " | " + getMenuDesc() + " | " + getPrice());
    }
}

