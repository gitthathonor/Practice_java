package example.sock;

import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
	public static void main(String[] args) {
		new WebServer().run();
	}
	
	public void run() {
		ServerSocket serverSocket;
		
		try {
			serverSocket = new ServerSocket(10000);
			while(true) {
				try {
					Socket client = serverSocket.accept();
					new Thread(()->handleClient(client)).start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void handleClient(Socket client) {
		// 1. 클라이언트의 요청 읽어오기
		// 2. 클라이언트의 요청에 맞는 작업 수행하기
		// 3. 클라이언트에게 응답 작성하기
		// 4. 소켓 닫기
	}
	
	
}
