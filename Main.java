package com.bridzelabz.employeepayrollJdbcDAY35;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args)throws SQLException {
		      MyConnection.connection();
		       Manager.queryRunner(new Employee());
		       Manager.create();
		    }

}
