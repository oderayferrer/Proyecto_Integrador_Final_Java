package Proyecto_Integrador_Final;

import java.util.Random;
import java.util.Scanner;

public class Programa {
//	Etapa 1
//	Una reconocida Entidad Bancaria está en la
//	búsqueda de Desarrolladores Backend Java Jr.,
//	Ssr. y Sr. Para que puedan postularse, se debe
//	crear una aplicación que valide el ingreso a la
//	plataforma de Online Banking a través de una
//	clave Token.
//	Se debe tener en cuenta lo siguiente:
//	● La Clave Token debe ser un número aleatorio
//	de 6 dígitos.
//	● El cliente debe ingresar los campos Usuario,
//	Contraseña y Clave Token (todos obligatorios).
//	● El campo Usuario no distingue minúsculas
//	o mayúsculas.
//	● El campo Contraseña es sensible a las
//	minúsculas y mayúsculas.
//	● El cliente solo posee 3 intentos de logueo. Si
//	alcanza los 3 intentos fallidos de forma
//	consecutiva, la aplicación deberá informar al
//	usuario que debe dirigirse a la sucursal del
//	banco más cercana para poder desbloquear
//	sus credenciales.
//	● Por cada intento fallido, la aplicación debe
//	preguntar al cliente si desea continuar
//	colocando las credenciales de manera
//	correcta.
//	● Si el cliente coloca las credenciales de forma
//	correcta, deberá informar que ha ingresado 
//	correctamente al Online Banking.
//	Etapa 2
//	1. Por cada intento fallido, debe crear una
//	nueva Clave Token.
//	2. Realizar un método para que retorne cada
//	Clave Token.
//	3. La Clave Token no deberá repetirse, por lo
//	que se debe validar si ya ha sido suministrada
//	anteriormente en la misma ejecución de la
//	aplicación.
//	4. Crear un método que valide los datos
//	ingresados por el cliente y retorne si los datos
//	son correctos o no.
//	5. Crear un método que contenga los ciclos de
//	pregunta de las credenciales que no posea
//	retorno alguno.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables y constantes
		Scanner teclado = new Scanner(System.in);
		String strUsuario = "administrador";
		int intToken;
		String strClave = "administrador.1234";
		final int MAX_INTENTOS = 3;
		String[] tokensGenerados = new String[MAX_INTENTOS];
		int numTokensGenerados = 0;

		cicloCredenciales(teclado, strUsuario, strClave, MAX_INTENTOS, tokensGenerados, numTokensGenerados);

	}

	public static void cicloCredenciales(Scanner teclado, String strUsuario, String strClave, int MAX_INTENTOS,
			String[] tokensGenerados, int numTokensGenerados) {
		int intIntentos = 0;
		boolean inicio = false;

		while (intIntentos < MAX_INTENTOS && !inicio) {
			// Genera una nueva clave token en cada iteración
			String tokenString = CreaToken(tokensGenerados, numTokensGenerados);
			System.out.println("Clave token generada automáticamente: " + tokenString);
			numTokensGenerados++;
			System.out.println("Ingrese su usuario: ");
			String strUsuarioInput = teclado.next();
			System.out.println("Ingrese su clave: ");
			String strClaveInput = teclado.next();
			System.out.println("Ingrese su token: ");
			String tokenInput = teclado.next();

			if (validarCredenciales(strUsuarioInput, strClaveInput, tokenInput, strUsuario, strClave, tokenString)) {
				inicio = true;
				System.out.println("\nHa ingresado correctamente al Online Banking.");
			} else {
				intIntentos++;
				System.out.println("\nCredenciales incorrectas, intentos restantes " + (MAX_INTENTOS - intIntentos));
				if (intIntentos < MAX_INTENTOS) {
					System.out.println("¿Quere volver a intentarlo? (si/no) ");
					String continuarInput = teclado.next();
					if (!continuarInput.equalsIgnoreCase("si"))
						break;
				}
			}

			if (intIntentos > MAX_INTENTOS) {
				System.out.println(
						"Ha alcanzado el máximo de intentos, debe dirigirse a la sucursal del banco más cercana para poder desbloquear sus credenciales.");
			}

		}
		teclado.close();
	}

	public static String CreaToken(String[] tokensGenerados, int numTokensGenerados) {
		Random random = new Random();
		String tokenString;
		boolean tokenRepetido;
		do {
			tokenRepetido = false;
			int token = 100000 + random.nextInt(900000);
			tokenString = String.valueOf(token);
			// Verifica si el token generado ya existe en el array
			for (int i = 0; i < numTokensGenerados; i++) {
				if (tokensGenerados[i].equals(tokenString)) {
					tokenRepetido = true;
					break;
				}
			}
		} while (tokenRepetido); // Si el token generado ya está en el array, genera otro

		tokensGenerados[numTokensGenerados] = tokenString; // Agrega el token generado al array
		return tokenString;
	}

	public static boolean validarCredenciales(String strUsuarioInput, String strClaveInput, String tokenInput,
			String strUsuario, String strClave, String tokenString) {
		return strUsuario.equalsIgnoreCase(strUsuarioInput) && strClave.equals(strClaveInput)
				&& tokenString.equals(tokenInput);
	}

}
