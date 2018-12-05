package com.sgic.springproject.service;

import java.util.List;
import com.sgic.springproject.entity.LeaveType;

public interface LeaveTypeService {

  LeaveType createLeaveType(LeaveType leaveType);

  List<LeaveType> getAllLeaveTypes();
}
