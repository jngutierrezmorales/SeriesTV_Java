
package seriestv.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jgm
 */

//Clase para establecer listeners propios para recoger eventos propios de la app

public class MiActionListener implements ActionListener {
    
    //Eventos
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("MiActionListener: El usuario se ha registrado correctamente en el sistema");
    }
    
}
