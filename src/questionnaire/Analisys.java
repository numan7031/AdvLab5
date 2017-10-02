package questionnaire;

public class Analisys {
	
	private String name,can,like;
	
	public void setName(String name,String sur){
		
		this.name = name+" "+sur;
		
	}
	
	
	public void setAge(String age,String sex,String sin){
		
		if(age.equals("<15")&&sex.equals("ชาย")){
			this.name = "ด.ช."+name;
		}else if(age.equals("<15")&&sex.equals("หญิง")){
			
			this.name = "ด.ญ."+name;
		}else if(age.equals("15-17")&&sex.equals("ชาย")){
			
			this.name = "นาย"+name;
		}else if(age.equals("15-17")&&sex.equals("หญิง")&&sin.equals("โสด")){
			this.name = "นางสาว"+name;
		}else if(age.equals("18-20")&&sex.equals("ชาย")){
			
			this.name = "นาย"+name;
		}else if(age.equals("18-20")&&sex.equals("หญิง")&&sin.equals("โสด")){
			this.name = "นางสาว"+name;
		}else if(age.equals(">20")&&sex.equals("ชาย")){
			this.name = "นาย"+name;
		}else if(age.equals(">20")&&sex.equals("หญิง")&&sin.equals("โสด")){
			this.name = "นางสาว"+name;
		}else if(age.equals("15-17")&&sex.equals("หญิง")&&sin.equals("แต่งงาน")){
			this.name = "นาง"+name;
		}else if(age.equals("18-20")&&sex.equals("หญิง")&&sin.equals("แต่งงาน")){
			this.name = "นาง"+name;
		}else if(age.equals(">20")&&sex.equals("หญิง")&&sin.equals("แต่งงาน")){
			this.name = "นาง"+name;
		}else if(age.equals("15-17")&&sex.equals("หญิง")&&sin.equals("หย่าร้าง")){
			this.name = "นาง"+name;
		}else if(age.equals("18-20")&&sex.equals("หญิง")&&sin.equals("หย่าร้าง")){
			this.name = "นาง"+name;
		}else if(age.equals(">20")&&sex.equals("หญิง")&&sin.equals("หย่าร้าง")){
			this.name = "นาง"+name;
		}else{
			this.name = "คุณ"+name;
		}
		
	}
	
	public void setCan(String age){
		
		if(age.equals("<15")){
			can = "\n -คุณไม่สามารถทำอะไรได้เลย";
		}else if(age.equals("15-17")){
			can = "\n -คุณสามารถทำสิ่งต่าง ๆ ดังนี้\n1.บัตรประชาชน\n 2.ใบขับขี่";
		}else if(age.equals("18-20")){
			can = "\n -คุณสามารถทำสิ่งต่าง ๆ ดังนี้\n1.บัตรประชาชน\n 2.ใบขับขี่ \n 3.เลือกตั้ง ";
		}else if(age.equals(">20")){
			can = "\n -คุณสามารถทำสิ่งต่าง ๆ ดังนี้\n1.บัตรประชาชน\n 2.ใบขับขี่ \n 3.เลือกตั้ง  \n 4.นิติกรรมด้วยตนเอง";
		}
		
	}
	
	public void setLike(String like1,String like2,String like3){
		
		if(like1.equals("")&&like2.equals("")&&like3.equals("")){
			like = "\n -คุณไม่ชอบทำอะไรเลย!!!";
		}else if(like1.equals("เขียนโปรแกรม")&&like2.equals("")&&like3.equals("")){
			like = "\n -คุณชอบเขียนโปรแกรม";
		}else if(like1.equals("เขียนโปรแกรม")&&like2.equals("อ่านหนังสือ")&&like3.equals("")){
			like = "\n -คุณชอบเขียนโปรแกรม และอ่านหนังสือ ";
		}else if(like1.equals("เขียนโปรแกรม")&&like2.equals("อ่านหนังสือ")&&like3.equals("เล่นเกมส์")){
			like = "\n -คุณชอบเขียนโปรแกรม อ่านหนังสือ และเล่นเกมส์";
		}else if(like1.equals("")&&like2.equals("อ่านหนังสือ")&&like3.equals("เล่นเกมส์")){
			like = "\n -คุณชอบอ่านหนังสือ และเล่นเกมส์";
		}else if(like1.equals("")&&like2.equals("")&&like3.equals("เล่นเกมส์")){
			like = "\n -คุณชอบเล่นเกมส์";
		}else if(like1.equals("เขียนโปรแกรม")&&like2.equals("")&&like3.equals("เล่นเกมส์")){
			like = "\n -คุณชอบเขียนโปรแกรม และเล่นเกมส์";
		}else if(like1.equals("เขียนโปรแกรม")&&like2.equals("อ่านหนังสือ")&&like3.equals("")){
			like = "\n -คุณชอบเขียนโปรแกรม และอ่านหนังสือ";
		}else if(like1.equals("")&&like2.equals("อ่านหนังสือ")&&like3.equals("เล่นเกมส์")){
			like = "\n -คุณชอบะอ่านหนังสือ และเล่นเกมส์";
		}else if(like1.equals("")&&like2.equals("อ่านหนังสือ")&&like3.equals("")){
			like = "\n -คุณชอบอ่านหนังสือ";
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
