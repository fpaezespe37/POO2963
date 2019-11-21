/**
 * Tax Computing Class
 * @Author Freddy Páez
 * @Version 0.0.1
 * @Since 21/11/2019
 */
package ec.espe.edu.taxlibrary.view;

public class Tax {
    /**
     * The variable is the value static of IVA assignated by the Ecuador Gobierno
     */
    private static float IvaPercentage = 12;
    /**
     * 
     * @param base Base is a money in a dollar
     * @return the valor of the value total
     */

    public static float computeIva(float base) {
        float iva;
        iva = (base * IvaPercentage) / 100;
        return iva;

    }
}
