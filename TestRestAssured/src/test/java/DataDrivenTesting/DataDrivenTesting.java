package DataDrivenTesting;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DataDrivenTesting {

    @Test (dataProvider = "empdataprovider")
    void DataDrivenTesting(String ename,String esal, String eage) {

        RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";

        RequestSpecification httpRequest =  RestAssured.given();

        //Creating the data  to send with the POST request
        JSONObject requestparams = new JSONObject() ;
        requestparams.put("name",ename);
        requestparams.put("salary",esal);
        requestparams.put("age",eage);

        //Add headers
        httpRequest.header("Content-Type","application/json");

        //Add Json body
        httpRequest.body(requestparams.toJSONString());

        //Post Request
        Response response= httpRequest.request(Method.POST,"/create");

        //Capture response body
        String responsebody = response.getBody().asPrettyString();

        System.out.println("responsebody = " + responsebody);

        Assert.assertEquals(responsebody.contains(ename),true);
        Assert.assertEquals(responsebody.contains(esal),true);
        Assert.assertEquals(responsebody.contains(eage),true);

        int statuscode = response.getStatusCode();
        Assert.assertEquals(statuscode,200);

    }

    // Harcoded Data
    /*@DataProvider(name = "empdataprovider")
    Object[][] getEmpData(){
        String empdata [][] = {{"abc123","30000","40"}, {"rwerwer","5325235","34"},{"rwfg","53255","23"}};
        return(empdata);
    }*/

    // With excel File

    @DataProvider(name = "empdataprovider")
     Object[][] getEmpData() throws IOException {

        String path = System.getProperty("user.dir")+"/src/test/java/DataDrivenTesting/empdata.xlsx";

        int rownumbers = XLUtils.getRowCount(path,"Sheet1");
        int columnnumber = XLUtils.getCellCount(path,"Sheet1",1);

        String empdata [][] = new String[rownumbers][columnnumber];

        for(int i =1 ; i <= rownumbers; i++){
            for (int j=0; j < columnnumber;j++){
                empdata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j);
            }
        }

        return (empdata);
    }

}
