package com.javaweb.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.converter.BuildingDTOConverter;
import com.javaweb.model.BuildingDTO;
import com.javaweb.model.BuildingRequestDTO;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.repository.entity.DistrictEntity;
import com.javaweb.service.BuildingService;

@RestController
@PropertySource("classpath:application.properties")
public class BuildingAPI {
	
	@Autowired
	private BuildingRepository buildingRepository;
	@Autowired
	private BuildingDTOConverter buildingDTOConverter;
	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private BuildingService buildingService;

	@GetMapping(value = "/api/building/")
	public List<BuildingDTO> getBuilding(@RequestParam Map<String,Object> params,
										@RequestParam(name = "typeCode", required = false) List<String> typeCode) {
		List<BuildingDTO> result = buildingService.findAll(params,typeCode);
		return result;
	}
	

	@PostMapping(value = "/api/building/")
	public void creatBuilding(@RequestBody BuildingRequestDTO buildingRequestDTO) {
		BuildingEntity builEntity = new BuildingEntity();
		builEntity.setName(buildingRequestDTO.getName());
		builEntity.setStreet(buildingRequestDTO.getStreet());
		builEntity.setWard(buildingRequestDTO.getWard());
		DistrictEntity districtEntity = new DistrictEntity();
		districtEntity.setId(buildingRequestDTO.getDistrictId());
		builEntity.setDistrict(districtEntity);
		buildingRepository.save(builEntity);
	}
	@PutMapping(value = "/api/building/")
	public void updateBuilding(@RequestBody BuildingRequestDTO buildingRequestDTO) {
		BuildingEntity builEntity = buildingRepository.findById(buildingRequestDTO.getId()).get();
		builEntity.setName(buildingRequestDTO.getName());
		builEntity.setStreet(buildingRequestDTO.getStreet());
		builEntity.setWard(buildingRequestDTO.getWard());
		DistrictEntity districtEntity = new DistrictEntity();
		districtEntity.setId(buildingRequestDTO.getDistrictId());
		builEntity.setDistrict(districtEntity);
		buildingRepository.save(builEntity);
	}
	@GetMapping(value = "/api/building/{name}/{street}")
	public List<BuildingDTO> getBuildingById(@PathVariable String name,@PathVariable String street) {
		List<BuildingDTO> result = new ArrayList<BuildingDTO>();
		List<BuildingEntity> buildingEntities = buildingRepository.findByNameContainingAndStreet(name, street);
		for (BuildingEntity item : buildingEntities) {
			BuildingDTO building = buildingDTOConverter.toBuildingDTO(item);
			result.add(building);
		}
		return result;
	}

	@DeleteMapping(value = "api/building/{ids}")
	public void deleteBuilding(@PathVariable Long[] ids) {
		buildingRepository.deleteByIdIn(ids);
	}
}