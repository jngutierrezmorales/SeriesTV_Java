
package seriestv.objetos;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jgm
 */

//Clase que define las propiedades y metodos para trabajar con los datos de una serie

public class SerieTV {
    private String nombreSerie;
    private String sinopsis;
    private String numTemporadas;
    private Date fechaEstreno;
    
    //Permite establecer el formato de la fecha aplicado a Fecha Estreno
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public SerieTV(String nombreSerie, String sinopsis, String numTemporadas, Date fechaEstreno) {
        this.nombreSerie = nombreSerie;
        this.sinopsis = sinopsis;
        this.numTemporadas = numTemporadas;
        this.fechaEstreno = fechaEstreno;
    }

    public String getNombreSerie() {
        return nombreSerie;
    }

    public void setNombreSerie(String nombreSerie) {
        this.nombreSerie = nombreSerie;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(String numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }
    
    //Transforma las propiedades de una serie en forma de array tipo string
    public String[] toArrayString(){
        String[] s = new String[4];
        s[0] = nombreSerie;
        s[1] = sinopsis;
        s[2] = numTemporadas;
        s[3] = sdf.format(fechaEstreno);
        return s;
    }
}
