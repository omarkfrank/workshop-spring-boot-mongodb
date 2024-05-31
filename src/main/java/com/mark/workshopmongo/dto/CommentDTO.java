package com.mark.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String texr;
	private Date date;
	private AuthorDTO author;

	public CommentDTO() {
	}

	public CommentDTO(String texr, Date date, AuthorDTO author) {
		super();
		this.texr = texr;
		this.date = date;
		this.author = author;
	}

	public String getTexr() {
		return texr;
	}

	public void setTexr(String texr) {
		this.texr = texr;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
}
