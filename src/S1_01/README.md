# S1_01
**Polimorfismo carga de clases en memoria**
## 📌 Enunciado
Estamos diseñando un programa para manejar instrumentos musicales de un grupo de música. En este grupo, existen tres tipos de instrumentos:

Instrumentos de viento
Instrumentos de cuerda
Instrumentos de percusión
Todos estos instrumentos tienen dos características en común: un nombre y un precio . Además, todos pueden tocarse , pero lo hacen de formas diferentes.

El proceso de carga de una clase Java sólo se produce una sola vez durante la ejecución del programa.

Demuestra que esta carga se puede provocar de dos formas:

Cuando se crea la primera instancia de la clase.
Cuando se accede a un miembro estático de la clase (como un método o atributo static).
Para comprobarlo, añade un bloque estático en la clase y observa cuándo se ejecuta.

Además, investiga y documenta por ti mismo :

¿Qué es un blog de inicialización (sin static)?
¿Cuándo se ejecuta?
¿Qué diferencia hay entre éste y un blog static?
## ✨ Funcionalidades
Un único método y una forma de demostrar que se ha cargado la clase

## 🛠 Tecnologies
- Java
## 🧩 Explicación carga
Al instanciar un objeto este se carga en la memoria de la JVM.
Sin instanciar un objeto también se carga en memoria si accedo al metodo static del mismo.
La principal diferencia es que cada vez que instancies la clase, se ejecutará el "bloque" static, sin emmbargo el método de carga estática solo se ejecuta al llamarlo. En ambos casos el objeto es cargado en memoria.

