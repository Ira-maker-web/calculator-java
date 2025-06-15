### LOC (Lines of Code)

Broj linija koda uključuje sve linije osim praznih i komentara.
Napomena: LOC uključuje `{` i `}`.

- Calculator.java: 109
- Start.java: 19
- **Ukupno:** 128 linija koda

### Neformalni pregled i zapažanja

Format: fajl - broj linije - zapažanje

### Calculator.java (LOC bez praznih linija i komentara)

- linija 9 – unutrašnja statička klasa `Operations` bi mogla biti refaktorisana kao enum.
- linija 13 – `ToString()` metoda - redosled operatora.
- linije 22–25 – ručno dodavanje `0` na početak izraza može izazvati greške. Vršiti proveru operatora umesto ručnog dodavanja nule.
- linija 28 – split regex koristi `Operations.ToString()`, ali zbog nedostatka escape karaktera može izazvati probleme.
- linija 31 – ručno parsiranje svih karaktera operacija može biti nepouzdano (npr. negativni brojevi).
- linije 53–105 – rekurzivna metoda `Calculate()` mogla bi uzrokovati StackOverflow kod većih izraza i ne poštuje kompletno pravila prioriteta operacija.

### Start.java (LOC bez praznih linija i komentara)

- linija 8 – `scanIn.close()` se poziva samo kada korisnik unese `"exit"`, što može ostaviti resurse neoslobođene.

### Zaključak
Metrika je rađena ručno upotrebom editora.
