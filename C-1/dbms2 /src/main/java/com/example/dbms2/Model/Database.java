package com.example.dbms2.Model;

import java.util.ArrayList;

public class Database {
    private String name;
		private ArrayList<Table> tables;

		public Database(String name) {
			this.name = name;
			this.tables = new ArrayList<>();
		}

		public void addTable(Table table) {
			this.tables.add(table);
		}

		public Table getTable(String tableName) {
			for (Table table : this.tables) {
				if (table.getName().equals(tableName)) {
					return table;
				}
			}
			return null; // return null if no matching table name is found
		}


}
