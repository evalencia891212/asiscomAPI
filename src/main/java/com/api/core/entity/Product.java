package com.api.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="cat_productos")
@Entity
public class Product {
	
	@GeneratedValue
	@Id
	@Column(name="id_producto")
	private long productId;
	
	@Column(name="id_lista_precio")
	private long priceListId;
	
	@Column(name="id_lista_costo")
	private long costListId;
	
	@Column(name="id_unidad_medida")
	private long mesureUnitId;
	
	@Column(name="clave")
	private String key;
	
	@Column(name="nombre")
	private String name;
	
	@Column(name="nombre_factura")
	private String factureName;
	
	@Column(name="codigo_barras")
	private String barCode;
	
	@Column(name="fecha_registro")
	private String registerDate;
	
	@Column(name="activo")
	private int active;
	
	@Column(name="id_proveedor")
	private long providerId;
	
	@Column(name="precio_costo")
	private double costPrice;
	
	@Column(name="precio_credito")
	private double creditPrice;
	
	

}
