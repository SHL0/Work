import java.awt.Font;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graph extends Wordcount{
	ChartPanel frame1;
	public  Graph(Map<String, Integer> Map1,String s1){

		DefaultCategoryDataset dataset = getDataSet(Map1,s1);
        JFreeChart chart = ChartFactory.createBarChart3D(
       		                 "����Ƶ��", // ͼ�����
                            " ", // Ŀ¼�����ʾ��ǩ
                          //  "����", // ��ֵ�����ʾ��ǩ
                            "���ʱ�",
                            dataset, // ���ݼ�
                            PlotOrientation.VERTICAL, // ͼ����ˮƽ����ֱ
                            true,           // �Ƿ���ʾͼ��(���ڼ򵥵���״ͼ������false)
                            false,          // �Ƿ����ɹ���
                            false           // �Ƿ�����URL����
                            );
        
        //�����￪ʼ
        CategoryPlot plot=chart.getCategoryPlot();//��ȡͼ���������
       CategoryAxis domainAxis=plot.getDomainAxis();         //ˮƽ�ײ��б�
      //   domainAxis.setLabelFont(new Font("����",Font.BOLD,14));         //ˮƽ�ײ�����
         domainAxis.setTickLabelFont(new Font("����",Font.BOLD,12));  //��ֱ����
         ValueAxis rangeAxis=plot.getRangeAxis();//��ȡ��״
         rangeAxis.setLabelFont(new Font("����",Font.BOLD,15));
          chart.getLegend().setItemFont(new Font("����", Font.BOLD, 15));
          chart.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ�������
          
          //�������������Ȼ�����е�࣬��ֻΪһ��Ŀ�ģ����������������
          
         frame1=new ChartPanel(chart,true);        //����Ҳ������chartFrame,����ֱ������һ��������Frame
         
	}
	/*private static DefaultCategoryDataset getDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(100, "ƻ��", "ƻ��");
        dataset.addValue(200, "����", "����");
        dataset.addValue(300, "����", "����");
        dataset.addValue(400, "�㽶", "�㽶");
        dataset.addValue(500, "��֦", "��֦");
        return dataset;
        
}*/
	public DefaultCategoryDataset getDataSet(Map<String, Integer> Map,String s) {

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
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		Set<Entry<String,Integer>> mapEntrySet = Map2.entrySet();
		for(Entry<String,Integer> entry : Map2.entrySet()) {
            Integer value=entry.getValue();
            dataset.setValue((Number)value,entry.getKey(),entry.getKey());
        }
		return dataset;		
		
	}	
	public ChartPanel getChartPanel(){
		return frame1;
		
	}
}