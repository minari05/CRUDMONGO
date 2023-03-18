
package config;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;

public class Conexion {
    
ConnectionString connectionString = new ConnectionString("mongodb+srv://minari05:<madMAXXÑ05>@registro.twz0hou.mongo"
                                                            + "db.net/?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("dsm501");
  }
