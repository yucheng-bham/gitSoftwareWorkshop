package worksheet_2;

/**
 * A class Film with the three field variables title, releaseDate, and length of
 * types String, Date and int respectively; The variable releaseDate is defined
 * by the class Date. A class Date with the three field variables day, month and
 * year of types int, String and int respectively;
 *
 * @version 2019-10-09
 * @author Yu Cheng
 */
public class Film {
    String title;
    Date releaseDate;
    int length;

    /**
     *
     * @param title The title of the Film.
     * @param releaseDate The releaseDate of the Film.
     * @param length The length of the Film.
     */
    public Film(String title, Date releaseDate, int length) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.length = length;
    }

    /**
     * Getter for the title.
     * @return The title of the film.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Getter for the releaseDate.
     * @return The releaseDate of the film.
     */
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * Getter for the length.
     * @return The length of the film.
     */
    public int getLength() {
        return length;
    }

    /**
     * Setter for the title. The title of the film is updated.
     * @param title The new title of the film.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Setter for the releaseDate. The releaseDate of the film is updated
     * @param releaseDate The new releaseDate of the film.
     */
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * Setter for the length. The length of the film is updated.
     * @param length The new length of the film.
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     *
     * @return A human readable description of the film in form of the three
     *          field variables specifying it.
     */
    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", length=" + length +
                '}';
    }
}


