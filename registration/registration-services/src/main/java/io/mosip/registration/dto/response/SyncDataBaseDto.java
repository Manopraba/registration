package io.mosip.registration.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SyncDataBaseDto {
	
	private String entityName;
	private String entityType;
	private List<String> data;

}
