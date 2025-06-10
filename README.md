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

3.- Para conectar la app con la api, se crear el package "com.conversormonedas.consumirapi" y en su interior el archivo encargado de realizar el enlace con la api "ConsumirApi.java"
