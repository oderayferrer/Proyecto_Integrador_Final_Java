# Proyecto Integrador Final del curso Introducción a Java de Educación IT

## Descripción
Para realizar el proyecto integrador, se integraron varios conceptos fundamentales de la programación en Java y del desarrollo de aplicaciones:
1. Manejo de Condicionales:

    if-else Statements: Se utilizaron para validar las credenciales de usuario, contraseña y token. Dependiendo de si las credenciales ingresadas son correctas o incorrectas, se ejecuta un bloque de código específico.

2. Bucles:

    while Loop: Se empleó para gestionar los intentos de inicio de sesión del usuario, permitiendo que el usuario vuelva a ingresar las credenciales mientras no supere el número máximo de intentos permitidos.

3. Generación de Números Aleatorios:

    Clase Random: Se utilizó para generar el número de 6 dígitos del Token que se requiere para el ingreso al sistema. Además, se incluyó lógica para asegurarse de que el token generado no se repita durante la misma sesión.

4. Arreglos (Arrays):

    Almacenamiento de Tokens Generados: Se utilizó un array para almacenar los tokens generados en cada intento, permitiendo así la verificación de que un token no se repita dentro de la misma sesión.

5. Manejo de Entradas del Usuario:

    Clase Scanner: Para capturar la entrada del usuario desde la consola, como el nombre de usuario, la contraseña, y el token.

6. Validación de Datos:

    Validación de Credenciales: Se implementaron métodos para comparar los valores ingresados por el usuario con los valores almacenados, respetando la sensibilidad a mayúsculas y minúsculas en la contraseña.

7. Métodos (Funciones):

    Modularización del Código: Se utilizaron métodos para dividir el programa en partes más pequeñas y manejables, como la creación del token, la validación de credenciales, y el ciclo de manejo de intentos.

8. Gestión de Errores y Control de Flujo:

    Manejo de Intentos Fallidos: Se incluyó lógica para manejar lo que sucede si un usuario alcanza el número máximo de intentos fallidos, incluyendo la posibilidad de reintentar o de ser bloqueado.

9. Buena Práctica de Programación:

    Uso de Constantes: Para definir valores que no cambian, como el número máximo de intentos permitidos.
    Encapsulamiento del Lógica: Agrupando la funcionalidad en métodos separados para mejorar la claridad y el mantenimiento del código.

Estos conceptos en conjunto permitieron construir una aplicación funcional, segura y que cumple con los requisitos de validación de acceso de un entorno bancario.


## Consigna

### Etapa 1

Una reconocida Entidad Bancaria está en la búsqueda de Desarrolladores Backend Java Jr., Ssr. y Sr. Para que puedan postularse, se debe crear una aplicación que valide el ingreso a la plataforma de Online Banking a través de una clave Token.

Se debe tener en cuenta lo siguiente:

- La Clave Token debe ser un número aleatorio de 6 dígitos.
- El cliente debe ingresar los campos Usuario, Contraseña y Clave Token (todos obligatorios).
- El campo Usuario no distingue minúsculas o mayúsculas.
- El campo Contraseña es sensible a las minúsculas y mayúsculas.
- El cliente solo posee 3 intentos de logueo. Si alcanza los 3 intentos fallidos de forma consecutiva, la aplicación deberá informar al usuario que debe dirigirse a la sucursal del banco más cercana para poder desbloquear sus credenciales.
- Por cada intento fallido, la aplicación debe preguntar al cliente si desea continuar colocando las credenciales de manera correcta.
- Si el cliente coloca las credenciales de forma correcta, deberá informar que ha ingresado correctamente al Online Banking.

### Etapa 2

- Por cada intento fallido, debe crear una nueva Clave Token.
- Realizar un método para que retorne cada Clave Token.
- La Clave Token no deberá repetirse, por lo que se debe validar si ya ha sido suministrada anteriormente en la misma ejecución de la aplicación.
- Crear un método que valide los datos ingresados por el cliente y retorne si los datos son correctos o no.
- Crear un método que contenga los ciclos de pregunta de las credenciales que no posea retorno alguno.

## Certificado
[Certificado del curso realizado](Certificado.pdf)
