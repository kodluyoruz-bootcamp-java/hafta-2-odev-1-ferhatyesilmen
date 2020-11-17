package com.yesilmen.brands;

import com.yesilmen.abstracts.Phone;
import com.yesilmen.interfaces.Keyboard;
import com.yesilmen.interfaces.Mp3;
import com.yesilmen.interfaces.ShareFile;

public class Samsung extends Phone implements Mp3, ShareFile {

    public Samsung(Keyboard keyboard) {
    }

    @Override
    public void listen() {
        System.out.println("Listening mp3....");
    }

    @Override
    public void shareFile() {
        System.out.println("Sharing screen....");
    }
}
