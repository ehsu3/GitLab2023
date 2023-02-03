package edu.unl.raikes.git;

import java.util.Arrays;

public class GitLabHelper {
    
   private String[] persons;
   
   GitLabHelper(String[] persons){
       this.persons = persons;
   }
   
   public void PrintWelcomeMessage() {
       System.out.printf("This is a lesson on git made by: %s", Arrays.toString(persons));
       System.out.println("John Mayer is actually a very valid musician.");

   }
}