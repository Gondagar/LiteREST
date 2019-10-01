package cc.serfer;

import cc.serfer.model.GrantMatrix;
import cc.serfer.model.GrantObject;
import cc.serfer.model.GrantOperation;
import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange t) throws IOException {
        String response = getDataFromDB();
        t.getResponseHeaders().add("Content-Type", "application/json");
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }


    public String getDataFromDB() {
        List<GrantMatrix> result = new ArrayList<>();

        String query = "SELECT m.id  , ob.id, ob.name, ob.name_ukr,ob.standard_object, ob.is_admin, op.id, op.name, op.standard_operation   FROM grant_matrix as m join grant_object ob on m.grant_object_id = ob.id join grant_operation op on m.grant_operation_id = op.id order by  m.id";

        try (Connection conn = DriverManager.getConnection(
            "jdbc:postgresql://127.0.0.1:5432/auth", "postgres", "password");
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                long id = resultSet.getLong(1);

                int objectId = resultSet.getInt(2);
                String name = resultSet.getString(3);
                String nameUkr = resultSet.getString(4);
                int isStandard = resultSet.getInt(5);
                int isAdmin = resultSet.getInt(6);

                int operationId = resultSet.getInt(7);
                String operationName = resultSet.getString(8);
                int standardOperation = resultSet.getInt(9);



                GrantObject grantObject = new GrantObject(objectId,name, nameUkr,isStandard, isAdmin);
                GrantOperation grantOperation = new GrantOperation(operationId,operationName,standardOperation);

                GrantMatrix matrix = new GrantMatrix();
                matrix.setId(id);
                matrix.setGrantObject(grantObject);
                matrix.setGrantOperation(grantOperation);


                result.add(matrix);

            }

            String json = new Gson().toJson(result);
            return json;

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
