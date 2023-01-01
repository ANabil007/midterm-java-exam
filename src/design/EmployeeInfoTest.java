package design;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeInfoTest {
    //Write Unit Test for all the methods has been implemented in this package.

    @Test
    public void employeeId() {

        EmployeeInfo test = new EmployeeInfo();
        test.employeeId(5);
        Assert.assertEquals(5, test.employeeId());
    }

    @Test
    public void employeeName() {
        EmployeeInfo test = new EmployeeInfo();
        test.employeeName("Steve");
        Assert.assertEquals("Steve", test.employeeName());
    }

    @Test
    public void getDepartment() {
        EmployeeInfo test = new EmployeeInfo();
        test.assignDepartment(30);
        Assert.assertEquals(30, test.getDepartment());
    }

    @Test
    public void testEmployeeId() {
        EmployeeInfo test = new EmployeeInfo();
        test.employeeId(5);
        Assert.assertEquals(5, test.employeeId());
    }

    @Test
    public void testEmployeeName() {
        EmployeeInfo test = new EmployeeInfo();
        test.employeeName("Steve");
        Assert.assertEquals("Steve", test.employeeName());
    }

    @Test
    public void assignDepartment() {
        EmployeeInfo test = new EmployeeInfo();
        test.assignDepartment(30);
        Assert.assertEquals(30, test.getDepartment());
    }
}