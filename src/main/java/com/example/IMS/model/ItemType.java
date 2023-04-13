package com.example.IMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item_type")
public class ItemType implements Comparable<ItemType>{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_type_id")
	private long id;

	@Column(name = "type_name")
	private String typeName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public ItemType(String typeName) {
		super();
		this.typeName = typeName;
	}

	public ItemType() {
		super();
	}

	@Override
	public int compareTo(ItemType o) {
		return (int) (this.id - o.id);
	}
	
	
	

}
