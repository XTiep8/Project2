package com.javaweb.repository;

import java.util.List;

import com.javaweb.repository.entity.BuildingEntity;

public interface BuildingRepository {
	// tim kiem theo ten, quan, phuong
	List<BuildingEntity> findByNameDistrictWard(String name, Long districtId, String ward);

	// tim kiem theo duong, so tang ham, huong
	List<BuildingEntity> findByStreetBasementDirection(String street, Integer numberOfBasement, String direction);

	// tim kiem theo dien tich san
	List<BuildingEntity> findByFloorAreaRange(Integer minFloorArea, Integer maxFloorArea);

	// tim kiem theo gia thue
	List<BuildingEntity> findByRentPriceRange(Integer minRentPrice, Integer maxRentPrice);

	// tim kiem theo ten, sdt quan ly
	List<BuildingEntity> findByManager(String managerName, String managerPhoneNumber);

	// tim kiem theo ten nhan vien, loai nha
	List<BuildingEntity> findByStaffTypeCode(Long staff, List<String> typeCode);

	// tim kiem theo dien tich san , hang
	List<BuildingEntity> findByFloorAreaLevel(Integer floorArea, String level);

}
