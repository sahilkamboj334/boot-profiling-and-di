package com.main.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("gov")
@Qualifier("GOV")
public class GovEmployee implements Employee{

	@Override
	public String detail() {
		// TODO Auto-generated method stub
		return "Gov Employee";
	}

}
