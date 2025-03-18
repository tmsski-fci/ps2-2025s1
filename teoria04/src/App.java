import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Boa noite!");
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.omnrwovhmuricmmikesv&password=mydb1234!@#$";
        Connection conexao = DriverManager.getConnection(url);
        String sql = "SELECT * FROM contas";
        PreparedStatement stm = conexao.prepareStatement(sql);
        ResultSet rset = stm.executeQuery();
        while (rset.next()) {
            long nroConta = rset.getLong("nro_conta");
            double saldo = rset.getDouble("saldo");
            System.out.print("Número da conta: " + nroConta);
            System.out.println(" tem saldo de R$ " + saldo);
        }
    }
}
