# adminservice


# To run posgres container:
docker run
--name postgres
-p 5432:5432
-e POSTGRES_USER=postgresUser
-e POSTGRES_PASSWORD=postgresPW
-e POSTGRES_DB=postgresDB
-d
postgres