
/*
   
    @author Murat Öztürk
 */

public class LiteralTester {

	public static void main(String[] args) {

		String str1, str2, str3, str4; // Deklaration der vier Variablen.
		int anzahl = 0;
		str1 = "Bo, die Katze"; // Zuweisung des Stringliterals für die beiden Referenzvariablen
		str2 = "Bo, die Katze";

		str3 = new String("Fred, der Hund"); // Erzeugung der Referenzvariablen
												// mit dem new-Operator und Inhalt
		str4 = new String("Fred, der Hund");

		if (str1 == str2) { // Überprüfung der beiden Referenzvariablen mit dem == - Operator,
							// ob sie auf dasselben Objekt verweisen.

			anzahl += 1; // wenn JA, wird die Anzahl der Objekte um 1 erhöht

		} else {

			anzahl += 2; // wenn NEIN, wird die Anzahl der Objekte um 2 erhöht

		}

		if (str3 == str4) { // Überprüfung der beiden Referenzvariablen mit dem == - Operator,
							// ob sie auf dasselben Objekt verweisen.

			anzahl += 1; // wenn JA, wird die Anzahl der Objekte um 1 erhöht

		} else {

			anzahl += 2; // wenn NEIN, wird die Anzahl der Objekte um 2 erhöht

		}

		System.out.println("Es wurden " + anzahl + " Objekte erzeugt.");

	}

}
