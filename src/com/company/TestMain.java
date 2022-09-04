package com.company;

import com.company.controllers.OrderController;
import com.company.enums.CompassEnum;
import com.company.enums.OrderEnum;
import com.company.models.GridClass;
import com.company.models.IHooverClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestMain {

    @Test
    public void testMain(){
        GridClass grid=new GridClass(10, 10) ;
        IHooverClass positionInitiale=new IHooverClass(5, 5, CompassEnum.N);
        List<OrderEnum> orders =new ArrayList<>(Arrays.asList(OrderEnum.D,OrderEnum.A,OrderEnum.D,OrderEnum.A,OrderEnum.D,OrderEnum.A,OrderEnum.D,OrderEnum.A,OrderEnum.A));
        IHooverClass iHooverArrived= OrderController.getArrivedIHoover(grid,positionInitiale,orders);
        assertEquals(iHooverArrived.getX(),5);
        assertEquals(iHooverArrived.getY(), 6);
        assertEquals(iHooverArrived.getCompass(), CompassEnum.N);
    }
}
