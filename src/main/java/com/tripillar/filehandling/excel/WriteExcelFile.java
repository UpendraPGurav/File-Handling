package com.tripillar.filehandling.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteExcelFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the USN : ");
        String usn = scanner.next();

        System.out.println("Enter the name : ");
        String name = scanner.next();

        System.out.println("Enter Job Role : ");
        String jobRole = scanner.next();

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");

        Row header = sheet.createRow(0);
        Cell headerCell = header.createCell(0);
        headerCell.setCellValue("USN");

        headerCell = header.createCell(1);
        headerCell.setCellValue("Name");

        headerCell = header.createCell(2);
        headerCell.setCellValue("Job Role");


        Row row1 = sheet.createRow(1);
        Cell cell = row1.createCell(0);
        cell.setCellValue(usn);

        cell = row1.createCell(1);
        cell.setCellValue(name);

        cell = row1.createCell(2);
        cell.setCellValue(jobRole);

        try (FileOutputStream fos = new FileOutputStream("file.xlsx")) {
            workbook.write(fos);
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
