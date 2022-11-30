package be.vinci.aj.server;

import be.vinci.aj.domaine.Query;
import be.vinci.aj.domaine.QueryFactory;

import java.util.Scanner;

public class ProxyServer {

    public static void startServer(){
        try(Scanner scanner = new Scanner(System.in)){
        while (true){
                String url = scanner.nextLine();
                Query query =  QueryFactory.getQuery();
                query.setUrl(url);
                new QueryHandler(query).start();
        }
        }
    }
}
