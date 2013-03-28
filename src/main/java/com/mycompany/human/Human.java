/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.human;

/**
 *
 * @author james
 */
public class  Human extends Mammal{

    static Integer age = 0;
    Integer arms = 2;
    Boolean educated;
    String say = "nnnngggg";
   
    
    
    public String say(String in){ 
           in = say;
           return say;
    }
        public void educatedSpeak(String in){
         in = "unghh";
    }
    
     public void unEducatedSpeak(String in){
           in = "unghh";
    }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Integer getArms() {
            return arms;
        }

        public void setArms(Integer arms) {
            this.arms = arms;
        }

        public Boolean getEducated() {
            return educated;
        }

        public void setEducated(Boolean educated) {
            this.educated = educated;
        }

        public String getSay() {
            return say;
        }

        public void setSay(String say) {
            this.say = say;
        }
     
     
}

