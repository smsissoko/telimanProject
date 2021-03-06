package ml.malisoft.telimanProject.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString

public class Client implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(length=75)
	private String nom;
	@Column(length=75)
	private String prenom;
	private String numeroCarte;
	private int telephone;
	private String addresse;
	@OneToMany(mappedBy="client")
	private Collection<Reservation>reservations;

}
