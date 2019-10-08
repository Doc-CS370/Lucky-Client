package BaseGame;

public class moveCheck {

	public static boolean isMoveValid(int playerPosition, int desiredRoom) {
		boolean isMoveValid = false;

		switch (playerPosition) {
		case 0:
			if (desiredRoom == 20 || desiredRoom == 3 || desiredRoom == 5 || desiredRoom == 1) {
				isMoveValid = true;
			}
			break;
		case 1:
			if (desiredRoom == 0 || desiredRoom == 18 || desiredRoom == 30 || desiredRoom == 29) {
				isMoveValid = true;
			}
			break;
		case 2:
			if (desiredRoom == 3 || desiredRoom == 29) {
				isMoveValid = true;
			}
			break;
		case 3:
			if (desiredRoom == 0 || desiredRoom == 2 || desiredRoom == 4 || desiredRoom == 23 || desiredRoom == 29) {
				isMoveValid = true;
			}
			break;
		case 4:
			if (desiredRoom == 3 || desiredRoom == 23) {
				isMoveValid = true;
			}
			break;
		case 5:
			if (desiredRoom == 0 || desiredRoom == 6 || desiredRoom == 21 || desiredRoom == 23) {
				isMoveValid = true;
			}
			break;
		case 6:
			if (desiredRoom == 5 || desiredRoom == 7 || desiredRoom == 19) {
				isMoveValid = true;
			}
			break;
		case 7:
			if (desiredRoom == 6 || desiredRoom == 21 || desiredRoom == 22) {
				isMoveValid = true;
			}
			break;
		case 8:
			if (desiredRoom == 21 || desiredRoom == 22 || desiredRoom == 23) {
				isMoveValid = true;
			}
			break;
		case 9:
			if (desiredRoom == 10 || desiredRoom == 24 || desiredRoom == 25) {
				isMoveValid = true;
			}
			break;
		case 10:
			if (desiredRoom == 9 || desiredRoom == 24 || desiredRoom == 25) {
				isMoveValid = true;
			}
			break;
		case 11:
			if (desiredRoom == 12 || desiredRoom == 25 || desiredRoom == 26) {
				isMoveValid = true;
			}
			break;
		case 12:
			if (desiredRoom == 11 || desiredRoom == 13) {
				isMoveValid = true;
			}
			break;
		case 13:
			if (desiredRoom == 12 || desiredRoom == 26 || desiredRoom == 27) {
				isMoveValid = true;
			}
			break;
		case 14:
			if (desiredRoom == 15 || desiredRoom == 27 || desiredRoom == 28) {
				isMoveValid = true;
			}
			break;
		case 15:
			if (desiredRoom == 14 || desiredRoom == 27 || desiredRoom == 28) {
				isMoveValid = true;
			}
			break;
		case 16:
			if (desiredRoom == 29 || desiredRoom == 30 || desiredRoom == 31) {
				isMoveValid = true;
			}
			break;
		case 17:
			if (desiredRoom == 18 || desiredRoom == 30 || desiredRoom == 31) {
				isMoveValid = true;
			}
			break;
		case 18:
			if (desiredRoom == 1 || desiredRoom == 17 || desiredRoom == 19) {
				isMoveValid = true;
			}
			break;
		case 19:
			if (desiredRoom == 6 || desiredRoom == 18 || desiredRoom == 20) {
				isMoveValid = true;
			}
			break;
		case 20:
			if (desiredRoom == 0 || desiredRoom == 19) {
				isMoveValid = true;
			}
			break;
		case 21:
			if (desiredRoom == 5 || desiredRoom == 7 || desiredRoom == 8 || desiredRoom == 23) {
				isMoveValid = true;
			}
			break;
		case 22:
			if (desiredRoom == 7 || desiredRoom == 8) {
				isMoveValid = true;
			}
			break;
		case 23:
			if (desiredRoom == 3 || desiredRoom == 4 || desiredRoom == 5 || desiredRoom == 8 || desiredRoom == 21
					|| desiredRoom == 24) {
				isMoveValid = true;
			}
			break;
		case 24:
			if (desiredRoom == 9 || desiredRoom == 10 || desiredRoom == 23) {
				isMoveValid = true;
			}
			break;
		case 25:
			if (desiredRoom == 9 || desiredRoom == 10 || desiredRoom == 11) {
				isMoveValid = true;
			}
			break;
		case 26:
			if (desiredRoom == 11 || desiredRoom == 13) {
				isMoveValid = true;
			}
			break;
		case 27:
			if (desiredRoom == 13 || desiredRoom == 14 || desiredRoom == 15) {
				isMoveValid = true;
			}
			break;
		case 28:
			if (desiredRoom == 14 || desiredRoom == 15 || desiredRoom == 29) {
				isMoveValid = true;
			}
			break;
		case 29:
			if (desiredRoom == 1 || desiredRoom == 2 || desiredRoom == 3 || desiredRoom == 16 || desiredRoom == 28
					|| desiredRoom == 30) {
				isMoveValid = true;
			}
			break;
		case 30:
			if (desiredRoom == 1 || desiredRoom == 16 || desiredRoom == 17 || desiredRoom == 29) {
				isMoveValid = true;
			}
			break;
		case 31:
			if (desiredRoom == 16 || desiredRoom == 17) {
				isMoveValid = true;
			}
			break;
		}
		return isMoveValid;
	}

}
