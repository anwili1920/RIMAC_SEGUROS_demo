package com.ibmloginrimac.demo.utils;

public interface Hasher {
	String hash(String decoded);
	boolean compare(String decoded, String hashed);
}
