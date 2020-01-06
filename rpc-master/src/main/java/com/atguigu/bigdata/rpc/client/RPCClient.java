package com.atguigu.bigdata.rpc.client;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class RPCClient {
    public static void main(String[] args) throws Exception{

        Socket socket = new Socket("localhost", 9999);

        PrintWriter writer = new PrintWriter(
                new OutputStreamWriter(
                        socket.getOutputStream(),
                        "UTF-8"
                )
        );

        writer.println("CMD /c notepad");
        writer.flush();
        writer.close();

    }
}
