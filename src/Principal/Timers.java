package Principal;

import java.util.Timer;
import java.util.TimerTask;

public class Timers extends TimerTask {

	@SuppressWarnings("unused")
	private Timer timer;
	private int times = 0;
	private char ventana;
	
	public Timers(Timer timer, char tipo) {
		this.timer = timer;
		this.ventana = tipo;
	}
	
	public void run() {
		times++;
		switch (ventana) {
			case 'P':
				int  p = FramePrincipal.txt.getText().length();
				if (times <= 5) {
					if (p > 0) {
						if ((p > 1) && (FramePrincipal.txt.getText().charAt(p-2) == 'Q') && (FramePrincipal.txt.getText().charAt(p-1) == 'U')) {
							FramePrincipal.txt.setText(FramePrincipal.txt.getText().substring(0, p-2));
							FramePrincipal.txt.setCaretPosition(FramePrincipal.txt.getText().length());
						}
						else {
							FramePrincipal.txt.setText(FramePrincipal.txt.getText().substring(0, p-1));
							FramePrincipal.txt.setCaretPosition(FramePrincipal.txt.getText().length());
						}
					}
				}
				else {
					if ((times > 5) && (times <= 15)) {
						if (p > 5) {
							if ((p > 6) && (FramePrincipal.txt.getText().charAt(p-6) == 'Q') && (FramePrincipal.txt.getText().charAt(p-5) == 'U')) {
								FramePrincipal.txt.setText(FramePrincipal.txt.getText().substring(0, p-6));
								FramePrincipal.txt.setCaretPosition(FramePrincipal.txt.getText().length());
							}
							else {
								FramePrincipal.txt.setText(FramePrincipal.txt.getText().substring(0, p-5));
								FramePrincipal.txt.setCaretPosition(FramePrincipal.txt.getText().length());
							}
						}
						else {
							FramePrincipal.txt.setText(null);
						}
					}
					else {
						FramePrincipal.txt.setText(null);
					}
				}
				break;
				
			case 'A':
				int  a = FramePrincipal.txtA.getText().length();
				if (times <= 5) {
					if (a > 0) {
						if ((a > 1) && (FramePrincipal.txtA.getText().charAt(a-2) == 'Q') && (FramePrincipal.txtA.getText().charAt(a-1) == 'U')) {
							FramePrincipal.txtA.setText(FramePrincipal.txtA.getText().substring(0, a-2));
							FramePrincipal.txtA.setCaretPosition(FramePrincipal.txtA.getText().length());
						}
						else {
							FramePrincipal.txtA.setText(FramePrincipal.txtA.getText().substring(0, a-1));
							FramePrincipal.txtA.setCaretPosition(FramePrincipal.txtA.getText().length());
						}
					}
				}
				else {
					if ((times > 5) && (times <= 15)) {
						if (a > 5) {
							if ((a > 6) && (FramePrincipal.txtA.getText().charAt(a-6) == 'Q') && (FramePrincipal.txtA.getText().charAt(a-5) == 'U')) {
								FramePrincipal.txtA.setText(FramePrincipal.txtA.getText().substring(0, a-6));
								FramePrincipal.txtA.setCaretPosition(FramePrincipal.txtA.getText().length());
							}
							else {
								FramePrincipal.txtA.setText(FramePrincipal.txtA.getText().substring(0, a-5));
								FramePrincipal.txtA.setCaretPosition(FramePrincipal.txtA.getText().length());
							}
						}
						else {
							FramePrincipal.txtA.setText(null);
						}
					}
					else {
						FramePrincipal.txtA.setText(null);
					}
				}
				break;
				
			case 'F':
				int  f = FramePrincipal.txtF.getText().length();
				if (times <= 5) {
					if (f > 0) {
						if ((f > 1) && (FramePrincipal.txtF.getText().charAt(f-2) == 'Q') && (FramePrincipal.txtF.getText().charAt(f-1) == 'U')) {
							FramePrincipal.txtF.setText(FramePrincipal.txtF.getText().substring(0, f-2));
							FramePrincipal.txtF.setCaretPosition(FramePrincipal.txtF.getText().length());
						}
						else {
							FramePrincipal.txtF.setText(FramePrincipal.txtF.getText().substring(0, f-1));
							FramePrincipal.txtF.setCaretPosition(FramePrincipal.txtF.getText().length());
						}
					}
				}
				else {
					if ((times > 5) && (times <= 15)) {
						if (f > 5) {
							if ((f > 6) && (FramePrincipal.txtF.getText().charAt(f-6) == 'Q') && (FramePrincipal.txtF.getText().charAt(f-5) == 'U')) {
								FramePrincipal.txtF.setText(FramePrincipal.txtF.getText().substring(0, f-6));
								FramePrincipal.txtF.setCaretPosition(FramePrincipal.txtF.getText().length());
							}
							else {
								FramePrincipal.txtF.setText(FramePrincipal.txtF.getText().substring(0, f-5));
								FramePrincipal.txtF.setCaretPosition(FramePrincipal.txtF.getText().length());
							}
						}
						else {
							FramePrincipal.txtF.setText(null);
						}
					}
					else {
						FramePrincipal.txtF.setText(null);
					}
				}
				break;
				
			case 'K':
				int  k = FramePrincipal.txtK.getText().length();
				if (times <= 5) {
					if (k > 0) {
						if ((k > 1) && (FramePrincipal.txtK.getText().charAt(k-2) == 'Q') && (FramePrincipal.txtK.getText().charAt(k-1) == 'U')) {
							FramePrincipal.txtK.setText(FramePrincipal.txtK.getText().substring(0, k-2));
							FramePrincipal.txtK.setCaretPosition(FramePrincipal.txtK.getText().length());
						}
						else {
							FramePrincipal.txtK.setText(FramePrincipal.txtK.getText().substring(0, k-1));
							FramePrincipal.txtK.setCaretPosition(FramePrincipal.txtK.getText().length());
						}
					}
				}
				else {
					if ((times > 5) && (times <= 15)) {
						if (k > 5) {
							if ((k > 6) && (FramePrincipal.txtK.getText().charAt(k-6) == 'Q') && (FramePrincipal.txtK.getText().charAt(k-5) == 'U')) {
								FramePrincipal.txtK.setText(FramePrincipal.txtK.getText().substring(0, k-6));
								FramePrincipal.txtK.setCaretPosition(FramePrincipal.txtK.getText().length());
							}
							else {
								FramePrincipal.txtK.setText(FramePrincipal.txtK.getText().substring(0, k-5));
								FramePrincipal.txtK.setCaretPosition(FramePrincipal.txtK.getText().length());
							}
						}
						else {
							FramePrincipal.txtK.setText(null);
						}
					}
					else {
						FramePrincipal.txtK.setText(null);
					}
				}
				break;
				
			case 'O':
				int  o = FramePrincipal.txtO.getText().length();
				if (times <= 5) {
					if (o > 0) {
						if ((o > 1) && (FramePrincipal.txtO.getText().charAt(o-2) == 'Q') && (FramePrincipal.txtO.getText().charAt(o-1) == 'U')) {
							FramePrincipal.txtO.setText(FramePrincipal.txtO.getText().substring(0, o-2));
							FramePrincipal.txtO.setCaretPosition(FramePrincipal.txtO.getText().length());
						}
						else {
							FramePrincipal.txtO.setText(FramePrincipal.txtO.getText().substring(0, o-1));
							FramePrincipal.txtO.setCaretPosition(FramePrincipal.txtO.getText().length());
						}
					}
				}
				else {
					if ((times > 5) && (times <= 15)) {
						if (o > 5) {
							if ((o > 6) && (FramePrincipal.txtO.getText().charAt(o-6) == 'Q') && (FramePrincipal.txtO.getText().charAt(o-5) == 'U')) {
								FramePrincipal.txtO.setText(FramePrincipal.txtO.getText().substring(0, o-6));
								FramePrincipal.txtO.setCaretPosition(FramePrincipal.txtO.getText().length());
							}
							else {
								FramePrincipal.txtO.setText(FramePrincipal.txtO.getText().substring(0, o-5));
								FramePrincipal.txtO.setCaretPosition(FramePrincipal.txtO.getText().length());
							}
						}
						else {
							FramePrincipal.txtO.setText(null);
						}
					}
					else {
						FramePrincipal.txtO.setText(null);
					}
				}
				break;
				
			case 'T':
				int  t = FramePrincipal.txtT.getText().length();
				if (times <= 5) {
					if (t > 0) {
						if ((t > 1) && (FramePrincipal.txtT.getText().charAt(t-2) == 'Q') && (FramePrincipal.txtT.getText().charAt(t-1) == 'U')) {
							FramePrincipal.txtT.setText(FramePrincipal.txtT.getText().substring(0, t-2));
							FramePrincipal.txtT.setCaretPosition(FramePrincipal.txtT.getText().length());
						}
						else {
							FramePrincipal.txtT.setText(FramePrincipal.txtT.getText().substring(0, t-1));
							FramePrincipal.txtT.setCaretPosition(FramePrincipal.txtT.getText().length());
						}
					}
				}
				else {
					if ((times > 5) && (times <= 15)) {
						if (t > 5) {
							if ((t > 6) && (FramePrincipal.txtT.getText().charAt(t-6) == 'Q') && (FramePrincipal.txtT.getText().charAt(t-5) == 'U')) {
								FramePrincipal.txtT.setText(FramePrincipal.txtT.getText().substring(0, t-6));
								FramePrincipal.txtT.setCaretPosition(FramePrincipal.txtT.getText().length());
							}
							else {
								FramePrincipal.txtT.setText(FramePrincipal.txtT.getText().substring(0, t-5));
								FramePrincipal.txtT.setCaretPosition(FramePrincipal.txtT.getText().length());
							}
						}
						else {
							FramePrincipal.txtT.setText(null);
						}
					}
					else {
						FramePrincipal.txtT.setText(null);
					}
				}
				break;
				
			case '1':
				if (times == 1) {
					FramePrincipal.okCerrar=true;
				}
				else {
					FramePrincipal.okCerrar=false;
					FramePrincipal.timerClose.cancel();
				}
				break;
				
			case '2':
				if (times == 1) {
					if (FramePrincipal.okCerrar) {
						System.exit(0);
					}
				}
				else {
					FramePrincipal.timerClose.cancel();
				}
				break;
				
			case 'D': //SE INICIA EL TIMER DEL BOTON PUNTO (DOT) PARA GUARDAR EL ARCHIVO
				if (times == 5) {
					FramePrincipal.Guardando=true;
				}
				if (times == 10) {
					if(FramePrincipal.GuardadoActivado) {
						FramePrincipal.CrearArchivo();
					}
				}
				break;
		}
	}
	
}
