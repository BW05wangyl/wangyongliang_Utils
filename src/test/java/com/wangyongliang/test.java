package com.wangyongliang;

import org.junit.Test;

import com.wangyongliang.StringUtils;

/**
 * @author 刘吉飞
 *
 * 2019年9月9日
 */
public class test {
	@Test
	public void toHtml(){
		String string = StringUtils.toHtml1("9月5日一大早，又有了新情况。\n上午9点多，传出中美经贸高级别磋商牵头人通话的消息。"
				+ "\n>9月5日上午，中共中央政治局委员、国务院副总理、中美全面经济对话中方牵头人刘鹤应约与美国贸易代表莱特希泽、财政部长姆努钦通话。");
		System.out.println(string);
	}
	
	@Test
	public void isPhone(){
		boolean b = StringUtils.isPhone("13711111111");
		System.out.println(b);
	}
	@Test
	public void isEmail(){
		boolean b = StringUtils.isEmail("1983919735@qq.com");
		System.out.println(b);
	}
}
