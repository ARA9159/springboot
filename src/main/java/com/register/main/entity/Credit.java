package com.register.main.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "credit")
@Entity

public class Credit {
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="cr_generator")
	//@SequenceGenerator(name="cr_generator",initialValue=1002345100,allocationSize=1,sequenceName="id_sequence")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int crnum;
	private int anninc;
	private int accnum;
	public Credit() {
		super();
	}
	public Credit(int crnum, int anninc, int accnum) {
		super();
		this.crnum = crnum;
		this.anninc = anninc;
		this.accnum = accnum;
	}
	public int getCrnum() {
		return crnum;
	}
	public void setCrnum(int crnum) {
		this.crnum = crnum;
	}
	public int getAnninc() {
		return anninc;
	}
	public void setAnninc(int anninc) {
		this.anninc = anninc;
	}
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	

}