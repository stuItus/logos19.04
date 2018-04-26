package ua.logos.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "upload_file")
@NoArgsConstructor
@Getter @Setter
public class UploadFile extends BaseEntity{
	
	@Column(name="file_name")
	private String fileName;
	
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "file_data", columnDefinition = "MEDIUMBLOB") // BLOB = 64Kb, MEDIUMBLOB = 16Mb, LONGBLOB = 4Gb
	private byte[] fileData;
}
