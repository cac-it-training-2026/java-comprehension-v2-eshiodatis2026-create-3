package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		//TODO ここから実装する
		try {
			System.out.println("input id>>");
			inputId = cr.inputNumber();
		} catch (NumberFormatException e) {
			System.out.println("error!");
			e.printStackTrace();
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		try {
			System.out.println("input password>>");
			inputPassword = cr.inputString();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		Member member = new Member(inputId, inputPassword, "Miura Manabu", 28, 2);

		member.showMember();

	}

}
