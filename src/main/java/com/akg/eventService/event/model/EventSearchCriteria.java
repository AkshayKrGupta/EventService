package com.akg.eventService.event.model;

import java.time.LocalDateTime;

public class EventSearchCriteria {
	
	private long id;
	private String source;
	private String priority;
	private LocalDateTime fromDate;
	private LocalDateTime toDate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public LocalDateTime getFromDate() {
		return fromDate;
	}
	public void setFromDate(LocalDateTime fromDate) {
		this.fromDate = fromDate;
	}
	public LocalDateTime getToDate() {
		return toDate;
	}
	public void setToDate(LocalDateTime toDate) {
		this.toDate = toDate;
	}

}
