package com.sgic.springproject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.springproject.entity.LeaveRequest;
import com.sgic.springproject.service.LeaveRequestService;

@RestController
public class LeaveRequestController {

  @Autowired
  private LeaveRequestService leaveRequestService;

  @GetMapping("/leave-request")
  public ResponseEntity<List<LeaveRequest>> getAllLeaveRequests() {
    return new ResponseEntity<List<LeaveRequest>>(leaveRequestService.getAllLeaveRequests(),
        HttpStatus.OK);
  }

  @PostMapping("/leave-request")
  public HttpStatus applyLeaveRequest(@RequestBody LeaveRequest leaveRequest) {

    if (leaveRequest != null) {
      leaveRequestService.addLeaveRequest(leaveRequest);
      return HttpStatus.CREATED;
    }

    return HttpStatus.BAD_REQUEST;

  }

}
