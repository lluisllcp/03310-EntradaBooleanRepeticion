/* 
 * Copyright 2019 Lluís CP - aw.lluiscerda@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */
public class Main {

// Instanciar Scanner
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

//entrada
        boolean logico = false;

        boolean l = true;

//bucle
        do {
            try {
//Entrada dato
                System.out.print("Inserte un valor logico ...: ");
                logico = SCN.nextBoolean();

//dato correcto
                l = false;

//Entrada incorrecta
            } catch (Exception e) {
                System.out.println("Error en la entrada de datos... ");
//limpiar bufer
            } finally {
                SCN.nextLine();
            }

        } while (l);

// Salida dato
        System.out.printf("Valor logico ...: %b\n", logico);

    }
}
