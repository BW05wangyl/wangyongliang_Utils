package com.wangyongliang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;


/**
 * 
 * @author zhuzg
 *
 */
public class FileUtil {
	
	public static Logger log = Logger.getLogger(FileUtil.class); 
	
	/**
	 * 如果是目录，则下面的文件和所有子目录中的文件都要删除
	     使用递归。涉及内容。判断目录的存在性，判断是否为目录或文件，删除。

	 * @param fileName
	 */
	public static void delFilePath(String fileName) {
		
		File file = new File(fileName);
		// 文件不存在  则直接返回
		if(!file.exists()) {
			return;
		}
		
		// 如果是文件  则删除后返回
		if(file.isFile()) {
			log.info(" 删除文件 " + fileName);
			file.delete();
			return;
		}
		
		//如果是目录
		if(file.isDirectory()) {
			// 则列出目录下所有的子目录和文件
			 String[] list = file.list();
			 //针对每一项
			 for (String subPath : list) {
				 //调用删除功能
				 delFilePath(fileName + "/" + subPath);
			}
			 log.info(" ------------ 删除文件 夹 ： " + fileName); 
			file.delete(); 
		}
		
		
	}
	
	//3.5.2获取文件扩展名
	/**
	 * 
	 * @param fileName
	 * @return
	 */
	public static String getSuffix(String fileName) {
		int dotIndex = fileName.lastIndexOf('.');
		//没有扩展名
		if(dotIndex<0) {
			return "";
		}
		//最后一位是 .
		if(dotIndex>=fileName.length()) {
			return "";
		}
		//
		return fileName.substring(dotIndex+1);
	}
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public static String getSystemProp(String key) {
		
		String propValue = System.getProperty(key);
		return propValue;
		
	}
	
	/**
	 * 返回文件以指定单位大小表示
	 */
	public long  getSize(String fileName,FileUnit fileUnit) {
		File file = new File(fileName);
		
		
		long  size = file.length();
		switch (fileUnit) {
			case B:
				return size;
			case KB:
				return size/1024;
			case MB:
				return size/1024/1024;
			case GB:
				return size/1024/1024/1024;
			case TB:
				return size/1024/1024/1024/1024;
			case PB:
				return size/1024/1024/1024/1024/1024;
			default:
				return 0;
		}
		
	}
	
	/**
	 * 使用工具包工程中的流工具类读取该文本文件，且不得乱码。如果输入流使用了FileInputStream
	 */
	public static List fileToBean(String fileName, Constructor constructor)
			throws IOException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		File file = new File(fileName);
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String lineString = null;
		List list = new ArrayList();
		while ((lineString = bufferedReader.readLine()) != null) {
			String[] split = lineString.split("\\|\\|");
			Object object = constructor.newInstance(split);
			list.add(object);
		}

		return list;

	}
	
	
	/*便利文件夹
*/	
	public static List<String> getFileList(String pathName){
		String[] list = new File(pathName).list();
		 List<String> fileList = new ArrayList<String>();
		for (String string : list) {
			File subFile = new File(pathName + "\\" + string);
			if(subFile!=null && subFile.exists() && subFile.isFile())
				fileList.add(pathName + "\\" + string);
		}
		return fileList;
		
	}
	
	/**
	 * 读取文件内容
	 * @throws IOException 
	 */
	public static String readFile(String fileName) throws IOException {

		StringBuilder sb = new StringBuilder();
		
		File file = new File(fileName);
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String lineString = null;
		
		while ((lineString = bufferedReader.readLine()) != null) {
			sb.append(lineString).append("\n");
		}
		return sb.toString();
	}
	

	public static void fileToBean(String string, Class<String> class1,
			Class<String> class2, Class<String> class3, Class<String> class4,
			Class<String> class5) {
		// TODO Auto-generated method stub
		
	}

	
	
}
