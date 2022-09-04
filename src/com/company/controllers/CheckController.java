package com.company.controllers;

import com.company.models.GridClass;
import com.company.models.IHooverClass;

public class CheckController {
    public static void checkCadre(GridClass gridClass, IHooverClass iHooverClass){
        //je vérifie que je reste dans le cadre
        if(iHooverClass.getY()>gridClass.getHeight() ||iHooverClass.getX()>gridClass.getWidth()){
            System.out.println("La destination de l'aspirateur est hors cadre,la dimension du cadre est:{"+gridClass.getHeight()+";"+gridClass.getWidth()+"}");
            System.exit(0);
        }
    }
}
