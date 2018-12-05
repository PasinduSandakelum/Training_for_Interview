package com.sgic.springproject.service;

import java.util.List;
import com.sgic.springproject.entity.LeaveRequest;

public interface LeaveRequestService {

  boolean addLeaveRequest(LeaveRequest leaveRequest);

  List<LeaveRequest> getAllLeaveRequests();

}
