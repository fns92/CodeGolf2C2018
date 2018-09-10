package codeGolf;

public class CodeGolf {

	static boolean secuenciaCiclica(Integer[] s) {
		int l = s.length,
			d = 0,	/*Valor que marca el sentido del incremento*/
			c = 0;  /*Valor para mostrar los cambios de sentido*/
		
		for (int i = 0; i < l; i++) {
				int j = i + 1;
				if (i == l - 1)	j = 0; /*Para poder comparar el ulitmo con el primero del array*/
				
				if (d == 0) {			/*Para determinar el sentido la primera vez*/
					if (s[i] >= s[j])
						d--;
					else
						d++;}

				if (d > 0) {				/*Para ver si hay cambio de sentido de Menor a Mayor*/
					if (s[i] >= s[j]) c++;
				}
					
				if (d < 0) {				/*Para ver si hay cambio de sentido de Mayor a Menor*/
					if (s[i] <= s[j]) c++;
				}	
		}
		if (c > 1)	/*Si hubo mas de un cambio ya no es incremental*/  
			return false;
		return true;
	}
}

