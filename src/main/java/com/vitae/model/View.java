package com.vitae.model;

import com.vitae.enums.KeyboardKey;

public interface View {
	public void renderFrame();
	public void handleKey(KeyboardKey key);
}
