package com.yesilmen.keyboards;

import com.yesilmen.interfaces.Keyboard;

public class KeyKeyboard implements Keyboard {
    @Override
    public void read() {
        System.out.println("Read from keys...");
    }
}
