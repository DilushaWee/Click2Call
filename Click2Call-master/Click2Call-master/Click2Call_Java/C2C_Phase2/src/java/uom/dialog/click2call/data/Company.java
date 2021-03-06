package uom.dialog.click2call.data;
// Generated Apr 8, 2013 10:35:36 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

/**
 * Company generated by hbm2java
 */
@Component
public class Company  implements java.io.Serializable {


     private Integer companyId;
     private AuthModel authModel;
     private ChargingPlan chargingPlan;
     private String companyName;
     private String contactName;
     private int companyStatus;
     private String maxAgents;
     private Date startTime;
     private Date endTime;
     private String contactNumber;
     private String secretKey;
     private Integer usedSeconds;
     private Integer allocatedMinutes;
     private String email;
     private Set userses = new HashSet(0);
     private Set companyUsages = new HashSet(0);
     private Set blacklists = new HashSet(0);
     private Set agentses = new HashSet(0);
     
    public Company() {
    }

	
    public Company(String companyName, String contactName, int companyStatus) {
        this.companyName = companyName;
        this.contactName = contactName;
        this.companyStatus = companyStatus;
    }
    public Company(AuthModel authModel, ChargingPlan chargingPlan, String companyName, String contactName, int companyStatus, String maxAgents, Date startTime, Date endTime, String contactNumber, String secretKey, Integer usedSeconds,Integer allocatedMinutes,String email, Set userses, Set companyUsages, Set blacklists, Set agentses) {
       this.authModel = authModel;
       this.chargingPlan = chargingPlan;
       this.companyName = companyName;
       this.contactName = contactName;
       this.companyStatus = companyStatus;
       this.maxAgents = maxAgents;
       this.startTime = startTime;
       this.endTime = endTime;
       this.contactNumber = contactNumber;
       this.secretKey = secretKey;
       this.usedSeconds = usedSeconds;
       this.allocatedMinutes = allocatedMinutes;
       this.email=email;
       this.userses = userses;
       this.companyUsages=companyUsages;
       this.blacklists = blacklists;
       this.agentses = agentses;
    }
   
    public Integer getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
    public AuthModel getAuthModel() {
        return this.authModel;
    }
    
    public void setAuthModel(AuthModel authModel) {
        this.authModel = authModel;
    }
    public ChargingPlan getChargingPlan() {
        return this.chargingPlan;
    }
    
    public void setChargingPlan(ChargingPlan chargingPlan) {
        this.chargingPlan = chargingPlan;
    }
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getContactName() {
        return this.contactName;
    }
    
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    public int getCompanyStatus() {
        return this.companyStatus;
    }
    
    public void setCompanyStatus(int companyStatus) {
        this.companyStatus = companyStatus;
    }
    public String getMaxAgents() {
        return this.maxAgents;
    }
    
    public void setMaxAgents(String maxAgents) {
        this.maxAgents = maxAgents;
    }
    public Date getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    public Date getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    public String getContactNumber() {
        return this.contactNumber;
    }
    
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getSecretKey() {
        return this.secretKey;
    }
    
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
    public Integer getUsedSeconds() {
        return this.usedSeconds;
    }
    
    public void setUsedSeconds(Integer usedSeconds) {
        this.usedSeconds = usedSeconds;
    }

    public Integer getAllocatedMinutes() {
        return allocatedMinutes;
    }

    public void setAllocatedMinutes(Integer allocatedMinutes) {
        this.allocatedMinutes = allocatedMinutes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Set getUserses() {
        return this.userses;
    }
    
    public void setUserses(Set userses) {
        this.userses = userses;
    }
    
    public Set getCompanyUsages() {
        return this.companyUsages;
    }
    
    public void setCompanyUsages(Set companyUsages) {
        this.companyUsages = companyUsages;
    }
    
    public Set getBlacklists() {
        return this.blacklists;
    }
    
    public void setBlacklists(Set blacklists) {
        this.blacklists = blacklists;
    }
    public Set getAgentses() {
        return this.agentses;
    }
    
    public void setAgentses(Set agentses) {
        this.agentses = agentses;
    }




}


