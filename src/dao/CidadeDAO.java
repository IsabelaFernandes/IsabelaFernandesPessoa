package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cidade;

public class CidadeDAO {
      public Boolean inserir(Cidade cidade)
    {
        Boolean retorno;
        //monta o sql de insert da tabela
       String sql= "INSERT INTO cidade (nome) VALUES (? )"; 
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try
        {
        pst.setString(1,cidade.getNome());
        //pst.setInt(2,cidade.getCodigo());
      
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
    
     
      public List<Cidade> listar()
     {
         List<Cidade> lista = new ArrayList<Cidade> ();
         String sql = "SELECT * FROM cidade";
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         try
         {
         ResultSet res = pst.executeQuery();
         while (res.next())
         {
             Cidade cidade = new Cidade();
             cidade.setNome(res.getString("nome"));
             cidade.setCodigo(res.getInt("codigo"));
             
             lista.add(cidade);
         }
         }
         catch (SQLException ex )
         {
             Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         return lista;
     }
      public Boolean excluir(Cidade c)
    {
        Boolean retorno;
        //monta o sql de insert da tabela
       String sql= "DELETE FROM cidade WHERE login = ? "; 
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try
        {
        pst.setString(1,c.getNome());
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