package com.sgic.springproject.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(schema = "spring_crud", name = "users")
public class User implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 5665589199001723657L;


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String userName;
  private String email;
  private Integer servicePeriod;

  @JsonIgnore
  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
  // @JoinColumn(name = "leave_request_id")
  private List<LeaveRequest> leaveRequestList;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getServicePeriod() {
    return servicePeriod;
  }

  public void setServicePeriod(Integer servicePeriod) {
    this.servicePeriod = servicePeriod;
  }

  public List<LeaveRequest> getLeaveRequests() {
    return leaveRequestList;
  }

  public void setLeaveRequests(List<LeaveRequest> leaveRequestList) {
    this.leaveRequestList = leaveRequestList;
  }


}
