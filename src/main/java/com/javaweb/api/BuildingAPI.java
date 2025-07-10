package com.javaweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.model.BuildingDTO;
import com.javaweb.service.BuildingService;

import customexception.FieldRequiredException;

@RestController
public class BuildingAPI {

	@Autowired
	private BuildingService buildingService;

	@GetMapping(value = "/api/building/")
	public List<BuildingDTO> getBuilding(@RequestParam(name = "name", required = false) String name,
										@RequestParam(name = "districtId", required = false) Long district,
										@RequestParam(name = "ward", required = false) String ward,
										@RequestParam(name = "street", required = false) String street,
										@RequestParam(name = "numberOfBasement", required = false) Integer numberOfBasement,
										@RequestParam(name = "direction", required = false) String direction,
										@RequestParam(name = "minFloorArea", required = false) Integer minFloorArea,
										@RequestParam(name = "maxFloorArea", required = false) Integer maxFloorArea,
										@RequestParam(name = "minRentPrice", required = false) Integer minRentPrice,
										@RequestParam(name = "maxRentPrice", required = false) Integer maxRentPrice,
										@RequestParam(name = "floorArea", required = false) Integer floorArea,
										@RequestParam(name = "managerName", required = false) String managerName,
										@RequestParam(name = "managerPhoneNumber", required = false) String managerPhoneNumber,
										@RequestParam(name = "staffId", required = false) Long staff,
										@RequestParam(name = "typeCode", required = false) List<String> typeCode,
										@RequestParam(name = "level", required = false) Long level) {
		List<BuildingDTO> result = buildingService.findByNameDistrictWard(name, district, ward);
		return result;
	}
	

//	@PostMapping(value = "/api/building/")
//	public Object postBuilding(@RequestBody BuildingDTO building) {
//		//
//		valiDate(building);
//		return null;
//	}
//
//	public void valiDate(BuildingDTO buildingDTO) {
//		if (buildingDTO.getName() == null || buildingDTO.getName().equals("")
//				|| buildingDTO.getNumberOfBasement() == null) {
//			throw new FieldRequiredException("Khong duoc de trong truong nao");
//		}
//	}

	@DeleteMapping(value = "api/building/{id}/{name}")
	public void deleteBuilding(@PathVariable Integer id, @PathVariable String name,
			@RequestParam(value = "ward", required = false) String ward) {
		System.out.println("Da xoa toa nha co id la " + id);
	}
}
