/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author assent2
 */
public class LogicTest {
    
    @Test
    public void testIsWork() {
        System.out.println("isWork");
        Logic instance = new Logic();
        boolean expResult = true;
        boolean result = instance.isWork();
        assertEquals(expResult, result);
    }
}