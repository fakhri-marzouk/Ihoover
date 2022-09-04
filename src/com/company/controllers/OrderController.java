package com.company.controllers;

import com.company.enums.OrderEnum;
import com.company.models.GridClass;
import com.company.models.IHooverClass;
import java.util.List;

public class OrderController {
    private static final int UNIT_DISTANCE = 1;
    public static IHooverClass getArrivedIHoover(GridClass grid, IHooverClass iHoover, List<OrderEnum> orders) {

        for (OrderEnum orderEnum : orders) {
            switch (orderEnum) {
                case A:
                    switch (iHoover.getDirection()) {
                        case 0:
                            iHoover.setY(iHoover.getY() + UNIT_DISTANCE);
                            break;
                        case 1:
                            iHoover.setX(iHoover.getX() + UNIT_DISTANCE);
                            break;
                        case 2:
                            iHoover.setY(iHoover.getY() - UNIT_DISTANCE);
                            break;
                        case 3:
                            iHoover.setX(iHoover.getX() - UNIT_DISTANCE);
                            break;
                    }
                    // Vérifier que les coordonnées de l'aspirateur sont toujours dans le cadre initial
                    CheckController.checkCadre(grid, iHoover);
                    break;
                case G:
                    iHoover.setDirectionAndCompass(3 + iHoover.getDirection());
                    break;
                case D:
                    iHoover.setDirectionAndCompass(1 + iHoover.getDirection());
                    break;

                default:
                    break;
            }

        }
        return iHoover;
    }
}
