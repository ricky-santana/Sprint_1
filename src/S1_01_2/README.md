# S1_01_2
**Modificadores y su comportamiento, static y final**
## 📌 Enunciado
Tienes que crear una clase que represente un coche con algunas particularidades que te permitirán entender cómo funciona la memoria y la inicialización en Java.
## 🛠 Tecnologies
- Java
## 🧩 Explicaciones
- En la clase coche, si un atributo es static y final al mismo tiempo, se inicializa antes del constructor, con lo cual, en mi ejercicio por ejemplo, todas las instancias de coche serán de la marca "Cupra", es algo "inmutable" en mi clase.
- El modelo, es static, pero no final, lo que haré al instanciar un objeto coche es borrar el anterior "modelo" y sobreescribir. Podría tener un constructor solo con la potencia del vehículo y el modelo será el valor de la última instanciación.
- El power es final pero no static, es una constante del objeto.