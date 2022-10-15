package c.ex2_4.IES.quotes;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

	private final AtomicLong counter = new AtomicLong();


	@GetMapping("/api/quote")
	public Quote quote(@RequestParam(value = "show_id", defaultValue = "null") String show_id) {
		return new Quote(counter.incrementAndGet(), show_id);
	}

	@GetMapping("/api/shows")
	public String quote() {
		return new Quote(counter.incrementAndGet(), "null").getShows();
	}
}