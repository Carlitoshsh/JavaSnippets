/**
 * <p>Copyright: Copyright (c) 2019</p>
 *
 * <h3>License</h3>
 *
 * Copyright (c) 2016 by Jonatan Gomez-Perdomo. <br>
 * All rights reserved. <br>
 *
 * <p>Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * <ul>
 * <li> Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * <li> Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * <li> Neither the name of the copyright owners, their employers, nor the
 * names of its contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 * </ul>
 * <p>THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 *
 *
 * @author <A HREF="https://dis.unal.edu.co/~jgomezpe/"> Jonatan Gomez-Perdomo </A>
 * (E-mail: <A HREF="mailto:jgomezpe@unal.edu.co">jgomezpe@unal.edu.co</A> )
 * @version 1.0
 */
package semana2.relaciones;

import semana2.relaciones.ciudad.Ciudad;
import semana2.relaciones.ciudad.Posicion;
import semana2.relaciones.ciudad.Sitio;
import semana2.relaciones.vehiculo.Automovil;
import semana2.relaciones.vehiculo.Deportivo;
import semana2.relaciones.vehiculo.Furgon;
import semana2.relaciones.vehiculo.Platon;
import semana2.relaciones.vehiculo.Vehiculo;

/**
 * Main class
 * 
 * @author jgomez
 *
 */
public class Principal {
	/**
	 * Stops the program 100 milliseconds
	 */
	public static void pausar() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Main program
	 * 
	 * @param args Not used in this program
	 */
	public static void main(String[] args) {
		Automovil automovil = new Automovil(new Posicion(5, 10), 5);
		Deportivo deportivo = new Deportivo(new Posicion(15, 40), 5);
		Platon camioneta = new Platon(new Posicion(20, 2), 3, 4);
		camioneta.llevar(1234);
		Furgon furgon = new Furgon(new Posicion(2, 50), 3, 4);
		furgon.llevar("AA");

		Vehiculo[] vehiculo = new Vehiculo[4];
		vehiculo[0] = automovil;
		vehiculo[1] = camioneta;
		vehiculo[2] = deportivo;
		vehiculo[3] = furgon;

		Sitio[] sitio = new Sitio[2];
		for (int i = 0; i < 2; i++) {
			int f = (int) (Math.random() * 20) + 2;
			int c = (int) (Math.random() * 45) + 1;
			sitio[i] = new Sitio(new Posicion(f, c));
		}

		Ciudad ciudad = new Ciudad(vehiculo, sitio);
		for (int i = 0; i < 10; i++) {
			ciudad.mover();
			ciudad.pintar();
			System.out.println();
			System.out.print("**************************************************");
			pausar();
		}
	}
}
