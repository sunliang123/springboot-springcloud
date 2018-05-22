package com.fengmangbilu.microservice.oa.utils;

import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;

public class ExportExcelUtils {
	public static void exportExcel(HttpServletRequest request, HttpServletResponse response, String fileName, ExcelData data)
			throws Exception {
		String userAgent = request.getHeader("User-Agent");
		if (userAgent.contains("MSIE") || userAgent.contains("Trident")) {
			fileName = URLEncoder.encode(fileName, "UTF-8");
		} else {
			fileName = new String(fileName.getBytes("GBK"), "ISO-8859-1");
		}
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Content-Type", "application/vnd.ms-excel;charset=utf-8");
		response.setHeader("Content-Disposition", "attachment;filename=" + fileName + ".xls");
		exportExcel(data, response.getOutputStream());
	}

	public static void exportExcel(ExcelData data, OutputStream out) throws Exception {

		HSSFWorkbook wb = new HSSFWorkbook();
		try {
			String sheetName = data.getName();
			if (null == sheetName) {
				sheetName = "Sheet1";
			}
			HSSFSheet sheet = wb.createSheet(sheetName);
			writeExcel(wb, sheet, data);

			wb.write(out);
		} finally {
			wb.close();
		}
	}

	private static void writeExcel(HSSFWorkbook wb, HSSFSheet sheet, ExcelData data) {

		int rowIndex = 0;

		rowIndex = writeTitlesToExcel(wb, sheet, data.getTitles());
		writeRowsToExcel(wb, sheet, data.getRows(), rowIndex);
		autoSizeColumns(sheet, data.getTitles().size() + 1);

	}

	private static int writeTitlesToExcel(HSSFWorkbook wb, HSSFSheet sheet, List<String> titles) {
		int rowIndex = 0;
		int colIndex = 0;

		Font titleFont = wb.createFont();
		titleFont.setFontName("simsun");
		titleFont.setBold(true);
		// titleFont.setFontHeightInPoints((short) 14);
		titleFont.setColor(IndexedColors.BLACK.index);

		HSSFCellStyle titleStyle = wb.createCellStyle();
		titleStyle.setAlignment(HorizontalAlignment.CENTER);
		titleStyle.setVerticalAlignment(VerticalAlignment.CENTER);
		titleStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
		titleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		titleStyle.setFont(titleFont);
		setBorder(titleStyle, BorderStyle.THIN, HSSFColor.BLACK.index);

		Row titleRow = sheet.createRow(rowIndex);
		// titleRow.setHeightInPoints(25);
		colIndex = 0;

		for (String field : titles) {
			Cell cell = titleRow.createCell(colIndex);
			cell.setCellValue(field);
			cell.setCellStyle(titleStyle);
			colIndex++;
		}

		rowIndex++;
		return rowIndex;
	}

	private static int writeRowsToExcel(HSSFWorkbook wb, HSSFSheet sheet, List<List<Object>> rows, int rowIndex) {
		int colIndex = 0;

		Font dataFont = wb.createFont();
		dataFont.setFontName("simsun");
		// dataFont.setFontHeightInPoints((short) 14);
		dataFont.setColor(IndexedColors.BLACK.index);

		HSSFCellStyle dataStyle = wb.createCellStyle();
		dataStyle.setAlignment(HorizontalAlignment.CENTER);
		dataStyle.setVerticalAlignment(VerticalAlignment.CENTER);
		dataStyle.setFont(dataFont);
		setBorder(dataStyle, BorderStyle.THIN, HSSFColor.BLACK.index);

		for (List<Object> rowData : rows) {
			Row dataRow = sheet.createRow(rowIndex);
			// dataRow.setHeightInPoints(25);
			colIndex = 0;

			for (Object cellData : rowData) {
				Cell cell = dataRow.createCell(colIndex);
				if (cellData != null) {
					cell.setCellValue(cellData.toString());
				} else {
					cell.setCellValue("");
				}

				cell.setCellStyle(dataStyle);
				colIndex++;
			}
			rowIndex++;
		}
		return rowIndex;
	}

	private static void autoSizeColumns(Sheet sheet, int columnNumber) {

		for (int i = 0; i < columnNumber; i++) {
			int orgWidth = sheet.getColumnWidth(i);
			sheet.autoSizeColumn(i, true);
			int newWidth = (int) (sheet.getColumnWidth(i) + 100);
			if (newWidth > orgWidth) {
				sheet.setColumnWidth(i, newWidth);
			} else {
				sheet.setColumnWidth(i, orgWidth);
			}
		}
	}

	private static void setBorder(HSSFCellStyle style, BorderStyle border, short color) {
		style.setBorderTop(border);
		style.setBorderLeft(border);
		style.setBorderRight(border);
		style.setBorderBottom(border);
		style.setTopBorderColor(color);
		style.setRightBorderColor(color);
		style.setLeftBorderColor(color);
		style.setBottomBorderColor(color);
	}
}
