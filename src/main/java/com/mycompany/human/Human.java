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
    private Integer arms = 2;
    private Boolean educated;
    private String say = "nnnngggg";
    private String name;

    public Human(String name) {
        this.name = name;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    
    
    public String say(String in){ 
           in = say;
           return say;
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

