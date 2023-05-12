package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "SHIPMENT_TYPE_TAB")
public class ShipmentType {
    @Id
    @Column(name ="SHIPMENT_ID" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer shipmentId;
    @Column(name = "SHIPMENT_MODE")
	private String shipmentMode;
    @Column(name = "SHIPMENT_CODE")
	private String shipmentCode;
    @Column(name = "ENABLE_SHIPMENT")
	private String enableShipment;
    @Column(name = "SHIPMENT_GRADE")
	private String shipmentGrade;
    @Column(name = "SHIPMENT_DESCRIPTION")
	private String shipmentDescription;

}
