package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testMarkAttendance() {
        AttendanceSystem system = new AttendanceSystem();
        assertTrue(system.markAttendance("John Doe", "Mathematics"));
    }

    @Test
    public void testInvalidSubjectName() {
        AttendanceSystem system = new AttendanceSystem();
        assertFalse(system.markAttendance("Jane Smith", ""));
    }

    @Test
    public void testInvalidStudentName() {
        AttendanceSystem system = new AttendanceSystem();
        assertFalse(system.markAttendance("", "History"));
    }

    @Test
    public void testInvalidAttendance() {
        AttendanceSystem system = new AttendanceSystem();
        assertFalse(system.markAttendance("", ""));
    }
}

