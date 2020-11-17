package com.yesilmen.keyboards;

import com.yesilmen.interfaces.Keyboard;

public class TouchKeyboard implements Keyboard {
    @Override
    public void read() {
        System.out.println("Read from touch screen...");
    }
}
