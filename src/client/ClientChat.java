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
			System.out.println("������ ����Ǿ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���߽��ϴ�.");
			e.printStackTrace();
		}
		start();
	}

	public void start() {
		sc = new Scanner(System.in);
		while(true) {
		System.out.println("������ ���� �޼����� �Է��ϼ���.");
		String msg = sc.nextLine();
		if(msg.equals("exit!"))
			sc.close();
		
		System.out.println(msg);
	}
		}
}
