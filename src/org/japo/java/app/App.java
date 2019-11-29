/*
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
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
package org.japo.java.app;

import java.util.Locale;
import java.util.Scanner;
import org.japo.java.libraries.UtilesPrimitivos;

/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public final class App {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final int NUM = 61;

    public static final int MAX = 50;
    public static final int MIN = 10;

    public final void launchApp() {

        int valor = UtilesPrimitivos.analizarRango(NUM, MIN, MAX);

        System.out.println("ANÁLISIS DE RANGO");
        System.out.println("=================");
        System.out.printf("Número ......: %d%n", NUM);
        System.out.println("---");
        System.out.printf("Mínimo ......: %d%n", MIN);
        System.out.printf("Máximo ......: %d%n", MAX);
        System.out.println("---");

        switch (valor) {
            case 0:
                System.out.println("Análisis ....: DENTRO");
                break;
            case 1:
                System.out.println("Análisis ....: FUERA ( Abajo )");
                break;
            case 2:
                System.out.println("Análisis ....: FUERA ( Arriba )");
                break;
            default:
                break;
        }

    }

}
