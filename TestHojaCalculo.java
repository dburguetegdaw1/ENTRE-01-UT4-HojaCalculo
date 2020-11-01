
/**
 *  Clase con código para probar el resto de clases
 * 
 * @author - 
 *  
 */
public class TestHojaCalculo
{
    
    /**
     * Constructor  
     */
    public TestHojaCalculo()    {
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 1
     * incluyendo la hoja duplicada
     * La fila4 que no se podrá guardar puedes crearla con el constructor por defecto
     * de fila (el que no tiene parámetros)
     */
    public void test1() {
        HojaCalculo pruebaHC;
        pruebaHC = new HojaCalculo("\nHOJA1");
        Fecha fecha1 = new Fecha(4, 10, 2020);
        Fecha fecha2 = new Fecha(5, 10, 2020);
        Fecha fecha3 = new Fecha(6, 10, 2020);
        Fila fila3 = new Fila(" Fila3");
        pruebaHC.addFila(" Fila1", fecha1, 25.50, 132.00);
        pruebaHC.addFila(" Fila2", fecha2, 300.00, 350.00);
        pruebaHC.addFila(fila3);
        pruebaHC.addFila(" Fila4", fecha3, 300.00, 350.00);
        System.out.println(pruebaHC);
        HojaCalculo test1 = pruebaHC.duplicarHoja();
        System.out.println(test1);
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 2 
     * incluyendo la hoja duplicada
     *  
     */
    public void test2() {
        HojaCalculo pruebaHC;
        pruebaHC = new HojaCalculo("\nHOJA2");
        Fecha fecha1 = new Fecha(7, 10, 2020);
        Fecha fecha2 = new Fecha(8, 10, 2020);
        pruebaHC.addFila(" Fila1", fecha1, 260.00, 125.00);
        pruebaHC.addFila(" Fila2", fecha2, 125.00, 245.00);
        System.out.println(pruebaHC);
        HojaCalculo test1 = pruebaHC.duplicarHoja();
        System.out.println(test1);
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 3
     * incluyendo la hoja duplicada
     *  
     */
    public void test3() {
        HojaCalculo pruebaHC;
        pruebaHC = new HojaCalculo("\nHOJA3");
        Fecha fecha1 = new Fecha(8, 10, 2020);
        pruebaHC.addFila(" Fila1", fecha1, 670.00, 234.00);
        System.out.println(pruebaHC);
        HojaCalculo test1 = pruebaHC.duplicarHoja();
        System.out.println(test1);
    }

}
