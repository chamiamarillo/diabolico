package ar.edu.unahur.obj2;

import java.util.List;

public class DemonioFuego extends Demonio {


    public DemonioFuego(Integer nivelMaldad, List<Alma> almasCazadas) {
        super(nivelMaldad, almasCazadas);
    }

    @Override
    public void cazar1(Lugar lugar) {
        super.cazar1(lugar);
    }

    @Override
    public void cazar2(Alma alma, Lugar lugar) {
        if (alma.isFriolenta() == false) {
            this.almasCazadas.add(alma);
            lugar.almasDelLugar.remove(alma);
            this.sumarCazadas();
        }else {
            atormentar1(alma);
        }
    }

    @Override
    public void atormentar2(Alma alma) {
//        TipoAlma tipo = new NoFriolenta();
 //       alma.tipoDeAlma = tipo;
        alma.setFriolenta(false);
    }
}
