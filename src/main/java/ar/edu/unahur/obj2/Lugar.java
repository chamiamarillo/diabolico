package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class Lugar {

    public String nombreDelLugar;
    public List<Alma> almasDelLugar;


    public Lugar(String nombreDelLugar) {

        this.nombreDelLugar = nombreDelLugar;
        almasDelLugar = new ArrayList<>();
    }

    public void agregarAlmasDelLugar(Alma almasDelLugar) {
        this.almasDelLugar.add(almasDelLugar);
    }
}
