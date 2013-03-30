package qotd

class Quote {
	
	String content
	String author
	Date created = new Date()
	
//	Quote(String content, String author){
//		this.content = content
//		this.author = author
//	}
	

    static constraints = {
		author(blank:false)
		content(maxSize:1000, blank:false)
    }
}
