 package com.ashokit.deo;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDeo {

	public String getNameById(Integer userID) {

		if (userID == 100) {
			return "Jonse";
		} else if (userID == 101) {
			return "Smith";

		} else {
			return " Name Not found";
		}

	}
}
