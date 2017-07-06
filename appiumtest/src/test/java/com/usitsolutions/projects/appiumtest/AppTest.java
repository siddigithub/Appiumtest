package com.usitsolutions.projects.appiumtest;

import java.net.MalformedURLException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     * @throws MalformedURLException 
     */
    public void testApp() throws MalformedURLException
    {
        assertTrue( true );
        System.out.println("Test Script executed");
        AppiumDriverProvider appiumDriver = new AppiumDriverProvider();
        appiumDriver.run();
    }
}
