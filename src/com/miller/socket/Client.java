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
 * @author Miller 客户端
 */
public class Client {
	public static void main(String[] args) {
		try {
			// 1.创建客户端Socket,制定服务器地址和端口
			Socket socket = new Socket("192.168.163.1", 8080);
			// 2.获取输出流,向服务器端发送信息
			OutputStream os = socket.getOutputStream(); // 字节输出流
			PrintWriter pw = new PrintWriter(os);// 把输出流包装为打印流
			pw.write("用户名：admin;密码：123");
			pw.flush();
			socket.shutdownOutput();
			// 3.获取输入流,并读取服务器端的相应信息
			InputStream is = socket.getInputStream(); // 字节输入流
			InputStreamReader isr = new InputStreamReader(is); // 字节转字符
			BufferedReader br = new BufferedReader(isr);// 为输入流添加缓冲

			String info = null;
			while ((info = br.readLine()) != null) {
				System.out.println("我是客户端,服务器说：" + info);
			}
			// 4.关闭资源
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
