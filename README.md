🌶️ 
## Ejercicio 3 – **Multómetro™ 3000**

> En un universo paralelo donde los límites de velocidad son una sugerencia y los radares están programados por becarios sin café, existe un sistema que:
> 
1. Pide nombre y velocidad a **5 conductores**.
2. Si alguien excede los **60 km/h**, le aplica una multa.
3. La multa se calcula como **(velocidad - 60) * 2.5**.
4. Si no se excede, se le felicita.
5. Todo esto debe ocurrir con un **bucle horroroso** y sin arrays, por supuesto.

📍*Pista picante:*

- El cast a `(int)` es como maquillarle el sueldo a fin de mes: se ve bonito, pero no es real.
- El buffer del `Scanner` es un campo minado: no lo limpias, explota.
- Los nombres de las variables parecen iniciales de estudiantes reprobando lógica.


## Solucion de la correción del codigo MuyMal ##
Para corregir un poco el codigo, reemplaze las letras individuales con variables con nombre, esto para poder tener un orden en el codigo ya que las letras no significan casi nada, luego de eso me fije que el scanner estaba tambien en una sola letra, asi que lo reemplaze por el nombre "scanner" y lo cerre ya que no estaba cerrado.
Se procede con un cambio en los carteles para hacerlo mas estetico, aparte de reducir el numero de filas utilizadas para que se vea mas corto.

## Solución Del ejercicio 3 ##
- Lo primero seria implementar un scanner osea un "Scanner scanner = new Scanner(System.in);" ahora voy a poner las variables tanto de los nombres de los conductores como de sus velocidades, utilizando tanto "String" para los nombres de los conductores y la variable "Int" para la velocidad de los conductores, luego utilizando los nombres de variable, name1, name2, name 3, name4 y name5 para la variable "String" y luego los nombres Speed1, Speed2, Speed3, Speed4 y Speed5 para la variable "Int", luego se utiliza un "System.out", para marcar el primer cartel de selección.

- Luego se empieza a poner los datos de cada conductor y para que sea un bucle o que repita la misma pregunta pero con el conductor de abajo utilizo con el nombre "speed#" el numero dependiendo del conductor al cual se pregunta y utilizando un "Integer.parseInt(scanner.nextLine());", esto se debe repetir 1 vez con cada conductor desde el conductor 1 al 5 pero como empieza?, ok lo primero es tirar un "System.out" que diga "nombre del conductor #" para escoger el nombre de este conductor, pero para poder escogerlo toca poner "name# = scanner.nextLine();" para al momento de que aparezca el cartel me marque para escribir el nombre del conductor designado.

- Ahora se viene la parte mas fea y es marcar la parte de la multa y la felicitación a la persona que no se excedio con el limite de velocidad o la multa si la persona excedio el limite por lo tanto se debe usar una variable "if(condition){}" la cual deberia quedar como "if(speed# > 60){}" a la par que se hace un "System.out" y dentro del out se pone "("Toma tu multa, " + name# + ": " + (speed1 - 60) * 2.5 + "€");""