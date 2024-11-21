package selectionStructures;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex22 {

	public static void main(String[] args) {

		Double salary, newSalary, percentual;

		int timeWithCompany;

		String position;

		DecimalFormat df = new DecimalFormat("$###,###.00");

		salary = Double.parseDouble(JOptionPane.showInputDialog(null, "Input your salary: "));

		if (salary < 0) {

			JOptionPane.showMessageDialog(null, "Only positive values are available in salary input: ");

			return;
		}

		position = JOptionPane.showInputDialog(null, "Input your position: ");

		if (position.equals("")) {

			JOptionPane.showMessageDialog(null, "Please insert a valid position!!");

			return;
		}

		else {

			position = position.toLowerCase();

			position = position.trim();

		}

		timeWithCompany = Integer.parseInt(JOptionPane.showInputDialog(null, "Input time with company"));

		if (timeWithCompany < 3) {

			JOptionPane.showMessageDialog(null,
					"The program only calculates employment duration greater than 3 years.");

			return;
		}

		switch (position) {

		case "manager":

			if (timeWithCompany >= 5) {

				percentual = 10.0;

				percentual /= 100;

				newSalary = salary + (salary * percentual);

				JOptionPane.showMessageDialog(null, "Position: " + position + "\nTime with company: " + timeWithCompany
						+ "\nSalary: " + df.format(salary) + "\nNew Salary: " + df.format(newSalary));
			}

			else if (timeWithCompany >= 3 && timeWithCompany < 5) {

				percentual = 9.0;

				percentual /= 100;

				newSalary = salary + (salary * percentual);

				JOptionPane.showMessageDialog(null, "Position: " + position + "\nTime with company: " + timeWithCompany
						+ "\nSalary: " + df.format(salary) + "\nNew Salary: " + df.format(newSalary));

			}

			else if (timeWithCompany < 3) {

				percentual = 8.0;

				percentual /= 100;

				newSalary = salary + (salary * percentual);

				JOptionPane.showMessageDialog(null, "Position: " + position + "\nTime with company: " + timeWithCompany
						+ "\nSalary: " + df.format(salary) + "\nNew Salary: " + df.format(newSalary));
			}

			break;

		case "engineer":

			if (timeWithCompany >= 5) {

				percentual = 11.0;

				percentual /= 100;

				newSalary = salary + (salary * percentual);

				JOptionPane.showMessageDialog(null, "Position: " + position + "\nTime with company: " + timeWithCompany
						+ "\nSalary: " + df.format(salary) + "\nNew Salary: " + df.format(newSalary));

			}

			else if (timeWithCompany >= 3 && timeWithCompany < 5) {

				percentual = 10.0;

				percentual /= 100;

				newSalary = salary + (salary * percentual);

				JOptionPane.showMessageDialog(null, "Position: " + position + "\nTime with company: " + timeWithCompany
						+ "\nSalary: " + df.format(salary) + "\nNew Salary: " + df.format(newSalary));

			}

			else if (timeWithCompany < 3) {

				percentual = 9.0;

				percentual /= 100;

				newSalary = salary + (salary * percentual);

				JOptionPane.showMessageDialog(null, "Position: " + position + "\nTime with company: " + timeWithCompany
						+ "\nSalary: " + df.format(salary) + "\nNew Salary: " + df.format(newSalary));
			}

			break;

		case "technician":

			if (timeWithCompany >= 5) {

				percentual = 12.0;

				percentual /= 100;

				newSalary = salary + (salary * percentual);

				JOptionPane.showMessageDialog(null, "Position: " + position + "\nTime with company: " + timeWithCompany
						+ "\nSalary: " + df.format(salary) + "\nNew Salary: " + df.format(newSalary));
			}

			else if (timeWithCompany >= 3 && timeWithCompany < 5) {

				percentual = 11.0;

				percentual /= 100;

				newSalary = salary + (salary * percentual);

				JOptionPane.showMessageDialog(null, "Position: " + position + "\nTime with company: " + timeWithCompany
						+ "\nSalary: " + df.format(salary) + "\nNew Salary: " + df.format(newSalary));

			}

			else if (timeWithCompany < 3) {

				percentual = 10.0;

				percentual /= 100;

				newSalary = salary + (salary * percentual);

				JOptionPane.showMessageDialog(null, "Position: " + position + "\nTime with company: " + timeWithCompany
						+ "\nSalary: " + df.format(salary) + "\nNew Salary: " + df.format(newSalary));
			}

			break;

		default:

			JOptionPane.showMessageDialog(null, "Position available: 'manager' , 'engineer' , 'technician'");

		}
	}

}
