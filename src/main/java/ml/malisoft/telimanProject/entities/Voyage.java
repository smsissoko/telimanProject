package ml.malisoft.telimanProject.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString

public class Voyage implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Temporal(TemporalType.DATE)
	private Date dateDepart;
	@Temporal(TemporalType.TIMESTAMP)
	private Date heureDepart;
	@Temporal(TemporalType.DATE)
	private Date dateArriver;
	@Temporal(TemporalType.TIMESTAMP)
	private Date heureArriver;
	private String prix;
	@OneToMany(mappedBy="voyage")
	private Collection<Reservation> reservations;
	@OneToMany(mappedBy="voyage")
	private Collection<InfosEscale> infosEscales;

}

