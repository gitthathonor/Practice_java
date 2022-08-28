package example.sock;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	
	ServerSocket serverSocket;
	
	public void init() {
		try {
			serverSocket = new ServerSocket(10000);
			Socket socket = serverSocket.accept();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		MyServer ms = new MyServer();
		
	}
}
