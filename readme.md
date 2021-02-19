# Escuela Colombiana de Ingeniería  Ciclos de vida del desarrollo de Software - CVDS Parcial Práctico - 1er Tercio


## Parte II. - Pruebas 'Eci Books'

Para la segunda parte del parcial, se creará el componente encargado de realizar el cálculo del valor a cobrar a un cliente que desea adquirir un libro en la tienda ECIBooks. 


1. Arbol del proyecto del parcial

```bash
	.
	+-- .gitignore
    +-- parcial-1.pdf
    +-- pom.xml
    +-- readme.md
    +-- src
	+-- main
	|	+-- java
	|		+-- edu
	|			+-- eci
	|				+-- cvds
	|					+-- ecibook
	|						+-- model
	|						|	+-- DiscountCategory.java
	|						+-- eci
	|						|	+-- BookSaleService.java
	+-- test
	|	+-- java
	|		+-- edu
	|			+-- eci
	|				+-- cvds
	|					+-- ecibook
	|						+-- eci
	|						|	+-- BookSaleServiceTest.java
```

2. El proyecto cuenta con una estructura inicial, la cual se describirá a continuación:
	* Paquete `edu.eci.cvds.ecibook.model`: Tiene las clases básicas del modelo.
		* Enumeración `DiscountCategory`: Enumeración con 3 categorías de descuento (Empleado, Estudiante, Otros).
	* Paquete `edu.eci.cvds.ecibook.service`: Se encuentra la lógica de negocio.
		* Clase `BooKSaleService`: Clase principal de la lógica de negocio, donde se realiza el cálculo para la venta de un libro.
	* Paquete `edu.eci.cvds.ecibook.service` (en src/test/java): Se encuentran las pruebas de la lógica de negocio.
		* Clase `BookSaleServiceTest`: en esta clase deben estar las pruebas para `BookSaleService`.

3. Para el cálculo del valor de un libro, se tienen los siguientes parámetros:
	* Categoría del descuento: El porcentaje de descuento que recibe un cliente dependiendo su relación con la Escuela es el siguiente:
		* *Empleado*: Este grupo incluye profesores y todos los miembros de la comunidad que trabaja en la Escuela, tienen un descuento del 10%.
		* *Estudiante*: Este grupo incluye a estudiantes actuales o egresados de la Escuela, tienen un 20% de descuento.
		* *Otros*: Este grupo incluye cualquier cliente que no pertenezca a la Escuela, para este grupo no existe ningún descuento.
	* Calificación del libro: Los libros dentro de ECIBooks están categorizados con un valor numérico de 1 a 30, con base en esta categoría es calculado el precio del libro.
		* *De 1 a 10*: Rango menor, el valor de los libros de esta categoría es de 25.000 pesos.
		* *De 11 a 20*: Rango intermedio, el valor de los libros de esta categoría es de 50.000 pesos.
		* *De 11 a 30*: Rango mas alto, el valor de los libros de esta categoría es de 100.000 pesos. 

4. Defina las clases de equivalencia necesarias para realizar las pruebas y asegurar la calidad del programa. Estas pueden ser realizadas en cualquier archivo que sea claramente visible.

5. Realice la implementación de las pruebas unitarias en la clase `BookSaleServiceTest` según las clases de equivalencia anteriormente definidas (no olvidar tener en cuenta los límites / fronteras).

6. Implemente la lógica específica en la clase `BookSaleService` para realizar el cálculo del valor de un libro, con base en la información anterior. Revisar el "tip" dado en la clase para realizar los cálculos necesarios.

7. Verifique la correcta compilación, ejecución y pruebas del proyecto, por medio de la construcción con Maven.

8. Realice los ajustes requeridos a las pruebas o al cálculo de la suscripción, según lo encontrado luego de las ejecuciones de maven.

## Entrega

* Cada que se realice uno de los puntos 3 al 7, realice un commit indicando el avance,
* Cargar en Moodle antes de finalizar el parcial.
* Elimine completamente la carpeta target para reducir el tamaño del archivo.
* Comprima todo el contenido del proyecto en un archivo .zip (excluyendo la carpeta target) y agreguela al espacio correspondiente en Moodle.
