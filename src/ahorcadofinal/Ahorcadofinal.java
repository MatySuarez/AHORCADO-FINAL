package ahorcadofinal;

import javax.swing.*;

class Ahorcadofinal {

	public static void main(String[] args) {
		String [] palabras= {"Banana", "Moneda", "Minuto", "Cocina", "Espejo", "Anillo", "Pincel", "Azucar", "Sirena", "Cabaña"};
		int [] num = new int[10];
		int r, error, ganar, correcto, usados, y, rep, pasa;
		boolean fueusado=false;
		String letra, jugar;
		String [][]letras= {{"b","a","n","a","n","a"},{"m","o","n","e","d","a"},{"m","i","n","u","t","o"},{"c","o","c","i","n","a"},{"e","s","p","e","j","o"},{"a","n","i","l","l","o"},{"p","i","n","c","e","l"},{"a","z","u","c","a","r"},{"s","i","r","e","n","a"},{"c","a","b","a","ñ","a"},};
		String [][]solucion= new String [10][6];
		String []novan= new String[6];
		for (int n=0; n<=9; n++) {
			num[n]=99;
		}
		for (int e=0; e<=9; e++) {
			for (int p=0; p<=5; p++) {
				solucion[e][p]="_";
			}
		}
		JOptionPane.showMessageDialog(null,"", "Juego del Ahorcado", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Ahorcadofinal.class.getResource("/img/portada.jpg")));
		JOptionPane.showMessageDialog(null,"Instrucciones: Debes ir ingresando de a una letra para ir formando la palabra \n" + "Si la palabra tiene letras repetidas solo hace falta que la ingreses por única vez \n" + "Por cada error se dibujara una nueva linea del ahorcado, si se completa la figura perdiste!!!");
		usados=0;
		jugar="no";
		do {
			error=0; ganar=0; y=0;
			fueusado=false;
			r=(int)(Math.random()*10);
			for (int t=0; t<=9; t++) {
				if(r==num[t]) {
					fueusado=true;
				}
			}
			if(fueusado==false) {
				num[r]=r;
				usados=usados+1;
				do {
					rep=0; pasa=0;
					letra=(String)(JOptionPane.showInputDialog(null, "Ingresar una letra: ", "Juego del Ahorcado", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Ahorcadofinal.class.getResource("/img/letras.jpg")),null, null));
					correcto=0; 
					for (int z=0; z<=5; z++) {
						if(letra.equalsIgnoreCase(letras[r][z])) {
							if(letra.equalsIgnoreCase(solucion[r][z])) {
									rep=rep+1;
								}
							if(rep==0) {
								correcto=correcto+1;
								solucion[r][z]=letra;
							}
						}
					}
					if(rep>0) {
						JOptionPane.showMessageDialog(null,"YA HAS INTRODUCIDO ESA LETRA, PRUEBA NUEVAMENTE ");
						pasa=1;
					}
					if(correcto==0 && pasa==0) {
						error=error+1;
						novan[y]=letra;
						y=y+1;
					} else {
						ganar=ganar+correcto;
					}
					switch(error) {
					case 0: JOptionPane.showMessageDialog(null,"Tienes " + error + " errores \n" + "Haz acertado " + ganar + "\n" + "Palabra: " + solucion[r][0] + " " + solucion[r][1] + " " + solucion[r][2] + " " + solucion[r][3] + " " + solucion[r][4] + " " + solucion[r][5], "Ahorcado", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Ahorcadofinal.class.getResource("/img/img.jpg")));
						break;
					case 1: JOptionPane.showMessageDialog(null,"Tienes " + error + " errores \n" + "Haz acertado " + ganar + "\n" + "Palabra: " + solucion[r][0] + " " + solucion[r][1] + " " + solucion[r][2] + " " + solucion[r][3] + " " + solucion[r][4] + " " + solucion[r][5] + "\n" + "No van: " + novan[0], "Ahorcado", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Ahorcadofinal.class.getResource("/img/img1.jpg")));
						break;
					case 2: JOptionPane.showMessageDialog(null,"Tienes " + error + " errores \n" + "Haz acertado " + ganar + "\n" + "Palabra: " + solucion[r][0] + " " + solucion[r][1] + " " + solucion[r][2] + " " + solucion[r][3] + " " + solucion[r][4] + " " + solucion[r][5] + "\n" + "No van: " + novan[0] + ", " + novan[1], "Ahorcado", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Ahorcadofinal.class.getResource("/img/img2.jpg")));
						break;
					case 3: JOptionPane.showMessageDialog(null,"Tienes " + error + " errores \n" + "Haz acertado " + ganar + "\n" + "Palabra: " + solucion[r][0] + " " + solucion[r][1] + " " + solucion[r][2] + " " + solucion[r][3] + " " + solucion[r][4] + " " + solucion[r][5] + "\n" + "No van: " + novan[0] + ", " + novan[1] + ", " + novan [2], "Ahorcado", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Ahorcadofinal.class.getResource("/img/img3.jpg")));
						break;
					case 4: JOptionPane.showMessageDialog(null,"Tienes " + error + " errores \n" + "Haz acertado " + ganar + "\n" + "Palabra: " + solucion[r][0] + " " + solucion[r][1] + " " + solucion[r][2] + " " + solucion[r][3] + " " + solucion[r][4] + " " + solucion[r][5] + "\n" + "No van: " + novan[0] + ", " + novan[1] + ", " + novan [2] + ", " + novan[3], "Ahorcado", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Ahorcadofinal.class.getResource("/img/img4.jpg")));
						break;
					case 5: JOptionPane.showMessageDialog(null,"Tienes " + error + " errores \n" + "Haz acertado " + ganar + "\n" + "Palabra: " + solucion[r][0] + " " + solucion[r][1] + " " + solucion[r][2] + " " + solucion[r][3] + " " + solucion[r][4] + " " + solucion[r][5] + "\n" + "No van: " + novan[0] + ", " + novan[1] + ", " + novan [2] + ", " + novan[3] + ", " + novan[4], "Ahorcado", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Ahorcadofinal.class.getResource("/img/img5.jpg")));
						break;
					case 6: JOptionPane.showMessageDialog(null,"Tienes " + error + " errores \n" + "Haz acertado " + ganar + "\n" + "Palabra: " + solucion[r][0] + " " + solucion[r][1] + " " + solucion[r][2] + " " + solucion[r][3] + " " + solucion[r][4] + " " + solucion[r][5] + "\n" + "No van: " + novan[0] + ", " + novan[1] + ", " + novan [2] + ", " + novan[3] + ", " + novan[4] + ", " + novan[5], "Ahorcado", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Ahorcadofinal.class.getResource("/img/img6.jpg")));
						break;
					}
				} while (ganar<=5 && error<=5);
				if(ganar==6) {
					JOptionPane.showMessageDialog(null,"HAS GANADO!!! \n" + "La palabra era: " + palabras[r] , "Juego del Ahorcado", JOptionPane.DEFAULT_OPTION, new ImageIcon(Ahorcadofinal.class.getResource("/img/ganador.jpg")));
				}
				if(error==6) {
					JOptionPane.showMessageDialog(null,"HAS PERDIDO... \n" + "La palabra era: " + palabras[r] , "Juego del Ahorcado", JOptionPane.DEFAULT_OPTION, new ImageIcon(Ahorcadofinal.class.getResource("/img/perdedor.jpg")));
				}
			}
			if(fueusado==true && usados<10) {
				jugar="si";
			}
			if(fueusado==false && usados<10) {
				jugar=JOptionPane.showInputDialog("Desea volver a jugar? Ingrese SI para volver a intentarlo ");
			}
		} while(jugar.equalsIgnoreCase("si"));
		JOptionPane.showMessageDialog(null,"HAS FINALIZADO EL JUEGO, GRACIAS POR JUGAR!!! " , "Juego del Ahorcado", JOptionPane.DEFAULT_OPTION, new ImageIcon(Ahorcadofinal.class.getResource("/img/portada.jpg")));
	}
}
