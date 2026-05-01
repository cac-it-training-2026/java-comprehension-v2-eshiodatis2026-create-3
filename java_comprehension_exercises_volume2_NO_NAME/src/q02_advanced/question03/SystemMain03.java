package q02_advanced.question03;

public class SystemMain03 {

	public static void main(String[] args) {

		//TODO ここから実装する
		ConsoleReader cr = new ConsoleReader();
		MemberStorage ms = new MemberStorage();
		LoginService ls = new LoginService(ms);

		Member loginUser = null;//ログインできていない間はnull

		boolean isLogin = false;
		System.out.println("ログイン情報を入力してください");

		while (!isLogin) {//ログインできていない間はnull
			try {
				System.out.println("inout id>>");
				int id = cr.inputNumber();

				System.out.println("inout password>>");
				String password = cr.inputString();

				loginUser = ls.doLogin(id, password);

				if (loginUser == null) {
					System.out.println("ID またはパスワードが違っています。再度入力してください。");

				} else {
					System.out.println("ログインに成功しました");

					isLogin = true;
				}
			} catch (NumberFormatException e) {
				System.out.println("不正な入力です。再度入力してください");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		System.out.println("ログイン情報を表示します。");
		System.out.println(loginUser);

	}

}
