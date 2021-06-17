package uom.dialog.click2call.data;
// Generated Apr 8, 2013 10:35:36 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

/**
 * Agents generated by hbm2java
 */
@Component
public class Agents  implements java.io.Serializable {


     private Integer agentId;
     private Company company;
     private String name;
     private String number;
     private String agentKey;
     private int totalMins;
     private Integer usedSeconds;
     private int status;
     private Date dateCreated;
     private Date dateDeleted;
     private String iframe;
     private int nextCorrelate;
     private Set callses = new HashSet(0);
     private Set agentUsages = new HashSet(0);

    public Agents() {
    }

	
    public Agents(Company company, String name, String number, String agentKey, int totalMins, Integer usedSeconds, int status, int nextCorrelate) {
        this.company = company;
        this.name = name;
        this.number = number;
        this.agentKey = agentKey;
        this.totalMins = totalMins;
        this.usedSeconds = usedSeconds;
        this.status = status;
        this.nextCorrelate = nextCorrelate;
    }
    public Agents(Company company, String name, String number, String agentKey, int totalMins, Integer usedSeconds, int status, Date dateCreated, Date dateDeleted, String iframe, int nextCorrelate, Set callses, Set agentUsages) {
       this.company = company;
       this.name = name;
       this.number = number;
       this.agentKey = agentKey;
       this.totalMins = totalMins;
       this.usedSeconds = usedSeconds;
       this.status = status;
       this.dateCreated = dateCreated;
       this.dateDeleted = dateDeleted;
       this.iframe = iframe;
       this.nextCorrelate = nextCorrelate;
       this.callses = callses;
       this.agentUsages=agentUsages;
    }
   
    public Integer getAgentId() {
        return this.agentId;
    }
    
    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }
    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getNumber() {
        return this.number;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    public String getAgentKey() {
        return this.agentKey;
    }
    
    public void setAgentKey(String agentKey) {
        this.agentKey = agentKey;
    }
    public int getTotalMins() {
        return this.totalMins;
    }
    
    public void setTotalMins(int totalMins) {
        this.totalMins = totalMins;
    }
    public Integer getUsedSeconds() {
        return this.usedSeconds;
    }
    
    public void setUsedSeconds(Integer usedSeconds) {
        this.usedSeconds = usedSeconds;
    }
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public Date getDateDeleted() {
        return this.dateDeleted;
    }
    
    public void setDateDeleted(Date dateDeleted) {
        this.dateDeleted = dateDeleted;
    }
    public String getIframe() {
        return this.iframe;
    }
    
    public void setIframe(String iframe) {
        this.iframe = iframe;
    }
    public int getNextCorrelate() {
        return this.nextCorrelate;
    }
    
    public void setNextCorrelate(int nextCorrelate) {
        this.nextCorrelate = nextCorrelate;
    }
    public Set getCallses() {
        return this.callses;
    }
    
    public void setCallses(Set callses) {
        this.callses = callses;
    }

public Set getAgentUsages() {
        return this.agentUsages;
    }
    
    public void setAgentUsages(Set agentUsages) {
        this.agentUsages = agentUsages;
    }


}

