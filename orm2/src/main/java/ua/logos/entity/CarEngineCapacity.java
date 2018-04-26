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
@Table(name = "car_engine_capacity")
@Getter @Setter
@NoArgsConstructor

public class CarEngineCapacity extends BaseEntity{

	@Column(name = "engine_capacity", columnDefinition = "DECIMAL(2,1)") // 99999.99
	private BigDecimal engineCapacity;
}
