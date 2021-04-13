package com.mitre.api.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.mitre.api.model.MitreModel;

public interface MitreRepository extends ElasticsearchRepository<MitreModel, String> {
	
	//List<MitreModel> findByTechniqueName(String Tname);
	List<MitreModel> findByID(String ID);
}
