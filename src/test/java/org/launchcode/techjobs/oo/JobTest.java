package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() { //Test the Empty Constructor
        Job test_job1 = new Job();
        Job test_job2 = new Job();
        assertNotEquals(test_job1.getId(),test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //  assertTrue statements - The instanceof keyword can be used to check the class of an object. The result of the comparison is a boolean.
        assertTrue(test_job instanceof Job);
        assertTrue(test_job.getEmployer() instanceof Employer);
        assertTrue(test_job.getLocation() instanceof Location);
        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);

        // assertEquals Statements
        assertEquals(test_job.getName(),"Product tester");
        assertEquals(test_job.getEmployer().getValue(),"ACME"); //without get value the test was failing cuz it is the instance of employer
        assertEquals(test_job.getLocation().getValue(),"Desert");
        assertEquals(test_job.getPositionType().getValue(),"Quality control");
        assertEquals(test_job.getCoreCompetency().getValue(),"Persistence");
        System.out.println(test_job.getPositionType().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(test_job1.equals(test_job2));
        assertFalse(test_job1.getId() == test_job2.getId());

    }
}
