
package bai.thuc.hanh.buoi.pkg3;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public abstract class hanghoa 
{
 String tenhang;
 String mahang;
 int soluong;
 double dongia;
public hanghoa(){}
    public String getTenhang() {
        return tenhang;
    }
    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }
    public String getMahang() {
        return mahang;
    }
    public void setMahang(String mahang) {
        this.mahang = mahang;
    }
    public int getSoluong() {
        return soluong;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public double getDongia() {
        return dongia;
    }
    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    public hanghoa(String tenhang, String mahang, int soluong, double dongia) {
        this.tenhang = tenhang;
        this.mahang = mahang;
        this.soluong = soluong;
        this.dongia = dongia;
    }
    abstract void VAT();
    abstract void tonkho();
}
class hangthucpham extends hanghoa
{
    Date ngaysanxuat,ngayhethan;
    String nhacungcap;
    public hangthucpham(String tenhang, String mahang, int soluong, double dongia, Date nsx ,Date nhh) {
        super(tenhang, mahang, soluong, dongia);
    }

    public Date getNgaysanxuat() {
        return ngaysanxuat;
    }

    public void setNgaysanxuat(Date ngaysanxuat) {
        this.ngaysanxuat = ngaysanxuat;
    }

    public Date getNgayhethan() {
        return ngayhethan;
    }

    public void setNgayhethan(Date ngayhethan) {
        this.ngayhethan = ngayhethan;
    }

    public String getNhacungcap() {
        return nhacungcap;
    }
    public void setNhacungcap(String nhacungcap) {
        this.nhacungcap = nhacungcap;
    }
    @Override
    void VAT(){}
    @Override
    void tonkho(){}
}
class hangdienmay extends hanghoa{
    Date thoigian;
    double cx;
    public hangdienmay(String tenhang, String mahang, int soluong, double dongia) {
        super(tenhang, mahang, soluong, dongia);
    }

    public Date getThoigian() {
        return thoigian;
    }

    public void setThoigian(Date thoigian) {
        this.thoigian = thoigian;
    }

    public double getCx() {
        return cx;
    }
    public void setCx(double cx) {
        this.cx = cx;
    }
    @Override
    void VAT(){}
    @Override
    void tonkho(){}
}
class hangsu extends hanghoa{
    Date ngaynhapkho;
    String xuatxu;
    public hangsu(String tenhang, String mahang, int soluong, double dongia) {
        super(tenhang, mahang, soluong, dongia);
    }
    public Date getNgaynhapkho() {
        return ngaynhapkho;
    }
    public void setNgaynhapkho(Date ngaynhapkho) {
        this.ngaynhapkho = ngaynhapkho;
    }
    public String getXuatxu() {
        return xuatxu;
    }
    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }
    @Override
    void VAT()
    {
    }
    @Override
    void tonkho(){}
    }
class list 
{
ArrayList <hangthucpham> lhtp = new ArrayList<>();
ArrayList <hangdienmay> lhdm = new ArrayList<>();
ArrayList <hangsu> lhs = new ArrayList<>();
void nhap()
{
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int i=0;
  SimpleDateFormat sp = new SimpleDateFormat("dd-MM-yyyy");
  switch (n)
  {
      case 1:
          do{
           
            System.out.println("nhap ma san pham");
            String masp = sc.next();
            if(masp==null || masp.equals(""))
            {
             break;
            }
            System.out.println("nhap ten san pham");
            String tensp =sc.next();
            System.out.println("nhap don gia");
            double dg =sc.nextDouble();
             System.out.println("nhap so luong ");
            int sl =sc.nextInt();
            Date nsx = null,nhh = null;
              System.out.println("nhap ngay ");
            try
            {
            nsx = sp.parse(sc.nextLine());
            nhh = sp.parse(sc.nextLine());
            }catch(Exception e){}
            hangthucpham htp = new hangthucpham(tensp,masp,sl,dg,nsx ,nhh);
            lhtp.add(htp);
            i++;
            }
            while(true);
            
  }
}       
}
class main
 {
   public static void main(String[] arg)
   {
   list l = new list();
   l.nhap();
   
   
   }



}
 