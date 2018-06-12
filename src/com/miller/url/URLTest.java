package com.miller.url;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Miller
 * ͳһ��Դ��λ��,��ʾInternet��ĳһ��Դ�ĵ�ַ
 * URL���÷���
 */
public class URLTest {
	public static void main(String[] args)  {
		try {
			// ����һ��URLʵ��
			URL imooc = new URL("http://www.imooc.com");
			
			URL url = new URL(imooc,"/index.html?username=tom#test");//?���ǲ��� #������ê��
			System.out.println("Э�飺" + url.getProtocol());
			System.out.println("������" + url.getHost());
			// ���δָ���˿ں�,�����Э��Ĳ�ͬʹ��Ĭ�ϵĶ˿ں�,��ʱgetPort��������ֵΪ-1
			System.out.println("�˿ڣ�" + url.getPort());
			
			System.out.println("�ļ�·����" + url.getPath());
			
			System.out.println("�ļ����ƣ�" + url.getFile()); 
			
			System.out.println("���·����" + url.getRef()); //ê��
			
			System.out.println("��ѯ�ַ�����" + url.getQuery()); //����
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
