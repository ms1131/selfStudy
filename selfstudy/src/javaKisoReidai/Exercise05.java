/**
 *
 */
package javaKisoReidai;

/**
 * @author prant
 *
 */
public class Exercise05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Employeeクラスで要素が６つの配列を生成する
		Employee[] employees = new Employee[6];
		employees[0] = new Employee("矢沢　晃", 5, 28);
		employees[1] = new Employee("宮本　純子", 10, 33);
		employees[2] = new Employee("藤原　美和子", 3, 23);
		employees[3] = new Employee("土浦　巧", 25, 45);
		employees[4] = new Employee("野崎　りさ", 18, 38);
		employees[5] = new Employee("浅井　真治", 8, 31);

		System.out.println("-----------------");
		System.out.println("社員名簿イステム");
		System.out.println("-----------------");

		for(int i = 0; i <employees.length; i++){
			employees[i].display();
			System.out.println("-----------------");
		}

		Employee.showTotalNumber();

	}

}
