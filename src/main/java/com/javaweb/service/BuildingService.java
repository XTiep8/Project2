package com.javaweb.service;

import java.util.List;

import com.javaweb.model.BuildingDTO;
import com.javaweb.repository.entity.BuildingEntity;

public interface BuildingService {
	// tim kiem theo ten, quan, phuong
		List<BuildingDTO> findByNameDistrictWard(String name, Long districtId, String ward);

		// tim kiem theo duong, so tang ham, huong
		List<BuildingDTO> findByStreetBasementDirection(String street, Integer numberOfBasement, String direction);

		// tim kiem theo dien tich san
		List<BuildingDTO> findByFloorAreaRange(Integer minFloorArea, Integer maxFloorArea);

		// tim kiem theo gia thue
		List<BuildingDTO> findByRentPriceRange(Integer minRentPrice, Integer maxRentPrice);

		// tim kiem theo ten, sdt quan ly
		List<BuildingDTO> findByManager(String managerName, String managerPhoneNumber);

		// tim kiem theo ten nhan vien, loai nha
		List<BuildingDTO> findByStaffTypeCode(Long staff, List<String> typeCode);

		// tim kiem theo dien tich san , hang
		List<BuildingDTO> findByFloorAreaLevel(Integer floorArea, String level);
}
