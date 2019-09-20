package org.onetwo.cloud.base.config;

import java.io.UnsupportedEncodingException;

import org.eclipse.jgit.util.Base64;
import org.junit.Test;

/**
 * @author wayshall
 * <br/>
 */
public class GitTest {
	
	@Test
	public void testBase64() throws Exception{
		String hostkey = "ecdsa-sha2-nistp256";
		String res = Base64.encodeBytes(hostkey.getBytes("utf-8"));
		System.out.println("res:"+res);
	}

}
