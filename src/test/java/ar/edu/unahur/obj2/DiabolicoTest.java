package ar.edu.unahur.obj2;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DiabolicoTest {


    @Test
    public void prueba1() {

        Alma jorge = new Alma(true, 20, 40);
        Alma javier = new Alma(false, 30, 60);
        Alma rama = new Alma(false, 15, 25);
        Alma pepe = new Alma(true, 80, 100);


        Lugar unahur = new Lugar("unahur", null);
       // unahur.agregarAlmasDelLugar(jorge);
        unahur.agregarAlmasDelLugar(javier);
       // unahur.agregarAlmasDelLugar(rama);
      //  unahur.agregarAlmasDelLugar(pepe);


        Demonio fueguito = new DemonioFuego(40, null);

        fueguito.cazar1(unahur);

        Assert.assertEquals(fueguito.getAlmasCazadas(), javier);



    }
}