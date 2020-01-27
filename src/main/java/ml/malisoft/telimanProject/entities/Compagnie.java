package ml.malisoft.telimanProject.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Compagnie implements Serializable{
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String nom;
}
