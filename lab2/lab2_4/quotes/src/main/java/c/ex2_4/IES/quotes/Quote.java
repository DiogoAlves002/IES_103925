package c.ex2_4.IES.quotes;

import java.util.Random;
public class Quote {

	private String show_id;
	private String quote;
	private String author;
	private Long id;

	
	public Quote(Long id, String show_id){
		this.id= id;
        Random rand = new Random(); 
        int rand_quote = rand.nextInt(5);

		if (show_id.equals("null")){
			int rand_show = rand.nextInt(4);
			show_id= ListQuotes.shows[rand_show];
		}

		switch(show_id){
			case "simpsons":
				this.quote= ListQuotes.simpsons[rand_quote];
				this.show_id= show_id;
				break;
			case "the_office":
				this.quote= ListQuotes.the_office[rand_quote];
				this.show_id= show_id;
				break;
			case "archer":
				this.quote= ListQuotes.archer[rand_quote];
				this.show_id= show_id;
				break;
			case "family_guy":
				this.quote= ListQuotes.family_guy[rand_quote];
				this.show_id= show_id;
				break;
		}

		//separating quote from author
		int index= this.quote.indexOf("-"); // this.quote = "quote - author"
		this.author= this.quote.substring(index+2);
		this.quote= this.quote.substring(0, index-1);
	}


	public String getShows(){
		String showList= "";
		for (String show : ListQuotes.shows){
			showList += show +", ";
		}
		return showList;
	}

	public String getQuote(){
		return this.quote;
	}


	public String getShow_id() {
		return show_id;
	}


	public String getAuthor() {
		return author;
	}


	public Long getId() {
		return id;
	}
	
}