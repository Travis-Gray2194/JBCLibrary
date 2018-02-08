package me.travisgray.Repositories;

import me.travisgray.Models.ReadingBook;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ${TravisGray} on 2/7/2018.
 */
public interface BookRepository extends CrudRepository<ReadingBook,Long> {
}
