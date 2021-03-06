package uom.dialog.click2call.data;
// Generated Apr 8, 2013 10:35:36 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

/**
 * Privileges generated by hbm2java
 */
@Component
public class Privileges  implements java.io.Serializable {


     private Integer privilegeId;
     private String pname;
     private Set typePrivilegeses = new HashSet(0);

    public Privileges() {
    }

	
    public Privileges(String pname) {
        this.pname = pname;
    }
    public Privileges(String pname, Set typePrivilegeses) {
       this.pname = pname;
       this.typePrivilegeses = typePrivilegeses;
    }
   
    public Integer getPrivilegeId() {
        return this.privilegeId;
    }
    
    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }
    public String getPname() {
        return this.pname;
    }
    
    public void setPname(String pname) {
        this.pname = pname;
    }
    public Set getTypePrivilegeses() {
        return this.typePrivilegeses;
    }
    
    public void setTypePrivilegeses(Set typePrivilegeses) {
        this.typePrivilegeses = typePrivilegeses;
    }




}


