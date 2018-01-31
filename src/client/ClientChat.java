package client;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientChat {
	String ip = "70.12.111.142";
	int port = 8888;
	Socket socket;
	Scanner sc = null;
	
	public ClientChat() {

	}

	public ClientChat(String ip, int port) {
		this.ip = ip;
		this.port = port;
		
		try {
			socket = new Socket(ip, port);
			System.out.println("서버와 연결되었습니다.");
		} catch (IOException e) {
			System.out.println("망했습니다.");
			e.printStackTrace();
		}
		start();
	}

	public void start() {
		sc = new Scanner(System.in);
		while(true) {
		System.out.println("보내고 싶은 메세지를 입력하세요.");
		String msg = sc.nextLine();
		if(msg.equals("exit!"))
			sc.close();
		
		System.out.println(msg);
	}
		}
}
