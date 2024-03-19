# language: es

Característica: Crear Cuenta

  @TEST-CuentaValida
  Escenario: Crear cuenta válida
    Dado que el usuario ingresa a la pantalla de inicio
    Y el usuario ingresa a la pantalla de registro
    Cuando el usuario completa el formulario de registro correctamente
    Entonces se valida que el usuario creo correctamente su cuenta



  @TEST-CuentaInvalida
  Escenario: Crear cuenta inválida
  Dado que el usuario ingresa a la pantalla de inicio
  Y el usuario ingresa a la pantalla de registro
  Cuando el usuario no completa el formulario de registro correctamente
  Entonces se valida que el usuario no pudo crear su cuenta
