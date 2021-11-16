package com.tecforte.blog.repository;
import com.tecforte.blog.domain.Entry;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data  repository for the Entry entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {
	/* New line */
	@Query("select entry from Entry entry left join fetch entry.blog where entry.blog.id =?1")
	List<Entry> get_all_entries_by_blogid(Long blogId);
}
