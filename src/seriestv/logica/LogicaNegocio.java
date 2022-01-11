
package seriestv.logica;

import java.util.ArrayList;
import java.util.List;
import seriestv.objetos.SerieTV;

/**
 *
 * @author jgm
 */

//Clase que define el comportamiento de la app para recoger y entregar los datos de una serie

public class LogicaNegocio {
    private static List<SerieTV> listaSeries = new ArrayList<>();
    
    //Añade a lista una nueva serie
    public static void agregarSerie(SerieTV serie){
        listaSeries.add(serie);
    }
    
    //Devuelve el contenido de la lista de series
    public static List<SerieTV> getListaSeries() {
        return listaSeries;
    }
    
}
