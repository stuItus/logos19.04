package ua.logos.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car_model")
@Getter @Setter
@NoArgsConstructor

public class CarModel extends BaseEntity{

	@Column(name = "model_title", length = 50)
	private String modelTitle;
	
	@OneToOne
	@JoinColumn(name = "car_engine_capacity_id")
	private CarEngineCapacity carEngineCapacity;
	
	@OneToOne
	@JoinColumn(name = "car_fuel_type_id")
	private CarFuelType carFuelType;
	
	@OneToOne
	@JoinColumn(name = "car_color_id")
	private CarColor carColor;
	
	@OneToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	@JoinColumn(name = "car_make_id")
	private CarMake carMake;
}
