package com.yesilmen.brands;

import com.yesilmen.abstracts.Phone;
import com.yesilmen.interfaces.Keyboard;
import com.yesilmen.interfaces.ShareFile;
import com.yesilmen.interfaces.VideoCall;


public class Apple extends Phone implements VideoCall, ShareFile {

    Keyboard keyboard;

    public Apple(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public void videoCall(String number) {
        System.out.println("video calling...\n");
    }

    @Override
    public void shareFile() {
        System.out.println("file sharing...\n");
    }

    public void read() {
        keyboard.read();
    }
}
