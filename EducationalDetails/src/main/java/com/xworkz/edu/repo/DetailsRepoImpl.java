package com.xworkz.edu.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.xworkz.edu.dto.DetailsDTO;

public class DetailsRepoImpl implements DetailsRepo {
	
	String url ="jdbc:mysql://localhost:3306/studentd";
	String userName ="root";
	String password="Shiva@456";
	
	@Override
	public boolean save(DetailsDTO dto)  throws ClassNotFoundException{
		
		int count = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		if(dto!=null) {
			try(Connection connection = DriverManager.getConnection(url, userName, password)){
				
				String query = "insert into details values(?,?,?,?,?,?,?,?)";
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, dto.getName());
				preparedStatement.setString(2, dto.getQualification());
				preparedStatement.setString(3, dto.getStream());
				preparedStatement.setString(4, dto.getUniversity());
				preparedStatement.setString(5, dto.getCollage());
				preparedStatement.setString(6, dto.getCity());
				preparedStatement.setString(7, dto.getState());
				preparedStatement.setString(8, dto.getCountry());
				count=preparedStatement.executeUpdate();

			} catch (Exception e) {
				
				e.printStackTrace();
			}
			if(count!=0) {
//				System.out.println("count=!0");
				return true;
				
			}
		}
		return false;
	}

}
