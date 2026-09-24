# Sistema de Registro y Control de Productos — Cafetería

## Descripción

Programa desarrollado en *Java* para una microempresa dedicada a la venta de productos de cafetería.

El sistema permite registrar productos del establecimiento y realizar operaciones básicas de control mediante un menú por consola.

Entre las principales funciones se encuentran:

* Registrar productos de la cafetería.
* Mostrar información de los productos.
* Consultar el estado del stock.
* Aumentar y disminuir el stock.
* Calcular descuentos sobre el precio de los productos.

## Integrantes

* Ariana Tiparra Reyes
* Amir Alvarez Alvarez
* Andreu Antonio Rangel
* Diana Cueva Cerna
* Fátima Gallardo Ramírez

## Tecnologías utilizadas

* *Java*
* *Git / GitHub*

## Modelo de la solución

La solución se basa principalmente en una clase Producto, que representa los productos disponibles en la cafetería.

Cada producto contiene:

* nombre: nombre del producto, por ejemplo, Caramel Macchiato o Cheesecake de fresa.
* precio: precio de venta del producto.
* stock: cantidad disponible.

La clase Producto cuenta con métodos para mostrar información, consultar el estado del stock, modificar las cantidades disponibles y calcular descuentos.

### Principales métodos

* mostrarInformacion(): muestra los datos principales del producto.
* obtenerEstadoStock(): determina si el producto está agotado o cuenta con stock disponible.
* aumentarStock(): incrementa la cantidad disponible de un producto.
* disminuirStock(): reduce la cantidad disponible.
* calcularDescuento(): calcula el precio final aplicando un porcentaje de descuento.

## Decisiones de modelado

Se decidió crear una clase Producto porque todos los productos de la cafetería comparten características como nombre, precio y stock.

Los métodos relacionados con el stock son métodos de instancia, ya que modifican o consultan la información de un producto específico.

Por otro lado, calcularDescuento() se implementó como método static porque para realizar el cálculo solamente necesita recibir el monto y el porcentaje de descuento, sin depender de un producto específico.

También se utilizaron *constructores* para facilitar la creación de productos con valores predeterminados o con información proporcionada al momento de registrarlos.

## Ejecución

Para ejecutar el programa:

1. Clonar o descargar este repositorio.
2. Abrir el proyecto en un entorno de desarrollo compatible con Java.
3. Ejecutar la clase Main.
4. Seguir las opciones del menú mostradas en la consola.

## Video de presentación

[Ver video en YouTube](https://youtu.be/brmJtKk5V8U)