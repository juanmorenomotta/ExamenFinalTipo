# Examen Final: Problema Tipo
Examen Final - Diseño de Software y Patrones

Esta es la solución al problema tipo planteado. En el documento se presenta una primera solución y luego un requerimiento adicional que nos hace pensar que pueden seguir viniendo cambios. Como podemos darle solución a un problema de este tipo??

## Problema

Inicialmente se tiene una unica fuente de lectura que es mediante el teclado (Keyboard.java) y luego nos plantean que podemos hacer reconocimiento de palabras por scanner. El problema no lo dice pero pueden venir reconocimiento QR o de cualquier otro medio lecturas por banda magnetica y la solución debe seguir proporcionando bajo acoplamiento y seguir funcionando.

El problema tambien plantea multiples salidas, en principio directo a la impresora, pero luego el requerimiento se amplia a guardar en una base de datos e inclusive a archivos.

## Planeamiento de la solución

Tanto para la lectura como para la escritura tenemos varias posibilidades y el resultado son sus combinaciones, es decir podriamos leer desde el Teclado (Keyboar) o desde el Scanner luego podriamos imprimirlo o grabarlo a base de datos o archivo.

Vemos que tanto para la lectura y escritura podemos utilizar el patrón Factory Method. Para la combinación de ellos utilizaremos el patrón Brigde. 

## Construcción

Para lograr el desacoplamiento creamos las interfaces para Lectura (Read.java) y Escritura (Write.java) en la carpeta Interface. Las implementaciones las realizamos en cada carpeta para Read.java creamos la carpeta ImplementRead para implementar la interface a traves de las clases concretas Keyboard.java y Scanner.java. Si tuvieramos otro medio de capturar información simplemente implementamos una nueva clase a partir de la interface Read.java.

Lo mismo realizamos para Escritura (Write.java), creamos las clases que implementan esta interface en la carpeta ImplementeWrite, dentro implementamos las clases concretas Database.java, File.java y Printer.java.

## Factory Method

Ahora usamos el patrón Factory Method para ambas interfaces, ReadFactory.java y WriteFactory.java. Estas clases tienen un comportamiento especial pues retornan una clase instaciada a partir de un parametro de tipo String que nos permite determinar que tipo de clase retornar. Lo hacemos a través del metodo TypeWrie() para WriteFactory.java y TypeRead para ReadFactory.java.

## Brigde 

Nos basamos en el patron Brigde para crear la clase Copier.java que implementa un puente para interactuar entre las clases  ReadFactory.java y WriteFactory.java. Desde el Client.java podemos ver el ejemplo que con dos lineas de programación podemos implementar la solución requerida.

## Conclusiones

Los patrones de desarrollo nos permiten desarrollar soluciones desacopladas y fuertemente cohesionadas. En este ejemplo podemos implementar mas clases concretas para Read.java y Write.java sin necesidad de tocar mas codigo fuente y las pruebas solo se reducirian a pasar los paramertros de las nuevas implementaciones.

