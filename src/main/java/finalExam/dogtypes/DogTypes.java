package finalExam.dogtypes;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DogTypes {

    private DataSource dataSource;

    public DogTypes(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getDogsByCountry(String country) {
        List<String> names = new ArrayList<>();

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("select name from dog_types where country = ?");
        ) {
            stmt.setString(1, country.toUpperCase());
            try (
                    ResultSet rs = stmt.executeQuery();
            ) {
                while (rs.next()) {
                    String name = rs.getString("name");
                    names.add(name.toLowerCase());
                }
            } catch (SQLException sqle) {
                throw new IllegalArgumentException("Error by insert", sqle);
            }
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by querry", sqle);
        }

        Collections.sort(names);
        return names;

    }
}
