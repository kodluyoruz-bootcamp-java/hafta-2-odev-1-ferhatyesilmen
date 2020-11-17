package com.yesilmen.services;

import com.yesilmen.abstracts.Phone;
import com.yesilmen.brands.Apple;
import com.yesilmen.brands.Samsung;
import com.yesilmen.enums.BrandType;
import com.yesilmen.exceptions.BrandNotFoundException;
import com.yesilmen.interfaces.Keyboard;

public class PhoneService {

    public static Phone create(BrandType brand, Keyboard keyboard) throws BrandNotFoundException {


        switch (brand) {
            case APPLE:
                return new Apple(keyboard);
            case SAMSUNG:
                return new Samsung(keyboard);
            default:
                throw new BrandNotFoundException("Brand not found....");
        }


    }
}
