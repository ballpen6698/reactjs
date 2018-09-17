package reactjs.sample.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name = "NOTE")
@NamedQueries({ @NamedQuery(name = "Note.FIND_ALL", query = "select n from Note n") })
public class Note implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	// name the @Id field 'Id' it will display in the JSON
	// @Id @Column(name="PERSON_ROLE_ID") private Long Id; Glitch in spring data?
	private long Id;

	@Column(name = "TITLE", length = 255)
	private String title;

	@Column(name = "CONTENT", length = 1024)
	private String content;

	private Note() {}
	
	public Note(long Id, String title, String content) {
		this.Id = Id;
		this.title = title;
		this.content = content;
	}
}
