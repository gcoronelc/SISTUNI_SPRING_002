/**
 * Todos los Derechos Reservados � 2014 Java Revolutions.
 * Sistema Web construido solo con Spring.
 * Este software contiene informaci�n propiedad exclusiva de Java Revolutions considerada
 * Confidencial. Queda totalmente prohibido su uso o divulgaci�n en forma
 * parcial o total.
 *	---------------------------------------------------------------------------
 * Nombre de Aplicacion: Proyecto Web Java Revolutions Solo Spring
 * Nombre de archivo: index.js
 * Fecha de creacion : Noviembre, 2013
 * @author : Sergio Alberto Cort�s Rios
 * @version 1.0
 *
 * Bit�cora de modificaciones:
 * CR/Defecto 		Fecha 			Autor 			Descripci�n del cambio
 *---------------------------------------------------------------------------
 */

/**
 * Funci�n que inicializa nuestra pantalla
 * @return
 */
function carga() {
	$("#j_username").focus();
}

/**
 * Funci�n que valida si los datos ingresados en la forma son correctos
 * @return true si los datos son correctos, false si hay datos requeridos nulos
 */
function validate() {
	
	user = $("#j_username");
	password = $("#j_password");
	if(user.val() == '') {
		
		user.focus();
		return false;
	} else if(password.val() == '') {
		
		password.focus();
		return false;
	} else {
		return true;
	}
}

function showError(error) {
	alert(error);
	if(error == 'null' || error == "null" || error == null) {
		return;
	}
	limite = 0;
	while(error.length > limite) {
		for(var i = 0; i < 100; i++) {
			document.write(error.charAt(limite));
			limite++;
			if(limite >= error.length) {
				break;
			}
		}
		document.write("<br>");
	}
}
