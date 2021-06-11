# Taller-SOLID
1.	Liskov Substitution Principle.

Clases Helado y Pastel. Tienen mucha similitud, se debería crear una clase padre llamada Postre.
 ![image](https://user-images.githubusercontent.com/72930050/121601894-29860780-ca0c-11eb-9a50-3b5b1abc1a60.png)

Las clases Helado y Pastel básicamente son las mismas de no ser por la diferencia de precio, por tal motivo se puede crear una clase padre, contenga todos los métodos para posteriormente extender esta clase padre a Helado y Pastel y ahí hacer la diferenciación de precios por medio del constructor respectivo.  

 ![image](https://user-images.githubusercontent.com/72930050/121601905-2be86180-ca0c-11eb-9a1a-4bff756db952.png)



2.	Single-Responsibility Principle y Open-Close Principle.

Clases Procesos.OperacionesAderezo y Postre. ¿Es necesaria la clase OperacionesAderezo?. Se puede incluir dentro de postre un método para agregar un aderezo y para quitar un aderezo.

![image](https://user-images.githubusercontent.com/72930050/121601917-2f7be880-ca0c-11eb-95dc-8114f0eadb87.png)

La clase OperacionesAderezo vioala el principio de single-responsibility pues esta clase tiene funcionalidades de otros objetos, también esta clase no cumple el principio Open-Close pues, si se quisiese añadir otros tipos de postres se tendrían que añadir otros dos métodos, pero ahora que ya existe la clase Postre es mas factible reemplazar la clase OperacionesAderezo por simplemente un método dentro de la clase Postre.

 ![image](https://user-images.githubusercontent.com/72930050/121601921-3145ac00-ca0c-11eb-8519-11ca15541e6f.png)
 
 
 3. Single Responsability Principle

Métodos calcularPrecioFinal() y  showPrecioFinal() están muy relacionados, deben estar en otra clase por si cambia la fórmula de cálculo.

![Captura](https://user-images.githubusercontent.com/72809497/121627228-9618fa80-ca3c-11eb-8ae0-2f3671059b01.PNG)

Los procesos para manejar el precio de los productos se encuentran dentro de las clases propias de cada producto, haciendo que la clase Postre posee la responsabilidad de hacer cálculos que podrían ser realizados por la clase ManejadorDePrecio sin afectar a la funcionalidad de dichas clases.

![Captura 2](https://user-images.githubusercontent.com/72809497/121627243-9addae80-ca3c-11eb-9b0c-6684097bd43d.PNG)


4. Single Responsability Principle

Enum Adicionales.Aderezo es muy estático, debe convertirse en clase abstract con un atributo nombre y un método abstracto setNombre para que cada tipo de aderezo sea una subclase de Aderezo e implemente dicho método. 

![Captura 3](https://user-images.githubusercontent.com/72809497/121627248-9ca77200-ca3c-11eb-9e45-539c7b736228.PNG)

La clase Aderezo es demasiado simple y hasta cierto punto ambiguoa, ya que no se podrían añadir nuevas funcionalidades para los aderezos si únicamente se limitan a ser un nombre, por ello se cambia el tipo de clase de Aderezo a Clase Abstracta y se crea una clase para cada distinto tipo de aderezo, además, se sobrescribe el método toString() en la clase Aderezo para que devuelva el nombre del aderezo en mayúsculas.

![Captura 4](https://user-images.githubusercontent.com/72809497/121627253-9f09cc00-ca3c-11eb-8f17-4c6b459dd43b.PNG)

 

5. Dependency inversion principle

La clase Manejador de archivos no cumplia con el dependency inversion principle, ya que contaba con un constructor que no recibia el que leche se utilizaria en el postre. 

![image](https://user-images.githubusercontent.com/76917298/121629888-b7c8b080-ca41-11eb-9978-3147d8400eb0.png)

Para solucionar este problema se implemento un contructor que reciba la leche para asi realizar una validacion al momento de utilar el metodo de manejadorDeLeche para los pasteles, si la leche es deslactosada se mostrara un mensaje diciendo que no se puede usar esa leche en un pastel.

![121623391-3703b780-ca35-11eb-8958-2b81ae0b7ce6](https://user-images.githubusercontent.com/76917298/121629527-fb6eea80-ca40-11eb-9bd1-3e357bd5e402.png)

6. Implementacion del nuevo codigo con las respectivas correciones.
![image](https://user-images.githubusercontent.com/76917298/121629593-21948a80-ca41-11eb-84bb-9725ab272314.png)
![image](https://user-images.githubusercontent.com/76917298/121629628-340ec400-ca41-11eb-99cb-b0130dbc90cc.png)


