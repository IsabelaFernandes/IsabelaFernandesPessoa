package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pessoa;

public class PessoaDAO {
      public Boolean inserir(Pessoa pessoa)
    {
        Boolean retorno;
        //monta o sql de insert da tabela
       String sql= "INSERT INTO pessoa (nome, sexo ) VALUES (?,?)"; 
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try
        {
        //pst.setInt(1,pessoa.getCodigo());
        pst.setString(1,pessoa.getNome());
        pst.setString(2,pessoa.getSexo());
      
        pst.executeUpdate();
        retorno = true ;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno ;
        
    }
    
     
      public List<Pessoa> listar()
     {
         List<Pessoa> lista = new ArrayList<Pessoa> ();
         String sql = "SELECT * FROM pessoa";
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         try
         {
         ResultSet res = pst.executeQuery();
         while (res.next())
         {
             Pessoa pessoa = new Pessoa();
             pessoa.setCodigo(res.getInt("codigo"));
             pessoa.setNome(res.getString("nome"));
             pessoa.setSexo(res.getString("sexo"));
             
             lista.add(pessoa);
         }
         }
         catch (SQLException ex )
         {
             Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         return lista;
     }
      public Boolean excluir(Pessoa p)
    {
        Boolean retorno;
        //monta o sql de insert da tabela
       String sql= "DELETE FROM pessoa WHERE login = ? "; 
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try
        {
        pst.setString(1,p.getNome());
        pst.executeUpdate();
        retorno = true ;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno ;
    }
}