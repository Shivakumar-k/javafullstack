package com.xworkz.practice;
import java.util.*;
public class Delete {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		char[] ch=str.toCharArray();
		char[] ch1=str1.toCharArray();
		String estr="";
		String estr1="";
		
		String nstr="";
		String nstr1="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				estr=estr+ch[i];
			}
			else
				nstr=nstr+ch[i];
		}
		char[] chnstr=nstr.toCharArray();
		for(int i=0;i<chnstr.length-1;i++)
		{
			for(int j=i+1;j<=chnstr.length-1;j++)
			{
				if(chnstr[i]>chnstr[j])
				{
					char temp=chnstr[i];
					chnstr[i]=chnstr[j];
					chnstr[j]=temp;
				}
			}
		}
			String hstr=new String(chnstr);

		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]==' ')
			{
				estr1=estr1+ch1[i];
			}
			else
				nstr1=nstr1+ch1[i];
		}
		char[] chnstr1=nstr1.toCharArray();
		for(int i=0;i<chnstr1.length-1;i++)
		{
			for(int j=i+1;j<chnstr1.length-1;j++)
			{
				if(chnstr1[i]>chnstr1[j])
				{
					char temp1=chnstr1[i];
					chnstr1[i]=chnstr1[j];
					chnstr1[j]=temp1;
				}
			}
		}
		String hstr1=new String(chnstr1);
		System.out.println(hstr1);
		
		if(hstr.equals(hstr1))
		//if(hstr.equals(hstr1))
		{
			System.out.println("same");
		}
		else
			System.out.println("not same");
//		System.out.println(nstr1);
//		System.out.print(hstr1);
//		
		
	}

}
