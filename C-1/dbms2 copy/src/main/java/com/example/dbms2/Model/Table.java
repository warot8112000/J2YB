package com.example.dbms2.Model;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private String name;
    private ArrayList<Column> columns;
    private ArrayList<Row> rows;

    public Table(String name) {
        this.name = name;
        this.columns = new ArrayList<>();
        this.rows = new ArrayList<>();
    }

    public Table() {
    }

    public void addColumn(Column column) {
        this.columns.add(column);
    }

    public void addListColumn(List<Column> columns) {
        this.columns.addAll(columns);
    }

    public void addRow(Row row) {
        this.rows.add(row);
    }

    public void addListRow(List<Row> rows) {
        this.rows.addAll(rows);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Column> getColumns() {
        return this.columns;
    }

    public ArrayList<Row> getRows() {
        return this.rows;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColumns(ArrayList<Column> columns) {
        this.columns = columns;
    }

    public void setRows(ArrayList<Row> rows) {
        this.rows = rows;
    }

    

  
    // print the table 
    public void printTable() {
        System.out.println("Table: " + this.name);
        // Print column names
        for (Column column : this.columns) {
            System.out.print(column.getName() + "\t");
        }
        System.out.println();

        // Print row values
        for (Row row : this.rows) {
            for (Column column : this.columns) {
                System.out.print(row.getValue(column.getName()) + "\t");
            }
            System.out.println();
        }
    }

    //Test method add column and row to the table
    public void tableTest1() {
    
        Table table = new Table("TestTable");
         Column column = new Column("TestColumn", "String");
		 List<Column> columns = new ArrayList<>();
		 columns.add(column);
		 columns.add(new Column("TestColumn2", "String"));
		 columns.add(new Column("TestColumn3", "String"));

		 table.addColumn(column);
		 table.addColumn(columns.get(1));
		table.addColumn(columns.get(2));
 
		 // Add a row to the table
		 Row row = new Row();
		 Cell cell = new Cell("TestColumn", "TestValue");
		 List<Cell> cells = new ArrayList<>();
		 cells.add(cell);
		 cells.add(new Cell("TestColumn2", "TestValue2"));
		 cells.add(new Cell("TestColumn3", "TestValue3"));
		 row.addCell(cells.get(0));
		 row.addCell(cells.get(1));
		 row.addCell(cells.get(2));
		 table.addRow(row);
		 table.printTable();
    }
}
