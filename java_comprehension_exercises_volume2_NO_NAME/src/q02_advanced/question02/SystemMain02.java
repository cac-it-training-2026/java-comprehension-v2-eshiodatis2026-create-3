package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		ConsoleReader cr = new ConsoleReader();

		List<Member> members = new ArrayList<>();

		members.add(Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2));
		members.add(Member.getInstance(2, "aaaAAA", "Sato Kensuk", 43, 1));

		System.out.println("===会員情報を表示します===");
		MemberManager.showAllMembers(members);

		System.out.println("===パスワードを変更します===");

		int targetId;
		String newPassword;

		try {
			System.out.println("input target id>>");
			targetId = cr.inputNumber();

			System.out.println("input new password>>");
			newPassword = cr.inputString();
		} catch (NumberFormatException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		MemberManager.updatePassword(members, targetId, newPassword);

		MemberManager.showAllMembers(members);
	}

}
