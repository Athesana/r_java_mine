


package com.kh.chap3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

	public class pracc {

		public void output() {
			
			FileOutputStream fw = null;
			
			try {
				fw = new FileOutputStream("test.dat", true);
				fw.write(97);
				fw.write(65);
				
			} catch (FileNotFoundException e ) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}	
		
		
	}


