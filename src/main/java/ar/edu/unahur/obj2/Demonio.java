package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public abstract class Demonio extends Diablo {

    public Integer nivelMaldad;
    public List<Alma> almasCazadas = new ArrayList<>();
    public int contadorCazadas;
    public int contadorAtormentadas;

    public Demonio(Integer nivelMaldad) {
        this.nivelMaldad = nivelMaldad;
    }

    public void cazar1(Lugar lugar) {
        for (Alma alma: lugar.almasDelLugar) {
            if (alma.getBondad() < this.nivelMaldad) {  // verifico que la bondad del alma sea inferior a la maldad del demonio
                this.cazar2(alma, lugar);
            }else {
                atormentar1(alma);
            }
        }
        this.aumentarNivel();
    }

    public List<Alma> getAlmasCazadas() {
        return almasCazadas;
    }

    public abstract void cazar2(Alma alma, Lugar lugar);

    public void atormentar1(Alma alma) {
        alma.setBondad(alma.getBondad() - 5);
        atormentar2(alma);
        this.sumarAtormentadas();
    }

    public abstract void atormentar2(Alma alma);

    public void sumarCazadas() {
        this.contadorCazadas++;
    }

    public void sumarAtormentadas() {
        this.contadorAtormentadas++;
    }

    public void aumentarNivel() {
        this.nivelMaldad = this.nivelMaldad + this.contadorAtormentadas + (this.contadorCazadas * 2);
    }
}
