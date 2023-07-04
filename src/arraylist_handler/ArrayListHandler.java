/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist_handler;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author jdev1
 */
public class ArrayListHandler extends JFrame {

    //---Schedule management---//
    private static final ArrayList<String> class_name = new ArrayList<>();
    private static final ArrayList<String> start_date = new ArrayList<>();
    private static final ArrayList<String> end_date   = new ArrayList<>();

    public static ArrayList<String> getClass_name() {
        return class_name;
    }

    public static ArrayList<String> getStart_date() {
        return start_date;
    }

    public static ArrayList<String> getEnd_date() {
        return end_date;
    }
    private static boolean classMatched = false;
    private static boolean scheduleEmpty = false;
    private static int count;
    //---end of Schedule management attributes---/
    
    //---Task management---/
    private static final ArrayList<String> task_name = new ArrayList<>();
    private static final ArrayList<String> task_start_date = new ArrayList<>();
    private static final ArrayList<String> task_end_date   = new ArrayList<>();
    private static final ArrayList<String> task_complete  = new ArrayList<>();

    public static ArrayList<String> getTask_name() {
        return task_name;
    }

    public static ArrayList<String> getTaskStart_date() {
        return task_start_date;
    }

    public static ArrayList<String> getTaskEnd_date() {
        return task_end_date;
    }
   
    // May need this for setting the task complet
    private static boolean taskMatched = false;

    public static boolean isTaskComplete() {
        return taskComplete;
    }

    public static void setTaskComplete(boolean taskComplete) {
        ArrayListHandler.taskComplete = taskComplete;
    }
    private static boolean taskComplete = false;
    private static boolean taskEmpty = false;
    private static int task_count;
    
    /* With progress tracking and task using the same task I thought it best to use this in conjunction with task management*/
    //---Progress Tracking---//
    private static final ArrayList<Integer> task_percentage  = new ArrayList<>();
    //--- end of addition of progresstacking arraylist---//
    
//---End of task management attributes---/
    //---start of resource management attributes---//
    private static final ArrayList<String> resource_name = new ArrayList<>();
    
    public static ArrayList<String> getResource_name() {
        return resource_name;
    }

    private static boolean resourceMatched = false;
    private static boolean resourceEmpty = false;
    private static int resource_count;
    
    //---end of resource management---//

    private ArrayListHandler() {
        // constructor code
    }
    //---Schedule management methods---//
    public static void addClass(String classname, String startdate, String enddate) {
       
        if(class_name.isEmpty()  && start_date.isEmpty() && end_date.isEmpty()){
            ArrayListHandler.class_name.add(classname);
            ArrayListHandler.start_date.add(startdate);
            ArrayListHandler.end_date.add(enddate);
            // testing the arrays
            testArrayList(class_name);
            testArrayList(start_date);
            testArrayList(end_date);
        }
        // test for a duplicate class
        else{
            for(String element: class_name){
                if(element.matches(classname)){
                    classMatched = true;
                }
            }
            if(classMatched == false){
                ArrayListHandler.class_name.add(classname);
                ArrayListHandler.start_date.add(startdate);
                ArrayListHandler.end_date.add(enddate);

                // testing the arrays
                testArrayList(class_name);
                testArrayList(start_date);
                testArrayList(end_date);
            }
         
        }

    }
    
    public static void deleteSchedule() {
        if(!class_name.isEmpty()  && !start_date.isEmpty() && !end_date.isEmpty()){
            ArrayListHandler.class_name.clear();
            ArrayListHandler.start_date.clear();
            ArrayListHandler.end_date.clear();
            //test 
           
    }
            testArrayList(class_name);
            testArrayList(start_date);
            testArrayList(end_date);
        
    }
    
    public static void editSchedule(String searchClass){
        
        if(class_name.isEmpty()  && start_date.isEmpty() && end_date.isEmpty()){
                    scheduleEmpty = true;
           
        }
        // test for a duplicate class
        else{
            for(String element: class_name){
                if(element.matches(searchClass)){
                    classMatched = true;
                }
            }
         
        }
        
        
    }
    // find the index where the String element is located and returns the number
    public static int findElement(String element ){
        count = 0;
        classMatched = false;
        for(String index :class_name ){
            if(index.equals(element)){
                classMatched = true;
                break;
            }
            count++;
        }
        if(classMatched == false){
            return -1;
        }
        
        return count;
    }
    
    public static void editEndAndStartDate(int element, String startDate, String endDate){
        
        start_date.set(element, startDate);
        end_date.set(element, endDate);
        // test 
         testArrayList(class_name);
         testArrayList(start_date);
         testArrayList(end_date);
    }
    
    public static Object[][] tableDisplay(){
        Object[][] data = new Object[class_name.size()][3]; // 3 is the number of columns

        for (int i = 0; i < class_name.size(); i++) {
              data[i][0] = class_name.get(i);
              data[i][1] = start_date.get(i);
              data[i][2] = end_date.get(i);
            }
    return data;
    }
    
        public static boolean getClassMatched(){
        return classMatched;
    }
      public static boolean getscheduleEmpty(){
        return scheduleEmpty;
    }
      
      //---end of schedule management---//
      
