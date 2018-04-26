package ua.logos.entity;

import java.math.BigDecimal;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car")
@Getter @Setter
@NoArgsConstructor
public class Car extends BaseEntity {

	@Column(name = "sell_price", columnDefinition = "DECIMAL(7,2)") // 99999.99
	private BigDecimal sellPrice;
	
	@OneToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	@JoinColumn(name = "car_make_id")
	private CarMake carMake;
	
	@OneToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	@JoinColumn(name = "car_seller_id")
	private CarSeller carSeller;
	
}
