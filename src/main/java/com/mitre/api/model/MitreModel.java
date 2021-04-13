package com.mitre.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName="mitrenew",indexStoreType="items",shards=2)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MitreModel {
	
	@Id
	public String id;
	public String ID;
	public String Tactic;
	public String Platforms;
	public String Detection;
	public String Description;
	//public String Mitigations;
	public String Version;
	public String Created;
	//Technique Name
	//Sub-techniques
	//Data Sources
	//Last Modified
}
