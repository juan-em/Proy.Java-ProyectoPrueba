/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package src;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


/**
 *
 * @author jhons
 */
public class ArrayTest {
    
    public ArrayTest() {
    }

    @Test
    public void testSize() {
        int arr[]={1,2,3};
        Array a = new Array(arr);
        assertEquals(3,a.size());
    }
    @Test
    public void testToString() {
        int arr[]={1,2,3};
        Array a = new Array(arr);
        assertEquals("1;2;3",a.toString());
    }
    
    @Test
    public void testSetElement(){
        int arr[] = {1,2,3};
        Array a = new Array (arr);
        a.setElementAt(100,2);
        
        //obtener arreglo
        int obt[] = a.getArray();
        
        //corroborar que se actualizó la información
        assertEquals(obt[2], 100);
    }
    
    @Test
    public void testSetElementAt(){
        int arr[] = {1,2,3};
        Array a = new Array(arr);
        a.setElementAt(100, 2);
        
        //obtener arreglo
        int obt[] = a.getArray();
        
        //corroborar que se actualizó la inoformcaión
        assertEquals(obt[2],100);
        
        try{
            a.setElementAt(100, -1);
            //si el método prueba llega a este punto, no se generó la execpxión
            //hacer que la prueba falle
            assertFalse(true);
        }catch(Exception e){
            //la excepci+on se dio, por lo tanto la prueba
            assertTrue(true);
        }
        
    }
    public void setUp(){
        System.out.println("Los valores iniciales del arreglo: {1,2,3}");
    }
    
    public void tearDown(){
        System.out.println("Aqui finaliza este caso de prueba");
    }
}
    

