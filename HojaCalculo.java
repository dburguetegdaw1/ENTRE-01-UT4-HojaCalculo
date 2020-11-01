
/**
 *  Un objeto de esta clase representa a una sencilla
 *  hoja de cálculo. La hoja tiene hasta un máximo de 3 filas (no más)
 *  En cada fila la empresa "apunta" los ingresos y gastos en 
 *  una determinada fecha
 * 
 * @author -   
 *  
 */
public class HojaCalculo
{
    private String nombre;
    private Fila fila1;
    private Fila fila2;
    private Fila fila3;

    /**
     * Constructor  
     * Crea la hoja de cálculo con el nombre indicado 
     * e inicializa las filas al valor null (inicialmente
     * la hoja se crea sin filas)
     */
    public HojaCalculo(String nombre)    {
        this.nombre = nombre;
        this.fila1 = null;
        this.fila2 = null;
        this.fila3 = null;

    }

    /**
     * accesor para el nombre de la hoja
     */
    public String getNombre() {
        return this.nombre;

    }

    /**
     * accesor para la fila1
     */
    public Fila getFila1() {
        return fila1;

    }

    /**
     * accesor para la fila2
     */
    public Fila getFila2() {
        return fila2;

    }

    /**
     * accesor para la fila3
     */
    public Fila getFila3() {
        return fila3;

    }

    /**
     * Devuelve el nº de filas de la hoja
     * (dependerá de cuántas filas estén a null)
     */
    public int getNumeroFilas() {
        if(fila1!=null){
            if(fila2!=null){
                if(fila3!=null){
                    return 3;
                }
                else if(fila3==null){
                    return 2;
                }
            }
            else if(fila2==null){
                if(fila3!=null){
                    return 2;
                }
                else if(fila3==null){
                    return 1;
                }
            }
        }
        else if(fila1==null){
            if(fila2!=null){
                if(fila3!=null){
                    return 2;
                }
                else if(fila3==null){
                    return 1;
                }
            }
            else if(fila2==null){
                if(fila3!=null){
                    return 1;
                }
            }
        }
        return 0 ;

    }

    /**
     * Devuelve true si la hoja está completa
     * (tiene exactamente 3 filas)
     */
    public boolean hojaCompleta() {
        if(fila1!=null && fila2!=null && fila3!=null){
            return true;
        }
        return false;
    }

    /**
     * Se añade una nueva fila a la hoja
     * Si la hoja está completa se muestra el mensaje "FilaX no se puede añadir en HOJAX"
     * Si no está completa se añade la fila a la hoja teniendo en cuenta
     * si se añade como primera, segunda o tercera fila (no han de quedar huecos)
     */
    public void addFila(Fila fila) { 
         if(fila1==null){
             fila1=fila;
         }
         else if(fila2==null){
             fila2=fila;
         }
         else if(fila3==null){
             fila3=fila;
         }
         else{
             System.out.println("FilaX no se puede añadir en HOJAX");
         }
    }

    /**
     * Dada la información a guardar en una fila el método
     * crea la fila y la añade a la hoja
     * (evita repetir código)
     */
    public void addFila(String id, Fecha fecha, double ingresos, double gastos) {
         if(fila1==null){
             fila1=new Fila(id, fecha, ingresos, gastos);
         }
         else if(fila1!=null){
             if(fila2==null){
                 fila2=new Fila(id, fecha, ingresos, gastos);
             }
             else if(fila2!=null){
                 if(fila3==null){
                     fila3=new Fila(id, fecha, ingresos, gastos);
                 }
                 else{
                     System.out.println("HOJA completa");
                 }
             }
         }
    }

