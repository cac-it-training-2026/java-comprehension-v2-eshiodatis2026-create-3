package q02_advanced.question02;

import java.util.List;

public class MemberManager {
	private MemberManager() {

	}

	public static void showAllMembers(List<Member> members) {
		for (Member m : members) {
			m.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int id, String newPassword) {
		boolean flag = false;
		for (Member m : members) {
			if (m.getId() == id) {
				m.setPassword(newPassword);
				System.out.println("パスワードを更新しました。");

				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("該当者はいませんでした。");
		}
	}
}
