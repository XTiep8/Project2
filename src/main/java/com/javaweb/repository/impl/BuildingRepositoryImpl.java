package com.javaweb.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;

@Repository
public class BuildingRepositoryImpl implements BuildingRepository {
	static final String DB_URL = "jdbc:mysql://localhost:3306/estatebasic";
	static final String USER = "root";
	static final String PASS = "123456";

	@Override
	public List<BuildingEntity> findByNameDistrictWard(String name, Long districtId, String ward) {
		StringBuilder sql = new StringBuilder("SELECT * FROM building b WHERE 1=1 ");
		if (name != null && !name.equals("")) {
			sql.append("AND b.name like '%" + name + "%' ");
		}
		if (ward != null && !ward.equals("")) {
			sql.append("AND b.name like '%" + ward + "%' ");
		}
		if (districtId != null) {
			sql.append("AND b.districtid = " + districtId + " ");
		}
		List<BuildingEntity> result = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql.toString());) {

			while (rs.next()) {
				result.add(mapResultSetToBuilding(rs));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<BuildingEntity> findByStreetBasementDirection(String street, Integer minNumberOfBasement,
			String direction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BuildingEntity> findByFloorAreaRange(Integer minFloorArea, Integer maxFloorArea) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BuildingEntity> findByRentPriceRange(Integer minRentPrice, Integer maxRentPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BuildingEntity> findByManager(String managerName, String managerPhoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BuildingEntity> findByStaffTypeCode(Long staff, List<String> typeCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BuildingEntity> findByFloorAreaLevel(Integer floorArea, String level) {
		// TODO Auto-generated method stub
		return null;
	}

	// Hàm tiện ích để ánh xạ ResultSet sang Building
	private BuildingEntity mapResultSetToBuilding(ResultSet rs) throws SQLException {
		BuildingEntity building = new BuildingEntity();
		building.setId(rs.getLong("id"));
		building.setName(rs.getString("name"));
		building.setStreet(rs.getString("street"));
		building.setWard(rs.getString("ward"));
		building.setDistrictId(rs.getLong("districtid"));
		building.setStructure(rs.getString("structure"));
		building.setNumberOfBasement(rs.getObject("numberofbasement") != null ? rs.getInt("numberofbasement") : null);
		building.setFloorArea(rs.getObject("floorarea") != null ? rs.getInt("floorarea") : null);
		building.setDirection(rs.getString("direction"));
		building.setLevel(rs.getString("level"));
		building.setRentPrice(rs.getInt("rentprice"));
		building.setRentPriceDescription(rs.getString("rentpricedescription"));
		building.setServiceFee(rs.getString("servicefee"));
		building.setCarFee(rs.getString("carfee"));
		building.setMotorbikeFee(rs.getString("motorbikefee"));
		building.setOvertimeFee(rs.getString("overtimefee"));
		building.setWaterFee(rs.getString("waterfee"));
		building.setElectricityFee(rs.getString("electricityfee"));
		building.setDeposit(rs.getString("deposit"));
		building.setPayment(rs.getString("payment"));
		building.setRentTime(rs.getString("renttime"));
		building.setDecorationTime(rs.getString("decorationtime"));
		building.setBrokerageFee(rs.getBigDecimal("brokeragefee"));
		building.setNote(rs.getString("note"));
		building.setLinkOfBuilding(rs.getString("linkofbuilding"));
		building.setMap(rs.getString("map"));
		building.setImage(rs.getString("image"));
		building.setCreatedDate(rs.getDate("createddate"));
		building.setModifiedDate(rs.getDate("modifieddate"));
		building.setCreatedBy(rs.getString("createdby"));
		building.setModifiedBy(rs.getString("modifiedby"));
		building.setManagerName(rs.getString("managername"));
		building.setManagerPhoneNumber(rs.getString("managerphonenumber"));
		return building;
	}
}
