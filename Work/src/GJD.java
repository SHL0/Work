import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GJD {
	Scanner in= new Scanner(System.in);
	
	public void category(Map<String, Integer> Map,int k) {
		
		guanci(Map,k);
        
        }
	public Map<String, Integer> guanci(Map<String, Integer> Map1,int k)
	{
		Map<String,Integer> Map11 = new TreeMap<String, Integer>();  
		for(Entry<String,Integer> entry : Map1.entrySet()) { 
    			Map11.put(entry.getKey(), entry.getValue());
    		}

		ArrayList<String> guanlists= new ArrayList<String>();
		guanlists.add("a");
		guanlists.add("an");
		guanlists.add("the");
		guanlists.add("A");
		guanlists.add("An");
		guanlists.add("The");
		guanlists.add("AN");
		guanlists.add("THE");
		for (Object obj:guanlists) {
			for(Entry<String,Integer> entry : Map11.entrySet()) {
			 if (obj.equals(entry.getKey())) {
					Map11.remove(entry.getKey(),entry.getValue());
					break;
			 }
			}
		}
		
		jieci(Map11,k);
		return Map11;
	}
	public  Map<String, Integer> jieci(Map<String, Integer> Map2,int k)
	{
		Map<String,Integer> Map12 = new TreeMap<String, Integer>();  
		for(Entry<String,Integer> entry : Map2.entrySet()) { 
    			Map12.put(entry.getKey(), entry.getValue());
    		}
		ArrayList<String> jielists=new ArrayList<String>();
		jielists.add("at");
		jielists.add(" on");
		jielists.add("in");
		jielists.add("before");
	    jielists.add("after");
	    jielists.add("before");
	    jielists.add("after");
	    jielists.add("by");
	    jielists.add("with");
	    jielists.add("about");
	    jielists.add("around");
	    jielists.add("over");
	    jielists.add("above");
	    jielists.add("under");
	    jielists.add("below");
	    jielists.add("between");
	    jielists.add("among");
	    jielists.add("into");
	    jielists.add("behind");
	    jielists.add("up");
	    jielists.add("down");
	    jielists.add("across");
	   	jielists.add("through");
	   	jielists.add("near");
	   	jielists.add("along");
	   	jielists.add("to");
	   	jielists.add("of");
	   	jielists.add("for");
	   	jielists.add("like");
	   	jielists.add("from");
	   	for (Object obj:jielists) {
			for(Entry<String,Integer> entry : Map12.entrySet()) {
			 if (obj.equals(entry.getKey())) {
					Map12.remove(entry.getKey(),entry.getValue());
					break;
			 }
			}
		}
		 
		daici(Map12,k);
		return Map12;
	}
	public  Map<String, Integer> daici(Map<String, Integer> Map3,int k)
	{ 
		JFrame daiframe = new JFrame();
		daiframe.setBounds(50, 50, 800, 600);
		JButton sureButton = new JButton("确定");
        JTextField s1=new JTextField(20);
		JPanel panel1= new JPanel();
		panel1.add(new JLabel("输入查询单词（除冠词介词代词之外）"));
		panel1.add(s1);
		panel1.add(sureButton);
		daiframe.add(panel1);
		
		Map<String,Integer> Map13 = new TreeMap<String, Integer>();  
		for(Entry<String,Integer> entry : Map3.entrySet()) { 
    			Map13.put(entry.getKey(), entry.getValue());
    		}
		ArrayList<String> dailists=new ArrayList<String>();
		dailists.add("I");
		dailists.add("you");
		dailists.add("he");
		dailists.add("she");
		dailists.add( "it");
		dailists.add("we");
		dailists.add("you");
		dailists.add( "they");
		dailists.add("me");
		dailists.add("you");
		dailists.add("him");
		dailists.add(" her");
		dailists.add("it");
		dailists.add("us");
		dailists.add("you");
		dailists.add("them");
		dailists.add("my");
		dailists.add(" your");
		dailists.add("his");
		dailists.add("her");
		dailists.add("its");
		dailists.add("our");
		dailists.add("their");
		dailists.add(" mine");
		dailists.add("yours");
		dailists.add("his");
		dailists.add("hers");
		dailists.add("its");
		dailists.add("ours");
		dailists.add("theirs");
		dailists.add("myself");
		dailists.add("yourself");
		dailists.add( "himself");
		dailists.add("herself");
		dailists.add("itself");
		dailists.add("ourselves");
		dailists.add( "yourselves");
		dailists.add("themselves");
		dailists.add("this");
		dailists.add("that");
		dailists.add("these");
		dailists.add("those");
		dailists.add("such");
		dailists.add("some");
		dailists.add("who");
		dailists.add( "whom");
		dailists.add( "whose");
		dailists.add( "which");
		dailists.add("what");
		dailists.add( "whoever");
		dailists.add("whichever");
		dailists.add("whatever");
		dailists.add("that");
		dailists.add( "which");
		dailists.add( "who");
		dailists.add("whom");
		dailists.add( "whose");
		dailists.add("as");
		dailists.add("one");
		dailists.add(" some");
		dailists.add("any");
		dailists.add("each");
		dailists.add(" every");
		dailists.add("none");
		dailists.add(" no");
		dailists.add( "many");
		dailists.add("much");
		dailists.add("few");
		dailists.add("little");
		dailists.add(" few");
		dailists.add( "other");
		dailists.add( "another");
		dailists.add( "all");
		dailists.add("both");
		dailists.add("neither");		
		dailists.add(" either");
	   	for (Object obj:dailists) {
			for(Entry<String,Integer> entry : Map13.entrySet()) {
			 if (obj.equals(entry.getKey())) {
					Map13.remove(entry.getKey(),entry.getValue());
					break;
			 }
			}
		}
		ArrayList<Map.Entry<String,Integer>> array = new ArrayList<Map.Entry<String,Integer>>(Map13.entrySet());

	       Collections.sort(array,new Comparator<Map.Entry<String,Integer>>(){  
	            @Override  
	            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {  
	                return e2.getValue() - e1.getValue(); 
	            }  
	        }); 
	  /*  	 for(Entry<String,Integer> entry : Map13.entrySet()) {
	  				System.out.println(entry.getKey()+"  "+entry.getValue());
	  	       }*/
	           Wordcount wc = new Wordcount();
		        
		        sureButton.addActionListener(new ActionListener() {
					  public void actionPerformed(ActionEvent e) {
						  if(e.getSource()==sureButton) {
							  String s= new String(s1.getText());
				                JFrame frame=new JFrame("除介词冠词代词之外的数据统计图");
								frame.setLayout(new GridLayout(2,2,10,10));
								frame.add(new Graph(Map13,s).getChartPanel());  
								frame.setBounds(50, 50, 800, 600);
								frame.setVisible(true);
						  }
					  }
				  });
		        daiframe.setVisible(true);
	    	    
		return Map13; 
	}
}