package ar.edu.unahur.obj2;

import java.util.List;

public class DemonioSombra extends Demonio {

    public DemonioSombra(Integer nivelMaldad) {
        super(nivelMaldad);
    }

    @Override
    public void cazar1(Lugar lugar) {
        super.cazar1(lugar);
    }

    @Override
    public void cazar2(Alma alma, Lugar lugar) {
        if (alma.getValor() < 50) {
            this.almasCazadas.add(alma);
            lugar.almasDelLugar.remove(alma);
            this.sumarCazadas();
        }else {
            atormentar1(alma);
        }
    }

    @Override
    public void atormentar2(Alma alma) {
        alma.setValor(alma.getValor() / 2);
    }
}
