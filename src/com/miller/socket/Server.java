package com.miller.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Miller
 * ����TCPЭ���Socketͨ��,ʵ���û���½
 * ��������
 */
public class Server {
	public static void main(String[] args) {
		try {
			// 1.����һ����������Socket ,��ServerSocket, ָ���󶨶˿�,�������˶˿�
			ServerSocket serverSocket = new ServerSocket(8080);
			// 2.����accept()������ʼ����,�ȴ��ͻ��˵�����
			System.out.println("***��������������,�ȴ��ͻ�������***");
			Socket socket = serverSocket.accept();
			// 3.��ȡ������, ����ȡ�ͻ�����Ϣ
			InputStream is = socket.getInputStream(); //�ֽ�������
			InputStreamReader isr = new InputStreamReader(is); // �ֽ�ת�ַ�
			BufferedReader br = new BufferedReader(isr);// Ϊ��������ӻ���
			String info = null;
			while((info = br.readLine()) != null){
				System.out.println("���Ƿ�����,�ͻ���˵��" + info);
			}
			
			
			//4.��ȡ�����,��Ӧ�ͻ�������
			OutputStream os = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			pw.write("��ӭ��");
			pw.flush();
			
			// 5.�ر���
			socket.shutdownOutput();
			socket.shutdownInput(); // �ر�������
			pw.close();
			os.close();
			br.close();
			isr.close();
			is.close();
			socket.close();
			serverSocket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
