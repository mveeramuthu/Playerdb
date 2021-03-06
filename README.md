# Player DB Microservice

Your assignment is to create a microservice which serves the contents of the `People.csv` through a
REST API. You are free to choose whatever programming language you are comfortable with, SDKs, web
frameworks, databases, and online resources to complete this exercise.

## Requirements:

- Provide a REST API to your service
- Provide a working Dockerfile for your service

## REST API

The service should expose two REST endpoints:

- `GET /api/players` - returns the list of all players
- `GET /api/players/{playerID}` - returns a single player by it's ID

Given a player line of the CSV file:

```
playerID,birthYear,birthMonth,birthDay,birthCountry,birthState,birthCity,deathYear,deathMonth,deathDay,deathCountry,deathState,deathCity,nameFirst,nameLast,nameGiven,weight,height,bats,throws,debut,finalGame,retroID,bbrefID
aardsda01,1981,12,27,USA,CO,Denver,,,,,,,David,Aardsma,David Allan,215,75,R,R,2004-04-06,2015-08-23,aardd001,aardsda01
```

The json representation of a player should be the following, where each field name is equal to the CSV column name:

```json
{
    "playerID": "aardsda01",
    "birthYear": 1981,
    "birthMonth": 12,
    "birthDay": 27,
    "deathYear": null,
    "deathMonth": null,
    "deathDay": null,
    "nameFirst": "David",
    "nameLast": "Aardsma",
    "height": 75,
    ...
    ...
}
```

## Steps to run the app

- First build a docker image of your app by running:

```bash
  ./mvnw -Pprod verify jib:dockerBuild
```

- Then run the below command to bring up mongodb database, consul registry and the app in different docker containers

```bash
  docker-compose -f src/main/docker/app.yml up -d
```

- Go to [0.0.0.0:8090](0.0.0.0:8090) in your browser

- Click on Account -> Login (on top right of the page) and enter `admin` as username & also as password to login

- Click on Administration -> API and scroll down to `player-resource` section where you can execute `/api/players` and `​/api​/players​/{playerID}` endpoints

## Demo

[![Watch demo video](https://j.gifs.com/jZVq4z.gif)](https://youtu.be/MK9tvO1ONYk)
