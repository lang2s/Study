package StudyForJava.front0808.day0903;

import java.util.Scanner;

public class Ex10If {
    
    public static void main(String[] args) {
        
        /*
            제품과 수량 단가를 입력하여
            수량이 5개 이상이면 10프로 디씨해주기
        */
        Scanner sc = new Scanner(System.in);
        String sangpum;
        int su,dan;
        int result;

        System.out.println("상품 입력");
        sangpum = sc.nextLine();
        System.out.println("수량 입력");
        su = sc.nextInt();
        System.out.println("단가 입력");
        dan = sc.nextInt();

        if(su>=5){
            result = (int)(su*dan*0.9);
        }else{
            result = su*dan;
        }

        System.out.println("총 결재할 금액은"+result+"원");
    }
}