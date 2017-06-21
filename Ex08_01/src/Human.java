	
public class Human {
		private static int cnt = 0;
		
		private String name = " ";
		private int height = 1;
		private double weight = 1;
		private int id = 0;
		
		{
			id = cnt++;
		}
		
		public Human(){
		}
		public Human(String name){
			this.name = name;
		}
		public Human(String name, int height){
			this(name);
			this.height = height;
		}
		public Human(String name, int height, double weight){
			this(name, height);
			this.weight = weight;
		}
		public Human(Human h){
			this(h.name, h.height, h.weight);
		}
		public int getId(){
			return id;
		}
		public  String getName(){
			return name;
		}
		
		public  int getHeight(){
			return height; 
		}
		
		public  double getWeight(){
			return weight;
		}
		
		public String getAll(){
			return String.format("아이디: %3d 이름: %s 키: %3d 몸무게: %3.2f", id, name, height, weight);
		}
		
		public void setName(String name){
			this.name = name;
		}
		public void setHeight(int height){
			this.height = height;
		}
		public void setWeight(double weight){
			this.weight = weight;
		}
		public void setAll(String name, int height, double weight){
			setName(name);
			setHeight(height);
			setWeight(weight);
		}
		
		public double eat(int foodNum){
			int[] kal = {797, 773, 688, 500, 2000, 450, 380, 670, 331, 300};
			
			weight += (double)(kal[foodNum] / 7)/ 1000;
			
			return weight;
		}
		
		public double exercise(int n){
			int[] kal = {196, 196, 273, 126, 186, 90, 200, 180, 200, 224};
			
			weight -= (double) (kal[n] / 7) /1000;
			
			return weight;
		}
		
		public String toBMI(){
			
			String[] str = new String[] {"체중 부족", "정상", "과체중", "비만"};
			
			return str[BMI()];
		}
		
		public int BMI(){
			double h= (double) height/100;
			double BMI = weight / ( h * h );
			
			if(BMI < 18.5){
				return 0;
			} else if(BMI > 18.5 && BMI < 22.9){
				return 1;
			} else if(BMI > 23.0 && BMI < 24.9){
				return 2;
			} else if(BMI > 25.0){
				return 3;
			}
			return -1;
		}
}
