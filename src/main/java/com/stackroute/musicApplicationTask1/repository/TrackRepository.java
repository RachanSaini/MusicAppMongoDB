package com.stackroute.musicApplicationTask1.repository;

import com.stackroute.musicApplicationTask1.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends MongoRepository<Track,Integer> {

     @Query // ? how many variables we are passing
     public Track findBytrackName(String trackName); //this method is not present in JPArepository so by providing method name we ask jparepo to provide its normal implementation.

    //but if it has modified implementation then use @Query
}
