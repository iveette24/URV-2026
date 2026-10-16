public class PilaCaracters {
		private int cim;
		private char[] elements;

		public PilaCaracters (int tamany) {
			cim=-1;
			elements=new char[tamany];
		}
		public void apilar(char valor) { 
			if (cim<elements.length-1) {
				cim++;
				elements[cim]=valor;
			} 
		}
		public char desapilar() {
		char aux;
			if (cim>-1) {
				aux=elements[cim];
				cim--;
				return(aux);
			}
			else return('*');
		}
		public char cim() {
			if (cim!=-1) return(elements[cim]);
			else return('*');
		}
		public boolean pilaBuida() { 
			if (cim==-1) return (true);
			else return(false);
		}
		public int tamanyPila() { 
			return(cim+1);
 		}
}
