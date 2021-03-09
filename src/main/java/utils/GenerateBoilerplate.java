package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GenerateBoilerplate {

    public static void generateBoilerplate(){

        String homeDirectory = "D:\\SCHOOL\\ContiTesting";
        new File( homeDirectory + "\\src\\test\\java\\testCases").mkdir();
        new File( homeDirectory + "\\src\\test\\java\\pageObject").mkdir();
        new File( homeDirectory + "\\src\\test\\resources\\testSuites").mkdir();

        try {
            File myObj = new File(homeDirectory + "\\src\\test\\resources\\testSuites\\testSuite.xml");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter(homeDirectory + "\\src\\test\\resources\\testSuites\\testSuite.xml");
            myWriter.write("" +
                    "<!DOCTYPE suite SYSTEM \"https://testng.org/testng-1.0.dtd\" >\n" +
                    "<suite name = \"Automation testing with selenium\" verbose = \"1\" >\n" +
                    "\n" +
                    "    <parameter name=\"environment\" value=\"grid\"/>\n" +
                    "    <test name = \"Login Test\" >\n" +
                    "        <parameter name=\"browser\" value=\"chrome\"/>\n" +
                    "        <classes>\n" +
                    "            <class name = \"testDemo.Login\" />\n" +
                    "        </classes>\n" +
                    "    </test>\n" +
                    "</suite>" +
                    "");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
