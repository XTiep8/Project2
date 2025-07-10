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
			building.setNumberOfBasement(item.getNumberOfBasement());
			building.setManagerName(item.getManagerName());
			building.setManagerPhoneNumber(item.getManagerPhoneNumber());
			building.setFloorArea(item.getFloorArea());
			building.setRentPrice(item.getRentPrice());
			building.setServiceFee(item.getServiceFee());
			building.setBrokerageFee(item.getBrokerageFee());
			result.add(building);
		}
		return result;
	}

	@Override
	public List<BuildingDTO> findByStreetBasementDirection(String street, Integer numberOfBasement,
			String direction) {
		// TODO Auto-generated method stub
		List<BuildingEntity> buildingEntities = buildingRepository.findByStreetBasementDirection(street, numberOfBasement, direction);
		List<BuildingDTO> result = new ArrayList<BuildingDTO>();
		for (BuildingEntity item : buildingEntities) {
			BuildingDTO building = new BuildingDTO();
			building.setName(item.getName());
			building.setAddress(item.getStreet() + ',' + item.getWard());
			building.setNumberOfBasement(item.getNumberOfBasement());
			building.setManagerName(item.getManagerName());
			building.setManagerPhoneNumber(item.getManagerPhoneNumber());
			building.setFloorArea(item.getFloorArea());
			building.setRentPrice(item.getRentPrice());
			building.setServiceFee(item.getServiceFee());
			building.setBrokerageFee(item.getBrokerageFee());
			result.add(building);
		}
		return result;
	}

	@Override
	public List<BuildingDTO> findByFloorAreaRange(Integer minFloorArea, Integer maxFloorArea) {
		List<BuildingEntity> buildingEntities = buildingRepository.findByFloorAreaRange(minFloorArea, maxFloorArea);
		List<BuildingDTO> result = new ArrayList<BuildingDTO>();
		for (BuildingEntity item : buildingEntities) {
			BuildingDTO building = new BuildingDTO();
			building.setName(item.getName());
			building.setAddress(item.getStreet() + ',' + item.getWard());
			building.setNumberOfBasement(item.getNumberOfBasement());
			building.setManagerName(item.getManagerName());
			building.setManagerPhoneNumber(item.getManagerPhoneNumber());
			building.setFloorArea(item.getFloorArea());
			building.setRentPrice(item.getRentPrice());
			building.setServiceFee(item.getServiceFee());
			building.setBrokerageFee(item.getBrokerageFee());
			result.add(building);
		}
		return result;
	}

	@Override
	public List<BuildingDTO> findByRentPriceRange(Integer minRentPrice, Integer maxRentPrice) {
		List<BuildingEntity> buildingEntities = buildingRepository.findByRentPriceRange(minRentPrice, maxRentPrice);
		List<BuildingDTO> result = new ArrayList<BuildingDTO>();
		for (BuildingEntity item : buildingEntities) {
			BuildingDTO building = new BuildingDTO();
			building.setName(item.getName());
			building.setAddress(item.getStreet() + ',' + item.getWard());
			building.setNumberOfBasement(item.getNumberOfBasement());
			building.setManagerName(item.getManagerName());
			building.setManagerPhoneNumber(item.getManagerPhoneNumber());
			building.setFloorArea(item.getFloorArea());
			building.setRentPrice(item.getRentPrice());
			building.setServiceFee(item.getServiceFee());
			building.setBrokerageFee(item.getBrokerageFee());
			result.add(building);
		}
		return result;
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
