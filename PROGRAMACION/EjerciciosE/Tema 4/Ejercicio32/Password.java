class Password {

	private int longitud;			// Instead of initializing here, better do it in the default constructor

	private String contrasenna = "";



	// Constructors

	Password () {
	
		longitud = 8;

		contrasenna = generarPassword();	// You can skip this assignation, so the method only modifies the password

	}

	Password (int length) {

		longitud = length;

		contrasenna = generarPassword();

	}



	// Methods

	public boolean esFuerte() {

		int countupper = 0;

		int countlower = 0;

		int countnumber = 0;

		/* for (int i=0; i<longitud; i++) {			// This can all be exchanged for a matches('whatev')

			char test = contrasenna.charAt(i);

			if (test >= 48 & test <= 57) {

				countnumber++;

			}

			if (test >= 65 & test <= 90) {

				countupper++;

			}

			if (test >= 97 & test <= 122) {

				countlower++;

			}

		}

		if (countupper > 0 & countlower > 0 & countnumber > 2) {

			return true;

		}

		else {
		
			return false;

		}	*/

		// ALTERNATIVE

			if (contrasenna.matches(".*[A-Z]"))

		// ALTERNATIVE

	}

	public String generarPassword () {

		// Restart the pass for each generation

		contrasenna = "";

		for (int i=0; i<longitud; i++) {

			// Either generates a number, lowercase letter or uppercase letter

			int cat = (int) (Math.random()*3);

			switch (cat) {

				// Generate numbers: ASCII 48-57

				case 0: {

					contrasenna += (char) ((Math.random()*10)+48);

					break;

				}

				// Generate uppercase: ASCII 65-90

				case 1: {

					contrasenna += (char) ((Math.random()*26)+65);

					break;

				}

				// Generate lowercase: ASCII 97-122

				case 2: {

					contrasenna += (char) ((Math.random()*26)+97);

					break;

				}

			}

		}

		return contrasenna;

	}

	// Don't create these if you don't actually need them

	public int cardGet() {

		return longitud;

	}

	public String passGet() {

		return contrasenna;

	}

	public void cardSet(int card) {

		this.longitud = longitud;

	}

	public void passSet(String pass) {

		this.contrasenna = contrasenna;

	}

}