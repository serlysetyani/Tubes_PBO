/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Controller.controller_hotel;
import View.Hotel_interface;

/**
 *
 * @author SUYANTO
 */
public class driver_hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hotel_interface view = new Hotel_interface();
        controller_hotel c = new controller_hotel(view);
        
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
    
}
