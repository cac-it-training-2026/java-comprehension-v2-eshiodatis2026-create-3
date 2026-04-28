package q01_basic.question05;

public class Member extends AbstMember {
	private int id;
	private String password;
	private String name;

	/**
	 * @return name
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	private int age;
	private int rank;

	/**
	 * @param id
	 * @param password
	 * @param age
	 * @param rank
	 */
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	/**
	 * 
	 */
	public Member() {
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public void buyItem() {
		System.out.println(name + " purchased the item at 50% off");
	}

	@Override
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + id);
		System.out.println("password:" + password);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");
	}

}
