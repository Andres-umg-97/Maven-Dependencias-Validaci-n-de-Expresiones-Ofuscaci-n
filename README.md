# Maven, Ofuscación e Ingeniería Inversa

Este repositorio contiene dos proyectos Java con Maven.
El objetivo principal es demostrar el uso de ofuscación reproducible, ejecución desde consola y verificación mediante ingeniería inversa, sin alterar el comportamiento del programa.

# Tecnologías utilizadas

Java
Maven
ProGuard (ofuscación)
JD-GUI (ingeniería inversa)

# Ofuscación con Maven
Ambos proyectos están configurados con un perfil Maven llamado obfuscate, el cual genera:
Un JAR normal
Un JAR ofuscado

# Comando reproducible
mvn clean package -Pobfuscate
El JAR ofuscado se genera automáticamente en la carpeta target/.

# Ingeniería inversa
El JAR ofuscado fue decompilado utilizando JD-GUI, donde se puede observar:
Nombres de clases y métodos alterados
Pérdida de claridad estructural
Mayor dificultad para comprender el código fuente
Aun así, la lógica general sigue siendo parcialmente interpretable.
Las capturas se encuentran en la carpeta evidencias/.

# Prueba de regresión desde consola
El JAR ofuscado fue ejecutado desde terminal con una expresión definida manualmente.
# Ejecución
java -cp "stackHandler-0.0.1-SNAPSHOT-obf.jar;libs/*" stackHandler.handler.Main "(a+b)"
# Resultado
El programa produce exactamente la misma salida que el JAR original, confirmando que la ofuscación no afecta el comportamiento del sistema.

# Conclusión
La práctica demuestra que es posible proteger el código mediante ofuscación sin modificar su funcionamiento.
El uso de perfiles Maven permite una configuración limpia, reproducible y profesional.

