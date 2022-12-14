package views.PeopleManagerFrame;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import utility.SuggestionUtility;
import views.AddressSuggestion;
import controllers.LoginController;
import controllers.PeoplePanelController;
import controllers.NhanKhauManagerController.AddNewController;
import models.AddressModel;
import models.ChungMinhThuModel;
import models.NhanKhauModel;

import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import bean.NhanKhauBean;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class NewPeopleFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int MARGIN_TOP = 20;
	
	private PeoplePanelController parentController;
    private JFrame parentFrame;
    private NhanKhauBean nhanKhauBean;
    private AddNewController controller;
    private AddressSuggestion addrSuggestion;
    private AddressModel addrModel = new AddressModel();

	private JPanel contentPane;
	private JTextField hoTenTxb;
	private JTextField danTocTxb;
	private JTextField soCMTTxb;
	private JTextField trinhDoHocVanTxb;
	private JTextField trinhDoNgoaiNguTxb;
	private JTextField ngheNghiepTxb;
	private JTextField bietDanhTxb;
	private JTextField tonGiaoTxb;
	private JTextField soHoChieuTxb;
	private JTextField trinhDoChuyenMonTxb;
	private JTextField bietTiengDanTocTxb;
	private JTextField noiLamViecTxb;
	private com.toedter.calendar.JDateChooser namSinhDateC;
	private javax.swing.JButton khacBtn;
	private SuggestionUtility quocTichTxb;
	private SuggestionUtility diaChiHienNayTxb;
	private JButton CancelBtn ;
	private JButton CreateBtn;
	private SuggestionUtility nguyenQuanTxb;
	private SuggestionUtility noiThuongTruTxb;
	private javax.swing.JComboBox<String> gioiTinhCbb;
	private JButton thuongTruBtn;


	private JTextField JtxReceiveAddress;
	
    /**
     * @wbp.parser.constructor
     */
    public NewPeopleFrame(JFrame parentJFrame) {
    	init();
        this.parentController = new PeoplePanelController(){
            @Override
            public void refreshData() {
            }

            @Override
            public void initAction() {
            }
        };
        
        this.parentFrame = parentJFrame;
        this.parentFrame.setEnabled(false);
        this.nhanKhauBean = new NhanKhauBean();
        controller = new AddNewController();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                    close();
            }
            
        });
    }

	public NewPeopleFrame(PeoplePanelController parentController, JFrame parentJFrame) {
        init();
		this.parentController = parentController;
        this.parentFrame = parentJFrame;
        this.parentFrame.setEnabled(false);
        this.nhanKhauBean = new NhanKhauBean();
        controller = new AddNewController();
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                close();
            }
        });
	}
	
	private void init() {
		setTitle("Th??m nh??n kh???u");
		setBounds(100, 100, 909, 531);
		contentPane = new JPanel();

		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBounds(5,5,1100,1100);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel  jPanel1 = new JPanel();
		jPanel1.setBackground(new Color(240, 248, 255));
		jPanel1.setBounds(10,10,875,474);
		jPanel1.setLayout(null);
		contentPane.add(jPanel1);
		
		
		nguyenQuanTxb = new SuggestionUtility(false) {
			private static final long serialVersionUID = 1L;

			@Override
			public List<String> getSuggestions(String textContent) {
				return null;
			}
		};
		nguyenQuanTxb.setEditable(false);
		nguyenQuanTxb.setBounds(150, 113, 220, 30);
		jPanel1.add(nguyenQuanTxb);
		
		namSinhDateC = new JDateChooser();
		namSinhDateC.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		namSinhDateC.setBounds(150, 72, 240, 30);
		jPanel1.add(namSinhDateC);

		JButton nguyenQuanBtn = new JButton("+");

		nguyenQuanBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JtxReceiveAddress=nguyenQuanTxb;
				getAddressAction();

			}
		});
		nguyenQuanBtn.setBounds(370, 113, 20, 30);
    
		jPanel1.add(nguyenQuanBtn);
		
		JLabel lblNewLabel = new JLabel("H??? v?? t??n:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(24, 31, 100, 30);
		jPanel1.add(lblNewLabel);
		
		JLabel lblNgyThngNm = new JLabel("Ng??y sinh");
		lblNgyThngNm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNgyThngNm.setBounds(24, 52+MARGIN_TOP, 113, 30);
		jPanel1.add(lblNgyThngNm);
		
		JLabel lblNguynQun = new JLabel("Nguy??n Qu??n:");
		lblNguynQun.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNguynQun.setBounds(24, 93+MARGIN_TOP, 99, 30);
		jPanel1.add(lblNguynQun);
		
		JLabel lblNghNghip = new JLabel("Ngh??? nghi???p:");
		lblNghNghip.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNghNghip.setBounds(24, 359, 100, 30);
		jPanel1.add(lblNghNghip);
		
		JLabel lblChiuS = new JLabel("H??? chi???u s???");
		lblChiuS.setBounds(466, 195, 85, 30);
		lblChiuS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jPanel1.add(lblChiuS);
		
		JLabel lblNiLmVic = new JLabel("N??i l??m vi???c:");
		lblNiLmVic.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNiLmVic.setBounds(466, 359, 127, 30);
		jPanel1.add(lblNiLmVic);
		
		JLabel lblGiiTnh = new JLabel("Gi???i t??nh:");
		lblGiiTnh.setBounds(466, 72, 65, 30);
		lblGiiTnh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jPanel1.add(lblGiiTnh);
		
		JLabel lblQucTch = new JLabel("Qu???c t???ch:");
		lblQucTch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQucTch.setBounds(466, 154, 65, 30);
		jPanel1.add(lblQucTch);
		
		JLabel lblNiThngCh = new JLabel("N??i th?????ng tr??:");
		lblNiThngCh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNiThngCh.setBounds(24, 215+MARGIN_TOP, 113, 30);
		jPanel1.add(lblNiThngCh);
		
		JLabel lblTnGio = new JLabel("T??n gi??o:");
		lblTnGio.setBounds(466, 113, 65, 30);
		lblTnGio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jPanel1.add(lblTnGio);
		
		JLabel lblSCmtcccd = new JLabel("S??? CMT/CCCD:");
		lblSCmtcccd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSCmtcccd.setBounds(24, 175+MARGIN_TOP, 113, 30);
		jPanel1.add(lblSCmtcccd);
		
		JLabel lblDnTc = new JLabel("D??n t???c:");
		lblDnTc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDnTc.setBounds(24, 134+MARGIN_TOP, 65, 30);
		jPanel1.add(lblDnTc);
		
		JLabel lblBitDanh = new JLabel("Bi???t danh:");
		lblBitDanh.setBounds(466, 31, 83, 30);
		lblBitDanh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jPanel1.add(lblBitDanh);
		
		JLabel lblaChHin = new JLabel("?????a ch??? hi???n t???i:");
		lblaChHin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblaChHin.setBounds(466, 235, 113, 30);
		jPanel1.add(lblaChHin);
		
		JLabel lblTrnhHc = new JLabel("Tr??nh ????? h???c v???n:");
		lblTrnhHc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTrnhHc.setBounds(24, 257+MARGIN_TOP, 113, 30);
		jPanel1.add(lblTrnhHc);
		
		JLabel lblNewLabel_5_1 = new JLabel("Tr??nh ????? chuy??n m??n:");
		lblNewLabel_5_1.setBounds(466, 277, 141, 30);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jPanel1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Bi???t ti???ng d??n t???c:");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5_2.setBounds(466, 318, 127, 30);
		jPanel1.add(lblNewLabel_5_2);
		
		JLabel lblTrnhNgoi = new JLabel("Tr??nh ????? ngo???i ng???:");
		lblTrnhNgoi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTrnhNgoi.setBounds(24, 318, 127, 30);
		jPanel1.add(lblTrnhNgoi);

		JLabel lblNewLabel_1 = new JLabel("(*)");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(UIManager.getColor("ToolBar.dockingForeground"));

		lblNewLabel_1.setBounds(400, 32, 30, 30);
		jPanel1.add(lblNewLabel_1);
		
		hoTenTxb = new JTextField();
		hoTenTxb.setBounds(150, 30, 240, 30);
		jPanel1.add(hoTenTxb);

		hoTenTxb.setColumns(10);
		
		danTocTxb = new JTextField();
		danTocTxb.setColumns(10);

		danTocTxb.setBounds(150, 154, 240, 30);
		jPanel1.add(danTocTxb);
		
		soCMTTxb = new JTextField();
		soCMTTxb.setColumns(10);
		soCMTTxb.setBounds(150, 195, 240, 30);
		jPanel1.add(soCMTTxb);
		
		trinhDoHocVanTxb = new JTextField();
		trinhDoHocVanTxb.setColumns(10);
		trinhDoHocVanTxb.setBounds(150, 277, 240, 30);
		jPanel1.add(trinhDoHocVanTxb);

		
		noiThuongTruTxb = new SuggestionUtility(false) {
			private static final long serialVersionUID = 1L;

			public List<String> getSuggestions(String textContent) {
				return null;
			}
		};
		noiThuongTruTxb.setEditable(false);
    
		noiThuongTruTxb.setBounds(150, 236, 220, 30);
		jPanel1.add(noiThuongTruTxb);

		
		thuongTruBtn = new JButton("Thuong Tru");
		thuongTruBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JtxReceiveAddress=noiThuongTruTxb;
				getAddressAction();
			}
		});
		thuongTruBtn.setBounds(370, 236, 20, 30);

		jPanel1.add(thuongTruBtn);
		
		trinhDoNgoaiNguTxb = new JTextField();
		trinhDoNgoaiNguTxb.setColumns(10);
		trinhDoNgoaiNguTxb.setBounds(150, 318, 240, 30);
		jPanel1.add(trinhDoNgoaiNguTxb);
		
		ngheNghiepTxb = new JTextField();
		ngheNghiepTxb.setColumns(10);
		ngheNghiepTxb.setBounds(150, 359, 240, 30);
		jPanel1.add(ngheNghiepTxb);

		
		JLabel lblNewLabel_1_1 = new JLabel("(*)");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setBounds(400, 72, 30, 30);

		jPanel1.add(lblNewLabel_1_1);

		
		JLabel lblNewLabel_1_1_1 = new JLabel("(*)");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.RED);
		lblNewLabel_1_1_1.setBounds(400, 112, 30, 30);

		jPanel1.add(lblNewLabel_1_1_1);

		
		JLabel lblNewLabel_1_1_2 = new JLabel("(*)");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setForeground(Color.RED);
		lblNewLabel_1_1_2.setBounds(400, 154, 30, 30);
    
		jPanel1.add(lblNewLabel_1_1_2);

		JLabel lblNewLabel_1_1_3 = new JLabel("(*)");
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3.setForeground(Color.RED);

		lblNewLabel_1_1_3.setBounds(400, 195, 30, 30);
		jPanel1.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel(" (*)");
		lblNewLabel_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_4.setForeground(Color.RED);
		lblNewLabel_1_1_4.setBounds(400, 236, 30, 30);
		jPanel1.add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("(*)");
		lblNewLabel_1_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_5.setForeground(Color.RED);
		lblNewLabel_1_1_5.setBounds(400, 278, 30, 30);
		jPanel1.add(lblNewLabel_1_1_5);
		
		JLabel lblNewLabel_1_1_6 = new JLabel("(*)");
		lblNewLabel_1_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_6.setForeground(Color.RED);
		lblNewLabel_1_1_6.setBounds(400, 318, 30, 30);
		jPanel1.add(lblNewLabel_1_1_6);
		
		JLabel lblNewLabel_1_1_6_1 = new JLabel("(*)");
		lblNewLabel_1_1_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_6_1.setForeground(Color.RED);
		lblNewLabel_1_1_6_1.setBounds(400, 360, 30, 30);
		jPanel1.add(lblNewLabel_1_1_6_1);
		
		gioiTinhCbb = new JComboBox<String>();
		gioiTinhCbb.setBounds(616, 72, 113, 30);
		gioiTinhCbb.addItem("Nam");		
		gioiTinhCbb.addItem("N???");
		gioiTinhCbb.setFont(new Font("Tohama",0,14));
		jPanel1.add(gioiTinhCbb);
		
		bietDanhTxb = new JTextField();
		bietDanhTxb.setColumns(10);
		bietDanhTxb.setBounds(616, 30, 240, 30);
		jPanel1.add(bietDanhTxb);
		
		tonGiaoTxb = new JTextField();
		tonGiaoTxb.setColumns(10);
		tonGiaoTxb.setBounds(616, 113, 240, 30);
		jPanel1.add(tonGiaoTxb);
		
		quocTichTxb = new SuggestionUtility(false) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public List<String> getSuggestions(String textContent) {
				return null;
			}
		};

		quocTichTxb.setBounds(616, 154, 240, 30);
		jPanel1.add(quocTichTxb);
		
		soHoChieuTxb = new JTextField();
		soHoChieuTxb.setColumns(10);
		soHoChieuTxb.setBounds(616, 198, 240, 30);
		jPanel1.add(soHoChieuTxb);

		
		diaChiHienNayTxb = new SuggestionUtility(false) {
			private static final long serialVersionUID = 1L;

			public List<String> getSuggestions(String textContent) {
				return null;
			}
		};
		diaChiHienNayTxb.setEnabled(false);

		diaChiHienNayTxb.setBounds(616, 236, 220, 30);
		jPanel1.add(diaChiHienNayTxb);
		
		JButton diaChiBtn = new JButton("New button");
		diaChiBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JtxReceiveAddress = diaChiHienNayTxb;
				getAddressAction();	
			}
		});
		diaChiBtn.setBounds(836, 237, 20, 30);
		jPanel1.add(diaChiBtn);
		
		trinhDoChuyenMonTxb = new JTextField();
		trinhDoChuyenMonTxb.setColumns(10);
		trinhDoChuyenMonTxb.setBounds(616, 277, 240, 30);
		jPanel1.add(trinhDoChuyenMonTxb);
		
		bietTiengDanTocTxb = new JTextField();
		bietTiengDanTocTxb.setColumns(10);
		bietTiengDanTocTxb.setBounds(616, 318, 240, 30);
		jPanel1.add(bietTiengDanTocTxb);
		
		noiLamViecTxb = new JTextField();
		noiLamViecTxb.setColumns(10);
		noiLamViecTxb.setBounds(616, 359, 240, 30);
		jPanel1.add(noiLamViecTxb);
		
		khacBtn = new JButton("Kh??c...");
		khacBtn.setBounds(150, 415, 127, 30);

		khacBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        khacBtn.setBackground(new Color(147, 112, 219));
        khacBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
        khacBtn.setForeground(new Color(255, 255, 255));
        khacBtn.setBorderPainted(false);
		jPanel1.add(khacBtn);
		
		CancelBtn = new JButton("Cancel");
		CancelBtn.setBounds(626, 415, 89, 30);

		CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

		CancelBtn.setBackground(new Color(147, 112, 219));
		CancelBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		CancelBtn.setForeground(new Color(255, 255, 255));
		CancelBtn.setBorderPainted(false);
		jPanel1.add(CancelBtn);
		
		CreateBtn = new JButton("Create");
		CreateBtn.setBounds(736, 415, 89, 30);

		CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBtnActionPerformed(evt);
            }
        });

		CreateBtn.setBackground(new Color(147, 112, 219));
		CreateBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		CreateBtn.setForeground(new Color(255, 255, 255));
		CreateBtn.setBorderPainted(false);
		jPanel1.add(CreateBtn);

	}
	
	void close() {
		if (JOptionPane.showConfirmDialog(null, "Are you sure to close??", "Warning!!", JOptionPane.YES_NO_OPTION) == 0) {
	        this.parentFrame.setEnabled(true);
	        dispose();		
		}
    }
	
    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
       close();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ProfileFrame tieuSuJFrame = new ProfileFrame(this, this.nhanKhauBean);
        tieuSuJFrame.setLocationRelativeTo(null);
        tieuSuJFrame.setResizable(false);
        tieuSuJFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private boolean validateValueInForm() {
        // check null
        if (hoTenTxb.getText().trim().isEmpty() 
                || nguyenQuanTxb.getText().trim().isEmpty()
                || tonGiaoTxb.getText().trim().isEmpty()
                || danTocTxb.getText().trim().isEmpty()
                || quocTichTxb.getText().trim().isEmpty()
                || soCMTTxb.getText().trim().isEmpty()
                || noiThuongTruTxb.getText().trim().isEmpty()
                || diaChiHienNayTxb.getText().trim().isEmpty()
                || trinhDoHocVanTxb.getText().trim().isEmpty()
                || trinhDoChuyenMonTxb.getText().trim().isEmpty()
                || trinhDoNgoaiNguTxb.getText().trim().isEmpty()
                || bietTiengDanTocTxb.getText().trim().isEmpty()
                || ngheNghiepTxb.getText().trim().isEmpty()
                || noiLamViecTxb.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Vui l??ng nh???p h???t c??c tr?????ng b???t bu???c", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        // check dinh dang so chung minh thu
        try {
                long d = Long.parseLong(soCMTTxb.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "S??? CMT kh??ng th??? ch???a c??c k?? t???", "Warning", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        // kiem tra do dai cmt
        if (soCMTTxb.getText().length() != 9 && soCMTTxb.getText().length() != 12) {
            JOptionPane.showMessageDialog(rootPane, "Vui l??ng nh???p ????ng ?????nh d???ng CMT", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        if (validateValueInForm()) {
        	
            NhanKhauModel temp = this.nhanKhauBean.getNhanKhauModel();
            ChungMinhThuModel cmt = this.nhanKhauBean.getChungMinhThuModel();
            temp.setBietDanh(bietDanhTxb.getText());
            temp.setHoTen(hoTenTxb.getText());
            temp.setNamSinh(namSinhDateC.getDate());
            temp.setGioiTinh(gioiTinhCbb.getSelectedItem().toString());
            temp.setNguyenQuan(nguyenQuanTxb.getText());
            temp.setTonGiao(tonGiaoTxb.getText());
            temp.setDanToc(danTocTxb.getText());
            temp.setQuocTich(quocTichTxb.getText());
            cmt.setSoCMT(soCMTTxb.getText());
            temp.setSoHoChieu(soHoChieuTxb.getText());
            temp.setNoiThuongTru(noiThuongTruTxb.getText());
            temp.setDiaChiHienNay(diaChiHienNayTxb.getText());
            temp.setTrinhDoHocVan(trinhDoHocVanTxb.getText());
            temp.setTrinhDoChuyenMon(trinhDoChuyenMonTxb.getText());
            temp.setTrinhDoNgoaiNgu(trinhDoNgoaiNguTxb.getText());
            temp.setBietTiengDanToc(bietTiengDanTocTxb.getText());
            temp.setNgheNghiep(ngheNghiepTxb.getText());
            temp.setNoiLamViec(noiLamViecTxb.getText());
            temp.setIdNguoiTao(LoginController.currentUser.getID());
            try {
                if (this.controller.addNewPeople(this.nhanKhauBean)) {
                    JOptionPane.showMessageDialog(null, "Th??m th??nh c??ng!!");
                    close();
                    parentController.refreshData();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(rootPane, "C?? l???i x???y ra. Vui long ki???m tra l???i!!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_CreateBtnActionPerformed
    
    private void getAddressAction() {
		addrSuggestion = new AddressSuggestion(this,addrModel) {
			private static final long serialVersionUID = 1L;

			@Override
			public void emmitToParent() {
				String address= this.getAddress();
				JtxReceiveAddress.setText(address);
			}
		};
		addrSuggestion.setVisible(true);
    }
    
}