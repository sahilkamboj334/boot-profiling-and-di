package com.main.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("IT")
public class ITEmployee implements Employee {

	@Override
	public String detail() {
		return "IT Employee";
	}

}
