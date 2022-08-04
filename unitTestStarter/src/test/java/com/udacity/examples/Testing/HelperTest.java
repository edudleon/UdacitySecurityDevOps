package com.udacity.examples.Testing;

import org.junit.jupiter.api.*;

import java.util.*;

public class HelperTest {

    @BeforeAll
    //Executes before all the tests execution
    public void setup(){
        //Setup operations like pre-conditions
        System.out.println("before all tests!");
    }

    @BeforeEach
    //Execute before each test execution
    public void init(){
        System.out.println("before each test!");
        //Clean operations for avoid collisions
    }

    @AfterEach
    //Execute after each test execution
    public void clean(){
        System.out.println("after each test!");
    }

    @AfterAll
    //Executes after all the tests execution
    public void teardown(){
        System.out.println("after all tests!");
    }

    @Test
	public void testGetCount(){
        List<String> testString = new ArrayList<>();
        testString.add("One");
        testString.add("Two");
        testString.add("");
        Assertions.assertEquals(1, Helper.getCountEmpty(testString));
        testString.add("");
        Assertions.assertEquals(2, Helper.getCountEmpty(testString));
        testString.removeIf(""::equals);
        Assertions.assertEquals(0, Helper.getCountEmpty(testString));
    }

    @Test
    public void testGetStats(){
        List<Integer> yrsOfExperience = Arrays.asList(13,4,15,6,17,8,19,1,2,3);
        IntSummaryStatistics stats = Helper.getStats(yrsOfExperience);
        Assertions.assertEquals(19, stats.getMax());
    }

    @Test
    public void testGetStringOfLength3(){
        //
    }

    @Test
    public void testGetSquareList(){
        List<Integer> yrsOfExperience = Arrays.asList(13,4,15,6,17,8,19,1,2,3);
        List<Integer> expected = Arrays.asList(169, 16, 225, 36, 289, 64, 361, 1, 4, 9);
        Assertions.assertEquals(expected, Helper.getSquareList(yrsOfExperience));
    }

    @Test
    public void testGetMergedList(){
        List<String> toMergeList = Arrays.asList("Hello", "World");
        String mergedList = Helper.getMergedList(toMergeList);
        Assertions.assertEquals("Hello World",mergedList);
    }

    @Test
    public void testGetFilteredList(){
        //
    }
}
