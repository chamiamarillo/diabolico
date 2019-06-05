package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class Lugar {

    public String nombreDelLugar;
    public List<Alma> almasDelLugar;


    public Lugar(String nombreDelLugar, List<Alma> almasDelLugar) {
        this.nombreDelLugar = nombreDelLugar;
        this.almasDelLugar = almasDelLugar;
    }

    public void agregarAlmasDelLugar(Alma almasDelLugar) {
        this.almasDelLugar.add(almasDelLugar);
    }
}
