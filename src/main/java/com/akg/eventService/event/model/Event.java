package com.akg.eventService.event.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="system_events")
public class Event implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Size(max=2000)
	@Column(name="message", nullable = false)
	@NotBlank(message="Event Message is mandatory.")
	private String message;
	
	@Column(name="ts")
	@CreationTimestamp
	private LocalDateTime timestamp;
	
	@Size(max=200)
	@Column(name="source", nullable = false)
	@NotBlank(message="Event Source is mandatory.")
	private String source;
	
	@Size(max=200)
	@Column(name="priority", nullable = false)
	@NotBlank(message="Event Priority is mandatory.")
	private String priority;
	
	
	
	public Event() { }
	
	public Event(String message,String source, String priority) {
		super();
		this.message = message;
		this.source = source;
		this.priority = priority;
	}

	
	public long getId() {
		return id;
	}

	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	
	
	

}
