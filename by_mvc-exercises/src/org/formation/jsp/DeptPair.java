package org.formation.jsp;

import java.io.*;

// Serializable because we store the bean in the session

public class DeptPair implements Serializable {
  private final String deptNum, deptName;

  public DeptPair(String deptNum, String deptName) {
    this.deptNum = deptNum;
    this.deptName = deptName;
  }
  
  public String getDeptNum() {
    return deptNum;
  }

  public String getDeptName() {
    return deptName;
  }
}
