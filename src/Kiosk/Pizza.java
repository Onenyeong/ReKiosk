package Kiosk;

public class Pizza extends Menu {
    public int menuPrice;

    public int getPrice() {
        return menuPrice;
    }

    public Pizza(int menuNumber, String menuName, String menuDesc, int menuPrice) {
        super(menuNumber, menuName, menuDesc);
        this.menuPrice = menuPrice;
    }

    public void getMenuToString() {
        System.out.println(getMenuNumber() + ". " + getMenuName() + " | " + getMenuDesc() + " | " + getPrice());
    }

}
