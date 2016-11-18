# java-rmi
##Pruebas de comunicación entre objetos distribuidos mediante RMI
Acceder al directorio de la aplicación de prueba de las tres disponibles
* /javaRMICalc
* /javaRMICount
* /javaRMIPrime

```bash
# 1. Compilar los ficheros
$ javac *.java

# 2. Generar stub
$ rmic *Impl

# 3. Arrancar rmiregistry
$ rmiregistry

# 4. Iniciar el servidor
$ java *Server

# 5. Iniciar el cliente
$ java *Client
```
Ver los resultados en el terminal
