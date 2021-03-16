package com.sapient.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EXCEL implements File {

	@Override
	public void getTransactionFromFile() {
		
		final String FILE_PATH = "C:/Users/patilde/Desktop/test.xlsx";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(FILE_PATH);

			Workbook workbook = new XSSFWorkbook(fis);

			int numberOfSheets = workbook.getNumberOfSheets();

			Map<String, TransactionAttribute> chechIntraday = new HashMap<>();

			for (int i = 0; i < numberOfSheets; i++) {
				Sheet sheet = workbook.getSheetAt(i);

				Iterator rowIterator = sheet.iterator();

				while (rowIterator.hasNext()) {

					TransactionAttribute transactionAttribute = new TransactionAttribute();

					Row row = (Row) rowIterator.next();

					Iterator cellIterator = row.cellIterator();

					while (cellIterator.hasNext()) {

						Cell cell = (Cell) cellIterator.next();

						if (Cell.CELL_TYPE_STRING == cell.getCellType()) {

							if (cell.getColumnIndex() == 0) {
								transactionAttribute.setExternal_transaction_id(cell.getStringCellValue());
							} else if (cell.getColumnIndex() == 1) {
								transactionAttribute.setClient_id(cell.getStringCellValue());
							} else if (cell.getColumnIndex() == 2) {
								transactionAttribute.setSecurity_id(cell.getStringCellValue());
							} else if (cell.getColumnIndex() == 3) {
								transactionAttribute.setTransaction_type(cell.getStringCellValue());
							} else if (cell.getColumnIndex() == 6) {
								transactionAttribute.setPriority(cell.getStringCellValue());
							}

						} else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
							if (cell.getColumnIndex() == 4) {
								String pattern = "dd-MM-yyyy";
								SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

								transactionAttribute
										.setTransaction_date(simpleDateFormat.format(cell.getDateCellValue()));
							} else if (cell.getColumnIndex() == 5) {
								transactionAttribute.setMarket_value(String.valueOf(cell.getNumericCellValue()));
							}
						}
					}
					TransactionFeeCalculator.calculateProcessingFee(transactionAttribute);
				}
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

  
}