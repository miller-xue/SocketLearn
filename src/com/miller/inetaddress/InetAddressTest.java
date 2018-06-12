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
		// ��ȡ������InetAddressʵ��
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("���������" + address.getHostName());
		System.out.println("IP��ַ��" + address.getHostAddress());
		
		byte[] bytes = address.getAddress();
		System.out.println("�ֽ�������ʽ��IP��" + Arrays.toString(bytes));
		
		System.out.println(address); //ֱ�����InetAddress����
		
		System.out.println("-------------------------------------");
		
		InetAddress address2 = InetAddress.getByName("DESKTOP-I5SPDUP");
		System.out.println("���������" + address2.getHostName());
		System.out.println("IP��ַ��" + address2.getHostAddress());
		
		System.out.println("-------------------------------------");
		
		InetAddress address3 = InetAddress.getByName("192.168.163.1");
		System.out.println("���������" + address3.getHostName());
		System.out.println("IP��ַ��" + address3.getHostAddress());
		
	}
}
