package org.formation.jsp;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

// The only differences in this example from the previous one:
// 1) DeptPair bean is stored in the session (and thus input form can display it)
// 2) Bean name changes (don't use same names for beans in different places!), 
//    so page names also change so that they can refer to correct bean.
// 3) URL of servlet changes (all servlets must have unique URLs)

@WebServlet("/show-departement-2")
public class ShowDept2 extends HttpServlet {
  private DeptNumService deptNumMapper = new NumDeptMapper();
  
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    String deptNum = request.getParameter("dept-num");
    if (deptNum == null) {
      deptNum = "";
    }
    deptNum = deptNum.trim();
    String deptName = deptNumMapper.findDept(deptNum);
    DeptPair deptInfo = new DeptPair(deptNum, deptName);
    HttpSession session = request.getSession();
    
    
    
    session.setAttribute("deptInfo2", deptInfo);
    
    String address;
    if (deptNum.isEmpty()) {
      address = "/WEB-INF/results/missing-num.jsp";
    } else if (deptName != null) {
      address = "/WEB-INF/results/show-departement-2.jsp";
    } else {
      address = "/WEB-INF/results/unknown-num-2.jsp";
    }
    RequestDispatcher dispatcher =
      request.getRequestDispatcher(address);
    dispatcher.forward(request, response);
  }
}
