package com.bisa.hkshop.wqc.basic.utility;

import java.util.UUID;

/**
 * @author Shengzhao Li
 */
public abstract class GuidGenerator {
	
	public static String generate() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
	
}