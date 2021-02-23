package filehandling_json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToJsonFile {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {

        // First Employee
        JSONObject employeeDetails1 = new JSONObject();
        employeeDetails1.put("firstName", "Jahidul");
        employeeDetails1.put("lastName", "Islam");

        JSONObject employeeObject1 = new JSONObject();
        employeeObject1.put("employee", employeeDetails1);

        // Second Employee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Ferhan");
        employeeDetails2.put("lastName", "Khan");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employeeDetails2);

        // Third Employee
        JSONObject employeeDetails3 = new JSONObject();
        employeeDetails3.put("firstName", "Usman");
        employeeDetails3.put("lastName", "Qazi");

        JSONObject employeeObject3 = new JSONObject();
        employeeObject3.put("employee", employeeDetails3);

        // Add employees to the List
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject1);   // add employee#1 object to the list
        employeeList.add(employeeObject2);  // add employee#2 object to the list
        employeeList.add(employeeObject3);  // add employee#3 object to the list

        // Write Json File
        try (FileWriter file = new FileWriter("employees.json")) {
            // We can write JSONArray or JSONObject instance to
            file.write(employeeList.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

