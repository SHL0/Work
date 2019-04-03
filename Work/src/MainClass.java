

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
public class MainClass{

	private static final int DEFAULT_WIDTH = 500;
	private static final int DEFAULT_HEIGHT = 400;

	public static final int TEXTAREA_ROWS =30;
	public static final int TEXTAREA_COLUMNS=50;
    public static String[] wordnumber ;
    public static Map<String, Integer> wordMap;
	 //static File file =new File( "input.txt"); 
    static Scanner in = new Scanner(System.in);
    static Map<String,Integer> Map = new LinkedHashMap<String,Integer>();
	@SuppressWarnings("resource")

	public static void main(String args[]) throws Exception {
		JFrame frame1= new JFrame();
		frame1.setBounds(50, 50, 500, 400);
		JPanel panel1= new JPanel();
        panel1.setLayout(new GridLayout(10,8));
	
		JTextField  t1= new JTextField(10);
		JLabel  title=new JLabel("�������ļ�����");
		title.setBounds(20, 10, 50, 20);
		JButton okbt=new JButton("ȷ��");
		okbt.setBounds(260, 250, 100, 50);
		JButton surebt=new JButton("�˳�");
		surebt.setBounds(260, 250, 50, 50);
		
		JLabel lab1=new JLabel("1.��ѯ���ʴ�Ƶ");
		lab1.setBounds(150, 80, 250, 40);
		JLabel lab2=new JLabel("2.��ѯ��Ƶ����");
		lab2.setBounds(150, 80, 250, 40);
		JLabel lab3=new JLabel("3.��ѯ���ʴ�Ƶ��״ͼ");
		lab3.setBounds(150, 80, 250, 40);
		JLabel lab4=new JLabel("4.��ѯ���е��ʴ�Ƶ");
		lab4.setBounds(150, 80, 250, 40);
		JLabel lab5=new JLabel("5.��ѯ����ʹڴʴ���֮��ĵ��ʴ�Ƶ");
		lab5.setBounds(150, 80, 250, 40);
		panel1.add(title);
		panel1.add(t1);
		panel1.add(lab1);
		panel1.add(lab2);
		panel1.add(lab3);
		panel1.add(lab4);
		panel1.add(lab5);
		
		panel1.add(surebt);
		panel1.add(okbt);
		frame1.add(panel1,BorderLayout.CENTER);
		
		 surebt.addActionListener(
				  new ActionListener(){
					  public void actionPerformed(ActionEvent event){
						  if(event.getSource()==surebt){
							  JOptionPane.showConfirmDialog(null, "�Ƿ��˳�����","���ҽ��",JOptionPane.DEFAULT_OPTION);
							  frame1.dispose();//���ٵ�ǰ����
						  }
					  }
					 });
		 okbt.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				  if(e.getSource()==okbt) {
					  String src = t1.getText();
					  File file =new File(src);
					  FileReader reader = null;
					try {
						reader = new FileReader(src);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					  if(!file.exists())
						{
						  JOptionPane.showConfirmDialog(null, "��������ȷ���ļ���","���ҽ��",JOptionPane.DEFAULT_OPTION);
						}
					  BufferedReader br = new BufferedReader(reader);
					  String readline = null;
				        int row=0;
				        int wordnumber=0;
				        long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��    
				        ArrayList<String> lists = new ArrayList<String>(); 
				        try {
							while ((readline = br.readLine()) != null)
							{
								String[] wordsArray=readline.split("[^a-zA-Z]");
								for(String word :wordsArray) 
								{
							        if(word.length() != 0)
							        {  
							        	word=word.toLowerCase();
							            lists.add(word);  
							        }
								}
								row++;	
							}
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						  System.out.println(row); 
				        try {
							br.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

						wordMap=new HashMap<String,Integer>();
							  for (String l : lists) 
							  {  
					            if(wordMap.get(l) != null)
					            {  
					            	wordMap.put(l,wordMap.get(l) + 1);  
					            }else
					            {  
					            	wordMap.put(l,1);  
					            }  
					            wordnumber++;
					        }
							  long endTime = System.currentTimeMillis();    //��ȡ����ʱ��  
							  JOptionPane.showConfirmDialog(t1, "�ı�ͳ����ɣ�"+"\n �ı�ͳ��������ʱ�䣺"+ (endTime - startTime)+"\n �ı������У�"+row+" ��������"+wordnumber,"���",JOptionPane.DEFAULT_OPTION);
				  }
			  }
		  });

        frame1.setVisible(true);
        lab1.addMouseListener(new MouseListener(){
        	public void mouseClicked(MouseEvent e) {
        		// ���������
        		JFrame outframe=new JFrame();
        		outframe.setBounds(50, 50, 500, 400);
			  	JPanel outp=new JPanel();
			  	outp.setBounds(50, 50,100,100);
			  	outframe.setLayout(new GridLayout(3,5));
        		JTextField inputField = new JTextField(10);
        		JLabel inputLab=new JLabel ("������Ҫ��ѯ�ĵ���: ");
        		//inputLab.setBounds(20, 80, 150, 50);
        		//inputField.setBounds(20, 80, 150, 50);
        		JButton insertButton = new JButton("ȷ��");
        		outp.add(inputLab);
        		outp.add(inputField);
        		
        		outp.add(insertButton);
				outframe.add(outp);
			    JTextArea textArea= new JTextArea(TEXTAREA_ROWS,TEXTAREA_COLUMNS);
			    JPanel southPanel=new JPanel();
			    southPanel.setBounds(50, 50,200,200);
				southPanel.add(textArea);
				outframe.add(southPanel,BorderLayout.CENTER);
				
				outframe.setVisible(true);
				insertButton.addActionListener(new ActionListener() {
					  public void actionPerformed(ActionEvent e) {
						  if(e.getSource()==insertButton) {
							 Wordcount wc = new Wordcount();
			                 String s= new String(inputField.getText());
			                 wc.count(wordMap,s,outp,outframe,textArea);
						  }
					  }
				  });
        	}
        	public void mouseEntered(MouseEvent e) {
        		// �����������
        	}
        	public void mouseExited(MouseEvent e) {
        		// ��������뿪
        	}
        	public void mousePressed(MouseEvent e) {
        		// ������갴��
        	}
        	public void mouseReleased(MouseEvent e) {
        		// ��������ͷ�
        	}
        	}); 
        lab2.addMouseListener(new MouseListener(){
        	public void mouseClicked(MouseEvent e) {
        		// ���������
        		JFrame outframe=new JFrame();
        		outframe.setBounds(50, 50, 500, 400);
			  	JPanel outp=new JPanel();
			  	outp.setBounds(50, 50, 500, 400);
			  	outframe.setLayout(new GridLayout(3,5));
        		JTextField inputField = new JTextField(10);
        		JLabel inputLab=new JLabel ("������Ҫ��ѯ�ĸ�Ƶ���ʸ���: ");
        		inputLab.setBounds(20, 80, 150, 50);
        		inputField.setBounds(20, 80, 150, 50);
        		JButton insertButton = new JButton("ȷ��");
        		outp.add(inputLab);
        		outp.add(inputField);
        		
        		outp.add(insertButton);
				outframe.add(outp, BorderLayout.NORTH);
			    JTextArea textArea= new JTextArea(TEXTAREA_ROWS,TEXTAREA_COLUMNS);
			    JPanel southPanel=new JPanel();
			    southPanel.setBounds(100,100,600,600);
				southPanel.add(textArea);
				outframe.add(southPanel,BorderLayout.CENTER);
				
				outframe.setVisible(true);
				insertButton.addActionListener(new ActionListener() {
					  public void actionPerformed(ActionEvent e) {
						  if(e.getSource()==insertButton) {
							  int k=Integer.parseInt(inputField.getText());
				    		  Wordcount wc = new Wordcount();
						      wc.Highcount(wordMap,k,outp,outframe,textArea);
						  }
					  }
				  });
        	}
        	public void mouseEntered(MouseEvent e) {
        		// �����������
        	}
        	public void mouseExited(MouseEvent e) {
        		// ��������뿪
        	}
        	public void mousePressed(MouseEvent e) {
        		// ������갴��
        	}
        	public void mouseReleased(MouseEvent e) {
        		// ��������ͷ�
        	}
        	}); 
        lab3.addMouseListener(new MouseListener(){
        	public void mouseClicked(MouseEvent e) {
        		// ���������
        		JFrame outframe=new JFrame();
        		outframe.setBounds(50, 50, 500, 400);
			  	JPanel outp=new JPanel();
			  	outp.setBounds(50, 50, 500, 400);
			  	outframe.setLayout(new GridLayout(3,5));
        		JTextField inputField = new JTextField(10);
        		JLabel inputLab=new JLabel ("������Ҫ��ѯ�ĵ���: ");
        		inputLab.setBounds(20, 80, 150, 50);
        		inputField.setBounds(20, 80, 150, 50);
        		JButton insertButton = new JButton("ȷ��");
        		outp.add(inputLab);
        		outp.add(inputField);
        		
        		outp.add(insertButton);
				outframe.add(outp, BorderLayout.NORTH);
				outframe.setVisible(true);
				insertButton.addActionListener(new ActionListener() {
					  public void actionPerformed(ActionEvent e) {
						  if(e.getSource()==insertButton) {
							// Wordcount wc = new Wordcount();
			                 String s= new String(inputField.getText());
			                 JFrame frame=new JFrame("Java����ͳ��ͼ");
							frame.setLayout(new GridLayout(2,2,10,10));
							frame.add(new Graph(wordMap,s).getChartPanel());  
							frame.setBounds(50, 50, 800, 600);
							frame.setVisible(true);
						  }
					  }
				  });
        	 
       	}
       	public void mouseEntered(MouseEvent e) {
       		// �����������
       	}
       	public void mouseExited(MouseEvent e) {
       		// ��������뿪
       	}
       	public void mousePressed(MouseEvent e) {
       		// ������갴��
       	}
       	public void mouseReleased(MouseEvent e) {
       		// ��������ͷ�
       	}
       	}); 
        lab4.addMouseListener(new MouseListener(){
        	public void mouseClicked(MouseEvent e) {
        		// ���������
        		Sort all = new Sort();
		    	all.sortwords(wordMap);
		    	
        		JOptionPane.showConfirmDialog(null, "������ɣ�\n����result.txt�鿴��","���",JOptionPane.DEFAULT_OPTION);
        	}
        	public void mouseEntered(MouseEvent e) {
        		// �����������
        	}
        	public void mouseExited(MouseEvent e) {
        		// ��������뿪
        	}
        	public void mousePressed(MouseEvent e) {
        		// ������갴��
        	}
        	public void mouseReleased(MouseEvent e) {
        		// ��������ͷ�
        	}
        	}); 
        lab5.addMouseListener(new MouseListener(){
        	public void mouseClicked(MouseEvent e) {
        		// ���������

        		JFrame outframe=new JFrame();
        		outframe.setTitle("���ڴʽ�ʴ���֮��ĵ���ͳ��");
        		outframe.setBounds(50, 50, 500, 400);
			  	JPanel outp=new JPanel();
			  	outp.setBounds(50, 50, 500, 400);
			  	outframe.setLayout(new GridLayout(3,5));
        		JTextField inputField = new JTextField(10);
        		JLabel inputLab=new JLabel ("�����ѯ�ĸ�Ƶ���ʸ���:");
        		inputLab.setBounds(20, 80, 150, 50);
        		inputField.setBounds(20, 80, 150, 50);
        		JButton insertButton = new JButton("ȷ��");
        		
        		
        		outp.add(inputLab);
        		outp.add(inputField);
        		outp.add(insertButton);
				outframe.add(outp, BorderLayout.NORTH);
				outframe.setVisible(true);
				insertButton.addActionListener(new ActionListener() {
					  public void actionPerformed(ActionEvent e) {
						  if(e.getSource()==insertButton) {
							  int k=Integer.parseInt(inputField.getText());
							  GJD g = new GJD();
						      g.category(wordMap, k);
							 
						  }
					  }
				  });
       	}
       	public void mouseEntered(MouseEvent e) {
       		// �����������
       	}
       	public void mouseExited(MouseEvent e) {
       		// ��������뿪
       	}
       	public void mousePressed(MouseEvent e) {
       		// ������갴��
       	}
       	public void mouseReleased(MouseEvent e) {
       		// ��������ͷ�
       	}
       	}); 
	}
   

}