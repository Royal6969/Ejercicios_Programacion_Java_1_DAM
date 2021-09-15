package Ejer_10_Punto;

public class Enunciado_Ejercicio {

/*
 * 10. Para construir este proyecto:
 * 
A. Defina una interfaz que denominará Ipunto con los siguientes métodos públicos:
a. mover que devuelve void y recibirá dos valores en doble precisión
b. mover que devuelve void y recibirá un Ipunto
c. borrar que devuelve void y no recibirá ningún parámetro.
d. getX y getY que devuelven double.
e. setX y setY que reciben un double y devuelven void.
f. distancia que recibe un objeto Ipunto y devuelve un double.
g. distanciaorigen sin parámetros. Devuelve un double.
h. imprime que devuelve void y no recibirá ningún parámetro.

B. Construya una clase Punto que implemente la interfaz Ipunto y tenga dos atributos protegidos de
tipo double denominados x e y (las coordenadas del punto), y un atributo estático protegidollamado origen de tipo Punto con los valores 0 y 0. La clase Punto implementará los siguientes
métodos:
a. Un constructor sin parámetros que defina el punto (0,0).
b. Un constructor que reciba dos valores de tipo double para cada atributo.
c. Un método borrar que ponga a 0 los dos atributos.
d. Un método mover que dado los dos valores pasados como parámetros cambie los
atributos x e y.
e. Un método denominado mover que cambie las coordenadas del Punto que invoca por
las de un Punto pasado como argumento.
f. Un método distancia que calcule la distancia entre el Punto que invoca y otro que es
pasado como argumento. Utilice el método sqrt de la clase Math.
g. Un método estático cambiarorigen que cambie el atributo origen por el punto que se le
pasa como argumento.
h. Un método distanciaorigen que calcula la distancia al origen utilizando el método
distancia.
i. Un método imprime que saca por pantalla los valores de los atributos con el siguiente
formato ( x , y )

C. Defina una interfaz que denominará Ipixel, que herede los métodos de la interfaz Ipunto y que
cuente además con los siguientes métodos públicos
a. borrar que devuelve void y no recibirá ningún parámetro.
b. cambiarcolor que recibe un entero y devuelve void.
c. imprime que devuelve void y no recibirá ningún parámetro
D. Cree una clase Pixel que extienda la clase Punto anterior y que implemente el interfaz IPixel,
añadiendo un atributo privado de tipo entero que denominaremos color. Los métodos propios de
la clase Pixel serán:
a. Un constructor sin parámetros que pondrá a 0 todos los atributos.
b. Un constructor con parámetros que reciba un Punto y un entero para el color.
c. Un método imprime que redefina el método de la clase Punto escribiendo además el
color.
d. Un método borrar que redefina el de la clase Punto poniendo el color a 0.
e. Un método cambiarcolor que cambie el color al valor que se le pasa como argumento.

¿Qué cambios deberá hacer en los atributos Punto?
Haga un programa principal para probar todos los métodos construidos, tanto para la
clase Punto, como para la clase Pixel. Compruebe cómo se pueden invocar los métodos
de la clase Punto desde objetos de la clase Pixel
 */
}
