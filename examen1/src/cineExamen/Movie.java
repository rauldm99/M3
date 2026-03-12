package cineExamen;

public class Movie {

	protected String title;
	protected String genre;
	protected int duration;
	protected int minimumAge;

	public Movie(String title, String genre, int duration, int minimumAge) {
		super();
		this.title = title;
		this.genre = genre;
		if (duration <= 0) {
			throw new IllegalArgumentException("La duracio ha ser major que 0!");
		}
		this.duration = duration;
		if (minimumAge < 0) {
			throw new IllegalArgumentException("La edat minima ha ser major o igual a 0!");
		}
		this.minimumAge = minimumAge;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getMinimumAge() {
		return minimumAge;
	}

	public void setMinimumAge(int minimumAge) {
		this.minimumAge = minimumAge;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", duration=" + duration + ", minimumAge=" + minimumAge
				+ "]";
	}

}
