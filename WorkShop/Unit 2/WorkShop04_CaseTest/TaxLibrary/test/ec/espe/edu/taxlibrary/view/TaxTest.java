/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.taxlibrary.view;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Labs-DCCO
 */
public class TaxTest {
    
    public TaxTest() {
    }
    
    

    /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva() {
        System.out.println("computeIva");
        float base = 10.00F;
        float expResult = 1.2F;
        float result = Tax.computeIva(base);
        
        
        assertEquals(expResult, result, 10);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
          
    public void testComputeIva1() {
        System.out.println("computeIva");
        float base = 50388.37F;
        float expResult = 6046.6844F;
        float result = Tax.computeIva(base);
        
        
        assertEquals(expResult, result, 10);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
