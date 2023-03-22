package StaticClass;

public class Users {

	static class VipUsers {

		public void displayVipUsers() {
			System.out.println("Welcome Vip User");
		}

	}

	class NormalUsers {

		public void displayNormalUsers() {
			System.out.println("Welcome Normal User");
		}

	}

	public static void main(String[] args) {

		// Nested Static Class doesn't need instantiation of outer class .
		/*
		 * Users users = new Users();-----> This outer class instantiation is not
		 * required
		 */
		Users.VipUsers vip = new Users.VipUsers();
		vip.displayVipUsers();

		/*
		 * Below line will throw error as the non-static class require instantiaion of
		 * the outer class Users.NormalUsers normal = new Users.NormalUsers();
		 */

		Users users = new Users(); // Instantiating outer class .
		Users.NormalUsers normal = users.new NormalUsers();// Instantiating inner class with the help of outer class.
		normal.displayNormalUsers();

	}

}
