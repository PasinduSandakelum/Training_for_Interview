package com.sgic.springproject.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.springproject.entity.LeaveRequest;
import com.sgic.springproject.repository.LeaveRequestRepository;

@Service
public class LeaveRequestServiceImpl implements LeaveRequestService {

  @Autowired
  private LeaveRequestRepository leaveRequestRepository;

  @Override
  public boolean addLeaveRequest(LeaveRequest leaveRequest) {

    try {
      leaveRequestRepository.save(leaveRequest);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
    }

    return false;
  }

  @Override
  public List<LeaveRequest> getAllLeaveRequests() {
    List<LeaveRequest> leaveRequests = new ArrayList<>();
    try {
      leaveRequests = leaveRequestRepository.findAll();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return leaveRequests;
  }

}
