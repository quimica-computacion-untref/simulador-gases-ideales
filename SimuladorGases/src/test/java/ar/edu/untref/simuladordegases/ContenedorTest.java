package ar.edu.untref.simuladordegases;

import ar.edu.untref.simuladordegases.implementacion.Contenedor;
import ar.edu.untref.simuladordegases.implementacion.Particula;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

/**
 * Created by synysterlove on 20/10/16.
 */
public class ContenedorTest {

    private Contenedor contenedor;

    @Before
    public void crearContenedorConParticulas() {

        this.contenedor = new Contenedor();
        for(int i=0; i < 20; i++) {

            Particula particula = new Particula(contenedor);
            contenedor.agregarParticula(particula);

        }

    }

    @Test
    public void testQueModifiqueCorrectamenteLaTemperaturaDelContenedorAlCambiarla() {

        this.contenedor.modificarTemperatura(100);
        Assert.assertEquals(100, this.contenedor.getTemperatura(), 0.0);

    }

    @Test
    public void testQueModifiqueCorrectamenteLaVelocidadDeLasParticulasAlCambiarLaTemperaturaDelContenedor() {

        this.contenedor.modificarTemperatura(100);
        for(Particula particula: this.contenedor.getParticulas()) {

            Assert.assertEquals(1, particula.getVelocidad(), 0.0);

        }
    }

    @Test
    public void testQueModifiqueCorrectamenteElColorDeLasParticulasAlCambiarLaTemperaturaDelContenedor() {

        this.contenedor.modificarTemperatura(100);
        Color color = new Color(255,255,0);
        for(Particula particula: this.contenedor.getParticulas()) {

            Assert.assertEquals(color, particula.getColor());

        }
    }

    @Test
    public void testQueAgregueDiezParticulas() {

        this.contenedor.agregarParticulas(10);
        Assert.assertEquals(30, this.contenedor.getParticulas().size());

    }

    /*
    @Test
    public void testLasParticulasAgregadasSeanDelColorCorrecto() {

        this.contenedor.agregarParticulas(10);
        Color color = new Color(255,255*200/500,0);
        for(Particula particula: this.contenedor.getParticulas()) {

            Assert.assertEquals(color, particula.getColor());

        }
    }*/

}