/*	������� ���������� �� �# - "������ ���� ������� ��� ����������".
	�� ����� �������� ���������� ���� ��������, ������� ������ ������� �� 100 ��.
	�� ������ �������� ���������� � �� ���� �������, ������������, ���� ���������� �������� ����
	� ������� ���� ��������� ������:
	1)������� �� ������� ����������� ��������� ���������� ���� ��������� �� ������������� �� ������ ��� ������� ������� 5 ������ �� 100 ��.
	2)������� �� ���� ������� ����������� ����.���������� ���� ��������� �� ������������� �� ������������. ��� ������� ������� 7 ������ �� 100 ��
	3)������� �� ���� ������� ����������� ��������� ���������� ���� ��������� �� ������������� �� ����� ��� ������� ������� 5 ������ �� 100 ��
 */

import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
//��� ����������� ��� ��� ���������� 
		float distanceBetweenSettlements;	// ���������� ������������ ���������� ������� ����� �������� ����� ��������
		float averageFuelConsumption;		// ����������� - ������� ������ �������
		float matterDensity;				// ���������� - ��������� ��������
		String answer;						// ������ ������ ������������
		int fuel;							// ���������� ��� ������ ���� �������
		boolean programm = true;			// ������ ���������� ��� ���������� ������ ���������
		boolean fuelSelection = true;		// ������ ���������� ��� ���������� ������ ���� �������
// ������� ������� ��� ������ ������ �� ������������
//� ��������
			Scanner scan1 = new Scanner(System.in);
//����� � ���� �������
			Scanner scan2 = new Scanner(System.in);
//������ �� ��� ���
			Scanner scan3 = new Scanner(System.in);
					
//�� ����� �������� ���������� ���� ��������, ������� ������ ������� �� 100 ��.
			
		while(programm) {	// ���� ������� ����������� - ��������� ��������
			

// ������������ ������ ���������� �������
			System.out.println("������� ���������� ����� ����������� �������� (��): ");
			distanceBetweenSettlements = scan1.nextFloat();
// ������������ ������ ������� ������ ������� �� 100 ��
			System.out.println("������� ������� ������ ������� �� 100 �� (�): ");
			averageFuelConsumption = scan1.nextFloat();
					
// ������� ������ ������ Calculation ��� ������� ����� ������� � ����� �����������, ���������� ������������� 
			Calculation computing = new Calculation(distanceBetweenSettlements,averageFuelConsumption);
// ������������ �������� �������
		while(fuelSelection) {		// ���� ������� ����������� - �������� �������
			System.out.println("�������� ��� ������� �� ������ � ������� ��� ����� �� ������ ");
			System.out.println("1.������");
			System.out.println("2.��������� ��������� ��� (���)");
			System.out.println("3.��������� �������");
			fuel = scan2.nextInt();
			scan2.nextLine();
			if(fuel<0||fuel>4) {
				fuel = scan2.nextInt();
			}
			switch(fuel) {
				case 1:
				System.out.println("�� ������� ������. ������� ��������� ������� ����� ��� 0,75 ��/� ");
				matterDensity = 0.75f;
				System.out.println(computing.kilogramsOfFuel(matterDensity));
				System.out.println("������ ���������� ������� ��� ������� �������?(��/���)");
				answer = scan3.nextLine();
				if(answer.equals("��")||answer.equals("��")||answer.equals("yes")||answer.equals("Yes")||answer.equals("lf")||answer.equals("Lf")) {
					break;
				}
				else {
				System.out.println("������ ���������?(��/���)");
				answer = scan3.nextLine();
				if(answer.equals("��")||answer.equals("��")||answer.equals("yes")||answer.equals("Yes")||answer.equals("lf")||answer.equals("Lf")) {
					fuelSelection = false;
					programm = false;
				}
				else if(answer.equals("���")||answer.equals("���")||answer.equals("no")||answer.equals("No")||answer.equals("ytn")||answer.equals("Ytn")) {
					break;
					
				}
				}
				break;
				
				case 2:
					System.out.println("�� ������� ���. ������� ��������� ��� ����� ��� 0,45 ��/� ");
					matterDensity = 0.45f;
					System.out.println(computing.kilogramsOfFuel(matterDensity));
					System.out.println("������ ���������� ������� ��� ������� �������?(��/���)");
					answer = scan3.nextLine();
					if(answer.equals("��")||answer.equals("��")||answer.equals("yes")||answer.equals("Yes")||answer.equals("lf")||answer.equals("Lf")) {
						break;
					}
					else {
					System.out.println("������ ���������?(��/���)");
					answer = scan3.nextLine();
					if(answer.equals("��")||answer.equals("��")||answer.equals("yes")||answer.equals("Yes")||answer.equals("lf")||answer.equals("Lf")) {
						fuelSelection = false;
						programm = false;
					}
					else if(answer.equals("���")||answer.equals("���")||answer.equals("no")||answer.equals("No")||answer.equals("ytn")||answer.equals("Ytn")) {
						break;
					}
					}
					break;
					
				case 3:
					System.out.println("�� ������� ��������� �������. ������� ��������� ���������� ������� ����� ��� 0,85 ��/� ");
					matterDensity = 0.85f;
					System.out.println(computing.kilogramsOfFuel(matterDensity));
					System.out.println("������ ���������� ������� ��� ������� �������?(��/���)");
					answer = scan3.nextLine();
					if(answer.equals("��")||answer.equals("��")||answer.equals("yes")||answer.equals("Yes")||answer.equals("lf")||answer.equals("Lf")) {
						break;
					}
					else {
					System.out.println("������ ���������?(��/���)");
					answer = scan3.nextLine();
					if(answer.equals("��")||answer.equals("��")||answer.equals("yes")||answer.equals("Yes")||answer.equals("Lf")||answer.equals("lf")) {
						fuelSelection = false;
						programm = false;
					}
					else if(answer.equals("���")||answer.equals("���")||answer.equals("no")||answer.equals("No")||answer.equals("ytn")||answer.equals("Ytn")) {
						break;
					}
					}	
					break;	
				}
			}
		}
	}
}