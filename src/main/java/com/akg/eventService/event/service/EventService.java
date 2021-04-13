package com.akg.eventService.event.service;

import java.util.List;

import com.akg.eventService.event.model.Event;

public interface EventService {
	
	public Event addEvent(Event event);
	
	public Event updateEvent(long eventId, Event event);
	
	public void deleteEvent(long eventId);
	
	public List<Event> fetchEvents();

}
