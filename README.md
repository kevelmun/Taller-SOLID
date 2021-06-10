# Taller-SOLID
1.	Liskov Substitution Principle
Clases Helado y Pastel. Tienen mucha similitud, se debería crear una clase padre llamada Postre.
 ![image](https://user-images.githubusercontent.com/72930050/121601894-29860780-ca0c-11eb-9a50-3b5b1abc1a60.png)

Las clases Helado y Pastel básicamente son las mismas de no ser por la diferencia de precio, por tal motivo se puede crear una clase padre, contenga todos los métodos para posteriormente extender esta clase padre a Helado y Pastel y ahí hacer la diferenciación de precios por medio del constructor respectivo.  

![image](https://user-images.githubusercontent.com/72930050/121601905-2be86180-ca0c-11eb-9a1a-4bff756db952.png)



2.	Single-Responsibility Principle
Clases Procesos.OperacionesAderezo y Postre. ¿Es necesaria la clase OperacionesAderezo?. Se puede incluir dentro de postre un método para agregar un aderezo y para quitar un aderezo.
 ![image](https://user-images.githubusercontent.com/72930050/121601917-2f7be880-ca0c-11eb-95dc-8114f0eadb87.png)

La clase OperacionesAderezo vioala el principio de single-responsibility pues esta clase tiene funcionalidades de otros objetos, además si se quisiese añadir otros tipos de postres se tendrían que añadir otros dos métodos, pero ahora que ya existe la clase Postre es mas factible reemplazar la clase OperacionesAderezo por simplemente un método dentro de la clase Postre.
![image](https://user-images.githubusercontent.com/72930050/121601921-3145ac00-ca0c-11eb-8519-11ca15541e6f.png)
