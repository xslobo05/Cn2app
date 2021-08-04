package app.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import app.common.*;
import app.resources.*;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.event.ChangeListener;
import org.json.JSONArray;
import org.json.JSONObject;
import javax.swing.event.ChangeEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.AbstractListModel;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JSlider;


public class appGui extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel pInput;
	private JPanel pOutput;
	private JTextField txtBeddbaeebef;
	private JRadioButton rdbtn5DayForecast;
	private JRadioButton rdbtn10DayForecast;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JList listLocations;
	private JButton btnAddLocation;
	private JButton btnRemoveLocation;
	private JButton btnSave;
	private JButton btnLoadData;
	private JComboBox comboBox;
	private JLabel lblTempValue;
	private JLabel lblHumidityValue;
	private JLabel lblWindValue;
	private JLabel lblPressureValue;
	private JLabel lblCn2now;
	private JLabel lblCn2nowValue;
	private JLabel lblCn2Prediction;
	private JLabel lblCn2Day1;
	private JLabel lblCn2Day2;
	private JLabel lblCn2Day3;
	private JLabel lblCn2Day4;
	private JLabel lblCn2Day5;
	private JLabel lblCn2Day6;
	private JLabel lblCn2Day7;
	private JLabel lblCn2Day8;
	private JLabel lblCn2Day9;
	private JLabel lblCn2Day10;
	private JLabel lblCn2Day1Value;
	private JLabel lblCn2Day2Value;
	private JLabel lblCn2Day3Value;
	private JLabel lblCn2Day4Value;
	private JLabel lblCn2Day5Value;
	private JLabel lblCn2Day6Value;
	private JLabel lblCn2Day7Value;
	private JLabel lblCn2Day8Value;
	private JLabel lblCn2Day9Value;
	private JLabel lblCn2Day10Value;
	private JButton btnSaveToCsv;
	private JButton btnLoadPredictions;
	private JComboBox comboBox2;
	private JLabel lblCurrentCond_1;
	private JLabel lblCurrentTemp_1;
	private JLabel lblHumidity_1;
	private JLabel lblWindSpeed_1;
	private JLabel lblPressure_1;
	private JLabel lblCn2now_1;
	private JLabel lblCurrentTemp2;
	private JLabel lblCurrentHumidity;
	private JLabel lblCurrentSpeed;
	private JLabel lblCurrentPressure;
	private JLabel lblCurrentCn2;
	private JLabel lblPredictions;
	private JLabel lblPred1;
	private JLabel lblPred2;
	private JLabel lblPred3;
	private JLabel lblPred4;
	private JLabel lblPred5;
	private JLabel lblPred6;
	private JLabel lblPred7;
	private JLabel lblPred8;
	private JLabel lblPred9;
	private JLabel lblPred10;
	private JLabel lblPred1Value;
	private JLabel lblPred2Value;
	private JLabel lblPred3Value;
	private JLabel lblPred4Value;
	private JLabel lblPred5Value;
	private JLabel lblPred6Value;
	private JLabel lblPred7Value;
	private JLabel lblPred8Value;
	private JLabel lblPred9Value;
	private JLabel lblPred10Value;
	private JButton btnTest;
	ArrayList<apiForecastResponse> listData = new ArrayList<apiForecastResponse>();
	ArrayList<ArrayList<CsvData5>> csvData5 = new ArrayList<ArrayList<CsvData5>>();
	ArrayList<ArrayList<CsvData10>> csvData10 = new ArrayList<ArrayList<CsvData10>>();
	ArrayList<ArrayList<apifyDataset3h>> dataset = new ArrayList<ArrayList<apifyDataset3h>>();
	ArrayList<String> foundCities = new ArrayList<String>();
	private JComboBox comboBox3;
	private JPanel p3hour;
	private JButton btn3HourPred;
	private JButton btn3hourPast;
	private JButton btnChart10days;
	private JPanel pCustom;
	private JTextField customTemp;
	private JTextField customRh;
	private JTextField customWs;
	private JLabel lblCustomCn2;
	private JLabel lblCustomCn2Value;
	private JButton btnNewButton;
	private JTextField sunriseHH;
	private JTextField sunriseMM;
	private JTextField sunsetHH;
	private JTextField timeHH;
	private JTextField sunsetMM;
	private JTextField timeMM;
	private JCheckBox cb1dayPred;
	private JCheckBox cb2dayPred;
	private JCheckBox cb3dayPred;
	private JCheckBox cb4dayPred;
	private JCheckBox cb5dayPred;
	private JSlider slider;
	private JLabel lblPastRec;
	private JTextField txtCity;
	private JButton btnTestCityList;
	private JList searchList;
	private JScrollPane scrollPane_2;
	private JList searchListId;
	private JScrollPane scrollPane_3;
	private JList listLocationsId;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					appGui frame = new appGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public appGui() throws Exception {
		setResizable(false);
		setTitle("Refractive index structure parameter prediction");
		initComponents();
		createEvents();		
		if(isInternet()) {
			if(loadConfig()) {
				JOptionPane.showMessageDialog(null, "Please wait until app starts. Downloading data...\nClick \"OK\" to proceed.");
				loadData();
				loadPredictions();
				fetchAllDatasets();
			}
			else {
				createDefaultConfig();
				JOptionPane.showMessageDialog(null, "Initial setup completed. Next:\n"
													+ "1) Please close the app (next window)\n"
													+ "2) Move \"citylist.json\" to user.home/Cn2Prediction folder\n"
													+ "3) Restart the app.");
			}
		}
		else JOptionPane.showMessageDialog(null, "No internet connection.");
	}
	
	private void initComponents() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		DefaultListModel listLoc = new DefaultListModel();
		
		pOutput = new JPanel();
		pOutput.setBackground(new Color(255, 250, 250));
		tabbedPane.addTab("Predictions", null, pOutput, null);
		
		btnLoadData = new JButton("Reload data");
		
		comboBox = new JComboBox();
		
		JLabel lblCurrentTemp = new JLabel("Temperature [\u00B0C]:");
		
		JLabel lblHumidity = new JLabel("Humidity [%]:");
		
		JLabel lblWindSpeed = new JLabel("Wind speed [m/s]:");
		
		JLabel lblPressure = new JLabel("Pressure [hPa]:");
		
		JLabel lblCurrentCond = new JLabel("Today's conditions:");
		
		lblTempValue = new JLabel("");
		
		lblHumidityValue = new JLabel("");
		
		lblWindValue = new JLabel("");
		
		lblPressureValue = new JLabel("");
		
		lblCn2now = new JLabel("Cn2 [m-2/3]:");
		
		lblCn2nowValue = new JLabel("");
		
		lblCn2Prediction = new JLabel("Cn2 prediction:");
		
		lblCn2Day1 = new JLabel("1 day:");
		
		lblCn2Day2 = new JLabel("2 day:");
		
		lblCn2Day3 = new JLabel("3 day:");
		
		lblCn2Day4 = new JLabel("4 day:");
		
		lblCn2Day5 = new JLabel("5 day:");
		
		lblCn2Day6 = new JLabel("6 day:");
		
		lblCn2Day7 = new JLabel("7 day:");
		
		lblCn2Day8 = new JLabel("8 day:");
		
		lblCn2Day9 = new JLabel("9 day:");
		
		lblCn2Day10 = new JLabel("10 day:");
		
		lblCn2Day1Value = new JLabel("");
		
		lblCn2Day2Value = new JLabel("");
		
		lblCn2Day3Value = new JLabel("");
		
		lblCn2Day4Value = new JLabel("");
		
		lblCn2Day5Value = new JLabel("");
		
		lblCn2Day6Value = new JLabel("");
		
		lblCn2Day7Value = new JLabel("");
		
		lblCn2Day8Value = new JLabel("");
		
		lblCn2Day9Value = new JLabel("");
		
		lblCn2Day10Value = new JLabel("");
		
		btnSaveToCsv = new JButton("Save predictions");
		
		btnChart10days = new JButton("Show chart");
		
		GroupLayout gl_pOutput = new GroupLayout(pOutput);
		gl_pOutput.setHorizontalGroup(
			gl_pOutput.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pOutput.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pOutput.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pOutput.createSequentialGroup()
							.addGroup(gl_pOutput.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCurrentCond)
								.addGroup(gl_pOutput.createSequentialGroup()
									.addGroup(gl_pOutput.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblHumidity)
										.addComponent(lblCurrentTemp)
										.addComponent(lblWindSpeed)
										.addComponent(lblPressure)
										.addComponent(lblCn2now))
									.addGap(12)
									.addGroup(gl_pOutput.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPressureValue)
										.addComponent(lblWindValue)
										.addComponent(lblHumidityValue)
										.addComponent(lblTempValue)
										.addComponent(lblCn2nowValue)))
								.addGroup(gl_pOutput.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(comboBox, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnLoadData, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addGap(106)
							.addGroup(gl_pOutput.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pOutput.createSequentialGroup()
									.addComponent(lblCn2Day1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblCn2Day1Value))
								.addComponent(lblCn2Prediction)
								.addGroup(gl_pOutput.createSequentialGroup()
									.addComponent(lblCn2Day2)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblCn2Day2Value))
								.addGroup(gl_pOutput.createSequentialGroup()
									.addComponent(lblCn2Day3)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblCn2Day3Value))
								.addGroup(gl_pOutput.createSequentialGroup()
									.addComponent(lblCn2Day4)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblCn2Day4Value))
								.addGroup(gl_pOutput.createSequentialGroup()
									.addComponent(lblCn2Day5)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblCn2Day5Value)))
							.addGap(72)
							.addGroup(gl_pOutput.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_pOutput.createParallelGroup(Alignment.LEADING)
									.addComponent(lblCn2Day7)
									.addComponent(lblCn2Day6)
									.addComponent(lblCn2Day8)
									.addComponent(lblCn2Day9))
								.addComponent(lblCn2Day10))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pOutput.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCn2Day7Value)
								.addComponent(lblCn2Day6Value)
								.addComponent(lblCn2Day8Value)
								.addComponent(lblCn2Day9Value)
								.addComponent(lblCn2Day10Value)))
						.addGroup(gl_pOutput.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(btnChart10days, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnSaveToCsv, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap(225, Short.MAX_VALUE))
		);
		gl_pOutput.setVerticalGroup(
			gl_pOutput.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pOutput.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnLoadData)
					.addGap(18)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addGroup(gl_pOutput.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCurrentCond)
						.addComponent(lblCn2Prediction))
					.addGap(18)
					.addGroup(gl_pOutput.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pOutput.createSequentialGroup()
							.addGroup(gl_pOutput.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCn2Day6)
								.addComponent(lblCn2Day6Value))
							.addGap(18)
							.addGroup(gl_pOutput.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCn2Day7)
								.addComponent(lblCn2Day7Value))
							.addGap(18)
							.addGroup(gl_pOutput.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCn2Day8)
								.addComponent(lblCn2Day8Value))
							.addGap(18)
							.addGroup(gl_pOutput.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCn2Day9)
								.addComponent(lblCn2Day9Value))
							.addGap(18)
							.addGroup(gl_pOutput.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCn2Day10)
								.addComponent(lblCn2Day10Value)))
						.addGroup(gl_pOutput.createSequentialGroup()
							.addGroup(gl_pOutput.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCurrentTemp)
								.addComponent(lblTempValue)
								.addComponent(lblCn2Day1)
								.addComponent(lblCn2Day1Value))
							.addGap(18)
							.addGroup(gl_pOutput.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblHumidity)
								.addComponent(lblHumidityValue)
								.addComponent(lblCn2Day2)
								.addComponent(lblCn2Day2Value))
							.addGap(18)
							.addGroup(gl_pOutput.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pOutput.createSequentialGroup()
									.addGroup(gl_pOutput.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblWindSpeed)
										.addComponent(lblWindValue))
									.addGap(18)
									.addGroup(gl_pOutput.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblPressure)
										.addComponent(lblPressureValue)
										.addComponent(lblCn2Day4)
										.addComponent(lblCn2Day4Value))
									.addGap(18)
									.addGroup(gl_pOutput.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblCn2now)
										.addComponent(lblCn2nowValue)
										.addComponent(lblCn2Day5)
										.addComponent(lblCn2Day5Value)))
								.addGroup(gl_pOutput.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblCn2Day3)
									.addComponent(lblCn2Day3Value)))))
					.addPreferredGap(ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
					.addComponent(btnChart10days)
					.addGap(18)
					.addComponent(btnSaveToCsv)
					.addContainerGap())
		);
		pOutput.setLayout(gl_pOutput);
		
		JPanel pHistory = new JPanel();
		pHistory.setBackground(new Color(255, 250, 250));
		tabbedPane.addTab("Past predictions", null, pHistory, null);
		
		btnLoadPredictions = new JButton("Reload predictions");
		
		comboBox2 = new JComboBox();
		
		lblCurrentCond_1 = new JLabel("Today's conditions:");
		
		lblCurrentTemp_1 = new JLabel("Temperature [\u00B0C]:");
		
		lblHumidity_1 = new JLabel("Humidity [%]:");
		
		lblWindSpeed_1 = new JLabel("Wind speed [m/s]:");
		
		lblPressure_1 = new JLabel("Pressure [hPa]:");
		
		lblCn2now_1 = new JLabel("Cn2 [m-2/3]:");
		
		lblCurrentTemp2 = new JLabel("");
		
		lblCurrentHumidity = new JLabel("");
		
		lblCurrentSpeed = new JLabel("");
		
		lblCurrentPressure = new JLabel("");
		
		lblCurrentCn2 = new JLabel("");
		
		lblPredictions = new JLabel("Past Cn2 predictions for today [m-2/3]:");
		
		lblPred1 = new JLabel("1 day:");
		
		lblPred2 = new JLabel("2 day:");
		
		lblPred3 = new JLabel("3 day:");
		
		lblPred4 = new JLabel("4 day:");
		
		lblPred5 = new JLabel("5 day:");
		
		lblPred6 = new JLabel("6 day:");
		
		lblPred7 = new JLabel("7 day:");
		
		lblPred8 = new JLabel("8 day:");
		
		lblPred9 = new JLabel("9 day:");
		
		lblPred10 = new JLabel("10 day:");
		
		lblPred1Value = new JLabel("");
		
		lblPred2Value = new JLabel("");
		
		lblPred3Value = new JLabel("");
		
		lblPred4Value = new JLabel("");
		
		lblPred5Value = new JLabel("");
		
		lblPred6Value = new JLabel("");
		
		lblPred7Value = new JLabel("");
		
		lblPred8Value = new JLabel("");
		
		lblPred9Value = new JLabel("");
		
		lblPred10Value = new JLabel("");
		GroupLayout gl_pHistory = new GroupLayout(pHistory);
		gl_pHistory.setHorizontalGroup(
			gl_pHistory.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pHistory.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pHistory.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pHistory.createSequentialGroup()
							.addGroup(gl_pHistory.createParallelGroup(Alignment.TRAILING)
								.addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pHistory.createSequentialGroup()
									.addGroup(gl_pHistory.createParallelGroup(Alignment.LEADING)
										.addComponent(lblCurrentTemp_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_pHistory.createSequentialGroup()
											.addGap(28)
											.addComponent(lblHumidity_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblWindSpeed_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_pHistory.createSequentialGroup()
											.addGap(18)
											.addComponent(lblPressure_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_pHistory.createSequentialGroup()
											.addGap(32)
											.addComponent(lblCn2now_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
									.addGap(1)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pHistory.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCurrentTemp2)
								.addComponent(lblCurrentHumidity)
								.addComponent(lblCurrentSpeed)
								.addComponent(lblCurrentPressure)
								.addComponent(lblCurrentCn2)))
						.addGroup(gl_pHistory.createSequentialGroup()
							.addGap(2)
							.addComponent(lblCurrentCond_1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)))
					.addGap(144)
					.addGroup(gl_pHistory.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLoadPredictions)
						.addGroup(gl_pHistory.createSequentialGroup()
							.addGroup(gl_pHistory.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblPred1)
								.addComponent(lblPred2)
								.addComponent(lblPred3)
								.addComponent(lblPred4)
								.addComponent(lblPred5))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pHistory.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPred1Value)
								.addComponent(lblPred2Value)
								.addComponent(lblPred3Value)
								.addComponent(lblPred4Value)
								.addComponent(lblPred5Value))
							.addGap(36)
							.addGroup(gl_pHistory.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblPred9)
								.addComponent(lblPred10)
								.addComponent(lblPred8)
								.addComponent(lblPred7)
								.addComponent(lblPred6))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pHistory.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPred10Value)
								.addComponent(lblPred9Value)
								.addComponent(lblPred8Value)
								.addComponent(lblPred7Value)
								.addComponent(lblPred6Value)))
						.addComponent(lblPredictions))
					.addContainerGap(139, Short.MAX_VALUE))
		);
		gl_pHistory.setVerticalGroup(
			gl_pHistory.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pHistory.createSequentialGroup()
					.addGap(56)
					.addGroup(gl_pHistory.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLoadPredictions))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pHistory.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pHistory.createSequentialGroup()
							.addComponent(lblCurrentCond_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pHistory.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCurrentTemp_1)
								.addComponent(lblCurrentTemp2))
							.addGap(18)
							.addGroup(gl_pHistory.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblHumidity_1)
								.addComponent(lblCurrentHumidity))
							.addGap(18)
							.addGroup(gl_pHistory.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblWindSpeed_1)
								.addComponent(lblCurrentSpeed))
							.addGap(18)
							.addGroup(gl_pHistory.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPressure_1)
								.addComponent(lblCurrentPressure))
							.addGap(18)
							.addGroup(gl_pHistory.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCn2now_1)
								.addComponent(lblCurrentCn2)))
						.addGroup(gl_pHistory.createSequentialGroup()
							.addComponent(lblPredictions)
							.addGap(18)
							.addGroup(gl_pHistory.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPred1)
								.addComponent(lblPred6)
								.addComponent(lblPred1Value)
								.addComponent(lblPred6Value))
							.addGap(18)
							.addGroup(gl_pHistory.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPred2)
								.addComponent(lblPred7)
								.addComponent(lblPred2Value)
								.addComponent(lblPred7Value))
							.addGap(18)
							.addGroup(gl_pHistory.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPred3)
								.addComponent(lblPred8)
								.addComponent(lblPred3Value)
								.addComponent(lblPred8Value))
							.addGap(18)
							.addGroup(gl_pHistory.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPred4)
								.addComponent(lblPred9)
								.addComponent(lblPred4Value)
								.addComponent(lblPred9Value))
							.addGap(18)
							.addGroup(gl_pHistory.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPred5)
								.addComponent(lblPred10)
								.addComponent(lblPred5Value)
								.addComponent(lblPred10Value))))
					.addContainerGap(186, Short.MAX_VALUE))
		);
		pHistory.setLayout(gl_pHistory);
		
		p3hour = new JPanel();
		p3hour.setBackground(new Color(255, 250, 250));
		
		tabbedPane.addTab("3 hour predictions", null, p3hour, null);
		
		btnTest = new JButton("Redownload data");
		
		comboBox3 = new JComboBox();
		
		btn3HourPred = new JButton("Chart - prediction");
		
		btn3hourPast = new JButton("Chart - past");
		
		btn3hourPast.setHorizontalAlignment(SwingConstants.LEFT);
		
		cb1dayPred = new JCheckBox("1 day predictions");
		cb1dayPred.setSelected(true);
		
		cb2dayPred = new JCheckBox("2 day predictions");
		
		cb3dayPred = new JCheckBox("3 day predictions");
		cb3dayPred.setSelected(true);
		
		cb4dayPred = new JCheckBox("4 day predictions");
		
		cb5dayPred = new JCheckBox("5 day predictions");
		
		slider = new JSlider();
		slider.setValue(0);
		
		slider.setMinorTickSpacing(1);
		slider.setMajorTickSpacing(8);
		
		JLabel lblNewLabel_1 = new JLabel("Show:");
		
		JLabel lblNewLabel_2 = new JLabel("Amount of past records:");
		
		lblPastRec = new JLabel("0 hours");
		
		GroupLayout gl_p3hour = new GroupLayout(p3hour);
		gl_p3hour.setHorizontalGroup(
			gl_p3hour.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p3hour.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_p3hour.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_p3hour.createSequentialGroup()
							.addGroup(gl_p3hour.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTest))
							.addContainerGap(534, Short.MAX_VALUE))
						.addGroup(gl_p3hour.createSequentialGroup()
							.addComponent(btn3HourPred, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_p3hour.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_p3hour.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_p3hour.createParallelGroup(Alignment.LEADING)
										.addComponent(cb3dayPred)
										.addComponent(cb4dayPred)
										.addComponent(cb5dayPred)
										.addGroup(gl_p3hour.createSequentialGroup()
											.addGroup(gl_p3hour.createParallelGroup(Alignment.LEADING)
												.addComponent(cb1dayPred)
												.addComponent(lblNewLabel_1)
												.addComponent(cb2dayPred))
											.addGap(69)
											.addGroup(gl_p3hour.createParallelGroup(Alignment.LEADING)
												.addComponent(lblPastRec, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_2)
												.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
								.addGroup(gl_p3hour.createSequentialGroup()
									.addGap(121)
									.addComponent(btn3hourPast)))
							.addGap(120))))
		);
		gl_p3hour.setVerticalGroup(
			gl_p3hour.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p3hour.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(btnTest)
					.addGap(18)
					.addGroup(gl_p3hour.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn3HourPred)
						.addComponent(btn3hourPast))
					.addGap(27)
					.addGroup(gl_p3hour.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_p3hour.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_p3hour.createSequentialGroup()
							.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblPastRec))
						.addGroup(gl_p3hour.createSequentialGroup()
							.addComponent(cb1dayPred)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cb2dayPred)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cb3dayPred)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cb4dayPred)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cb5dayPred)))
					.addContainerGap(134, Short.MAX_VALUE))
		);
		p3hour.setLayout(gl_p3hour);
		
		pCustom = new JPanel();
		pCustom.setBackground(new Color(255, 250, 250));
		tabbedPane.addTab("Custom", null, pCustom, null);
		
		customTemp = new JTextField();
		customTemp.setColumns(10);
		
		customRh = new JTextField();
		customRh.setColumns(10);
		
		customWs = new JTextField();
		customWs.setColumns(10);
		
		JLabel lblCustomTemp = new JLabel("Temp [\u00B0C]:");
		
		JLabel lblCustomHumidity = new JLabel("Humidity [%]:");
		
		JLabel lblCustomWind = new JLabel("Wind speed [m/s]:");
		
		JLabel lblCustomSunrise = new JLabel("Time of sunrise:");
		
		JLabel lblCustomSunset = new JLabel("Time of sunset:");
		
		JLabel lblNewLabel = new JLabel("Time of measurement:");
		
		lblCustomCn2 = new JLabel("Cn2 [m-2/3]:");
		
		lblCustomCn2Value = new JLabel("");
		
		btnNewButton = new JButton("Calculate Cn2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		sunriseHH = new JTextField();
		sunriseHH.setText("6");
		sunriseHH.setColumns(10);
		
		sunriseMM = new JTextField();
		sunriseMM.setText("00");
		sunriseMM.setColumns(10);
		
		sunsetHH = new JTextField();
		sunsetHH.setText("20");
		sunsetHH.setColumns(10);
		
		timeHH = new JTextField();
		timeHH.setText("12");
		timeHH.setColumns(10);
		
		sunsetMM = new JTextField();
		sunsetMM.setText("00");
		sunsetMM.setColumns(10);
		
		timeMM = new JTextField();
		timeMM.setText("00");
		timeMM.setColumns(10);
		
		JLabel separator = new JLabel(":");
		
		JLabel separator_1 = new JLabel(":");
		
		JLabel separator_2 = new JLabel(":");
		GroupLayout gl_pCustom = new GroupLayout(pCustom);
		gl_pCustom.setHorizontalGroup(
			gl_pCustom.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pCustom.createSequentialGroup()
					.addGap(58)
					.addGroup(gl_pCustom.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton)
						.addGroup(gl_pCustom.createSequentialGroup()
							.addGroup(gl_pCustom.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblCustomTemp)
								.addComponent(lblCustomHumidity)
								.addComponent(lblCustomWind)
								.addComponent(lblCustomSunrise)
								.addComponent(lblCustomSunset)
								.addComponent(lblNewLabel))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pCustom.createParallelGroup(Alignment.LEADING)
								.addComponent(customWs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(customRh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(customTemp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pCustom.createSequentialGroup()
									.addComponent(lblCustomCn2)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblCustomCn2Value))
								.addGroup(gl_pCustom.createSequentialGroup()
									.addGroup(gl_pCustom.createParallelGroup(Alignment.LEADING)
										.addComponent(sunriseHH, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
										.addComponent(sunsetHH, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
										.addComponent(timeHH, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_pCustom.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pCustom.createSequentialGroup()
											.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 5, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(timeMM, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_pCustom.createSequentialGroup()
											.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 5, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(sunsetMM, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_pCustom.createSequentialGroup()
											.addComponent(separator, GroupLayout.PREFERRED_SIZE, 5, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(sunriseMM, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))))))
					.addContainerGap(383, Short.MAX_VALUE))
		);
		gl_pCustom.setVerticalGroup(
			gl_pCustom.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pCustom.createSequentialGroup()
					.addGap(106)
					.addGroup(gl_pCustom.createParallelGroup(Alignment.BASELINE)
						.addComponent(customTemp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCustomTemp))
					.addGap(18)
					.addGroup(gl_pCustom.createParallelGroup(Alignment.BASELINE)
						.addComponent(customRh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCustomHumidity))
					.addGap(18)
					.addGroup(gl_pCustom.createParallelGroup(Alignment.BASELINE)
						.addComponent(customWs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCustomWind))
					.addGap(18)
					.addGroup(gl_pCustom.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCustomSunrise)
						.addComponent(sunriseHH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(sunriseMM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pCustom.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCustomSunset)
						.addComponent(sunsetHH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(sunsetMM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pCustom.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(timeHH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(timeMM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pCustom.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCustomCn2)
						.addComponent(lblCustomCn2Value))
					.addContainerGap(72, Short.MAX_VALUE))
		);
		pCustom.setLayout(gl_pCustom);
		
		pInput = new JPanel();
		pInput.setBackground(new Color(255, 250, 250));
		tabbedPane.addTab("Settings", null, pInput, null);
		
		JLabel lblApiKey = new JLabel("Openweathermap API key:");
		
		JLabel lblTypeForecast = new JLabel("Type of forecast:");
		
		JLabel lblLocations = new JLabel("List of locations:");
		
		txtBeddbaeebef = new JTextField();
		txtBeddbaeebef.setEnabled(false);
		txtBeddbaeebef.setEditable(false);
		txtBeddbaeebef.setText("b598e22d24d549b196a6e88eb98e292f");
		txtBeddbaeebef.setColumns(10);
		
		rdbtn5DayForecast = new JRadioButton("5 day forecast");
		rdbtn5DayForecast.setEnabled(false);
		buttonGroup.add(rdbtn5DayForecast);
		
		rdbtn10DayForecast = new JRadioButton("10 day forecast (subscription required)");
		rdbtn10DayForecast.setEnabled(false);
		rdbtn10DayForecast.setSelected(true);
		buttonGroup.add(rdbtn10DayForecast);
		
		JScrollPane scrollPane = new JScrollPane();
		
		btnSave = new JButton("Save settings");
		btnSave.setVisible(false);
		
		btnAddLocation = new JButton("Add location");
		
		btnRemoveLocation = new JButton("Remove location");
		
		JLabel lblAddLocation = new JLabel("Add location (name):");
		
		txtCity = new JTextField();
		txtCity.setColumns(10);
		
		btnTestCityList = new JButton("Search");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		scrollPane_2 = new JScrollPane();
		
		scrollPane_3 = new JScrollPane();
		
		
		GroupLayout gl_pInput = new GroupLayout(pInput);
		gl_pInput.setHorizontalGroup(
			gl_pInput.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pInput.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pInput.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblTypeForecast)
						.addComponent(lblApiKey)
						.addComponent(lblLocations)
						.addComponent(lblAddLocation))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pInput.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRemoveLocation)
						.addGroup(gl_pInput.createSequentialGroup()
							.addComponent(btnAddLocation)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnSave))
						.addGroup(gl_pInput.createSequentialGroup()
							.addComponent(txtCity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnTestCityList))
						.addComponent(txtBeddbaeebef, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, gl_pInput.createSequentialGroup()
							.addComponent(rdbtn5DayForecast)
							.addGap(18)
							.addComponent(rdbtn10DayForecast))
						.addGroup(Alignment.TRAILING, gl_pInput.createSequentialGroup()
							.addGroup(gl_pInput.createParallelGroup(Alignment.TRAILING)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
								.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_pInput.createParallelGroup(Alignment.TRAILING)
								.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))))
					.addGap(116))
		);
		gl_pInput.setVerticalGroup(
			gl_pInput.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pInput.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pInput.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApiKey)
						.addComponent(txtBeddbaeebef, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pInput.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTypeForecast)
						.addComponent(rdbtn5DayForecast)
						.addComponent(rdbtn10DayForecast))
					.addGap(18)
					.addGroup(gl_pInput.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_pInput.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblLocations)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
					.addGap(13)
					.addComponent(btnRemoveLocation)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pInput.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAddLocation)
						.addComponent(txtCity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTestCityList))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pInput.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
						.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pInput.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddLocation)
						.addComponent(btnSave))
					.addContainerGap())
		);
		
		listLocationsId = new JList();
		scrollPane_3.setViewportView(listLocationsId);
		
		searchListId = new JList();
		scrollPane_2.setViewportView(searchListId);
		
		searchList = new JList();
		scrollPane_1.setViewportView(searchList);
		listLocations = new JList(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(listLocations);
		pInput.setLayout(gl_pInput);
		
	}
	
	private void createEvents() {
		
		btnAddLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			/*
			 * Adds new location to list of locations based on user input.
			 */
				
				try {
					addLocation();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		btnRemoveLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			/*
			 * Removes selected location
			 */
				
				DefaultListModel listLoc = (DefaultListModel<String>) listLocations.getModel();
				DefaultListModel listLocId = (DefaultListModel<String>) listLocationsId.getModel();
				if(listLocations.getSelectedIndex() != -1) {
					int index = listLocations.getSelectedIndex();
					listLoc.removeElementAt(index);
					listLocId.removeElementAt(index);
				}
				Config newConfig = new Config();
				newConfig.setApiKey(txtBeddbaeebef.getText());
				newConfig.setMode(rdbtn5DayForecast.isSelected());
				newConfig.setList(listLoc);
				newConfig.setListId(listLocId);
				
				new java.io.File(System.getProperty("user.home"), "Cn2Prediction").mkdirs();
				ObjectMapper mapper = new ObjectMapper();
				
				try {
					mapper.writeValue(new File(System.getProperty("user.home") + File.separator + "Cn2Prediction" + File.separator + "configid.json"), newConfig);
				} catch (JsonGenerationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (JsonMappingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				btnSave.setEnabled(false);
				
			}
		});
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			/*
			 * Saves configuration to configid.json
			 */
				
				DefaultListModel listLoc = (DefaultListModel<String>) listLocations.getModel();
				DefaultListModel listLocId = (DefaultListModel<String>) listLocationsId.getModel();
				Config newConfig = new Config();
				newConfig.setApiKey(txtBeddbaeebef.getText());
				newConfig.setMode(rdbtn5DayForecast.isSelected());
				newConfig.setList(listLoc);
				newConfig.setListId(listLocId);
				
				new java.io.File(System.getProperty("user.home"), "Cn2Prediction").mkdirs();
				ObjectMapper mapper = new ObjectMapper();
				
				try {
					mapper.writeValue(new File(System.getProperty("user.home") + File.separator + "Cn2Prediction" + File.separator + "configid.json"), newConfig);
				} catch (JsonGenerationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (JsonMappingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				btnSave.setEnabled(false);
									
				
				
			}
		});
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
				loadData();
			}
		});
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
			/*
			 * Updates displayed values based on selected location
			 */	
				if(comboBox.getItemCount()>0 ) {
					
					Double t = listData.get(comboBox.getSelectedIndex()).getList().get(0).getTemp().getDay() - 273.15;
					String ts = new DecimalFormat("##.##").format(t);
					Double Cn2 = listData.get(comboBox.getSelectedIndex()).getList().get(0).calculateCn2();
					DecimalFormat df = new DecimalFormat("0.##E0");
					String Cn2s = df.format(Cn2);
					lblTempValue.setText(ts);
					lblHumidityValue.setText(listData.get(comboBox.getSelectedIndex()).getList().get(0).getHumidity().toString());
					lblWindValue.setText(listData.get(comboBox.getSelectedIndex()).getList().get(0).getSpeed().toString());
					lblPressureValue.setText(listData.get(comboBox.getSelectedIndex()).getList().get(0).getPressure().toString());
					lblCn2nowValue.setText(Cn2s);
					
					customTemp.setText(new DecimalFormat("##.##").format(listData.get(comboBox.getSelectedIndex()).getList().get(0).getTemp().getDay()- 275.15));
					customRh.setText(listData.get(comboBox.getSelectedIndex()).getList().get(0).getHumidity().toString());
					customWs.setText(listData.get(comboBox.getSelectedIndex()).getList().get(0).getSpeed().toString());
					
					lblCn2Day1Value.setText(df.format(listData.get(comboBox.getSelectedIndex()).getList().get(1).calculateCn2()));
					lblCn2Day2Value.setText(df.format(listData.get(comboBox.getSelectedIndex()).getList().get(2).calculateCn2()));
					lblCn2Day3Value.setText(df.format(listData.get(comboBox.getSelectedIndex()).getList().get(3).calculateCn2()));
					lblCn2Day4Value.setText(df.format(listData.get(comboBox.getSelectedIndex()).getList().get(4).calculateCn2()));
					lblCn2Day5Value.setText(df.format(listData.get(comboBox.getSelectedIndex()).getList().get(5).calculateCn2()));
					
					if(listData.get(0).getCnt()==11) {
						lblCn2Day6Value.setVisible(true);
						lblCn2Day7Value.setVisible(true);
						lblCn2Day8Value.setVisible(true);
						lblCn2Day9Value.setVisible(true);
						lblCn2Day10Value.setVisible(true);
						lblCn2Day6.setVisible(true);
						lblCn2Day7.setVisible(true);
						lblCn2Day8.setVisible(true);
						lblCn2Day9.setVisible(true);
						lblCn2Day10.setVisible(true);
						
						lblCn2Day6Value.setText(df.format(listData.get(comboBox.getSelectedIndex()).getList().get(6).calculateCn2()));
						lblCn2Day7Value.setText(df.format(listData.get(comboBox.getSelectedIndex()).getList().get(7).calculateCn2()));
						lblCn2Day8Value.setText(df.format(listData.get(comboBox.getSelectedIndex()).getList().get(8).calculateCn2()));
						lblCn2Day9Value.setText(df.format(listData.get(comboBox.getSelectedIndex()).getList().get(9).calculateCn2()));
						lblCn2Day10Value.setText(df.format(listData.get(comboBox.getSelectedIndex()).getList().get(10).calculateCn2()));
						
					}
					else {
						lblCn2Day6Value.setVisible(false);
						lblCn2Day7Value.setVisible(false);
						lblCn2Day8Value.setVisible(false);
						lblCn2Day9Value.setVisible(false);
						lblCn2Day10Value.setVisible(false);
						lblCn2Day6.setVisible(false);
						lblCn2Day7.setVisible(false);
						lblCn2Day8.setVisible(false);
						lblCn2Day9.setVisible(false);
						lblCn2Day10.setVisible(false);
					}
				}	
			}
		});
		rdbtn5DayForecast.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				btnSave.setEnabled(true);
			}
		});
		btnSaveToCsv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Boolean check = true;
				for(int i=0;i<listData.size();i++) {	
					try {
						if(!savePrediction(listData.get(i)))
							check = false;
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(!check) JOptionPane.showMessageDialog(null, "One or multiple predictions were not saved, because today's data has been saved previously.");
				else JOptionPane.showMessageDialog(null, "Predictions saved.");
			}
		});
		btnLoadPredictions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loadPredictions();
			}
		});
		comboBox2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
			/*
			 * Displays values based on selected location
			 */	
				if(comboBox.getItemCount()>0) {	
							
					Double t = listData.get(comboBox2.getSelectedIndex()).getList().get(0).getTemp().getDay() - 273.15;
					String ts = new DecimalFormat("##.##").format(t);
					Double Cn2 = listData.get(comboBox2.getSelectedIndex()).getList().get(0).calculateCn2();
					DecimalFormat df = new DecimalFormat("0.##E0");
					String Cn2s = df.format(Cn2);
					lblCurrentTemp2.setText(ts);
					lblCurrentHumidity.setText(listData.get(comboBox2.getSelectedIndex()).getList().get(0).getHumidity().toString());
					lblCurrentSpeed.setText(listData.get(comboBox2.getSelectedIndex()).getList().get(0).getSpeed().toString());
					lblCurrentPressure.setText(listData.get(comboBox2.getSelectedIndex()).getList().get(0).getPressure().toString());
					lblCurrentCn2.setText(Cn2s);
					
					showHistory(csvData5, csvData10, listData);	
				}
			}
		});
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			/*
			 * testing
			 */
				for(int i=0;i<dataset.get(comboBox3.getSelectedIndex()).size();i++) {
					System.out.println(dataset.get(comboBox3.getSelectedIndex()).get(i).getDt0());
				}
			}
		});
		comboBox3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(comboBox3.getItemCount()>0 && dataset.size()>0) {
				/*
				 * Updates slider readout
				 */
					
					int i = comboBox3.getSelectedIndex();
					//dataset.get(i).get(0).getDt0();
					
					Double cn2_0 = calculateCn2(dataset.get(i).get(0).getDt0(), dataset.get(i).get(0).getTemp0(), dataset.get(i).get(0).getWind0(), dataset.get(i).get(0).getHumidity0(), dataset.get(i).get(0).getSunrise0(), dataset.get(i).get(0).getSunset0());
					Double cn2_1 = calculateCn2(dataset.get(i).get(0).getDt1(), dataset.get(i).get(0).getTemp1(), dataset.get(i).get(0).getWind1(), dataset.get(i).get(0).getHumidity1(), dataset.get(i).get(0).getSunrise1(), dataset.get(i).get(0).getSunset1());
					Double cn2_2 = calculateCn2(dataset.get(i).get(0).getDt2(), dataset.get(i).get(0).getTemp2(), dataset.get(i).get(0).getWind2(), dataset.get(i).get(0).getHumidity2(), dataset.get(i).get(0).getSunrise2(), dataset.get(i).get(0).getSunset2());
					Double cn2_3 = calculateCn2(dataset.get(i).get(0).getDt3(), dataset.get(i).get(0).getTemp3(), dataset.get(i).get(0).getWind3(), dataset.get(i).get(0).getHumidity3(), dataset.get(i).get(0).getSunrise3(), dataset.get(i).get(0).getSunset3());
					//String ts = new DecimalFormat("##.##").format(t);
					//Double Cn2 = listData.get(comboBox2.getSelectedIndex()).getList().get(0).calculateCn2();
					
					DecimalFormat df = new DecimalFormat("0.##E0");
					String cn2_0s = df.format(cn2_0);
					String cn2_1s = df.format(cn2_1);
					String cn2_2s = df.format(cn2_2);
					String cn2_3s = df.format(cn2_3);
					
					int lastIndex = dataset.get(comboBox3.getSelectedIndex()).size()-1;
					slider.setMaximum(lastIndex);
					slider.setValue(0);
					lblPastRec.setText("0 hours");
					
				}
			}
		});
		btn3HourPred.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			/*
			 * Generates graph with 3 hour interval predictions
			 */
				
				DefaultCategoryDataset cn2prediction = new DefaultCategoryDataset();
				int lastIndex = dataset.get(comboBox3.getSelectedIndex()).size()-1;
				String pattern = "MM/dd HH:mm";
				DateFormat df = new SimpleDateFormat(pattern);
				
				if(dataset.get(comboBox3.getSelectedIndex()).size()>1)	
					cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex-1).getDt0(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex-1).getTemp0(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex-1).getWind0(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex-1).getHumidity0(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex-1).getSunrise0(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex-1).getSunset0())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex-1).getDt0()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt0(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp0(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind0(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity0(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise0(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset0())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt0()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt1(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp1(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind1(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity1(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise1(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset1())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt1()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt2(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp2(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind2(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity2(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise2(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset2())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt2()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt3(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp3(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind3(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity3(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise3(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset3())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt3()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt4(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp4(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind4(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity4(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise4(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset4())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt4()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) ); 
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt5(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp5(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind5(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity5(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise5(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset5())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt5()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt6(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp6(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind6(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity6(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise6(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset6())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt6()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt7(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp7(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind7(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity7(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise7(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset7())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt7()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt8(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp8(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind8(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity8(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise8(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset8())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt8()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt9(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp9(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind9(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity9(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise9(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset9())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt9()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt10(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp10(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind10(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity10(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise10(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset10())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt10()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt11(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp11(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind11(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity11(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise11(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset11())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt11()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt12(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp12(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind12(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity12(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise12(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset12())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt12()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt13(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp13(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind13(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity13(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise13(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset13())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt13()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt14(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp14(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind14(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity14(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise14(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset14())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt14()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt15(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp15(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind15(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity15(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise15(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset15())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt15()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt16(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp16(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind16(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity16(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise16(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset16())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt16()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt17(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp17(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind17(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity17(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise17(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset17())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt17()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt18(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp18(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind18(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity18(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise18(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset18())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt18()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt19(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp19(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind19(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity19(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise19(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset19())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt19()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt20(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp20(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind20(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity20(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise20(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset20())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt20()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt21(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp21(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind21(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity21(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise21(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset21())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt21()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt22(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp22(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind22(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity22(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise22(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset22())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt22()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt23(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp23(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind23(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity23(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise23(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset23())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt23()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt24(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp24(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind24(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity24(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise24(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset24())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt24()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt25(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp25(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind25(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity25(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise25(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset25())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt25()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt26(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp26(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind26(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity26(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise26(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset26())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt26()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt27(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp27(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind27(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity27(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise27(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset27())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt27()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt28(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp28(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind28(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity28(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise28(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset28())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt28()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt29(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp29(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind29(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity29(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise29(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset29())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt29()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt30(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp30(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind30(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity30(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise30(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset30())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt30()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt31(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp31(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind31(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity31(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise31(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset31())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt31()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt32(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getTemp32(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getWind32(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getHumidity32(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunrise32(), dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getSunset32())*(1E14) , "Cn2" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(lastIndex).getDt32()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				
				
				JFreeChart lineChartObject = ChartFactory.createLineChart(
				         "Prediction of Cn2 [m-2/3] - " + comboBox3.getSelectedItem().toString(),"Date and time",
				         "Cn2 [m-2/3]*10-E14",
				         cn2prediction,PlotOrientation.VERTICAL,
				         true,true,false);
				
				CategoryAxis axis = lineChartObject.getCategoryPlot().getDomainAxis();
				axis.setCategoryLabelPositions(CategoryLabelPositions.UP_90);
				ChartFrame frame = new ChartFrame("Predictions (3 hour intervals)", lineChartObject);
				frame.pack();
		        frame.setVisible(true);
			      
			}
		});
		btn3hourPast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			/*
			 * Generates graph comparing actual values with their predictions
			 */
				
				DefaultCategoryDataset cn2prediction = new DefaultCategoryDataset();
				int lastIndex = dataset.get(comboBox3.getSelectedIndex()).size()-1;
				String pattern = "MM/dd HH:mm";
				DateFormat df = new SimpleDateFormat(pattern);
				
				for(int i=lastIndex-slider.getValue();i<=lastIndex;i++) {
					
					cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(i).getDt0(), dataset.get(comboBox3.getSelectedIndex()).get(i).getTemp0(), dataset.get(comboBox3.getSelectedIndex()).get(i).getWind0(), dataset.get(comboBox3.getSelectedIndex()).get(i).getHumidity0(), dataset.get(comboBox3.getSelectedIndex()).get(i).getSunrise0(), dataset.get(comboBox3.getSelectedIndex()).get(i).getSunset0())*(1E14) , "Actual value" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(i).getDt0()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
					if(i>0 && cb1dayPred.isSelected())
						cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(i-1).getDt1(), dataset.get(comboBox3.getSelectedIndex()).get(i-1).getTemp1(), dataset.get(comboBox3.getSelectedIndex()).get(i-1).getWind1(), dataset.get(comboBox3.getSelectedIndex()).get(i-1).getHumidity1(), dataset.get(comboBox3.getSelectedIndex()).get(i-1).getSunrise1(), dataset.get(comboBox3.getSelectedIndex()).get(i-1).getSunset1())*(1E14) , "1 day prediction" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(i-1).getDt1()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
					if(i>7 && cb2dayPred.isSelected())
						cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(i-8).getDt8(), dataset.get(comboBox3.getSelectedIndex()).get(i-8).getTemp8(), dataset.get(comboBox3.getSelectedIndex()).get(i-8).getWind8(), dataset.get(comboBox3.getSelectedIndex()).get(i-8).getHumidity8(), dataset.get(comboBox3.getSelectedIndex()).get(i-8).getSunrise8(), dataset.get(comboBox3.getSelectedIndex()).get(i-8).getSunset8())*(1E14) , "2 day prediction" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(i-8).getDt8()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
					if(i>15 && cb3dayPred.isSelected())
						cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(i-16).getDt16(), dataset.get(comboBox3.getSelectedIndex()).get(i-16).getTemp16(), dataset.get(comboBox3.getSelectedIndex()).get(i-16).getWind16(), dataset.get(comboBox3.getSelectedIndex()).get(i-16).getHumidity16(), dataset.get(comboBox3.getSelectedIndex()).get(i-16).getSunrise16(), dataset.get(comboBox3.getSelectedIndex()).get(i-16).getSunset16())*(1E14) , "3 day prediction" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(i-16).getDt16()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
					if(i>23 && cb4dayPred.isSelected())
						cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(i-24).getDt24(), dataset.get(comboBox3.getSelectedIndex()).get(i-24).getTemp24(), dataset.get(comboBox3.getSelectedIndex()).get(i-24).getWind24(), dataset.get(comboBox3.getSelectedIndex()).get(i-24).getHumidity24(), dataset.get(comboBox3.getSelectedIndex()).get(i-24).getSunrise24(), dataset.get(comboBox3.getSelectedIndex()).get(i-24).getSunset24())*(1E14) , "4 day prediction" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(i-24).getDt24()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
					if(i>31 && cb5dayPred.isSelected())
						cn2prediction.addValue( calculateCn2(dataset.get(comboBox3.getSelectedIndex()).get(i-32).getDt32(), dataset.get(comboBox3.getSelectedIndex()).get(i-32).getTemp32(), dataset.get(comboBox3.getSelectedIndex()).get(i-32).getWind32(), dataset.get(comboBox3.getSelectedIndex()).get(i-32).getHumidity32(), dataset.get(comboBox3.getSelectedIndex()).get(i-32).getSunrise32(), dataset.get(comboBox3.getSelectedIndex()).get(i-32).getSunset32())*(1E14) , "5 day prediction" , df.format(new Date((long)dataset.get(comboBox3.getSelectedIndex()).get(i-32).getDt32()*1000 + (long)listData.get(comboBox3.getSelectedIndex()).getCity().getTimezone()*1000)) );
				
				}
				JFreeChart lineChartObject = ChartFactory.createLineChart(
				         "Cn2 [m-2/3] - " + comboBox3.getSelectedItem().toString(),"Date and time",
				         "Cn2 [m-2/3]*10-E14",
				         cn2prediction,PlotOrientation.VERTICAL,
				         true,true,false);
				
				CategoryAxis axis = lineChartObject.getCategoryPlot().getDomainAxis();
				axis.setCategoryLabelPositions(CategoryLabelPositions.UP_90);
				ChartFrame frame = new ChartFrame("Past predictions (3 hour intervals)", lineChartObject);
				frame.pack();
		        frame.setVisible(true);
				
			}
		});
		btnChart10days.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			/*
			 * Generates graph with 10 day predictions
			 */
				
				DefaultCategoryDataset cn2prediction = new DefaultCategoryDataset();
				int lastIndex = dataset.get(comboBox.getSelectedIndex()).size()-1;
				String pattern = "MM/dd HH:mm";
				DateFormat df = new SimpleDateFormat(pattern);
				
				cn2prediction.addValue( listData.get(comboBox.getSelectedIndex()).getList().get(0).calculateCn2()*(1E14) , "Cn2" , df.format(new Date((long)listData.get(comboBox.getSelectedIndex()).getList().get(0).getDt()*1000 +(long)listData.get(comboBox.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( listData.get(comboBox.getSelectedIndex()).getList().get(1).calculateCn2()*(1E14) , "Cn2" , df.format(new Date((long)listData.get(comboBox.getSelectedIndex()).getList().get(1).getDt()*1000 +(long)listData.get(comboBox.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( listData.get(comboBox.getSelectedIndex()).getList().get(2).calculateCn2()*(1E14) , "Cn2" , df.format(new Date((long) listData.get(comboBox.getSelectedIndex()).getList().get(2).getDt()*1000+ (long)listData.get(comboBox.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( listData.get(comboBox.getSelectedIndex()).getList().get(3).calculateCn2()*(1E14) , "Cn2" , df.format(new Date((long) listData.get(comboBox.getSelectedIndex()).getList().get(3).getDt()*1000+ (long)listData.get(comboBox.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( listData.get(comboBox.getSelectedIndex()).getList().get(4).calculateCn2()*(1E14) , "Cn2" , df.format(new Date((long) listData.get(comboBox.getSelectedIndex()).getList().get(4).getDt()*1000+ (long)listData.get(comboBox.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( listData.get(comboBox.getSelectedIndex()).getList().get(5).calculateCn2()*(1E14) , "Cn2" , df.format(new Date((long) listData.get(comboBox.getSelectedIndex()).getList().get(5).getDt()*1000+ (long)listData.get(comboBox.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( listData.get(comboBox.getSelectedIndex()).getList().get(6).calculateCn2()*(1E14) , "Cn2" , df.format(new Date((long) listData.get(comboBox.getSelectedIndex()).getList().get(6).getDt()*1000+ (long)listData.get(comboBox.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( listData.get(comboBox.getSelectedIndex()).getList().get(7).calculateCn2()*(1E14) , "Cn2" , df.format(new Date((long) listData.get(comboBox.getSelectedIndex()).getList().get(7).getDt()*1000+ (long)listData.get(comboBox.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( listData.get(comboBox.getSelectedIndex()).getList().get(8).calculateCn2()*(1E14) , "Cn2" , df.format(new Date((long) listData.get(comboBox.getSelectedIndex()).getList().get(8).getDt()*1000+ (long)listData.get(comboBox.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( listData.get(comboBox.getSelectedIndex()).getList().get(9).calculateCn2()*(1E14) , "Cn2" , df.format(new Date((long) listData.get(comboBox.getSelectedIndex()).getList().get(9).getDt()*1000+ (long)listData.get(comboBox.getSelectedIndex()).getCity().getTimezone()*1000)) );
				cn2prediction.addValue( listData.get(comboBox.getSelectedIndex()).getList().get(10).calculateCn2()*(1E14) , "Cn2" , df.format(new Date((long) listData.get(comboBox.getSelectedIndex()).getList().get(10).getDt()*1000+ (long)listData.get(comboBox.getSelectedIndex()).getCity().getTimezone()*1000)) );
				
				JFreeChart lineChartObject = ChartFactory.createLineChart(
				         "Cn2 [m-2/3] - " + comboBox.getSelectedItem().toString(),"Date and time",
				         "Cn2 [m-2/3]*10-E14",
				         cn2prediction,PlotOrientation.VERTICAL,
				         true,true,false);
				
				LineAndShapeRenderer renderer = (LineAndShapeRenderer) lineChartObject.getCategoryPlot().getRenderer();
			    renderer.setAutoPopulateSeriesStroke(false);
			    renderer.setSeriesLinesVisible(0, false);
			    renderer.setSeriesShapesVisible(0, true);
				
				CategoryAxis axis = lineChartObject.getCategoryPlot().getDomainAxis();
				axis.setCategoryLabelPositions(CategoryLabelPositions.UP_90);
				ChartFrame frame = new ChartFrame("10 day Cn2 forecast", lineChartObject);
				frame.pack();
		        frame.setVisible(true);
		        
				
				
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			/*
			 * Calculates Cn2 from user input
			 */
				
				String strTemp =customTemp.getText().replaceAll(",",".");
				Double temp = Double.parseDouble(strTemp) + 273.15;
				Double wind = Double.parseDouble(customWs.getText());
				Integer humid = Integer.parseInt(customRh.getText());
				Integer sunriseH = Integer.parseInt(sunriseHH.getText());
				Integer sunriseM = Integer.parseInt(sunriseMM.getText());
				Integer sunsetH = Integer.parseInt(sunsetHH.getText());
				Integer sunsetM = Integer.parseInt(sunsetMM.getText());
				Integer timeH = Integer.parseInt(timeHH.getText());
				Integer timeM = Integer.parseInt(timeMM.getText());
				Integer sunriseDt = 3600*sunriseH + 60*sunriseM;
				Integer sunsetDt = 3600*sunsetH + 60*sunsetM;
				Integer timeDt = 3600*timeH + 60*timeM;
				//System.out.println(sunriseDt);
				//System.out.println(sunsetDt);
				//System.out.println(timeDt);
				//Integer sunrise = Integer.parseInt(customSunrise.getText());
				//Integer sunset = Integer.parseInt(customSunset.getText());
				Double Cn2 = calculateCn2(timeDt, temp, wind, humid, sunriseDt, sunsetDt );
				DecimalFormat df = new DecimalFormat("0.##E0");
				String Cn2s = df.format(Cn2);
				lblCustomCn2Value.setText(Cn2s);
				
			}
		});
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
			/*
			 * Updates slider readout
			 */	
				
				Integer valueInt = slider.getValue();
				if(valueInt >= 8) {
					Integer valueIntFix = valueInt - valueInt%8;
					Integer days = valueIntFix/8;
					lblPastRec.setText(days.toString() + " days");	
				}
				else {
					valueInt = valueInt*3;
					lblPastRec.setText(valueInt.toString() + " hours");
				}
				
			}
		});
		btnTestCityList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			/*
			 * Searches for locations
			 */	
				
				cityID cities = new cityID();
				java.util.List<cityID> citiesList = new ArrayList<cityID>();
				try {
					citiesList = cities.createList();
					if(citiesList == null) return;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				searchList.setModel(new DefaultListModel());
				searchListId.setModel(new DefaultListModel());
				DefaultListModel list = (DefaultListModel<String>) searchList.getModel();
				DefaultListModel listId = (DefaultListModel<String>) searchListId.getModel();
				
				foundCities.removeAll(foundCities);
				
				
				
				for(int i=0;i<citiesList.size();i++) {
					System.out.println("id: " + citiesList.get(i).getId() + ", name: " + citiesList.get(i).getName());
					if(citiesList.get(i).getName().equals(txtCity.getText())) {
						list.addElement("Name: " + citiesList.get(i).getName() + ", country: " + citiesList.get(i).getCountry() + ", state: " + citiesList.get(i).getState());
						listId.addElement(citiesList.get(i).getId());
						foundCities.add(citiesList.get(i).getName());
					}
					
				}
				if(list.size() <=0) JOptionPane.showMessageDialog(null, "No matching locations found.");
				
			}
		});
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(tabbedPane.getSelectedIndex() == 2) {	
					int lastIndex = dataset.get(comboBox3.getSelectedIndex()).size()-1;
					slider.setMaximum(lastIndex);
					slider.setValue(0);
					lblPastRec.setText("0 hours");
				}
			}
		});
		
	}
	
	private Boolean loadConfig() throws Exception {
	/*
	This function opens configid.json file and puts user's configuration into appropriate variables.
	Console input is user's API key, forecast mode (true: 5 day, false: 10 day) and list of locations.
	*/
		
		File f = new File(System.getProperty("user.home") + File.separator + "Cn2Prediction" + File.separator + "configid.json");
		if(f.isFile()) { 
		    
		
			BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home") + File.separator + "Cn2Prediction" + File.separator + "configid.json"));
			Config loadedConfig = new Gson().fromJson(br, Config.class);
			
			System.out.println(loadedConfig.getApiKey());
			System.out.println(loadedConfig.getMode());
			System.out.println(loadedConfig.getList());
			System.out.println(loadedConfig.getListId());
			
			txtBeddbaeebef.setText(loadedConfig.getApiKey());
			if(loadedConfig.getMode()) 
				rdbtn5DayForecast.setSelected(true);
			else rdbtn10DayForecast.setSelected(true);
			
		    listLocations.setModel(new DefaultListModel());
		    listLocationsId.setModel(new DefaultListModel());

		    DefaultListModel listLocs = (DefaultListModel)listLocations.getModel();
		    DefaultListModel listLocsId = (DefaultListModel)listLocationsId.getModel();
			
			listLocs.removeAllElements();
			for(int i=0;i<loadedConfig.getList().size();i++)
				listLocs.addElement(loadedConfig.getList().get(i));
			
			listLocsId.removeAllElements();
			for(int i=0;i<loadedConfig.getListId().size();i++)
				listLocsId.addElement(loadedConfig.getListId().get(i));
			
			btnSave.setEnabled(false);
			return true;
		}
		else {
			//tabbedPane.setSelectedIndex(2);
			return false;
		}
	}
	
	private Boolean createDefaultConfig() {
	/* 
	Creates config file containing default settings	 
	*/
		DefaultListModel list = new DefaultListModel();
		DefaultListModel listId = new DefaultListModel();
		
		list.addElement("Prague"); listId.addElement("3067696");
		list.addElement("London"); listId.addElement("2643743");
		list.addElement("Nymburk"); listId.addElement("3069236");
		list.addElement("Reykjavik"); listId.addElement("6692263");
		list.addElement("Liberec"); listId.addElement("3071961");
		list.addElement("Brno"); listId.addElement("3078610");
		list.addElement("Moscow"); listId.addElement("524894");
		list.addElement("Berlin"); listId.addElement("2950158");
		
		
		Config newConfig = new Config();
		newConfig.setApiKey("b598e22d24d549b196a6e88eb98e292f");
		newConfig.setMode(false);
		newConfig.setList(list);
		newConfig.setListId(listId);
		
		new java.io.File(System.getProperty("user.home"), "Cn2Prediction").mkdirs();
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			mapper.writeValue(new File(System.getProperty("user.home") + File.separator + "Cn2Prediction" + File.separator + "configid.json"), newConfig);
		} catch (JsonGenerationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JsonMappingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		btnSave.setEnabled(false);
		
		return null;
		
	}
	private apiForecastResponse fetchData(String key, Boolean mode, String cityId) throws Exception {
	/*
	This function sends a HTTP request to openweathermap.com, reads json response and parses values to
	an apiForecastResponse object, which corresponds to structure of the json response.
	Returns an apiForecastResponse object.
	*/
		
		String cnt = new String();
		if(rdbtn10DayForecast.isSelected())
			cnt = "11";
		else
			cnt = "6";
		String url = "http://api.openweathermap.org/data/2.5/forecast/daily?id=" + cityId +"&cnt=" + cnt + "&appid=" + key;
		
		System.out.println(url);
		URL obj = new URL(url);
	    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	    con.setRequestMethod("GET");
	    con.setRequestProperty("User-Agent", "Mozilla/5.0");
	    int responseCode = con.getResponseCode();
	    System.out.println("Response Code : " + responseCode);
	    if(responseCode != 200) JOptionPane.showMessageDialog(null, "An error has occured while fetching weather data.\nCheck your input settings.");
	    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	    String inputLine;
	    StringBuffer response = new StringBuffer();
	    while ((inputLine = in.readLine()) != null) {
	    	response.append(inputLine);
	    }
	    in.close();
	    //System.out.println(response.toString());
	    
	    apiForecastResponse data = new apiForecastResponse();
	    try {
	    	ObjectMapper om = new ObjectMapper();
	    	om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	    	data = om.readValue(response.toString(), apiForecastResponse.class);
	    } catch (Exception e) {
	    	 e.printStackTrace();
	    }
	    
	    return data;    
		
	}
	private Boolean savePrediction(apiForecastResponse data) throws IOException {
	/*
	This function parses predicted Cn2 values and calle save method,
	which saves data to a .csv file in one line.
	Returns true if data is saved.
	Returns false if an error occurs.
	Returns null if amount of predictions' days is not 5 nor 10. This cannot currently occur, because user doesn't have the option to set different amount of days.
	 */
			
		if(data.getCnt()==11){	
			CsvData10 csv10 = new CsvData10();
			csv10.setDt(data.getList().get(0).getDt());
			csv10.setDay1(data.getList().get(1).calculateCn2());
			csv10.setDay2(data.getList().get(2).calculateCn2());
			csv10.setDay3(data.getList().get(3).calculateCn2());
			csv10.setDay4(data.getList().get(4).calculateCn2());
			csv10.setDay5(data.getList().get(5).calculateCn2());
			csv10.setDay6(data.getList().get(6).calculateCn2());
			csv10.setDay7(data.getList().get(7).calculateCn2());
			csv10.setDay8(data.getList().get(8).calculateCn2());
			csv10.setDay9(data.getList().get(9).calculateCn2());
			csv10.setDay10(data.getList().get(10).calculateCn2());
			
			return csv10.save(data.getCity().getId().toString());
				
				
		}
		if(data.getCnt()==6){
			CsvData5 csv5 = new CsvData5();
			csv5.setDt(data.getList().get(0).getDt());
			csv5.setDay1(data.getList().get(1).calculateCn2());
			csv5.setDay2(data.getList().get(2).calculateCn2());
			csv5.setDay3(data.getList().get(3).calculateCn2());
			csv5.setDay4(data.getList().get(4).calculateCn2());
			csv5.setDay5(data.getList().get(5).calculateCn2());
			
			return csv5.save(data.getCity().getId().toString());
		}
		return null;
	}
	
	private ArrayList<CsvData5> loadCsv5(String city) throws IOException {
		
		ArrayList<CsvData5> data = new ArrayList<CsvData5>();
		File csvFile = new File(System.getProperty("user.home") + File.separator + "Cn2Prediction" + File.separator + "pred_id" + city +"5.csv");
		if (csvFile.isFile()) {
			String row;
			BufferedReader csv = new BufferedReader(new FileReader(System.getProperty("user.home") + File.separator + "Cn2Prediction" + File.separator + "pred_id" + city +"5.csv"));
			while ((row = csv.readLine()) != null) {
			    String[] elements = row.split(",");
			    CsvData5 line = new CsvData5();
			    line.setDt(Integer.parseInt(elements[0]));
			    line.setDay1(Double.parseDouble(elements[1]));
			    line.setDay2(Double.parseDouble(elements[2]));
			    line.setDay3(Double.parseDouble(elements[3]));
			    line.setDay4(Double.parseDouble(elements[4]));
			    line.setDay5(Double.parseDouble(elements[5]));			    
			    data.add(line);			    		
			}
			csv.close();
			return data;
		}
		return null;
	}
	
	private ArrayList<CsvData10> loadCsv10(String city) throws IOException {
				
		ArrayList<CsvData10> data = new ArrayList<CsvData10>();
		File csvFile = new File(System.getProperty("user.home") + File.separator + "Cn2Prediction" + File.separator + "pred_id" + city +"10.csv");
		if (csvFile.isFile()) {
			String row;
			BufferedReader csv = new BufferedReader(new FileReader(System.getProperty("user.home") + File.separator + "Cn2Prediction" + File.separator + "pred_id" + city +"10.csv"));
			while ((row = csv.readLine()) != null) {
			    String[] elements = row.split(",");
			    CsvData10 line = new CsvData10();
			    line.setDt(Integer.parseInt(elements[0]));
			    line.setDay1(Double.parseDouble(elements[1]));
			    line.setDay2(Double.parseDouble(elements[2]));
			    line.setDay3(Double.parseDouble(elements[3]));
			    line.setDay4(Double.parseDouble(elements[4]));
			    line.setDay5(Double.parseDouble(elements[5]));
			    line.setDay6(Double.parseDouble(elements[6]));
			    line.setDay7(Double.parseDouble(elements[7]));
			    line.setDay8(Double.parseDouble(elements[8]));
			    line.setDay9(Double.parseDouble(elements[9]));
			    line.setDay10(Double.parseDouble(elements[10]));
			    data.add(line);			    		
			}
			csv.close();
			return data;
		}		
		return null;
	}
	private void loadCsv(ArrayList<ArrayList<CsvData5>> csvData5, ArrayList<ArrayList<CsvData10>> csvData10, ArrayList<apiForecastResponse> listData ) throws IOException {
		
	/* Loads historical predictions from .csv files. */
		
		
		csvData5.removeAll(csvData5);
		csvData10.removeAll(csvData10);
		for(int i=0;i<listData.size();i++) {
			String city = listData.get(i).getCity().getId().toString();
			File f5 = new File(System.getProperty("user.home") + File.separator + "Cn2Prediction" + File.separator + "pred_id" + city +"5.csv");
			File f10 = new File(System.getProperty("user.home") + File.separator + "Cn2Prediction" + File.separator + "pred_id" + city +"10.csv");
			if(!f5.isFile() && listData.get(i).getCnt()==6) {
				JOptionPane.showMessageDialog(null, "One or multiple files with 5 day historical predictions haven't been found.\nGo to tab \"Predictions\", click \"Load data\" and \"Save predictions\".");
				return;
			}
			if(!f10.isFile() && listData.get(i).getCnt()==11) {
				JOptionPane.showMessageDialog(null, "One or multiple files with 10 day historical predictions haven't been found.\nGo to tab \"Predictions\", click \"Load data\" and \"Save predictions\".");
				return;
			}
			if(listData.get(i).getCnt()==6)
				csvData5.add(loadCsv5(listData.get(i).getCity().getId().toString()));
			if(listData.get(i).getCnt()==11)
				csvData10.add(loadCsv10(listData.get(i).getCity().getId().toString()));
						
		}
		
	}
	private void showHistory(ArrayList<ArrayList<CsvData5>> csvData5, ArrayList<ArrayList<CsvData10>> csvData10, ArrayList<apiForecastResponse> listData ) {
		
	/* Puts historical predictions to gui components */
		
		
		if(comboBox2.getItemCount()>0) {
			
			Double Cn2;
			DecimalFormat df = new DecimalFormat("0.##E0");
			String Cn2s;
			
			if(listData.get(0).getCnt()==6 && csvData5.size() > 0) {
				lblPred1Value.setText("");
				lblPred2Value.setText("");
				lblPred3Value.setText("");
				lblPred4Value.setText("");
				lblPred5Value.setText("");
				lblPred6Value.setVisible(false);
				lblPred7Value.setVisible(false);
				lblPred8Value.setVisible(false);
				lblPred9Value.setVisible(false);
				lblPred10Value.setVisible(false);
				lblPred6.setVisible(false);
				lblPred7.setVisible(false);
				lblPred8.setVisible(false);
				lblPred9.setVisible(false);
				lblPred10.setVisible(false);
				int lastCsvIndex = csvData5.get(comboBox2.getSelectedIndex()).size() - 1;
				if(lastCsvIndex>=1) {
					Cn2 = csvData5.get(comboBox2.getSelectedIndex()).get(lastCsvIndex-1).getDay1();
					Cn2s = df.format(Cn2);
					lblPred1Value.setText(Cn2s);
					if(lastCsvIndex>=2) {
						Cn2 = csvData5.get(comboBox2.getSelectedIndex()).get(lastCsvIndex-2).getDay2();
						Cn2s = df.format(Cn2);
						lblPred2Value.setText(Cn2s);
						if(lastCsvIndex>=3) {
							Cn2 = csvData5.get(comboBox2.getSelectedIndex()).get(lastCsvIndex-3).getDay3();
							Cn2s = df.format(Cn2);
							lblPred3Value.setText(Cn2s);
							if(lastCsvIndex>=4) {
								Cn2 = csvData5.get(comboBox2.getSelectedIndex()).get(lastCsvIndex-4).getDay5();
								Cn2s = df.format(Cn2);
								lblPred4Value.setText(Cn2s);
								if(lastCsvIndex>=5) {
									Cn2 = csvData5.get(comboBox2.getSelectedIndex()).get(lastCsvIndex-5).getDay5();
									Cn2s = df.format(Cn2);
									lblPred5Value.setText(Cn2s);
								}
							}
						}
					}
					
				}
			}
			
			if(listData.get(0).getCnt()==11 && csvData10.size() > 0) {
				lblPred1Value.setText("");
				lblPred2Value.setText("");
				lblPred3Value.setText("");
				lblPred4Value.setText("");
				lblPred5Value.setText("");
				lblPred6Value.setText("");
				lblPred7Value.setText("");
				lblPred8Value.setText("");
				lblPred9Value.setText("");
				lblPred10Value.setText("");
				lblPred6Value.setVisible(true);
				lblPred7Value.setVisible(true);
				lblPred8Value.setVisible(true);
				lblPred9Value.setVisible(true);
				lblPred10Value.setVisible(true);
				lblPred6.setVisible(true);
				lblPred7.setVisible(true);
				lblPred8.setVisible(true);
				lblPred9.setVisible(true);
				lblPred10.setVisible(true);
				int lastCsvIndex = csvData10.get(comboBox2.getSelectedIndex()).size() - 1;
				if(lastCsvIndex>=1) {
					Cn2 = csvData10.get(comboBox2.getSelectedIndex()).get(lastCsvIndex-1).getDay1();
					Cn2s = df.format(Cn2);
					lblPred1Value.setText(Cn2s);
					if(lastCsvIndex>=2) {
						Cn2 = csvData10.get(comboBox2.getSelectedIndex()).get(lastCsvIndex-2).getDay2();
						Cn2s = df.format(Cn2);
						lblPred2Value.setText(Cn2s);
						if(lastCsvIndex>=3) {
							Cn2 = csvData10.get(comboBox2.getSelectedIndex()).get(lastCsvIndex-3).getDay3();
							Cn2s = df.format(Cn2);
							lblPred3Value.setText(Cn2s);
							if(lastCsvIndex>=4) {
								Cn2 = csvData10.get(comboBox2.getSelectedIndex()).get(lastCsvIndex-4).getDay5();
								Cn2s = df.format(Cn2);
								lblPred4Value.setText(Cn2s);
								if(lastCsvIndex>=5) {
									Cn2 = csvData10.get(comboBox2.getSelectedIndex()).get(lastCsvIndex-5).getDay5();
									Cn2s = df.format(Cn2);
									lblPred5Value.setText(Cn2s);
									if(lastCsvIndex>=6) {
										Cn2 = csvData10.get(comboBox2.getSelectedIndex()).get(lastCsvIndex-6).getDay6();
										Cn2s = df.format(Cn2);
										lblPred6Value.setText(Cn2s);
										if(lastCsvIndex>=7) {
											Cn2 = csvData10.get(comboBox2.getSelectedIndex()).get(lastCsvIndex-7).getDay7();
											Cn2s = df.format(Cn2);
											lblPred7Value.setText(Cn2s);
											if(lastCsvIndex>=8) {
												Cn2 = csvData10.get(comboBox2.getSelectedIndex()).get(lastCsvIndex-8).getDay8();
												Cn2s = df.format(Cn2);
												lblPred8Value.setText(Cn2s);
												if(lastCsvIndex>=9) {
													Cn2 = csvData10.get(comboBox2.getSelectedIndex()).get(lastCsvIndex-9).getDay9();
													Cn2s = df.format(Cn2);
													lblPred9Value.setText(Cn2s);
													if(lastCsvIndex>10) {
														Cn2 = csvData10.get(comboBox2.getSelectedIndex()).get(lastCsvIndex-10).getDay10();
														Cn2s = df.format(Cn2);
														lblPred10Value.setText(Cn2s);
													}
												}
											}
										}
									}
									
									
								}
							}
						}
					}
					
				}
			}
			
			
		}
	}
	private void loadData() {
	/*
	Calls fetch() method, saves json response to apiForecastResponse object.
	Puts list of locations to JComboBoxes.
	*/
		
		DefaultListModel listLocsId = (DefaultListModel<String>) listLocationsId.getModel();
		DefaultComboBoxModel cbmodel = (DefaultComboBoxModel) comboBox.getModel();
		DefaultComboBoxModel cbmodel2 = (DefaultComboBoxModel) comboBox2.getModel();
		DefaultComboBoxModel cbmodel3 = (DefaultComboBoxModel) comboBox3.getModel();
		cbmodel.removeAllElements();
		cbmodel2.removeAllElements();
		cbmodel3.removeAllElements();
		listData.removeAll(listData);
		
		if(listLocsId.getSize()<=0) JOptionPane.showMessageDialog(null, "No locations defined. Go to tab \"Settings\".");
		else {
			for(int i=0;i<listLocsId.getSize();i++) {
				try {
					listData.add(fetchData(txtBeddbaeebef.getText(),rdbtn5DayForecast.isSelected(),(String) listLocsId.get(i)));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				cbmodel.addElement(listData.get(i).getCity().getName());
				cbmodel2.addElement(listData.get(i).getCity().getName());
				cbmodel3.addElement(listData.get(i).getCity().getName());
			}
			
		}
		
	}
	private void loadPredictions() {
	/*
	Loads historical predictions from .csv files.
	Unifies other related methods
	*/
		
		if(comboBox2.getItemCount() <= 0) JOptionPane.showMessageDialog(null, "No locations defined. Go to tab \"Predictions\" and click \"Load data\".");
		else {
			try {
				loadCsv(csvData5, csvData10, listData);
				showHistory(csvData5, csvData10, listData);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	private ArrayList<apifyDataset3h> fetchDataset3h(String city) throws Exception {
		
	/* Fetches 3 hour forecast data for particular location */
		
		String apifyToken = "Y2bcbeMQwk36qCo4KjdRZFKa4";
		String name = "hyjoJDneaG4r7bmGi~3-hour-" + city;
		
		String url = "https://api.apify.com/v2/datasets/" + name + "/items?token=" + apifyToken + "&offset=1000";
		
		System.out.println(url);
		URL obj = new URL(url);
	    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	    con.setRequestMethod("GET");
	    con.setRequestProperty("User-Agent", "Mozilla/5.0");
	    int responseCode = con.getResponseCode();
	    System.out.println("Response Code : " + responseCode);
	    //if(responseCode != 200) JOptionPane.showMessageDialog(null, "An error has occured while fetching weather data.\nCheck your input settings.");
	    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	    String inputLine;
	    StringBuffer response = new StringBuffer();
	    while ((inputLine = in.readLine()) != null) {
	    	response.append(inputLine);
	    }
	    in.close();
	    
	    JSONArray responseArr = new JSONArray(response.toString());
	    
	    ArrayList<apifyDataset3h> data = new ArrayList<apifyDataset3h>();
	    
	    Integer lastDt = 0;
	    
	    for (int i=0;i<responseArr.length();i++){   
	    	ObjectMapper om = new ObjectMapper();
		    apifyDataset3h row = new apifyDataset3h();
		    om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	    	row = om.readValue(responseArr.get(i).toString(), apifyDataset3h.class); 
	    	data.add(row);
	    	lastDt = row.getDt0();
	    	
	 
        }
	    return data;      
		
	}
	private ArrayList<apifyDataset3h> fetchDataset3hId(String id) throws Exception {
		
		/* Fetches 3 hour forecast data for particular location */
			
			String apifyToken = "Y2bcbeMQwk36qCo4KjdRZFKa4";
			String name = "hyjoJDneaG4r7bmGi~3-hour-id-" + id;
			
			String url = "https://api.apify.com/v2/datasets/" + name + "/items?token=" + apifyToken;// + "&offset=1000";
			
			System.out.println(url);
			URL obj = new URL(url);
		    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		    con.setRequestMethod("GET");
		    con.setRequestProperty("User-Agent", "Mozilla/5.0");
		    int responseCode = con.getResponseCode();
		    System.out.println("Response Code : " + responseCode);
		    //if(responseCode != 200) JOptionPane.showMessageDialog(null, "An error has occured while fetching weather data.\nCheck your input settings.");
		    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		    String inputLine;
		    StringBuffer response = new StringBuffer();
		    while ((inputLine = in.readLine()) != null) {
		    	response.append(inputLine);
		    }
		    in.close();
		    JSONArray responseArr = new JSONArray(response.toString());
		    
		    ArrayList<apifyDataset3h> data = new ArrayList<apifyDataset3h>();
		    
		    Integer lastDt = 0;
		    
		    for (int i=0;i<responseArr.length();i++){   
		    	ObjectMapper om = new ObjectMapper();
			    apifyDataset3h row = new apifyDataset3h();
			    om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		    	row = om.readValue(responseArr.get(i).toString(), apifyDataset3h.class);
		    	data.add(row);
		    	lastDt = row.getDt0();
		    	
		 
	        }
		    return data;      
			
		}
	
	private void fetchAllDatasets() throws Exception {
		
	/* Fetches 3 hour forecast data for all locations */
		
		dataset.removeAll(dataset);
		DefaultListModel listLocs = (DefaultListModel<String>) listLocationsId.getModel();
		
		if(listLocs.getSize()<=0) JOptionPane.showMessageDialog(null, "No locations defined. Go to tab \"Settings\".");
		else {
			for(int i=0;i<listLocs.getSize();i++) {
				try {
					//dataset.add(fetchDataset3h(listLocs.get(i).toString()));
					dataset.add(fetchDataset3hId(listLocs.get(i).toString()));
					System.out.println(dataset.get(i).get(0).getDt0());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		cleanDatasets();
	}
	
	private Double calculateCn2(Integer dt,Double temp,Double ws,Integer rh, Integer sunrise, Integer sunset) {
		
	/* Returns value of Cn2 */
		
		Double a1 = 3.8E-14;
		Double b1 = 2.0E-15;
		Double c1 = -2.8E-15;
		Double c2 = 2.9E-17;
		Double c3 = -1.1E-19;
		Double d1 = -2.5E-15;
		Double d2 = 1.2E-15;
		Double d3 = -8.5E-17;
		Double e = -5.3E-13;
		
		Double tp = (double) ((sunset - sunrise)/12);
		Double th = (dt - sunrise)/tp;
		
		Double w = this.th_To_w(th);
		Double Cn2 = a1*w + b1*temp + c1*(rh/100) + c2*(rh/100)*(rh/100) + 
					c3*(rh/100)*(rh/100)*(rh/100) + d1*ws + d2*ws*ws +
					d3*ws*ws*ws + e;
		
		return Cn2;
	
	}
	private Double th_To_w(Double th) {
		Double w = null;
		
		if(th<-3) 				w = 0.11;
		if(th>=-3 && th<-2) 	w = 0.07;
		if(th>=-2 && th<-1) 	w = 0.08;
		if(th>=-1 && th<0) 		w = 0.06;
		if(th>=0 && th<1)	 	w = 0.05;
		if(th>=1 && th<2)		w = 0.10;
		if(th>=2 && th<3) 		w = 0.51;
		if(th>=3 && th<4) 		w = 0.75;
		if(th>=4 && th<5) 		w = 0.95;
		if(th>=5 && th<6) 		w = 1.00;
		if(th>=6 && th<7) 		w = 0.90;
		if(th>=7 && th<8) 		w = 0.80;
		if(th>=8 && th<9) 		w = 0.59;
		if(th>=9 && th<10) 		w = 0.32;
		if(th>=10 && th<11) 	w = 0.22;
		if(th>=11 && th<12) 	w = 0.10;
		if(th>=12 && th<13) 	w = 0.08;
		if(th>=13)				w = 0.13;
		
		return w;
	}
	private void addLocation() throws Exception {
	
	/* Adds location to list of locations and to location source dataset on Apify cloud */
		
		
		
		DefaultListModel listId = (DefaultListModel<String>) searchListId.getModel();
		DefaultListModel listLocsId = (DefaultListModel<String>) listLocationsId.getModel();
		
		String newLocationId = listId.getElementAt(searchList.getSelectedIndex()).toString();
		String newLocationName = foundCities.get(searchList.getSelectedIndex());
		
		if(newLocationId == null || Integer.parseInt(newLocationId) <= 0) return;
		
		for(int i=0; i<listLocsId.size();i++) {
			if(newLocationId.equals(listLocsId.get(i).toString())) {
				JOptionPane.showMessageDialog(null, "This location is already on the list.");
				return;
			}
		}
		System.out.println(newLocationId);
		System.out.println(newLocationName);
		
		URL url = new URL ("https://api.apify.com/v2/acts/WjjTIupYXBP58pGhF/runs?token=Y2bcbeMQwk36qCo4KjdRZFKa4");
		
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "text/json; utf-8");
		con.setRequestProperty("Accept", "text/json");
		con.setDoOutput(true);
		
		JSONObject jsonInput = new JSONObject();
		jsonInput.put("cityid", newLocationId);
		
		OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
		wr.write(jsonInput.toString());
		wr.flush();
		
		try(BufferedReader br = new BufferedReader(
				  new InputStreamReader(con.getInputStream(), "utf-8"))) {
				    StringBuilder response = new StringBuilder();
				    String responseLine = null;
				    while ((responseLine = br.readLine()) != null) {
				        response.append(responseLine.trim());
				    }
				    System.out.println(response.toString());
				}
		JOptionPane.showMessageDialog(null, "Location has been added. Program will make changes to the cloud service.\nPlease wait and restart the app.");
		btnAddLocation.setEnabled(false);
		
		
		DefaultListModel listLoc = (DefaultListModel<String>) listLocations.getModel();
		DefaultListModel listLocId = (DefaultListModel<String>) listLocationsId.getModel();
		
		listLocId.addElement(newLocationId);
		listLoc.addElement(newLocationName);
		
		Config newConfig = new Config();
		newConfig.setApiKey(txtBeddbaeebef.getText());
		newConfig.setMode(rdbtn5DayForecast.isSelected());
		newConfig.setList(listLoc);
		newConfig.setListId(listLocId);
		
		new java.io.File(System.getProperty("user.home"), "Cn2Prediction").mkdirs();
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			mapper.writeValue(new File(System.getProperty("user.home") + File.separator + "Cn2Prediction" + File.separator + "configid.json"), newConfig);
		} catch (JsonGenerationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JsonMappingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		btnSave.setEnabled(false);
		
		
	}
	private void cleanDatasets() {
		
		/* Removes duplicates from datasets -> ensures each prediction is present once */
		
		for(int i=0;i<dataset.size();i++) {
			//ArrayList<Integer> toRemove = new ArrayList<Integer>();
			for(int j=0;j<dataset.get(i).size()-1;j++) {
				if(dataset.get(i).size()-j>1) {
					int val1 = dataset.get(i).get(j).getDt0();
					int val2 = dataset.get(i).get(j+1).getDt0();
					if(val1 == val2) dataset.get(i).remove(j+1);
					if(dataset.get(i).size()-j>1) {
						int val3 = dataset.get(i).get(j+1).getDt0();
						if(val1 == val3) dataset.get(i).remove(j+1);
						if(dataset.get(i).size()-j>1) {
							int val4 = dataset.get(i).get(j+1).getDt0();
							if(val1 == val4) dataset.get(i).remove(j+1);
						}
					}
					
				}
			
			}
			
		}
			
	}
	public void startupMessage() {
		
		JOptionPane win = new JOptionPane();
		
	}
	public Boolean isInternet() {
		try {
	         URL url = new URL("http://www.google.com");
	         URLConnection connection = url.openConnection();
	         connection.connect();
	         System.out.println("Internet OK");
	         return true;
	      } catch (MalformedURLException e) {
	         System.out.println("Internet is not OK");
	         return false;
	      } catch (IOException e) {
	         System.out.println("Internet is not OK");
	         return false;
	      }
		
	}
}