package Kiosk;

import java.util.*;

import static Kiosk.Menu.getConfirmNumberFromUsr;


public class OrderBasket {
    List<OrderBasket> orderBasketList = new ArrayList<>();
    OrderTimer orderTimer = new OrderTimer();
    // static 접근시 주의해야할듯
    int menuNumber;
    String menuName;
    String menuDesc;
    int menuQuantity;
    int menuPrice;




    public OrderBasket(int menuNumber, String menuName, String menuDesc, int menuPrice, int menuQuantity) {
        this.menuNumber = menuNumber;
        this.menuName = menuName;
        this.menuDesc = menuDesc;
        this.menuPrice = menuPrice;
        this.menuQuantity = menuQuantity;
    }

    public OrderBasket() {

    }


    public void cancleOrderBasket() {
        System.out.println("몇번의 주문을 취소하시겠습니까?");
        Scanner scan = new Scanner(System.in);
        int orderNumber = scan.nextInt();
//            orderBaskets.remove(orderBaskets.indexOf(orderNumber));
//        System.out.println(orderBaskets.get(i));      // 주소만 출력되는게 정상임.
        // i번째 방이 없는데 오류가 안났다?? 예외처리 필요했던 상황임.
        orderBasketList.remove(orderNumber - 1);   //  리스트는 0부터시작.
//            System.out.println(orderBaskets.indexOf(orderNumber));  //
    }

    public void clearOrderBasket() {
        System.out.println("정말로 지우시겠습니까?");
        Scanner scan = new Scanner(System.in);
        int checkNumber = scan.nextInt();
        if (checkNumber == 0) {
            orderBasketList.clear();
            System.out.println("모두 삭제되었습니다");
        } else if (checkNumber == 1) {
            System.out.println("취소되었습니다 메뉴화면으로 이동합니다.");
        }
    }

    public void showOrderTotal() {
        int orderTotal = 0;

        for (int i = 0; i < orderBasketList.size(); i++) {
            int basketTotal = orderBasketList.get(i).menuPrice * orderBasketList.get(i).menuQuantity;
            orderTotal += basketTotal;  // 각 리스트의 합한값을 넣어야하는데
        }
        System.out.println("결제하신 금액은" + orderTotal + "입니다.");
    }

    public void showOrderBasket() {

        /* Edit by YuJin */

        // 주문 내역을 메뉴 이름을 기준으로 그룹화하고, 수량과 가격을 합산

        // key를 메뉴 이름으로 하고 value에 OrderBasket을 넣는다.
        Map<String, OrderBasket> consolidatedOrders = new HashMap<>();

        // 메뉴를 반복문으로 순회한다.
        for (OrderBasket basket : orderBasketList) {
            // 만약 map에 메뉴가 있으면 (중복된 메뉴라면) 수량과 가격을 합산한다.
            if (consolidatedOrders.containsKey(basket.menuName)) {
                OrderBasket existingBasket = consolidatedOrders.get(basket.menuName);
                existingBasket.menuQuantity += basket.menuQuantity;
                existingBasket.menuPrice += basket.menuPrice;
            }

            // 그렇지 않다면 map에 메뉴를 추가한다.
            else {
                consolidatedOrders.put(basket.menuName, new OrderBasket(basket.menuNumber, basket.menuName, basket.menuDesc, basket.menuPrice, basket.menuQuantity));
            }
        }

        // 최종 주문 내역 출력
        int index = 0;
        for (OrderBasket basket : orderBasketList) {
            System.out.println(index + ". " + basket.menuName + ", " + basket.menuDesc + ", " + (basket.menuPrice * basket.menuQuantity));
            index++;
        }


    }

}
