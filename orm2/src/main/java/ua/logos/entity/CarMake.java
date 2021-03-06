package ua.logos.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car_make")
@Getter @Setter
@NoArgsConstructor
public class CarMake extends BaseEntity{

	@Column(name = "make_title", length = 50, unique = true)
	private String makeTitle;
	
	@Column(name = "manufacture_year")
	private int manufactureYear;
}
