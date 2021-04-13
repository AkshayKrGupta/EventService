package com.akg.eventService.event.model;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.akg.eventService.event.service.EventService;

@Controller
@RequestMapping("/api/")
public class EventController {

	private @Autowired EventService eventService;
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@PostMapping("/addEvent")
	public ResponseEntity<String> addEvent(@Valid @RequestBody Event event){
		Event _event = eventService.addEvent(event);
		logger.info("Event added with eventId:"+_event.getId());
		return ResponseEntity.ok("Event Added Successfully");
	}
	
	
	@PostMapping("/updateEvent")
	public ResponseEntity<String> updateEvent(@Valid @RequestBody Event event, @RequestParam(name = "id") String _eventIdStr){
		long eventId = Long.parseLong(_eventIdStr);
		
		eventService.updateEvent(eventId, event);
		logger.info("Event updated successfully with eventId:"+eventId);
		return ResponseEntity.ok("Event Updated Successfully");
	}
	
	@PostMapping("/deleteEvent")
	public ResponseEntity<String> updateEvent( @RequestParam(name = "id") String _eventIdStr){
		long eventId = Long.parseLong(_eventIdStr);
		eventService.deleteEvent(eventId);
		return ResponseEntity.ok("Event Deleted Successfully");
	}
	
	@GetMapping("/getAllEvents")
	public @ResponseBody List<Event> getAllEvents(){
		return eventService.fetchEvents();
	}
	
	
}
