package ml.malisoft.telimanProject.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Compagnie implements Serializable{
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	@Column(length=75)
	private String nom;
	private double longitude,latitude,altitude;
	private String addresse;
	private int telephone;
	@OneToMany(mappedBy="compagnie")
	private Collection<Agence>agences;
	
	
}
