# TASK-3-MULTITHREADED_CHAT_APPLICATION

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: MEGHANA A B

*INTERN ID*: CTIS2029

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 4 WEEKS

*MENTOR NAME*: NEELA SANTHOSH

# Project Overview

This project is a Java-based console application that demonstrates real-time communication using a client–server architecture.It is designed to help learners understand how multiple users can connect to a central server and exchange messages instantly over a network.The application focuses on backend logic such as socket communication, message broadcasting, and handling multiple users at the same time.By running entirely in the command line, the project avoids graphical complexity and emphasizes core networking concepts.

The system is divided into two main components: a ChatServer that manages connections and a ChatClient that allows users to communicate.Multithreading is used to ensure that several clients can interact simultaneously without interruptions.Overall, this project provides practical exposure to real-world communication systems built using Java.
Overall, this project reflects practical skills expected from an intern, such as understanding client–server models, handling concurrency, and writing clean, maintainable Java code.

# Features

•	This application allows multiple users to connect to a single server and communicate in real time.

•	Messages sent by one client are instantly broadcast to all connected users, creating a shared chat environment.

•	The server supports multiple client connections simultaneously using multithreading.

•	User join and leave messages make it easy to track active participants in the chat.

•	The entire system runs in the console, keeping it lightweight and easy to understand.

# Languages and Tools Used

•	Java

•	Java Socket Programming

•	Java Development Kit (JDK)

•	Eclipse / IntelliJ IDEA / NetBeans

•	Command Prompt / Terminal

# Platforms Used

•	Windows Operating System

•	Java Virtual Machine (JVM)

•	Console-Based Environment

# Applications 

•	This project can be used as a basic real-time chat system for learning and experimentation.

•	It is helpful for students who want hands-on experience with Java networking and socket programming.

•	The project can act as a foundation for building more advanced messaging systems.

•	It is suitable for academic projects related to computer networks and distributed applications.

•	The system can be extended into a GUI-based or web-based chat application in the future.

# Project Structure

The project is organized into two main Java files to clearly separate responsibilities.

ChatServer : The ChatServer file contains the server-side logic, including listening for client connections, managing multiple users, and broadcasting messages.Each client connection is handled using a separate thread, ensuring smooth and uninterrupted communication.The server maintains a list of connected clients so that messages can be delivered to everyone in real time.
The ChatServer class is the backbone of the entire application. It is responsible for starting the server, accepting incoming client connections, and managing communication between all connected users. The server uses a ServerSocket to listen on a specific port for client requests. Once the server starts, it continuously waits for clients to connect.

ChatClient : The ChatClient file represents the user-side application.It connects to the server using a socket, sends user messages, and listens for incoming messages simultaneously.Separate threads are used so that the client can send and receive messages at the same time without blocking input.This clear separation makes the code easier to understand, maintain, and enhance.
Once connected, the client allows the user to enter a username, which helps identify messages in the chat. The client code uses two separate threads: one for sending messages and another for receiving messages. This design ensures that the client can listen for incoming messages while the user is typing at the same time.
The sending thread reads user input from the keyboard and sends it to the server using an output stream. The receiving thread continuously listens for messages from the server and displays them in the console. This approach closely resembles how real-world chat applications work, even though the interface is text-based.

# OUTPUT

![Image](https://github.com/user-attachments/assets/5080d770-aa59-4433-bead-1696f6e34b19)


![Image](https://github.com/user-attachments/assets/110dfc0d-b36a-42a4-a0eb-c9e60229426d)


![Image](https://github.com/user-attachments/assets/20b93875-d0ac-40d5-8d3b-76acf609e29c)



![Image](https://github.com/user-attachments/assets/cee7c307-285e-40bf-b219-fad8be3fb2df)


![Image](https://github.com/user-attachments/assets/28366c1a-7d24-41dc-8316-6841b0790d88)







