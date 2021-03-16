/*package com.sapient.Objects;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile_ {

	private static final String FILE_PATH = "C:/Users/patilde/Desktop/test.xlsx";

	public static void main(String args[]) {

		List<TransactionAttribute_> studentList = getTransactionFromExcel();

		System.out.println(studentList);
	}

	public static List<TransactionAttribute_> getTransactionFromExcel() {
		List<TransactionAttribute_> transactionList = new ArrayList();

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(FILE_PATH);

			// Using XSSF for xlsx format, for xls use HSSF
			Workbook workbook = new XSSFWorkbook(fis);

			int numberOfSheets = workbook.getNumberOfSheets();
			
			Map<String, TransactionAttribute_> chechIntraday =new HashMap<>();

			// looping over each workbook sheet
			for (int i = 0; i < numberOfSheets; i++) {
				Sheet sheet = workbook.getSheetAt(i);

				Iterator rowIterator = sheet.iterator();

				// iterating over each row
				while (rowIterator.hasNext()) {

					TransactionAttribute_ transactionAttribute = new TransactionAttribute_();

					Row row = (Row) rowIterator.next();

					Iterator cellIterator = row.cellIterator();

					// Iterating over each cell (column wise) in a particular row.
					while (cellIterator.hasNext()) {

						Cell cell = (Cell) cellIterator.next();
						// The Cell Containing String will is name.

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
								transactionAttribute.setPriority_flag(cell.getStringCellValue());
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
					
					String key= transactionAttribute.client_id +transactionAttribute.security_id+transactionAttribute.transaction_date;
					
					
					if(chechIntraday.containsKey(key))
					{
						   TransactionAttribute_ intraday=chechIntraday.get(key);
						   if(checkTransactionType(transactionAttribute,intraday))
						   {
							   transactionAttribute.setIntraDay("True");
						   }
						   chechIntraday.put(key, transactionAttribute);
					}
					else
						 chechIntraday.put(key, transactionAttribute);					
					
					transactionList.add(transactionAttribute);
				}
			}

			fis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return transactionList;
	}

	public static boolean checkTransactionType(TransactionAttribute_ attribute, TransactionAttribute_ attribute2) {

		if ((attribute.transaction_type.equals("SELL") && attribute2.transaction_type.equals("BUY"))
				|| (attribute.transaction_type.equals("BUY") && attribute2.transaction_type.equals("SELL")))
			return true;

		return false;
	}
	
}*/