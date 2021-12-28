/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Controller.controller_hotel;
import Manajemen_Hotel.Kamar;
import Manajemen_Hotel.Pelanggan;
import Manajemen_Hotel.Sewa;
import View.Hotel_interface;
import java.time.LocalDate;
import java.util.List;

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
