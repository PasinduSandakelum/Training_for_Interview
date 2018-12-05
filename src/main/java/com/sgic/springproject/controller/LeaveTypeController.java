package com.sgic.springproject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.springproject.entity.LeaveType;
import com.sgic.springproject.service.LeaveTypeService;

@RestController
public class LeaveTypeController {

  @Autowired
  private LeaveTypeService LeaveTypeService;

  @GetMapping("/leave-type")
  public List<LeaveType> getAllLeaveTypes() {
    return LeaveTypeService.getAllLeaveTypes();
  }

  @PostMapping("/leave-type")
  public LeaveType createLeaveType(@RequestBody LeaveType leaveType) {

    return LeaveTypeService.createLeaveType(leaveType);

  }

}
