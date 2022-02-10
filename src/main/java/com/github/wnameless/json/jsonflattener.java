package com.github.wnameless.json;

import com.github.wnameless.json.flattener.JsonFlattener;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.Scanner;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class jsonflattener {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        sc.close();

        JSONParser jsonParser = new JSONParser();

        try {

            Object obj = jsonParser
                    .parse(new FileReader(input));

            JSONObject jsonObject = (JSONObject) obj;

            String flattenedJson = JsonFlattener.flatten(jsonObject.toString());
            System.out.println(flattenedJson);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
