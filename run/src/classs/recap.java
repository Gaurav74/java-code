/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs;

/**
 *
 * @author HP
 */
public class recap {
    int a,b,c;
   public static int m=0;
   int length,breadth,height;
    recap(recap re){
    length=re.length;
    breadth=re.breadth;
    height=re.height;
    }    
    
   /*public recap(){
        length=a;
        breadth=b;
        height=c;   
    }*/
    recap(int i){
        length=i;
        breadth=i;
        height=i;
      //  return (height*length*breadth);
    System.out.println("volume is="+i*i*i);
 
    }
   
    recap(int q,int w,int e){
        length=q;
        breadth=w;
        height=e;
        m++;                  //static used to provide all class as public
        System.out.println("volume is="+length*breadth*height);
    }
    public int vol(){
        return length*breadth*height;
    }
    protected void finalize(){
            System.out.println("this is the last command executed");    
}
        }
class done{
     public static void main(String[] args){
         int a=2,b=3,c=5;
//recap ro1=new recap();
recap ro2=new recap(2);
recap ro3=new recap(1,3,5);
recap ro4=new recap(ro3);
next ro6=new next(1,2,3,4);
System.out.println("peri="+ro6.peri());
/*recap ro5=new recap(){
    @override public int vol(){
        return length+breadth+height;
    }
};*/
//System.out.println("vol="+ro1.vol());
     System.out.println("vol="+ro4.vol());
       System.out.println(recap.m);
     
}}
class next extends recap{
    int time;
    next(int q,int w,int e,int r){
        super(q,w,e);
        time=r;
    }
    next(next nt){
        super (nt);
        time=nt.time;
    }
    public int peri(){
        return length+breadth+height+time;
    }
}
