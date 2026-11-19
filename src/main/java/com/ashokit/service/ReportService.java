 package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.deo.ReportDeo;

@Service
public class ReportService {

	private ReportDeo reportDeo;

	@Autowired
	public void setReportDeo(ReportDeo reportDeo) {
		System.out.println("setReport () Method called");
		this.reportDeo = reportDeo;
	}

	public void printName(Integer userID) {

		String nameById = reportDeo.getNameById(userID);
		System.out.println(nameById);

	}
}
