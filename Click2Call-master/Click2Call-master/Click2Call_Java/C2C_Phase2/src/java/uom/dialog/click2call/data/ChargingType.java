package uom.dialog.click2call.data;
// Generated Apr 9, 2013 12:33:39 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

/**
 * ChargingType generated by hbm2java
 */
@Component
public class ChargingType  implements java.io.Serializable {


     private Integer typeId;
     private String typeName;
     private Set chargingPlans = new HashSet(0);

    public ChargingType() {
    }

	
    public ChargingType(String typeName) {
        this.typeName = typeName;
    }
    public ChargingType(String typeName, Set chargingPlans) {
       this.typeName = typeName;
       this.chargingPlans = chargingPlans;
    }
   
    public Integer getTypeId() {
        return this.typeId;
    }
    
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
    public String getTypeName() {
        return this.typeName;
    }
    
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    public Set getChargingPlans() {
        return this.chargingPlans;
    }
    
    public void setChargingPlans(Set chargingPlans) {
        this.chargingPlans = chargingPlans;
    }




}


