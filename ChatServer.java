package Codtech_Task3;


import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {

    private static Set<PrintWriter> clients = new HashSet<>();

    public static void main(String[] args) {

        System.out.println("Chat Server Started...");

        try (ServerSocket serverSocket = new ServerSocket(1504)) {

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");

                new ClientHandler(socket).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;

        ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                clients.add(out);

                String name = in.readLine();
                broadcast("🔔 " + name + " joined the chat");

                String message;
                while ((message = in.readLine()) != null) {
                    broadcast(name + ": " + message);
                }

            } catch (IOException e) {
                System.out.println("Client disconnected");
            } finally {
                clients.remove(out);
            }
        }

        private void broadcast(String message) {
            for (PrintWriter writer : clients) {
                writer.println(message);
            }
        }
    }
}
