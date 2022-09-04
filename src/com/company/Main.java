package com.company;

import com.company.controllers.OrderController;
import com.company.enums.CompassEnum;
import com.company.enums.OrderEnum;
import com.company.models.GridClass;
import com.company.models.IHooverClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("****** Bienvenue dans IHoover *******");
        GridClass grid=new GridClass(10, 10) ;
        IHooverClass positionInitiale=new IHooverClass(5, 5, CompassEnum.N);
        List<OrderEnum> orders =new ArrayList<>(Arrays.asList(OrderEnum.D,OrderEnum.A,OrderEnum.D,OrderEnum.A,OrderEnum.D,OrderEnum.A,OrderEnum.D,OrderEnum.A,OrderEnum.A));
        IHooverClass iHooverArrived= OrderController.getArrivedIHoover(grid,positionInitiale,orders);
        System.out.println("position finale de l'aspirateur est "+ iHooverArrived);
        System.out.println("****** Fin du programme ******");

    }
}
