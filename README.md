# Challenge Conversor de Monedas

## Descripción
Challenge Conversor de Monedas es una aplicación desarrollada en Java que permite convertir entre diversas monedas de interés. Utiliza la API "Exchange Rate API" para obtener las tasas de cambio actualizadas.

## Elementos usados
- **IntelliJ**
- **JDK 21**
- **API "Exchange Rate API"**
- **Biblioteca GSON**

## Descripción de funcionamiento
La aplicación está diseñada con una arquitectura modular, compuesta por las siguientes clases principales:

- **Main**: controla el flujo del programa.
- **Operacion**: contiene la lógica para realizar las conversiones de divisas.
- **Solicitud**: se encarga de llevar a cabo las solicitudes a la API para obtener las tasas de cambio.

La particularidad del funcionamiento radica en el uso de **hash maps** para relacionar las divisas con sus valores correspondientes, facilitando así la búsqueda y conversión de monedas.

## Ejemplo de Uso
I. Selecciona la opción de conversión deseada

  1. Dolar -> Peso Argentino
  2. Peso Argentino -> Dolar
  3. Dolar -> Real Brasileño
  4. Real Brasileño -> Dolar
  5. Peso Colombiano -> Dolar
  6. Dolar -> Peso Colombiano
  7. Salir

II. Introduce el monto a convertir.

III. La aplicación mostrará el resultado de la conversión basada en las tasas de cambio actuales obtenidas de la API.
