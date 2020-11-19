package com.yesilmen.brands;

import com.yesilmen.abstracts.Phone;
import com.yesilmen.interfaces.Keyboard;
import com.yesilmen.interfaces.Mp3;
import com.yesilmen.interfaces.ScreenShare;
import com.yesilmen.interfaces.ShareFile;

public class Samsung extends Phone implements Mp3, ScreenShare {

    public Samsung(Keyboard keyboard) {
    }

    @Override
    public void listen() {
        System.out.println("Listening mp3....\n");
    }

    @Override
    public void share() {
        System.out.println("Sharing screen....\n");
    }
}
