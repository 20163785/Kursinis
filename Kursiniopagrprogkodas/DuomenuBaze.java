/*
 * Gytis Jankasukas 
 * PRif-16/1
 * DB
 * 4 laboratorinis
 */
package Kursiniopagrprogkodas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DuomenuBaze {

    private static final String USERNAME = "root";
    private static final String PASS = "root";
    private static final String DB = "jdbc:mysql://127.0.0.1:8889/sistema";

    public Connection dbConnect() {

        Connection conn = null;

        try {

            conn = DriverManager.getConnection(DB, USERNAME, PASS);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

        return conn;

    }

    private void Destytojai() {
        Connection conn = dbConnect();
        try {
            Statement state = conn.createStatement();
            state.execute("CREATE TABLE if not exists Destytojas( id INTEGER, vardas TEXT, pavarde TEXT)");
        } catch (SQLException ex) {
            Logger.getLogger(DuomenuBaze.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void InsertIntoDestytojai(int id, String vardas, String pavarde) {
        Destytojai();
        Connection conn = dbConnect();
        String code = "INSERT INTO Destytojas (id, vardas, pavarde) values (?,?,?)";

        try {
            PreparedStatement statement = conn.prepareStatement(code);
            statement.setInt(1, id);
            statement.setString(2, vardas);

            statement.setString(3, pavarde);

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(DuomenuBaze.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void Kursai() {
        Connection conn = dbConnect();
        try {
            Statement state = conn.createStatement();
            state.execute("CREATE TABLE if not exists Kursas( pavadinimas TEXT )");
        } catch (SQLException ex) {
            Logger.getLogger(DuomenuBaze.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void InsertIntoKursai(String pavadinimas) {
        Kursai();
        Connection conn = dbConnect();
        String code = "INSERT INTO Kursas(pavadinimas) values (?)";

        try {
            PreparedStatement statement = conn.prepareStatement(code);
            statement.setString(1, pavadinimas);

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(DuomenuBaze.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void Grupes() {
        Connection conn = dbConnect();
        try {
            Statement state = conn.createStatement();
            state.execute("CREATE TABLE if not exists Grupe( kodas TEXT, stojimoMetai INTEGER)");
        } catch (SQLException ex) {
            Logger.getLogger(DuomenuBaze.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void InsertIntoGrupes(String kodas, int stojimoMetai) {
        Grupes();
        Connection conn = dbConnect();
        String code = "INSERT INTO Grupe(kodas, stojimoMetai) values (?,?)";

        try {
            PreparedStatement statement = conn.prepareStatement(code);
            statement.setString(1, kodas);
            statement.setInt(2, stojimoMetai);

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(DuomenuBaze.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void Studentai() {
        Connection conn = dbConnect();
        try {
            Statement state = conn.createStatement();
            state.execute("CREATE TABLE if not exists Studentas(kodas TEXT, studkodas INTEGER, vardas TEXT, pavarde TEXT)");
        } catch (SQLException ex) {
            Logger.getLogger(DuomenuBaze.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void InsertIntoStudentai(String kodas, long studkodas, String vardas, String pavarde) {
        Studentai();
        Connection conn = dbConnect();
        String code = "INSERT INTO Studentas( kodas, studkodas, vardas, pavarde) values (?,?,?,?)";

        try {
            PreparedStatement statement = conn.prepareStatement(code);
            statement.setString(1, kodas);
            statement.setLong(2, studkodas);
            statement.setString(3, vardas);
            statement.setString(4, pavarde);

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(DuomenuBaze.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
