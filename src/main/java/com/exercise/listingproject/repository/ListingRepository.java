package com.exercise.listingproject.repository;

import com.exercise.listingproject.entity.Listing;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListingRepository extends JpaRepository<Listing, Integer> {
	List<Listing> findByUserId(Integer userId, Pageable pageable);
}
