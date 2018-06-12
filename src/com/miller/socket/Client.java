package com.miller.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Miller �ͻ���
 */
public class Client {
	public static void main(String[] args) {
		try {
			// 1.�����ͻ���Socket,�ƶ���������ַ�Ͷ˿�
			Socket socket = new Socket("192.168.163.1", 8080);
			// 2.��ȡ�����,��������˷�����Ϣ
			OutputStream os = socket.getOutputStream(); // �ֽ������
			PrintWriter pw = new PrintWriter(os);// ���������װΪ��ӡ��
			pw.write("�û�����admin;���룺123");
			pw.flush();
			socket.shutdownOutput();
			// 3.��ȡ������,����ȡ�������˵���Ӧ��Ϣ
			InputStream is = socket.getInputStream(); // �ֽ�������
			InputStreamReader isr = new InputStreamReader(is); // �ֽ�ת�ַ�
			BufferedReader br = new BufferedReader(isr);// Ϊ��������ӻ���

			String info = null;
			while ((info = br.readLine()) != null) {
				System.out.println("���ǿͻ���,������˵��" + info);
			}
			// 4.�ر���Դ
			socket.shutdownInput();
			br.close();
			isr.close();
			is.close();
			pw.close();
			os.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
