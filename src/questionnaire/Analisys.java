package questionnaire;

public class Analisys {
	
	private String name,can,like;
	
	public void setName(String name,String sur){
		
		this.name = name+" "+sur;
		
	}
	
	
	public void setAge(String age,String sex,String sin){
		
		if(age.equals("<15")&&sex.equals("���")){
			this.name = "�.�."+name;
		}else if(age.equals("<15")&&sex.equals("˭ԧ")){
			
			this.name = "�.�."+name;
		}else if(age.equals("15-17")&&sex.equals("���")){
			
			this.name = "���"+name;
		}else if(age.equals("15-17")&&sex.equals("˭ԧ")&&sin.equals("�ʴ")){
			this.name = "�ҧ���"+name;
		}else if(age.equals("18-20")&&sex.equals("���")){
			
			this.name = "���"+name;
		}else if(age.equals("18-20")&&sex.equals("˭ԧ")&&sin.equals("�ʴ")){
			this.name = "�ҧ���"+name;
		}else if(age.equals(">20")&&sex.equals("���")){
			this.name = "���"+name;
		}else if(age.equals(">20")&&sex.equals("˭ԧ")&&sin.equals("�ʴ")){
			this.name = "�ҧ���"+name;
		}else if(age.equals("15-17")&&sex.equals("˭ԧ")&&sin.equals("�觧ҹ")){
			this.name = "�ҧ"+name;
		}else if(age.equals("18-20")&&sex.equals("˭ԧ")&&sin.equals("�觧ҹ")){
			this.name = "�ҧ"+name;
		}else if(age.equals(">20")&&sex.equals("˭ԧ")&&sin.equals("�觧ҹ")){
			this.name = "�ҧ"+name;
		}else if(age.equals("15-17")&&sex.equals("˭ԧ")&&sin.equals("������ҧ")){
			this.name = "�ҧ"+name;
		}else if(age.equals("18-20")&&sex.equals("˭ԧ")&&sin.equals("������ҧ")){
			this.name = "�ҧ"+name;
		}else if(age.equals(">20")&&sex.equals("˭ԧ")&&sin.equals("������ҧ")){
			this.name = "�ҧ"+name;
		}else{
			this.name = "�س"+name;
		}
		
	}
	
	public void setCan(String age){
		
		if(age.equals("<15")){
			can = "\n -�س�������ö�����������";
		}else if(age.equals("15-17")){
			can = "\n -�س����ö����觵�ҧ � �ѧ���\n1.�ѵû�ЪҪ�\n 2.㺢Ѻ���";
		}else if(age.equals("18-20")){
			can = "\n -�س����ö����觵�ҧ � �ѧ���\n1.�ѵû�ЪҪ�\n 2.㺢Ѻ��� \n 3.���͡��� ";
		}else if(age.equals(">20")){
			can = "\n -�س����ö����觵�ҧ � �ѧ���\n1.�ѵû�ЪҪ�\n 2.㺢Ѻ��� \n 3.���͡���  \n 4.�Եԡ������µ��ͧ";
		}
		
	}
	
	public void setLike(String like1,String like2,String like3){
		
		if(like1.equals("")&&like2.equals("")&&like3.equals("")){
			like = "\n -�س���ͺ���������!!!";
		}else if(like1.equals("��¹�����")&&like2.equals("")&&like3.equals("")){
			like = "\n -�س�ͺ��¹�����";
		}else if(like1.equals("��¹�����")&&like2.equals("��ҹ˹ѧ���")&&like3.equals("")){
			like = "\n -�س�ͺ��¹����� �����ҹ˹ѧ��� ";
		}else if(like1.equals("��¹�����")&&like2.equals("��ҹ˹ѧ���")&&like3.equals("�������")){
			like = "\n -�س�ͺ��¹����� ��ҹ˹ѧ��� ����������";
		}else if(like1.equals("")&&like2.equals("��ҹ˹ѧ���")&&like3.equals("�������")){
			like = "\n -�س�ͺ��ҹ˹ѧ��� ����������";
		}else if(like1.equals("")&&like2.equals("")&&like3.equals("�������")){
			like = "\n -�س�ͺ�������";
		}else if(like1.equals("��¹�����")&&like2.equals("")&&like3.equals("�������")){
			like = "\n -�س�ͺ��¹����� ����������";
		}else if(like1.equals("��¹�����")&&like2.equals("��ҹ˹ѧ���")&&like3.equals("")){
			like = "\n -�س�ͺ��¹����� �����ҹ˹ѧ���";
		}else if(like1.equals("")&&like2.equals("��ҹ˹ѧ���")&&like3.equals("�������")){
			like = "\n -�س�ͺ���ҹ˹ѧ��� ����������";
		}else if(like1.equals("")&&like2.equals("��ҹ˹ѧ���")&&like3.equals("")){
			like = "\n -�س�ͺ��ҹ˹ѧ���";
		}
		
		
	}
	
	public String getName(){
		
		return name;
	}
	
	public String getCan(){
		return can;
	}
	
	public String getLike(){
		return like;
	}

}
