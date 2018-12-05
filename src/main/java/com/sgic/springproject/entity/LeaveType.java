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
@Table(schema = "spring_crud", name = "leave_types")
public class LeaveType implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -6867812689644473824L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String leaveType;
  private String allocatedDays;

  @JsonIgnore
  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "leaveType")
  // @JoinColumn(name = "leave_request_id")
  private List<LeaveRequest> leaveRequestsList;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLeaveType() {
    return leaveType;
  }

  public void setLeaveType(String leaveType) {
    this.leaveType = leaveType;
  }

  public String getAllocatedDays() {
    return allocatedDays;
  }

  public void setAllocatedDays(String allocatedDays) {
    this.allocatedDays = allocatedDays;
  }

  public List<LeaveRequest> getLeaveRequests() {
    return leaveRequestsList;
  }

  public void setLeaveRequests(List<LeaveRequest> leaveRequests) {
    this.leaveRequestsList = leaveRequests;
  }



}
