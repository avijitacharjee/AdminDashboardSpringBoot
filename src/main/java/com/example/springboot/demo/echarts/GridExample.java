package com.example.springboot.demo.echarts;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class GridExample {
    public static String getGridData() {
        //JsonObject jsonObject = new JsonObject();
        JsonArray clients = new JsonArray();
        JsonObject client0 = new JsonObject();
        client0.addProperty("Name", "RAHMAN TAOFIQUR");
        client0.addProperty("Age", 21);
        client0.addProperty("Country", 1);
        client0.addProperty("Id", 2017490071);
        clients.add(client0);
        
        JsonObject client1 = new JsonObject();
        client1.addProperty("Name", "UDDIN MOHAMMED FARHAD");
        client1.addProperty("Age", 22);
        client1.addProperty("Country", 1);
        client1.addProperty("Id", 2017490106);
        clients.add(client1);

        JsonObject client2 = new JsonObject();
        client2.addProperty("Name", "SHAHID MUHAMMAD SHABAN");
        client2.addProperty("Age", 24);
        client2.addProperty("Country", 2);
        client2.addProperty("Id", 2017490210);
        clients.add(client2);

        // JsonObject client3 = new JsonObject();
        // client3.addProperty("Name", "avijit");
        // client3.addProperty("Age", 5);
        // client3.addProperty("Country", 2);
        // client3.addProperty("Id", 123456);
        // clients.add(client3);

        return clients.toString();
    }
}
