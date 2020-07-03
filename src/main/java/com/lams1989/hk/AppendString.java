package com.lams1989.hk;

public class AppendString {

	public String append(String[] values) {

		StringBuffer sb = new StringBuffer(" ");

		for (String value : values) {
			sb.append(value);
			sb.append(" ");
		}

		return sb.toString().trim();
	}
}
