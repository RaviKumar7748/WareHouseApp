package com.app.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ORDER-MRTHOD_TAB")
public class OrderMethod {
	@Id
	@GeneratedValue(generator = "om_gen")
	@SequenceGenerator(name = "om_gen", sequenceName = "om_gem_seq")
	@Column(name = "ORD_ID_COL")
	private Integer id;
	@Column(name = "ORD_MODE_COL")
	private String orderMode;
	@Column(name = "ORD_TYPE_COL")
	private String orderType;
	@Column(name = "ORD_ACPT_COL")
	@ElementCollection
	@CollectionTable(
			name = "ORD_ACPT_COL",
			joinColumns=@JoinColumn(name = "ORD_ID_COL")
			)
	private List<String> orderAcpt;

	@Column(name = "ORD_DESCRIPTION_COL")
	private String description;

}
