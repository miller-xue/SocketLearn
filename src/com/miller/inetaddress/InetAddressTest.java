package com.miller.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @author Miller
 * InetAddress
 */
public class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		// 获取本机的InetAddress实例
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("计算机名：" + address.getHostName());
		System.out.println("IP地址：" + address.getHostAddress());
		
		byte[] bytes = address.getAddress();
		System.out.println("字节数组形式的IP：" + Arrays.toString(bytes));
		
		System.out.println(address); //直接输出InetAddress对象
		
		System.out.println("-------------------------------------");
		
		InetAddress address2 = InetAddress.getByName("DESKTOP-I5SPDUP");
		System.out.println("计算机名：" + address2.getHostName());
		System.out.println("IP地址：" + address2.getHostAddress());
		
		System.out.println("-------------------------------------");
		
		InetAddress address3 = InetAddress.getByName("192.168.163.1");
		System.out.println("计算机名：" + address3.getHostName());
		System.out.println("IP地址：" + address3.getHostAddress());
		
	}
}
