package com.javaweb.api;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.model.BuildingDTO;
import com.javaweb.service.BuildingService;


@RestController
public class BuildingAPI {

	@Autowired
	private BuildingService buildingService;

	@GetMapping(value = "/api/building/")
	public List<BuildingDTO> getBuilding(@RequestParam Map<String,Object> params) {
		System.out.println("hello");
		//List<BuildingDTO> result = buildingService.findAll(params);
		return null;
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
