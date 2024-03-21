package com.example.dbms2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dbms2.Model.Column;
import com.example.dbms2.Model.Table;

@SpringBootApplication
public class Dbms2Application {

	public static void main(String[] args) {
		SpringApplication.run(Dbms2Application.class, args);
		Table a = new Table();
		a.tableTest1();
	}
	

	// class a database file structure in DBMS
	class Database {

	}

}
