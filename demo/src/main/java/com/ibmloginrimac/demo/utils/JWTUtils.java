package com.ibmloginrimac.demo.utils;

import java.util.Date;
import java.util.Map;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;

public class JWTUtils {
   
	public static String build(long exp, Map<String, Object> claims, String secret) {
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
		long nowMillis = System.currentTimeMillis();
		Date expt = new Date(nowMillis + exp * 1000);	
		JwtBuilder builder = Jwts.builder().addClaims(claims)
	            .signWith(signatureAlgorithm, secret.getBytes())
	            .setExpiration(expt);
	    return builder.compact();
	}
	
	public static Map<String, Object> getClaimsFromToken(String token, String secret) {		
		try {
			return Jwts.parser().setSigningKey(secret.getBytes()).parseClaimsJws(token).getBody();
		} catch (ExpiredJwtException | MalformedJwtException | SignatureException mje) {
			return null;
		}
	}
	 
}
