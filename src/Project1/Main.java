package Project1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Football> teams = new ArrayList<>(List.of(

        ));
        Football football1 =  new Football("맨체스터 유나이티드", 7,1,0);
        Football football2 = new Football("첼시", 5, 2, 1);
        Football football3 = new Football("리버풀",6, 2, 1);
        Football football4 = new Football("맨체스터 시티", 7, 2, 1);
        Football football5 = new Football("아스날");
        Football football6 = new Football("토트넘 훗스퍼");
        Football football7 = new Football("본머스");
        Football football8 = new Football("크리스탈 펠리스");
        Football football9 = new Football("선덜랜드");
        Football football10 = new Football("리즈 유나이티드");
        Football football11 = new Football("울버햄튼");
        Football football12 = new Football("번리");
        Football football13 = new Football("브랜트 포드");
        Football football14 = new Football("풀럼");
        Football football15 = new Football("뉴캐슬 유나이티드 ");
        Football football16 = new Football("아스톤 빌라");
        Football football17 = new Football("브라이턴");
        Football football18 = new Football("웨스트 햄 유나이티드 ");
        Football football19 = new Football("에버턴");
        Football football20 = new Football("노팅엄 포레스트");

        teams.add(football1);
        teams.add(football2);
        teams.add(football3);
        teams.add(football4);
        teams.add(football5);
        teams.add(football6);
        teams.add(football7);
        teams.add(football8);
        teams.add(football9);
        teams.add(football10);
        teams.add(football11);
        teams.add(football12);
        teams.add(football13);
        teams.add(football14);
        teams.add(football15);
        teams.add(football16);
        teams.add(football17);
        teams.add(football18);
        teams.add(football19);
        teams.add(football20);




        football1.recordWin();
        football1.recordDraw();
        football1.recordLoss();
        System.out.println(football1);


        football2.recordWin();
        football2.recordDraw();
        football2.recordWin();
        System.out.println(football2);

        football3.recordWin();
        football3.recordLoss();
        football3.recordLoss();
        System.out.println(football3);

        teams.sort((a,b) -> Integer.compare(b.getPoints(), a.getPoints()));
        System.out.println("=== 프리미어리그 순위표 ===");
        int rank = 1;
        for (Football team : teams) {
            System.out.printf("%2d위: %s%n", rank++, team);

    }
}}
