
/**
 *  Representa a una fila de la hoja de cálculo
 *  Toda fila tiene un identificador y en ella
 *  se anotan la fecha, los ingresos y los gastos correspondientes a un
 *  apunte  contable  de una empresa
 * 
 * @author - 
 *  
 */
public class Fila
{
    private String id;
    private Fecha fecha;
    private double ingresos;
    private double gastos;
    private double beneficio;

    /**
     * Constructor  
     */
    public Fila(String newId){
        this.id=newId;
        this.fecha=new Fecha(1, 1, 2020);
        this.ingresos=0;
        this.gastos=0;
    }

    /**
     * Constructor  
     */
    public Fila(String newId, Fecha fecha, double ingresos, double gastos){
        this.id=newId;
        this.fecha=new Fecha(fecha.getDia(), fecha.getMes(), fecha.getAño());
        this.ingresos=ingresos;
        this.gastos=gastos;
    }
    
    /**
     * accesor para el id de la fila
     */
    public String getId() {
        return this.id;

    }


    /**
     * accesor para la fecha
     */
    public Fecha getFecha() {
        return this.fecha;

    }

    /**
     * accesor para los ingresos
     */
    public double getIngresos() {
        return this.ingresos;

    }

    /**
     * accesor para los gastos
     */
    public double getGastos() {
        return this.gastos;

    }

    /**
     * calcula y devuelve el beneficio
     */
    public double getBeneficio() {
        if(this.ingresos - this.gastos < 0){
            return this.ingresos - this.gastos;
        }
        return this.ingresos - this.gastos;
    }
    
    /**
     * obtiene una copia idéntica a la fila actual.
     * La fecha que incluye la fila duplicada también es una copia
     * 
     */
    public Fila duplicar() {
       return new Fila(this.id, this.fecha, this.ingresos, this.gastos);

    }

    /**
     * Representación textual de una fila
     * (leer enunciado)
     */
    public String toString() {
        double valorIngresos = this.ingresos;
        double valorGastos = this.gastos;   
        beneficio=this.ingresos - this.gastos;
        String patron = "%s%17s%15.2f€%15.2f€%15.2f€";
        String resultado = String.format(patron, this.id, this.fecha, valorIngresos, valorGastos, beneficio);
        return (resultado);
        
    }

     

}
