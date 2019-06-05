package ar.edu.unahur.obj2;

import java.util.List;

public class DemonioHielo extends Demonio{


    public DemonioHielo(Integer nivelMaldad, List<Alma> almasCazadas) {
        super(nivelMaldad, almasCazadas);
    }

    @Override
    public void cazar1(Lugar lugar) {
        super.cazar1(lugar);
    }

    @Override
    public void cazar2(Alma alma, Lugar lugar) {
 //       if (alma.tipoDeAlma.friolenta() == true) {
            if (alma.isFriolenta() == true) {
            this.almasCazadas.add(alma);
            lugar.almasDelLugar.remove(alma);
            this.sumarCazadas();
        }else {
            atormentar1(alma);
        }
    }

    @Override
    public void atormentar2(Alma alma) {
        TecnicaDefensa supervivencia = new TecnicaSupervivencia();
        int tieneSupervivencia = 0;
        for (TecnicaDefensa tecnica: alma.tecnicaDefensas) {
            if (tecnica == supervivencia) {
                tieneSupervivencia++;
            }
        }
        if (tieneSupervivencia == 0){
 //           TipoAlma tipo = new Friolenta();
 //           alma.tipoDeAlma = tipo;
            alma.setFriolenta(true);  // creo que esta arreglado el atributo de alma
        }

    }
}
