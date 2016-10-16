class Student extends Person{
	private int[] scores;
 
    
    
    public Student(String fName,String lName, int id, int[] testScores){
        
       super(fName,lName,id);
       this.scores= testScores;
              
    }
    
    public int getTotalScore(){
        int grades=0;
        for (int i=0; i<scores.length; i++){
            grades+=scores[i];
        }  
            return grades;
    }
       
    
    
   
      
    
    public String Calculate()
     {
       
       int grades=this.getTotalScore(); 
       int avg=0;
       
       
        avg=grades/scores.length-1;
        
        if(avg<=100 && avg>=90){
            return "Grade: O";
        }
        else if(avg<90 && avg>=80){
            return "Grade: E";
        }
        else if(avg<80 && avg>=70){
            return "Grade: A";
        }
        else if(avg<70 && avg>=55){
            return "Grade: P";
        }
        else if(avg<55 && avg >=40){
            return "Grade: D";
        }
        else{
            return "Grade: T";
        }
        
        
    }
    
}