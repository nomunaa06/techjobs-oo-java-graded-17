package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    //test empty constructor if it is creating unique IDs.
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }
    // test full constructor
    @Test
    public void testJobConstructorSetsAllFields(){
    Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job3.getName() instanceof String);
        assertEquals(job3.getName(), "Product tester");

        assertTrue(job3.getEmployer() instanceof Employer);
        assertEquals(job3.getEmployer().getValue(), "ACME");

        assertTrue(job3.getLocation() instanceof Location);
        assertEquals(job3.getLocation().getValue(), "Desert");

        assertTrue(job3.getPositionType() instanceof PositionType);
        assertEquals(job3.getPositionType().getValue(), "Quality control");

        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(job3.getCoreCompetency().getValue(), "Persistence");
    }

    //test equals method
    @Test
    public void testJobsForEquality(){
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(job5, job4);
        assertNotEquals(job5.getId(), job4.getId());
    }

}
