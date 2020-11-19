package com.yesilmen;

import com.yesilmen.abstracts.Phone;
import com.yesilmen.brands.Apple;
import com.yesilmen.brands.Samsung;
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

        //Apple apple = new Apple(keyKeyboard);
        Apple apple = (Apple) PhoneService.create(BrandType.APPLE, keyKeyboard);

        apple.setModel("iPhone 12 Pro");
        apple.setImeiNumber("11111111111111111111111");
        apple.setMemory(32768);
        apple.setScreenSize(6.1);
        apple.setVersionNumber("v12");

        System.out.println(apple.toString());

        apple.call("5011112233");
        apple.sendSms("5011112233", "Merhaba.....");
        apple.videoCall("5011112233");
        apple.shareFile();


        //Samsung samsung = new Samsung(touchKeyboard);
        Samsung samsung = (Samsung) PhoneService.create(BrandType.SAMSUNG, touchKeyboard);

        samsung.setModel("S7");
        samsung.setImeiNumber("22222222222222222");
        samsung.setMemory(768);
        samsung.setScreenSize(4.1);
        samsung.setVersionNumber("v7");

        System.out.println(samsung.toString());

        samsung.call("5011112233");
        samsung.sendSms("5011112233","Merhaba......");
        samsung.listen();
        samsung.share();


    }
}
