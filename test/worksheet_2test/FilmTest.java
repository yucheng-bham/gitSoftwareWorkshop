package worksheet_2test;

import org.junit.jupiter.api.Test;
import worksheet_2.Date;
import worksheet_2.Film;

import static org.junit.jupiter.api.Assertions.*;

class FilmTest {
    Film film = new Film("Ad Astra",
            new Date(18, "September", 2019),
            123);
    @Test
    void getTitle() {
        assertEquals("Ad Astra", film.getTitle(),"Failure in getTitle");
    }

    @Test
    void getReleaseDate() {
        assertEquals(new Date(18, "September", 2019),
                film.getReleaseDate(),
                "Failure in getReleaseDate");
    }

    @Test
    void getLength() {
        assertEquals(123, film.getLength(), "Failure in getLength");
    }

    @Test
    void setTitle() {
        assertEquals("Ad Astra", film.getTitle(),"Failure in SetTitle");
    }

    @Test
    void setReleaseDate() {
        assertEquals(new Date(18, "September", 2019),
                film.getReleaseDate(),
                "Failure in setReleaseDate");
    }

    @Test
    void setLength() {
        assertEquals(
                123,
                film.getLength(),
                "Failure in setLength");
    }
}