# owner-consumer-service

A simple HTTP API which consumes [owner-producer-service](https://github.com/narenchoudhary/owner-producer-service).

## End-points

* GET `/owner-producer/`

		GET /owner-producer/
		
		You are at root

		
* GET `/owner-producer/get/<id>/` : Calls 	`/owner-consumer/get/<id>/` to prepare response
