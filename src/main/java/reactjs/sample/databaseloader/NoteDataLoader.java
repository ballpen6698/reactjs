package reactjs.sample.databaseloader;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import reactjs.sample.entity.Note;
import reactjs.sample.repo.NoteRepository;

@Component
public class NoteDataLoader implements CommandLineRunner {

	private final NoteRepository repository;

	@Autowired
	public NoteDataLoader(NoteRepository repository) {
		this.repository = repository;
	}

	public void run(String... strings) throws Exception {
		this.repository.save(new Note(1,"Test1", "My first test case"));
	}
}
