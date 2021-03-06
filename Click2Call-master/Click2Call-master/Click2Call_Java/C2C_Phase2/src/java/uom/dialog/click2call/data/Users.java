package uom.dialog.click2call.data;
// Generated Apr 8, 2013 10:35:36 AM by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

/**
 * Users generated by hbm2java
 */
@Component
public class Users implements java.io.Serializable {

    private Integer userId;
    private UserType userType;
    private Company company;
    private String userName;
    private String password;
    private int userStatus;
    private String email;
    private String phone;
    private String fullName;
    private Set systemHistories = new HashSet(0);

    public Users() {
    }

    public Users(UserType userType, Company company, String userName, String password, int userStatus) {
        this.userType = userType;
        this.company = company;
        this.userName = userName;
        this.password = password;
        this.userStatus = userStatus;
    }

    public Users(UserType userType, Company company, String userName, String password, int userStatus, String email, String phone, String fullName, Set systemHistories) {
        this.userType = userType;
        this.company = company;
        this.userName = userName;
        this.password = password;
        this.userStatus = userStatus;
        this.email = email;
        this.phone = phone;
        this.fullName = fullName;
        this.systemHistories = systemHistories;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public UserType getUserType() {
        return this.userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserStatus() {
        return this.userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Set getSystemHistories() {
        return this.systemHistories;
    }

    public void setSystemHistories(Set systemHistories) {
        this.systemHistories = systemHistories;
    }
}
