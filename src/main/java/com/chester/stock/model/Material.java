package com.chester.stock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "material", uniqueConstraints={@UniqueConstraint(columnNames={"nombre"})})
@Getter
@Setter
public class Material 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	
	@NotNull(message = "El nombre del producto no debe ser vacio")
	String nombre;
	
	String descripcion;

	
	@Range(min=0, message = "La cantidad no puede ser negativa")
	Integer cantidad;
	}
