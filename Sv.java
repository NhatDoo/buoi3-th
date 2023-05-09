
package sv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sv {
String tensv;
String msv;
Date namsinh; 
    public Sv(){}
    public Sv(String tensv, String msv, Date namsinh) {
        this.tensv = tensv;
        this.msv = msv;
        this.namsinh = namsinh;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public Date getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(Date namsinh) {
        this.namsinh = namsinh;
    }
}
class list
{
ArrayList<Sv> list = new ArrayList<>();
SimpleDateFormat d = new SimpleDateFormat("dd-mm-yyyy");
void nhap()
{
    do
    {
Scanner sc = new Scanner(System.in);
System.out.println("nhap ma sinh vien ");
String msv = sc.nextLine();
if(msv == null || msv.equals(""))
{
break;
}
System.out.println("nhap ten sinh vien");
String tsv = sc.nextLine();
System.out.println("nhap nam sinh ");
String ngay = sc.nextLine();
Date ns = null;
    try {
         ns = d.parse(ngay);
    } catch (ParseException ex) {
    }
    Sv sv = new Sv(tsv,msv,ns);
    list.add(sv);
    }
    while(true);
     
}
void xuat()
{
 System.out.println("ten sinh vien     ||      masinhvien    ||    nam sinh");
 for (Sv sv : list)
 {
  System.out.printf(" %s             ||            %s        ||   %s \n",sv.tensv,sv.msv,sv.namsinh);
 } 
}
void sua()
{
 SimpleDateFormat d = new SimpleDateFormat("dd-mm-yyyy");
 Sv sv = new Sv();
 if(list.size() > 0)
     {
     System.out.println("nhap ma thay doi");
     Scanner sc = new Scanner(System.in);
     String tk = sc.nextLine();
     Sv pctim = null;
     for(Sv pc :list )
     {
       if(pc.msv.equalsIgnoreCase(tk))
       {
        pctim = pc;
       }
       break;
     }
     if(pctim !=null)
     {
      System.out.println("chon du lieu can thay doi 1: tensv , 2 ngaysinh ");
      int n =sc.nextInt();
      switch(n)
      {
          case 1: sv.msv = pctim.msv;
                  sv.namsinh =pctim.namsinh;
                  pctim.tensv =sc.nextLine();break;
          case 2: sv.msv = pctim.msv;
                  sv.tensv =pctim.tensv;
                  String ngay = sc.nextLine();
                  pctim.namsinh = null;
              try {
                  pctim.namsinh = d.parse(ngay);
              } catch (ParseException ex) {
              }
          

      }
     }
}
}
void xoa()
{
 if(list.size()>0)
     {
     System.out.println("nhap ma sinh vien  can xoa");
     Scanner sc = new Scanner(System.in);
     String tk = sc.nextLine();
     Sv pctim = null;
     for(Sv pc : list )
     {
       if(pc.getMsv().equalsIgnoreCase(tk))
       {
        pctim = pc;
       }
       break;
     }
     if(pctim !=null)
     {
      list.remove(pctim);
      System.out.println("Xoa Thanh Cong");
     }
     }

}
}
class main
{
 public static void main(String[] arg)
 {
  int n;
  Scanner sc = new Scanner(System.in);
  list l = new list();
  do
  {
       n = sc.nextInt();
      switch(n)
      {
          case 1 : l.nhap();break;
          case 2: l.xuat();break;
          case 3 : l.xoa();break;
          case 4: l.sua();break;
      }
  }
  while(true);
 }

}