# language: es

Característica: Carrito

  @TEST-Carrito

  Escenario: Agregar producto al carrito
    Dado que el usuario ingresa a la pantalla de inicio
    Y el usuario se loguea en la aplicacion
    Cuando el usuario agrega un producto al carrito
    Entonces se valida que se agrego un producto al carrito correctamente

