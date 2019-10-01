package cc.serfer;


import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class runner {


    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/api/grant/matrix/", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }





}
