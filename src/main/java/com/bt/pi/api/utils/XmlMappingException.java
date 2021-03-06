/* (c) British Telecommunications plc, 2009, All Rights Reserved */
package com.bt.pi.api.utils;

public class XmlMappingException extends RuntimeException {
	private static final long serialVersionUID = -3108752903669563236L;

	public XmlMappingException(String message) {
		super(message);
	}

	public XmlMappingException(String message, Exception e) {
		super(message, e);
	}
}
