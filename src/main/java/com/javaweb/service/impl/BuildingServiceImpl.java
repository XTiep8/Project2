package com.javaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javaweb.model.BuildingDTO;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.service.BuildingService;

@Service
public class BuildingServiceImpl implements BuildingService {

	@Autowired
	private BuildingRepository buildingRepository;

	@Override
	public List<BuildingDTO> findByNameDistrictWard(String name, Long districtId, String ward) {
		// TODO Auto-generated method stub
		List<BuildingEntity> buildingEntities = buildingRepository.findByNameDistrictWard(name, districtId,ward);
		List<BuildingDTO> result = new ArrayList<BuildingDTO>();
		for (BuildingEntity item : buildingEntities) {
			BuildingDTO building = new BuildingDTO();
			building.setName(item.getName());
			building.setAddress(item.getStreet() + ',' + item.getWard());
			building.setManagerName(item.getManagerName());
			building.setManagerPhoneNumber(item.getManagerPhoneNumber());
			result.add(building);
		}
		return result;
	}

	@Override
	public List<BuildingDTO> findByStreetBasementDirection(String street, Integer minNumberOfBasement,
			String direction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BuildingDTO> findByFloorAreaRange(Integer minFloorArea, Integer maxFloorArea) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BuildingDTO> findByRentPriceRange(Integer minRentPrice, Integer maxRentPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BuildingDTO> findByManager(String managerName, String managerPhoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BuildingDTO> findByStaffTypeCode(Long staff, List<String> typeCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BuildingDTO> findByFloorAreaLevel(Integer floorArea, String level) {
		// TODO Auto-generated method stub
		return null;
	}

}