    /**
     * Calcula y devuelve el total de ingresos entre
     * todas las filas que incluye la hoja
     */
    public double getTotalIngresos() {
        double ingresosTotales1=0;
        double ingresosTotales2=0;
        double ingresosTotales3=0;
        if(fila1!=null){
            ingresosTotales1=fila1.getIngresos();
        }
        if(fila2!=null){
            ingresosTotales2=fila2.getIngresos();
        }
        if(fila3!=null){
            ingresosTotales3=fila3.getIngresos();
        }
        double ingresosTotales=ingresosTotales1+ingresosTotales2+ingresosTotales3;
        return ingresosTotales;
    }

    /**
     * Calcula y devuelve el total de gastos
     * entre todas las filas que incluye la hoja
     */
    public double getTotalGastos() {
        double gastosTotales1=0;
        double gastosTotales2=0;
        double gastosTotales3=0;
        if(fila1!=null){
            gastosTotales1=fila1.getGastos();
        }
        if(fila2!=null){
            gastosTotales2=fila2.getGastos();
        }
        if(fila3!=null){
            gastosTotales3=fila3.getGastos();
        }
        double gastosTotales=gastosTotales1+gastosTotales2+gastosTotales3;
        return gastosTotales;
    }

    /**
     * Calcula y devuelve el total del beneficio
     * entre todas las filas que incluye la hoja
     */
    public double getBeneficio() {
        double beneficio1=0;
        double beneficio2=0;
        double beneficio3=0;
        if(fila1!=null){
            beneficio1=fila1.getBeneficio();
        }
        if(fila2!=null){
            beneficio2=fila2.getBeneficio();
        }
        if(fila3!=null){
            beneficio3=fila3.getBeneficio();
        }
        double beneficioTotal=beneficio1+beneficio2+beneficio3;
        return beneficioTotal;
    }

    /**
     * Representación textual de la hoja
     * con el formato exacto que indica el enunciado
     */
    public String toString() {
        String hoja = String.format("%s%n%23s%16s%16s%16s", this.nombre,"FECHA","INGRESOS","GASTOS","BENEFICIO");
        if(getNumeroFilas()==1){
            hoja = hoja + String.format("\n" + fila1.toString());
        }
        else if(getNumeroFilas()==2){
            hoja = hoja + String.format("\n" + fila1.toString());
            hoja = hoja + String.format("\n" + fila2.toString());
        }
        else if(getNumeroFilas()==3){
            hoja = hoja + String.format("\n" + fila1.toString());
            hoja = hoja + String.format("\n" + fila2.toString());
            hoja = hoja + String.format("\n" + fila3.toString());
        }
        hoja = hoja + "\n---------------------------------------------------------------------------";
        String lineaSalida = String.format("%39s%16s%16s", getTotalIngresos(), getTotalGastos(), getBeneficio());
        hoja = hoja + "\n" + lineaSalida;
        return hoja;
    }

    /**
     * Devuelve un duplicado de la hoja actual.
     * El nombre de la hoja duplicada será "Duplicada HojaX"
     * Al duplicar la hoja se duplicarán también las filas que contenga
     */
    public HojaCalculo duplicarHoja() {
       HojaCalculo hojaDuplicada = new HojaCalculo("\nDuplicada " +  this.nombre);
       if(getNumeroFilas()==1){
           Fila copiaFila1 = fila1.duplicar();
           hojaDuplicada.addFila(copiaFila1);
       }
       else if(getNumeroFilas()==2){
           Fila copiaFila1 = fila1.duplicar();
           hojaDuplicada.addFila(copiaFila1);
           Fila copiaFila2 = fila2.duplicar();
           hojaDuplicada.addFila(copiaFila2);
       }
       else if(getNumeroFilas()==3){
           Fila copiaFila1 = fila1.duplicar();
           hojaDuplicada.addFila(copiaFila1);
           Fila copiaFila2 = fila2.duplicar();
           hojaDuplicada.addFila(copiaFila2);
           Fila copiaFila3 = fila3.duplicar();
           hojaDuplicada.addFila(copiaFila3);
       }
       return hojaDuplicada;
    }

   
}