      //---Start Task Management---//
          public static void addTask(String taskname, String startdate, String enddate) {
       
        if(class_name.isEmpty()  && start_date.isEmpty() && end_date.isEmpty()){
           task_name.add(taskname);
           task_start_date.add(startdate);
           task_end_date.add(enddate);
           task_complete.add("No");
           task_percentage.add(0);

            // testing the arrays
            testArrayList(task_name);
            testArrayList(task_start_date);
            testArrayList(task_end_date);
        }
        // test for a duplicate class
        else{
            for(String element: task_name){
                if(element.matches(taskname)){
                    taskMatched = true;
                }
            }
            if(taskMatched == false){
                ArrayListHandler.task_name.add(taskname);
                ArrayListHandler.task_start_date.add(startdate);
                ArrayListHandler.task_end_date.add(enddate);
                ArrayListHandler.task_complete.add("No");

                // testing the arrays
                testArrayList(task_name);
                testArrayList(task_start_date);
                testArrayList(task_end_date);
            }
         
        }

    }
    
    public static void deleteTasks() {
        if(!task_name.isEmpty()  && !task_start_date.isEmpty() && !task_end_date.isEmpty()){
            ArrayListHandler.task_name.clear();
            ArrayListHandler.task_start_date.clear();
            ArrayListHandler.task_end_date.clear();
            //test 
           
    }
            testArrayList(task_name);
            testArrayList(task_start_date);
            testArrayList(task_end_date);
        
    }
    
    public static void editTask(String searchTask){
        
        if(task_name.isEmpty()  && task_start_date.isEmpty() && end_date.isEmpty()){
                    taskEmpty = true;
        }
        // test for a duplicate class
        else{
            for(String element: task_name){
                if(element.matches(searchTask)){
                    taskMatched = true;
                }
            }
        }
    }
    // find the index where the String element is located and returns the number
    public static int findTaskElement(String element ){
        task_count = 0;
        taskMatched = false;
        for(String index :task_name ){
            if(index.equals(element)){
                taskMatched = true;
                break;
            }
            task_count++;
        }
        if(taskMatched == false){
            return -1;
        }        
        return task_count;
    }
    
    public static void editTaskEndAndStartDate(int element, String startDate, String endDate){
        
        task_start_date.set(element, startDate);
        task_end_date.set(element, endDate);
        // test 
         testArrayList(task_name);
         testArrayList(task_start_date);
         testArrayList(task_end_date);
    }

    public static void editTaskComplete(int element){
        task_complete.set(element, "Yes");
    }
    
    public static Object[][] tableTaskDisplay(){
        
        Object[][] data = new Object[task_name.size()][4]; // 4 is the number of columns

        for (int i = 0; i < task_name.size(); i++) {
              data[i][0] = task_name.get(i);
              data[i][1] = task_start_date.get(i);
              data[i][2] = task_end_date.get(i);
              data[i][3] = task_complete.get(i);
            }
    return data;
    }
    
    //---Progress Tracking---// 
     public static void editTask_Percentage(String searchTask){
        
        if(task_name.isEmpty()  && task_start_date.isEmpty() && end_date.isEmpty()){
                    taskEmpty = true;
        }
        // test for a duplicate class
        else{
            for(String element: task_name){
                if(element.matches(searchTask)){
                    taskMatched = true;
                }
            }
        }
    }
    // find the index where the String element is located and returns the number
    public static int findTaskElement_Percentage(String element ){
        task_count = 0;
        taskMatched = false;
        for(String index :task_name ){
            if(index.equals(element)){
                taskMatched = true;
                break;
            }
            task_count++;
        }
        if(taskMatched == false){
            return -1;
        }        
        return task_count;
    }
    
    public static void editPercentComplete(int element, int percent){
        
        task_percentage.set(element, percent);
        
    }
    
      public static Object[][] tableProgressTrackingDisplay(){
        
        Object[][] data = new Object[task_name.size()][2]; // 4 is the number of columns

        for (int i = 0; i < task_name.size(); i++) {
              data[i][0] = task_name.get(i);
              data[i][1] = task_percentage.get(i);
            }
    return data;
    }
    
      
      
    
    //--- end of Progress Tracking---//
        public static boolean getTaskMatched(){
        return taskMatched;
    }
      public static boolean getTaskEmpty(){
        return taskEmpty;
    }
      //---End of Tasks---//
      //---Start of resource management---//
    public static void addResource(String resourcename) {
       
        if(resource_name.isEmpty()){
            resource_name.add(resourcename);
            // testing the arrays
            testArrayList(resource_name);
        }
        // test for a duplicate class
        else{
            for(String element: resource_name){
                if(element.matches(resourcename)){
                    resourceMatched = true;
                }
            }
            if(resourceMatched == false){
                resource_name.add(resourcename);
                // testing the arrays
                testArrayList(resource_name);  
            }
        }
    }
    // find the index where the String element is located and returns the number
        public static void searchResource(String searchTask){
        
        if(resource_name.isEmpty()){
                    resourceEmpty = true;
        }
        // test for a duplicate class
        else{
        for(String element: resource_name){
                if(element.matches(searchTask)){
                    resourceMatched = true;
                    break;
                }
            }
        }
        
    }
 
    public static Object[][] table_resource_Display(){
        Object[][] data = new Object[resource_name.size()][1]; // 3 is the number of columns

        for (int i = 0; i < resource_name.size(); i++) {
              data[i][0] = resource_name.get(i);
            }
    return data;
    }
        public static boolean getResourceMatched(){
            return resourceMatched;
    }
      public static boolean getResourceEmpty(){
        return resourceEmpty;
    }
      //---End of resource management---//
           
    public static void testArrayList(ArrayList<String> test){
       if(!test.isEmpty()){
        for(String element: test){
            System.out.println(element);
        }
       }
       else{
           System.out.println("The size of arraylist : " + test.size());
       }
    }
}