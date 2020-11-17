package com.yesilmen;

import com.yesilmen.abstracts.Phone;
import com.yesilmen.enums.BrandType;
import com.yesilmen.exceptions.BrandNotFoundException;
import com.yesilmen.interfaces.Keyboard;
import com.yesilmen.keyboards.KeyKeyboard;
import com.yesilmen.keyboards.TouchKeyboard;
import com.yesilmen.services.PhoneService;

public class Main {

    public static void main(String[] args) throws BrandNotFoundException {

        Keyboard keyKeyboard = new KeyKeyboard();
        Keyboard touchKeyboard = new TouchKeyboard();

        Phone apple = PhoneService.create(BrandType.APPLE,keyKeyboard);

        apple.setModel("iPhone 12 Pro");
        apple.setImeiNumber("11111111111111111111111");
        apple.setMemory(32768);
        apple.setScreenSize(6.1);
        apple.setVersionNumber("v12");

        System.out.println(apple.toString());


        Phone samsung = PhoneService.create(BrandType.SAMSUNG,keyKeyboard);

        samsung.setModel("S7");
        samsung.setImeiNumber("22222222222222222");
        samsung.setMemory(768);
        samsung.setScreenSize(4.1);
        samsung.setVersionNumber("v7");

        System.out.println(samsung.toString());


    }
}
