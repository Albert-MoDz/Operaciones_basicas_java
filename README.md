# Operaciones_basicas_java
Operaciones básicas en java con menú de opciones

- creamos una comunicación remota para guiarnos en el proyecto.
- utilizamos un repositio de manaera compartida.
- con las herramientas de code with me de intellij ultimate edition 

se crearon las clases de las operaciones basicas .java
clases:

1- sumar.java
2- Restar.java
3- Multiplicar.java
4- Dividir.java
5- Main.java

2- se creo la clases: Main.java : 
   donde se desarrllo la logica de la calculadora de operaciones basicas
   
   utlizamos un do while para la creacion del menu de opciones para que el usuario elija su opcion.

se usan funciones para las diferentes operaciones aritmeticas 
y eso lo llamamos en el main mas adelante



COMANDOS DE XAMPP

utilizar mysql por consola si usas xampp en gnu/linux
Carlos Alberto
canred
si usas xampp en gnu/linux para poder usar el servicio de la base de datos por consola usa el siguientes comandos

iniciar la base de datos

sudo /opt/lampp/lampp startmysql

abrir la consola de mysql


/opt/lampp/bin/mysql -u root


pero considero que estos comandos son poco intuitivos a si que vamos creer varios alias


alias mysql="/opt/lampp/bin/mysql -u root"
alias mysqlstart="sudo /opt/lampp/lampp startmysql"
alias mysqlstop="sudo /opt/lampp/lampp stopmysql"


ya solo con mysql, mysqlstart y mysqlstop podrás acceder al los diferentes comandos, 
pero sorpresa reiniciaste tu equipo y dejaron de funcionar, 
para que esto no suceda hacemos esto abrimos el archivo .
bashrc ubicado en la carpeta home con tu editor de textos preferido y al final escribiremos la definición de los alias

alias mysql="/opt/lampp/bin/mysql -u root"
alias mysqlstart="sudo /opt/lampp/lampp startmysql"
alias mysqlstop="sudo /opt/lampp/lampp stopmysql"

y por ultimo ubicados en home escribimos

source .bashrc


