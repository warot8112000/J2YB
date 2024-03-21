package com.example.dbms2.Model;

import java.util.ArrayList;

public class Row {
    private ArrayList<Cell> cells;

		public Row() {
			this.cells = new ArrayList<>();
		}

		public void addCell(Cell cell) {
			this.cells.add(cell);
		}

		public Object getValue(String columnName) {
			for (Cell cell : this.cells) {
				if (cell.getColumnName().equals(columnName)) {
					return cell.getValue();
				}
			}
			return null; // return null if no matching column name is found
		}

        public void deleteCell(String columnName) {
            for (Cell cell : this.cells) {
				if (cell.getColumnName().equals(columnName)) {
					this.cells.remove(cell);
					break;
				}
			}
        }
}
