package Codtech_Task3;

import java.io.*;
import java.net.*;

public class ChatClient {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 1504);
            System.out.println("Connected to Chat Server");

            BufferedReader consoleInput =
                    new BufferedReader(new InputStreamReader(System.in));

            BufferedReader in =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));

            PrintWriter out =
                    new PrintWriter(socket.getOutputStream(), true);

            System.out.print("Enter your name: ");
            String name = consoleInput.readLine();
            out.println(name);

            new Thread(() -> {
                try {
                    String msg;
                    while ((msg = in.readLine()) != null) {
                        System.out.println(msg);
                    }
                } catch (IOException e) {
                    System.out.println("Disconnected from server");
                }
            }).start();

            String message;
            while ((message = consoleInput.readLine()) != null) {
                out.println(message);
            }

        } catch (IOException e) {
            System.out.println("Unable to connect to server");
            e.printStackTrace();
        }
    }
}
