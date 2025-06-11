# phi-challenge-conversor-monedas
App java de conversor de monedas utilizando la API: Api Exchange Rate.

Descripción del problema a solucionar: Se deben elegir de entre 6 tipos de conversiones en monedas, seleccionadas por el usuario a través de ingreso de opción por teclado. Una vez seleccionada la opción se solicita un monto, el sistema obtendrá los parámetros para consultar a la api, procesará los datos obtenidos y mostrará al usuario el resultado de la conversión de monedas.

Este proyecto cuenta de la siguiente estructura:
  - Un package com.conversormonedas.consumirapi, que contiene:
     * una clase java llamada ConsumirApi 
  - Una clase principal llamada Principal

Descripción de la solución del problema:

1.- Se eligen las siguientes opciones de conversión de monedas para el programa.

    * Dólar (USD) a Peso Chileno (CLP)
    * Peso Chileno (CLP) a Dólar (USD)
    * Dólar(USD) a Real Brasileño (BRL)
    * Real Brasileño (BRL) a Dólar (USD)
    * Dólar (USD) a Peso Argentino (ARS)
    * Peso Argentino (ARS) a Dólar (USD)

2.- Se crea una API key para poder realizar las consultas a la base de datos de Api Exchange Rate.

3.- Para conectar la app con la api, se crear el package "com.conversormonedas.consumirapi".

4.- Se incluye la librería de Gson, para interpretar las respuestas de la API.

5.- Se crea el archivo ConsumirApi.java que se encarga de la comunicación entre la app y la Api Exchange Rate.

  5.1 - Se crea el método sin retorno convertirMonedas() que recibe como parámetro el código de moneda de origen (String), el código de moneda de destino (String)          y el monto a convertir(Double). Se crea la url para la conexión con los parámetros entregados.
  5.2 - Se crea el objeto client de tipo HttpClient y el objeto request de tipo HttpRequest, para realizar la petición de conexión a la API.
  5.3 - Mediante un  try catch, se realiza la construcción de la petición de datos para que retorne un String y poder procesar la respuesta. En caso de que falle           el intento de comunicación se arroja la excepción en dos de casos IOException  o InterruptedException
  5.4 - Se crea un objeto gson de tipo Gson, para procesar la respuesta de la API que viene en formato JSON.
  5.5 - Se extrae cada dato de la respuesta de la API, estos son:
        * base_code:  código de la moneda de origen de la conversión.
        * target_code: código de la moneda destino de la conversión.
        * conversion_rate: es la razón de conversión entre las monedas.
        * conversion_result: el valor total de la moneda de origen convertido a la moneda de destino.
  5.6 - Se imprime el resultado de la conversión.

6.- Se crea la clase Principal.java la cual es la encargada de interactuar con el usuario.
  6.1 - Se crea una variable de control salidaDeLaApp de tipo boolean que cambiará a verdadero cuando el usuario ingrese la opción salir.
  6.2 - Se crea un objeto scanner del tipo Scanner, para capturar la opción ingresada del usuario por teclado.
  6.3 - Se crea un objeto consumirApi del tipo ConsumirApi (punto 5), para establecer comunicación con la API.
  6.4 - Se crea la variable montoAConvertir de tipo double, para almacenar el monto de dinero a convertir.
  6.5 - Se crea un ciclo while con la condición
  
  
    
