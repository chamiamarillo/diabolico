package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class Alma {

//    public TipoAlma tipoDeAlma;
    public boolean friolenta = true;
    private double bondad;
    private double valor;
    public List<TecnicaDefensa> tecnicaDefensas = new ArrayList<>();


    public Alma(boolean friolenta, Integer bondad, Integer valor, List<TecnicaDefensa> tecnicaDefensas) {
        this.friolenta = friolenta;
        this.bondad = bondad;
        this.valor = valor;
        this.tecnicaDefensas = tecnicaDefensas;
    }


    public void setFriolenta(boolean friolenta) {
        this.friolenta = friolenta;
    }

    public boolean isFriolenta() {
        return friolenta;
    }

    /*

    public void setTipoDeAlma(TipoAlma tipoDeAlma2) {
        this.tipoDeAlma = tipoDeAlma2;
    }

*/

    public double getValor() {
        TecnicaDefensa lucha = new TecnicaLucha();
        int conta = 0;
        double resultado = 0;
        for (TecnicaDefensa tecnica: this.tecnicaDefensas) {
            if (tecnica == lucha && conta == 0) {
                resultado = this.valor * 2;
            }
        }
        if (conta == 0){
            resultado = this.valor;
        }
        return resultado;
    }

    public double getBondad() {
        TecnicaDefensa cruz = new TecnicaCruz();
        int conta = 0;
        double resultado = 0;
        for (TecnicaDefensa tecnica: this.tecnicaDefensas) {
            if (tecnica == cruz) {
                resultado = this.bondad + 100;
            }
        }
        if (conta == 0){
            resultado = this.bondad;
        }
        return resultado;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setBondad(double bondad) {
        this.bondad = bondad;
    }

    public void agregarTecnicaDefensas(TecnicaDefensa tecnica) {

        this.tecnicaDefensas.add(tecnica);
        TecnicaDefensa supervivencia = new TecnicaSupervivencia();
        if (tecnica == supervivencia){
//            TipoAlma tipo = new NoFriolenta();
//            this.tipoDeAlma = tipo;
            this.setFriolenta(false);
        }
    }
}
