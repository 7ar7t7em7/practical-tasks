package com.walking.HomeWork_lesson32_1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class CarRepository {
	private static final String CAR_SEPARATOR = "\n";
	private static final String FIELD_SEPARATOR = "~";
	private static final String FILE_OF_CARS = "./resource/fileForCar.txt";
		
	static void saveCars(Car[] cars) {
		
		//чистим файл
		File file = new File(FILE_OF_CARS);
		if (file.exists()){
			
			try (FileOutputStream fos = new FileOutputStream(file)){
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//сохраняем машины
		for (Car carRep : cars) {

				CarRepository.saveCar(carRep);

		}
	}
	
	static void saveCar(Car car) {

		try (FileOutputStream fos = new FileOutputStream(FILE_OF_CARS, true)){
			fos.write(car.forSaving().getBytes(), 0, car.forSaving().getBytes().length);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	//возврат массива машин
	static Car[] parseFile() {
		try (FileInputStream fis = new FileInputStream(FILE_OF_CARS)){
			String str = new String(fis.readAllBytes());
			String[] arr = str.split(CAR_SEPARATOR);
			Car[] cars = new Car[arr.length];
			int i = 0;
			for (String string : arr) {
				cars[i] = parseCar(string);
				i++;
			}
			return cars;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	//By FileReader
	static Car[] parseFileByFileReader() {
		try (FileReader fr = new FileReader(FILE_OF_CARS)){
			int i;
			String str = "";
			while((i = fr.read()) != -1) {
				str += (char)i;
			}
			String[] arr = str.split(CAR_SEPARATOR);
			Car[] cars = new Car[arr.length];
			int j = 0;
			for (String string : arr) {
				cars[j] = parseCar(string);
				j++;
			}
			return cars;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	static Car[] parseFileByBufferedInputStream() {
		try (FileInputStream fis = new FileInputStream(FILE_OF_CARS);
				BufferedInputStream bin = new BufferedInputStream(fis)){
			String str = "";
			byte[] bytes = bin.readAllBytes();
			for (byte b : bytes) {
				str += (char)b;
			}
			String[] arr = str.split(CAR_SEPARATOR);
			Car[] cars = new Car[arr.length];
			int j = 0;
			for (String string : arr) {
				cars[j] = parseCar(string);
				j++;
			}
			return cars;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	static Car[] parseFileByBufferedReader() {
		try (FileReader fr = new FileReader(FILE_OF_CARS); 
		     BufferedReader br = new BufferedReader(fr); ){
			int i;
			String str = "";
			while((i = br.read()) != -1) {
				str += (char)i;
			}
			String[] arr = str.split(CAR_SEPARATOR);
			Car[] cars = new Car[arr.length];
			int j = 0;
			for (String string : arr) {
				cars[j] = parseCar(string);
				j++;
			}
			return cars;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	//возврат объекта машина
	private static Car parseCar(String str) {
		String[] mas = str.split(FIELD_SEPARATOR);
		return new Car(mas[0], mas[1], mas[2], mas[3]);
	}
}
