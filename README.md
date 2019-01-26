# Restful-football-service

Jax-B restful football service using http://footballpool.dataaccess.eu api.

## Run the program

.war file can be found in the target folder and you can run it in apache tomcat server.

Use queries like 
Curl -X POST http://<hostname>:<port>/Rest/rest/postVote/1 
Curl http://<hostname>:<port>/Rest/rest/readId/1 
Curl -X DELETE http://<hostname>:<port>/Rest/rest/resetVotes 
Curl -X PUT http://localhost:8084/Rest/rest/UpdateRating 

## Developing

Done using maven, apache tomcat, jax-b and netbeans.
Purpose was to practise making of a rest api but can be used as a base for similiar projects easily.