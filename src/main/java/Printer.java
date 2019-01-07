public class Printer {

	private int pagesLeft;
	private int tonerLeft;

	public Printer() {
		this.pagesLeft = 0;
		this.tonerLeft = 1000;
	};



	public void print(int numberPages, int numberCopies) {
		int pagesNeeded = numberPages * numberCopies;
		if (this.getPagesLeft() < pagesNeeded) {
			System.out.println("Insufficient paper for job - please refill first");
			return;
		}
		if (this.getTonerLeft() < pagesNeeded) {
			System.out.println("Insufficient toner for job - please refill toner");
			return;
		}

		this.pagesLeft = this.getPagesLeft() - pagesNeeded;
		this.tonerLeft = this.getTonerLeft() - pagesNeeded;

	}

	public void refill(int numberSheets) {
		this.pagesLeft = this.getPagesLeft() + numberSheets;
	}

	public int getPagesLeft() {
		return pagesLeft;
	}

	public int getTonerLeft() {
		return tonerLeft;
	}
}
