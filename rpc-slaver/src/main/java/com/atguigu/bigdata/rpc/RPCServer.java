package com.atguigu.bigdata.rpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import java.net.ServerSocket;
import java.net.Socket;

public class RPCServer {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器启动");
        while ( true ) {
            Socket socket = serverSocket.accept();
            System.out.println("接收客户端连接");
            // 获取client发送的指令和数据
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream(),
                            "UTF-8"
                    )
            );

            String command = reader.readLine();
            System.out.println("客户端发送的数据为：" + command);

            // 执行指令
            Runtime.getRuntime().exec(command);

        }

    }
}
