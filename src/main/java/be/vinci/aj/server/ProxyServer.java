package be.vinci.aj.server;

import be.vinci.aj.domaine.Query;
import be.vinci.aj.domaine.QueryFactory;
import be.vinci.aj.domaine.QueryFactoryImpl;

import java.util.Scanner;

public class ProxyServer {

    private QueryFactory queryFactory;

    public ProxyServer(QueryFactory queryFactory) {
        this.queryFactory = queryFactory;
    }

    public void startServer(){
        try(Scanner scanner = new Scanner(System.in)){
        while (true){
                String url = scanner.nextLine();
                Query query =  queryFactory.getQuery();
                query.setUrl(url);
                new QueryHandler(query).start();
        }
        }
    }
}
