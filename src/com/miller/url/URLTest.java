package com.miller.url;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Miller
 * 统一资源定位符,表示Internet上某一资源的地址
 * URL常用方法
 */
public class URLTest {
	public static void main(String[] args)  {
		try {
			// 创建一个URL实例
			URL imooc = new URL("http://www.imooc.com");
			
			URL url = new URL(imooc,"/index.html?username=tom#test");//?后是参数 #后面是锚点
			System.out.println("协议：" + url.getProtocol());
			System.out.println("主机：" + url.getHost());
			// 如果未指定端口号,则根据协议的不同使用默认的端口号,此时getPort方法返回值为-1
			System.out.println("端口：" + url.getPort());
			
			System.out.println("文件路径：" + url.getPath());
			
			System.out.println("文件名称：" + url.getFile()); 
			
			System.out.println("相对路径：" + url.getRef()); //锚点
			
			System.out.println("查询字符串：" + url.getQuery()); //参数
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
