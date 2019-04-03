import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.util.TreeMap;

public class Wordcount extends JFrame{
	JTextField inputField = new JTextField();
			public void count(Map<String, Integer> Map,String s,JPanel outp, JFrame outframe,JTextArea textArea) {	

				
			
				Map<String,Integer> Map2 = new TreeMap<String, Integer>();  
				String[] word= s.split(",");
				for(int i=0; i<word.length; i++) {
		        			
		        	for(Entry<String,Integer> entry : Map.entrySet()) { 
		        		if(word[i].equals(entry.getKey()))
		        		{
		        			Map2.put(entry.getKey(), entry.getValue());
		        			break;
		        		}
		            } 
		        }
				
				for(Entry<String,Integer> entry : Map2.entrySet()) { 
					 Map2.put(entry.getKey(), entry.getValue());
					 textArea.append("单词:  "+entry.getKey()+"    频数："+entry.getValue()+ "\n");
				} 
				//outp.add(textArea);
				//outframe.add(outp);
				outframe.setVisible(true);
				
			}
			public void Highcount(Map<String, Integer> Map,int k,JPanel outp, JFrame outframe,JTextArea textArea)
			{
		        ArrayList<Map.Entry<String,Integer>> array = new ArrayList<Map.Entry<String,Integer>>(Map.entrySet());

		       Collections.sort(array,new Comparator<Map.Entry<String,Integer>>(){  
		            @Override  
		            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {  
		                return e2.getValue() - e1.getValue(); 
		            }  
		        }); 
		        for(int i=0; i<k; i++) {
		            //System.out.println(array.get(i).getKey()+ ": " +array.get(i).getValue());  
		            textArea.append("单词:  "+array.get(i).getKey()+"    频数："+array.get(i).getValue()+ "\n");
		        }
		         
				//outp.add(textArea);
				//outframe.add(outp);
				outframe.setVisible(true);
			}	
	}
