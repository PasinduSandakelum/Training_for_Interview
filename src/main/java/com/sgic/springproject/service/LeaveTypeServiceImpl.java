package com.sgic.springproject.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.springproject.entity.LeaveType;
import com.sgic.springproject.repository.LeaveTypeRepository;

@Service
public class LeaveTypeServiceImpl implements LeaveTypeService {

  @Autowired
  private LeaveTypeRepository leaveTypeRepository;

  @Override
  public LeaveType createLeaveType(LeaveType leaveType) {

    return leaveTypeRepository.save(leaveType);
  }

  @Override
  public List<LeaveType> getAllLeaveTypes() {

    return leaveTypeRepository.findAll();
  }

}
