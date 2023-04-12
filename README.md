# El_polimorfismo_de_Noe

## “EL POLIMORFISMO DE NOÈ” (Parte 1)


El diluvio universal está apunto de empezar, Noé lo sabe porqué lleva varios años teniendo unos sueños premonitores. Por ello quiere crear un barco muy grande que llamará "The Ark" con el cual pretende salvar todas las especies de animales terrestres de una muerte segura. 


Noé os pide ayuda cómo expertos creadores de "objetos" de este Mundo OOP



Cómo primer trabajo hay que crear un modelo genérico de animal y varios animales específicos para testear el funcionamiento del arca.  

1. Crear una clase abstracta Animal que contenga los métodos abstractos walk() y sit()

2. Crear por lo menos 3 tipos distintos de animales que hereden de la clase animal: Sheep, Dog and Elephant con la implementación de los métodos walk() y sit() y por lo menos un método específico para cada uno de ellos.


3. Crear la clase Ark() que contenga el método principal "main()" y el método store() que servirá para almacenar los animales. El método "store()" tendrá que aceptar cómo parámetro cualquier animal.

En el cuerpo del método store() se tendrán que lanzar los métodos walk() and sit() del animal que se reciba cómo parámetro y finalmente escribiremos en la consola: "Acaba de entrar un/una <tipo de animal>, en total tenemos <numTotAnimals> animales en el arca"


El arca tendrá un atributo arkWarehouse de tipo "ArrayList" donde se irán guardando todos los animales almacenados.


## Parte 2


Añadir el atributo “occupiedPlaces” en la clase Animal: en este atributo cada animal tendrá que guardar un valor que representa las plazas ocupadas por cada tipo de animales (ejemplo: cada “Dog” ocupará 1 plaza y cada “Elephant” ocupará 15 plazas…)


Añadir e inicializar el atributo availablePlaces en la clase Ark 


Tenemos que añadir un control en el arca para que se puedan guardar animales en el almacén hasta que se terminen las plazas disponibles.

## Parte 3:

Los animales que han podido entrar en el Arca tendrán que comer durante el "viaje" por ello su arca tendrá que aceptar en su almacén también algunos tipos de alimentos.


Copiar el código del ejercicio 1 y modificarlo de esta manera:

1. crear una interfaz ITransportable que tenga los métodos move(), stop(), occupancy()

2. En esta nueva versión del programa, el método store() de la clase Ark tendrá que aceptar cualquier instancia de objeto que implemente la interfaz ITransportable (habrá que aportar las modificaciones necesarias al código del método y de las clases de los animales existentes)

3. Crear una nueva clase Food que representará la comida para los animales. Esta clase también deberá implementar la interfaz ITransportable para poder entrar en el Arca a través del método store()