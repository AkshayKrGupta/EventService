package com.akg.eventService.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akg.eventService.event.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
