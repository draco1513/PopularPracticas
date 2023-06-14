package com.popular.demo.persistence.entity;

import jakarta.persistence.*;

import javax.swing.*;

@Entity
@Table(name=" ")
/*agregar entre comillas el nombre de la tabla de la bd*/
public class user {

@Id /*es el @  para un id simple*/
@GeneratedValue(strategy = GenerationType.IDENTITY) /*solo si no esta definido en el bd el autoincremnt*/
@Column(name="id_producto")
/*si vas a usar un nombre diferente entre la bd y java
* no se permite guiones */
    private Integer idUser;

}
