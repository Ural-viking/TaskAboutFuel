/*	Создать приложение на С# - "Расчет веса топлива для автомобиля".
	На входе задается расстояние пути движения, средний расход топлива на 100 км.
	На выходе получаем количество в КГ веса топлива, необходимого, чтоб преодолеть заданный путь
	С помощью этой программы узнать:
	1)Сколько кг топлива потребуется легковому автомобилю чтоб добраться от Екатеринбурга до Москвы при среднем расходе 5 литров на 100 км.
	2)Сколько кг веса топлива потребуется легк.автомобилю чтоб добраться от Екатеринбурга до Владивостока. при среднем расходе 7 литров ан 100 км
	3)Сколько кг веса топлива потребуется легковому автомобилю чтоб добраться от Екатеринбурга до Токио при среднем расходе 5 литров на 100 км
 */

import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
//все необходимые для нас переменные 
		float distanceBetweenSettlements;	// переменная обозначающее расстояние которое нужно проехать между пунктами
		float averageFuelConsumption;		// переменнная - средний расход топлива
		float matterDensity;				// переменная - плотность вещества
		String answer;						// строка ответа пользователя
		int fuel;							// переменная для выбора вида топлива
		boolean programm = true;			// булева переменная для постоянной работы программы
		boolean fuelSelection = true;		// булева переменной для повторного выбора вида топлива
// создаем сканеры для приема данных от пользователя
//о маршруте
			Scanner scan1 = new Scanner(System.in);
//выбор в меню топлива
			Scanner scan2 = new Scanner(System.in);
//ответы да или нет
			Scanner scan3 = new Scanner(System.in);
					
//На входе задается расстояние пути движения, средний расход топлива на 100 км.
			
		while(programm) {	// пока условие соблюдается - программа работает
			

// пользователь вводит расстояние поездки
			System.out.println("Введите расстояние между населенными пунктами (км): ");
			distanceBetweenSettlements = scan1.nextFloat();
// пользователь вводит средний расход топлива на 100 км
			System.out.println("Введите средний расход топлива на 100 км (л): ");
			averageFuelConsumption = scan1.nextFloat();
					
// создаем обьект класса Calculation для расчета массы топлива с двумя параметрами, указанными пользователем 
			Calculation computing = new Calculation(distanceBetweenSettlements,averageFuelConsumption);
// пользователь выбирает топливо
		while(fuelSelection) {		// пока условие соблюдается - выбираем топливо
			System.out.println("Выберете вид топлива из списка и введите его номер из списка ");
			System.out.println("1.Бензин");
			System.out.println("2.Сжиженный природный газ (СПГ)");
			System.out.println("3.Дизельное топливо");
			fuel = scan2.nextInt();
			scan2.nextLine();
			if(fuel<0||fuel>4) {
				fuel = scan2.nextInt();
			}
			switch(fuel) {
				case 1:
				System.out.println("Вы выбрали бензин. Средняя плотность бензина взята как 0,75 кг/л ");
				matterDensity = 0.75f;
				System.out.println(computing.kilogramsOfFuel(matterDensity));
				System.out.println("Хотите произвести расчеты для другого топлива?(да/нет)");
				answer = scan3.nextLine();
				if(answer.equals("да")||answer.equals("Да")||answer.equals("yes")||answer.equals("Yes")||answer.equals("lf")||answer.equals("Lf")) {
					break;
				}
				else {
				System.out.println("Хотите завершить?(да/нет)");
				answer = scan3.nextLine();
				if(answer.equals("да")||answer.equals("Да")||answer.equals("yes")||answer.equals("Yes")||answer.equals("lf")||answer.equals("Lf")) {
					fuelSelection = false;
					programm = false;
				}
				else if(answer.equals("нет")||answer.equals("Нет")||answer.equals("no")||answer.equals("No")||answer.equals("ytn")||answer.equals("Ytn")) {
					break;
					
				}
				}
				break;
				
				case 2:
					System.out.println("Вы выбрали СПГ. Средняя плотность СПГ взята как 0,45 кг/л ");
					matterDensity = 0.45f;
					System.out.println(computing.kilogramsOfFuel(matterDensity));
					System.out.println("Хотите произвести расчеты для другого топлива?(да/нет)");
					answer = scan3.nextLine();
					if(answer.equals("да")||answer.equals("Да")||answer.equals("yes")||answer.equals("Yes")||answer.equals("lf")||answer.equals("Lf")) {
						break;
					}
					else {
					System.out.println("Хотите завершить?(да/нет)");
					answer = scan3.nextLine();
					if(answer.equals("да")||answer.equals("Да")||answer.equals("yes")||answer.equals("Yes")||answer.equals("lf")||answer.equals("Lf")) {
						fuelSelection = false;
						programm = false;
					}
					else if(answer.equals("нет")||answer.equals("Нет")||answer.equals("no")||answer.equals("No")||answer.equals("ytn")||answer.equals("Ytn")) {
						break;
					}
					}
					break;
					
				case 3:
					System.out.println("Вы выбрали дизельное топливо. Средняя плотность дизельного топлива взята как 0,85 кг/л ");
					matterDensity = 0.85f;
					System.out.println(computing.kilogramsOfFuel(matterDensity));
					System.out.println("Хотите произвести расчеты для другого топлива?(да/нет)");
					answer = scan3.nextLine();
					if(answer.equals("да")||answer.equals("Да")||answer.equals("yes")||answer.equals("Yes")||answer.equals("lf")||answer.equals("Lf")) {
						break;
					}
					else {
					System.out.println("Хотите завершить?(да/нет)");
					answer = scan3.nextLine();
					if(answer.equals("да")||answer.equals("Да")||answer.equals("yes")||answer.equals("Yes")||answer.equals("Lf")||answer.equals("lf")) {
						fuelSelection = false;
						programm = false;
					}
					else if(answer.equals("нет")||answer.equals("Нет")||answer.equals("no")||answer.equals("No")||answer.equals("ytn")||answer.equals("Ytn")) {
						break;
					}
					}	
					break;	
				}
			}
		}
	}
}