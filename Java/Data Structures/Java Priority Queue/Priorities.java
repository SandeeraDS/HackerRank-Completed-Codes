import java.util.*;

class Srting implements Comparator<Student>{
    
    public int compare(Student s1,Student s2){
        
        if(s1.getCGPA()==s2.getCGPA()){
            
            if(s1.getName().compareTo(s2.getName())==0){
                
                if(s1.getID()==s2.getID()){
                    return 0;
                }
                else if(s1.getID()>s2.getID()){
                    return 1;
                }
                else{
                    return -1;
                }
                
            }
            else{
                return s1.getName().compareTo(s2.getName());
            }
        }
        else if(s1.getCGPA()>s2.getCGPA()){
            return -1;
        }
        else{
            return 1;
        }
    }
}


class Student{
    
    int id;
    String name;
    double cgpa;
    
    public Student(int id, String name, double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
    
    int getID(){
        return id;
    }
    
    String getName(){
        return name;
    }
    
    double getCGPA(){
        return cgpa;
    }
    
}


class  Priorities{
    
    List<Student> getStudents(List<String> events){
        
       // Student std = new Student();
        
        String name;
        double cgpa;
        int id;      
         List<Student> stList = new ArrayList<>();
        
        for(String s:events){
            
            String query=s.trim();
            
            String[] arry=s.split(" ");
            
            if(arry[0].equals("ENTER")){
                name=arry[1];
                cgpa=Double.parseDouble(arry[2]);
                id=Integer.parseInt(arry[3]);
                
                stList.add(new Student(id,name,cgpa));
            }
            else{
                Collections.sort(stList,new Srting());
               
                if(!stList.isEmpty())
                stList.remove(0);
                    
            }
        }
        
       
        
        return stList;
    }
}
