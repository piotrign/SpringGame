package com.vitae.enums;

import java.util.Arrays;
import java.util.Optional;

public enum KeyboardKey {

	KEY_UNKNOWN(-1),
	KEY_ESCAPE(1),
	KEY_ENTER(1);
	
	private int keyCode;
	
	private KeyboardKey(int keyCode) {
		this.keyCode = keyCode;
	}

	public static KeyboardKey findByCode(final int keyCode) {
		Optional<KeyboardKey> optionalKey = Arrays.asList(values()).stream().filter(key -> key.keyCode == keyCode).findFirst();
		return optionalKey.orElse(KEY_UNKNOWN);
	}
	
}
