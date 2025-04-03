package com.example.demo.service;

import java.util.List;

import com.example.demo.binding.DashboardResponse;
import com.example.demo.binding.EnquiryForm;
import com.example.demo.binding.EnquirySearchCriteria;

public interface EnquiryService {

	public List<String> getCourseName();

	public List<String> getEnqStatus();

	public DashboardResponse getDashboardData(Integer userId);

	public String upsertEnquiry(EnquiryForm form);

	public List<EnquiryForm> getEnqueries(Integer userId, 
										EnquirySearchCriteria criteria);

	public EnquiryForm getEnquery(Integer enqId);

}
