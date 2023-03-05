package com.bridzelabz.employeepayrollJdbcDAY35;

import java.util.Date;

public class Employee {
	
	    String  address,name;
	    String phone_number; 
	    String gender;
	    Date startDate;

	    @Override
		public String toString() {
			return "Employee [address=" + address + ", name=" + name + ", phone_number=" + phone_number + ", gender="
					+ gender + ", startDate=" + startDate + "]";
	    }

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhone_number() {
			return phone_number;
		}

		public void setPhone_number(String phone_number) {
			this.phone_number = phone_number;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Date getStartDate() {
			return startDate;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}

	  
}
