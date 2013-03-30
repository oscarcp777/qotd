package qotd

class QuoteController {
	def scaffold = true


	def index() {
		redirect(action: random)
	}

	def home = {
		render "<h1>Real Programmers do not eat Quiche</h1>"
	}

	def quoteService
	def random = {
		def randomQuote = quoteService.getRandomQuote()
		[ quote : randomQuote ]
	}

	def ajaxRandom = {
		redirect(action: random)
	}
		



}
