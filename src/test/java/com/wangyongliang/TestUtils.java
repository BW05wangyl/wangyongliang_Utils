package com.wangyongliang;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.junit.Test;

import com.wangyongliang.FileUtil;
import com.wangyongliang.StringUtils;

/**
 * @author 刘吉飞
 *
 * 2019年9月14日
 */
public class TestUtils {

	/*
	 * String str="asd爱上的我去\\\r大神发\n大神夫人为ver饿的我\n"; String html =
	 * StringUtils.toHtml(str); System.out.println(html);
	 */
	
	/*@Test
	public void tohtml() {
		String str = "稍等哈\r\n和健康\n大家哈\r和对啊撒\n";
		String html = StringUtils.toHtml(str);
		System.out.println();
		System.out.println(html);
	}*/
	
	/*
	@Test
	public void testFileToBean() throws NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, IOException {
		String fileNameString = "D:\\CMS\\Utils\\src\\main\\resources\\refinfo";
		List list = FileUtil.fileToBean(fileNameString, RegisterInfo.class
				.getConstructor(String.class, String.class, String.class,
						String.class, String.class, String.class, String.class,
						String.class, String.class, String.class

				));

		System.out.println("list is " + list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list is " + list.get(i));
		}

	}*/
	
	/*@Test
	public void testDir(){
		String pathString = "D:\\内网通\\文件\\拾间\\CMS\\main\\webapp\\resource\\js";
		List<String> fileList = FileUtil.getFileList(pathString);
		for (String string : fileList) {
			System.out.println(" string  is "  + string);
		}
	}*/
	
	/*@Test
	public void testReadFile() throws IOException{
		String fileName = "D:\\内网通\\文件\\拾间\\CMS\\main\\webapp\\resource\\js\\jquery-3.2.1.js";
		String string = FileUtil.readFile(fileName);
		string = string.replaceAll("\\\n", "<br/>\n");
		System.out.println(" string  is " + string);
	}
*/
} 
