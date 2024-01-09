package Kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {


    List<OrderBasket> orderBasketList = new ArrayList<>();

    OrderBasket orderBasket = new OrderBasket();

    public Order() {
    }


    public void addHamburgerAndOrder() {
        System.out.println("번호를 입력하세요");
        Scanner scan = new Scanner(System.in);
        int menuNumber = scan.nextInt();
        System.out.println("수량을 입력하세요");
        int quantity = scan.nextInt();

        switch (menuNumber) {       // 의식의 흐름대로 짜버림.. 기존 For문
            case 1:
                orderBasketList.add(new OrderBasket(1, "불고기 버거", "불고기에 소스만 바른 버거", 3800, quantity));
                break;
            case 2:
                orderBasketList.add(new OrderBasket(2, "새우 버거", "새우만 넣은 버거", 4200, quantity));
                break;
            case 3:
                orderBasketList.add(new OrderBasket(3, "맥스파이시 상하이버거", "꽤나 매운 버거", 5500, quantity));
                break;
            case 4:
                orderBasketList.add(new OrderBasket(4, "빅맥", "소고기 들어간 버거", 6400, quantity));
                break;
            case 5:
                orderBasketList.add(new OrderBasket(5, "쿼터 파운더 치즈", "치즈 듬뿍 들어간 버거", 7000, quantity));
                break;
        }
        System.out.println(orderBasketList.isEmpty());        // 추가로 주문하시겠습니까? 예, 아니오
        // 예 클릭시 항목 다시한번 보여주기
        // 아니오 클릭시 메뉴로 돌아가기
    }
    public void addChickenAndOrder(){
        System.out.println("번호를 입력하세요");
        Scanner scan = new Scanner(System.in);
        int menuNumber = scan.nextInt();
        System.out.println("수량을 입력하세요");
        int quantity = scan.nextInt();
        switch (menuNumber) {       // 의식의 흐름대로 짜버림.. 기존 For문
            case 1:
                orderBasketList.add(new OrderBasket(1, "후라이드치킨", "후라이드 치킨의 교과서", 16000,quantity));
                break;
            case 2:
                orderBasketList.add(new OrderBasket(2, "양념치킨", "싫어할 사람은 없겠죠?", 18000,quantity));
                break;
            case 3:
                orderBasketList.add(new OrderBasket(3, "간장치킨", "간장의 짭조롬함을 좋아한다면", 17000,quantity));
                break;

        }
        orderBasket.showOrderBasket();
    }
    public void addPizzaAndOrder(){
        System.out.println("번호를 입력하세요");
        Scanner scan = new Scanner(System.in);
        int menuNumber = scan.nextInt();
        System.out.println("수량을 입력하세요");
        int quantity = scan.nextInt();
        switch (menuNumber) {       // 의식의 흐름대로 짜버림.. 기존 For문
            case 1:
                orderBasketList.add(new OrderBasket(1, "콤비네이션 피자", "토핑의 조화를 원한다면", 13500,quantity));
                break;
            case 2:
                orderBasketList.add(new OrderBasket(2, "불새 피자", "불고기와 새우가 만나", 15000,quantity));
                break;
            case 3:
                orderBasketList.add(new OrderBasket(3, "불갈비 피자", "불갈비를 맛보고싶다면", 16000,quantity));
                break;
            case 4:
                orderBasketList.add(new OrderBasket(4, "휴게소 피자", "휴게소의 감자와 소시지의 합작", 14000,quantity));
                break;

        }
        orderBasket.showOrderBasket();
    }
    public void addDrinkAndOrder(){
        System.out.println("번호를 입력하세요");
        Scanner scan = new Scanner(System.in);
        int menuNumber = scan.nextInt();
        System.out.println("수량을 입력하세요");
        int quantity = scan.nextInt();

        switch (menuNumber) {       // 의식의 흐름대로 짜버림.. 기존 For문
            case 1:
                orderBasketList.add(new OrderBasket(1, "코카콜라제로", "음료계의 근본", 2000,quantity));
                break;
            case 2:
                orderBasketList.add(new OrderBasket(2, "펩시제로", "코카콜라의 대항마", 2000,quantity));
                break;
            case 3:
                orderBasketList.add(new OrderBasket(3, "환타", "톡쏘는 오렌지", 1700,quantity));
                break;
            case 4:
                orderBasketList.add(new OrderBasket(4, "사이다", "청량함과 시원함을 동시에", 1800,quantity));
                break;

        }
        orderBasket.showOrderBasket();
    }

}

