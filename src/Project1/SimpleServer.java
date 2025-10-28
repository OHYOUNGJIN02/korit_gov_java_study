package Project1;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.*;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/", SimpleServer::handleRequest);
        server.setExecutor(null);
        server.start();

        System.out.println("서버 실행 중 → http://localhost:8080");
    }

    private static void handleRequest(HttpExchange exchange) throws IOException {
        List<Football> teams = new ArrayList<>(List.of(
                new Football("맨체스터 유나이티드", 7, 1, 0),
                new Football("첼시", 5, 2, 1),
                new Football("리버풀", 6, 2, 1),
                new Football("맨체스터 시티", 7, 2, 1),
                new Football("아스날"),
                new Football("토트넘 훗스퍼"),
                new Football("본머스"),
                new Football("크리스탈 펠리스"),
                new Football("선덜랜드"),
                new Football("리즈 유나이티드"),
                new Football("울버햄튼"),
                new Football("번리"),
                new Football("브렌트 포드"),
                new Football("풀럼"),
                new Football("뉴캐슬 유나이티드"),
                new Football("아스톤 빌라"),
                new Football("브라이턴"),
                new Football("웨스트 햄 유나이티드"),
                new Football("에버턴"),
                new Football("노팅엄 포레스트")
        ));


        teams.get(0).recordWin();
        teams.get(0).recordWin();
        teams.get(0).recordWin();

        teams.get(1).recordWin();
        teams.get(1).recordDraw();
        teams.get(1).recordWin();

        teams.get(2).recordWin();
        teams.get(2).recordLoss();
        teams.get(2).recordLoss();

        teams.get(3).recordLoss();
        teams.get(3).recordWin();
        teams.get(3).recordDraw();

        teams.sort((a, b) -> Integer.compare(b.getPoints(), a.getPoints()));

        StringBuilder html = new StringBuilder();
        html.append("""
        <html lang='ko'><head><meta charset='UTF-8'><title>프리미어리그 순위표</title>
        <style>
        body{font-family:sans-serif;text-align:center;padding:20px;}
        table{margin:0 auto;border-collapse:collapse;width:70%;}
        th,td{border:1px solid #ccc;padding:8px;}
        th{background:#333;color:white;}
        tr:nth-child(even){background:#f9f9f9;}
        </style></head><body>
        <h1>⚽ 프리미어리그 순위표 ⚽</h1>
        <table><thead><tr>
        <th>순위</th><th>팀 이름</th><th>승</th><th>무</th><th>패</th><th>승점</th>
        </tr></thead><tbody>
        """);

        int rank = 1;
        for (Football team : teams) {
            html.append("<tr>")
                    .append("<td>").append(rank++).append("</td>")
                    .append("<td>").append(team.getTeamName()).append("</td>")
                    .append("<td>").append(team.getWins()).append("</td>")
                    .append("<td>").append(team.getDraws()).append("</td>")
                    .append("<td>").append(team.getLosses()).append("</td>")
                    .append("<td>").append(team.getPoints()).append("</td>")
                    .append("</tr>");
        }

        html.append("</tbody></table></body></html>");

        byte[] response = html.toString().getBytes();
        exchange.sendResponseHeaders(200, response.length);
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(response);
        }
    }
}
