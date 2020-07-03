package com.lams1989.hk;

import junit.framework.TestCase;

public class AppendStringTest extends TestCase{

	public void testAppend() {
		AppendString ap = new AppendString();
		String[] values = {"Hola" , "Mundo", "Perro"};
		
		assertEquals("Hola Mundo Perro", ap.append(values));
	}
}
