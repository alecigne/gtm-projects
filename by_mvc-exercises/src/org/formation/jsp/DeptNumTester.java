package org.formation.jsp;

import static org.junit.Assert.*;

import org.junit.*;

public class DeptNumTester {
  @Test
  public void testDeptNum() {
    String deptNum = "75";
    String deptName = "Paris";
    DeptPair pair = new DeptPair(deptNum, deptName);
    assertEquals(deptNum, pair.getDeptNum());
    assertEquals(deptName, pair.getDeptName());
    DeptNumService mapper = new NumDeptMapper();
    assertEquals(mapper.findDept(deptNum), deptName);
  }
}
