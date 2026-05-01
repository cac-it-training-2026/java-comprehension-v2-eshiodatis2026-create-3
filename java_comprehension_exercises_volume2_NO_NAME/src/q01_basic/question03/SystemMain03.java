package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		//TODO ここから実装する
		System.out.println("---SHOW DATA(NULL)---");
		Member member1 = new Member();
		member1.showMember();

		System.out.println("---SHOW DATA(Miura)---");
		Member member2 = new Member("Miura Manabu", 28, 2);
		member2.showMember();

	}

}
