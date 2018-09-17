package reactjs.sample.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import reactjs.sample.entity.Note;
/**
 * The repository extends Spring Data Commons' CrudRepository and plugs in the type of the domain object and its primary key
 * PagingAndSortingRepository is subinterface of CrudRepository
 * @author ty2061_sa
 *
 */
public interface NoteRepository extends PagingAndSortingRepository<Note, Long>  {

}
