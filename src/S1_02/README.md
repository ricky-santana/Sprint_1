# S1_02
**Metodos abstractos e interfaces**
## 📌 Enunciado
Crea una clase llamada Phonecon información básica sobre un teléfono: marca y modelo. Esta clase debe incluir un método para realizar llamadas, que muestre por pantalla que se está llamando al número pasado como parámetro.

A continuación, define dos interfaces: una relacionada con la función de cámara ( Camera), y otra con la función de reloj ( Clock). Cada una debe tener un único método que muestre por pantalla que se está tomando una foto o que está sonando una alarma.

Desarrolla una clase llamada Smartphoneque sea una extensión de Phone, y que a su vez implemente las interfaces Cameray Clock. Implementa los comportamientos para que muestren el mensaje adecuado por consola.

Por último, desde el main()de tu aplicación, crea un objeto Smartphone, intenta hacer una llamada, tomar una foto y activar la alarma.

Piensa en el tuyo Smartphonecomo un objeto que “puede hacer cosas”: puede llamar, puede tomar fotos, puede sonar una alarma. Cada una de estas acciones podría ser compartida con otros dispositivos (una cámara de seguridad también puede tomar fotos, un despertador puede sonar…). Las interfaces te permiten moldear este tipo de funcionalidades sin forzar relaciones jerárquicas entre clases.
## 🛠 Tecnologies
- Java
