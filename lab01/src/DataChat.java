public class DataChat
 {

    private int dia;
    private int mes;
    private int any;

    // Constructor
    public DataChat(int dia, int mes, int any) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }

    // Getters
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAny() { return any; }

    // toString
    public String toString() {
        return dia + "/" + mes + "/" + any;
    }

    // Comprovar si és any de traspàs
    public boolean esAnyDeTraspas() {
        return (any % 4 == 0 && any % 100 != 0) || (any % 400 == 0);
    }

    // Comprovar si és primera quinzena
    public boolean esPrimeraQuinzena() {
        return dia <= 15;
    }

    // Comprovar si dues dates són iguals
    public boolean esIgual(DataChat altra) {
        return this.dia == altra.dia &&
               this.mes == altra.mes &&
               this.any == altra.any;
    }

    // Calcular el dia següent
    public DataChat diaSeguent() {
        int nouDia = dia;
        int nouMes = mes;
        int nouAny = any;

        int diesMes = diesDelMes(mes, any);

        if (dia < diesMes) {
            nouDia++;
        } else {
            nouDia = 1;
            if (mes < 12) {
                nouMes++;
            } else {
                nouMes = 1;
                nouAny++;
            }
        }

        return new DataChat(nouDia, nouMes, nouAny);
    }

    // Mètode auxiliar per saber quants dies té un mes
    private int diesDelMes(int mes, int any) {
        switch (mes) {
            case 2:
                return esAnyDeTraspas() ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

    // ✔️ MÈTODE OBLIGATORI 1: És l'últim dia del mes?
    public boolean esUltimDiaMes() {
        return dia == diesDelMes(mes, any);
    }

    // ✔️ MÈTODE OBLIGATORI 2: És anterior a una altra data?
    public boolean esAnterior(DataChat altra) {
        if (this.any < altra.any) return true;
        if (this.any > altra.any) return false;

        if (this.mes < altra.mes) return true;
        if (this.mes > altra.mes) return false;

        return this.dia < altra.dia;
    }
}
