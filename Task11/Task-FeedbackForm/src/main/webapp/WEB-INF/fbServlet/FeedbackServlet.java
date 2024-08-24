package fbServlet;

 
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("FeedbsckServlet")
public class FeedbackServlet extends HttpServlet {
	
	 
    response.setContentType("text/html");
    response.getWriter().write("feedback saved!");
    

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/feedbackDB";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "password"; // Change this to your MySQL password

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String bookName = request.getParameter("book_name");
        String feedback = request.getParameter("feedback");

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish connection
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            
            // Prepare SQL statement
            String sql = "INSERT INTO feedback (name, book_name, feedback) VALUES (?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, bookName);
            stmt.setString(3, feedback);

            // Execute update
            stmt.executeUpdate();
            
           
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "An error occurred while saving feedback.");
        } finally {
            // Close resources
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
}
