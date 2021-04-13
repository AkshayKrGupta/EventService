# EventService
A SpringBoot RESTFul API with JPA. Fully functional CRUD operation along with Pagination and Criteria Filters are implemented. 

#Database Tables

CREATE TABLE public.system_events ( id bigserial, message character varying NOT NULL, ts timestamp without time zone NOT NULL, source character varying NOT NULL, priority character varying NOT NULL, PRIMARY KEY (id) );

