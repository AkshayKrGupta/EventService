package com.akg.eventService.event.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akg.eventService.event.model.Event;
import com.akg.eventService.event.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	private EventRepository eventRepository;
	

	@Override
	public Event addEvent(Event event) {
		return eventRepository.save(event);
	}


	@Override
	public Event updateEvent(long eventId, Event event) {
		Event _event = eventRepository.findById(eventId).get();
		_event.setMessage(event.getMessage());
		_event.setPriority(event.getPriority());
		_event.setSource(event.getSource());
		return eventRepository.save(_event);
	}


	@Override
	public void deleteEvent(long eventId) {
		eventRepository.deleteById(eventId);
	}


	@Override
	public List<Event> fetchEvents() {
		return eventRepository.findAll();
	}

}
