/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author 180000B1Z
 */
/*public class AdicionarDAO {
    
public void cadastrar(JTextField jTextFieldProduto, JSlider jSliderQuantidade) {
        try {

            String sql = "INSERT INTO lista (idLista,Item,Quantidade,Data_Inclusao,Hora_Inclusao,Data_Modificacao,Hora_Modificacao) VALUES('" + this.getData() + "','" + this.getNome() + "','" + this.getRua() + "','" + this.getNumero() + "','" + this.getCidade() + "','" + this.Empreendimentos_idEmpreendimentos + "');";
            System.out.println("sql: " + sql);
            Conexao.executar(sql);
            JOptionPane.showMessageDialog(null, "Atividade cadastrada");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro cadastrar atividades" + e);
        }

    }

    public void editar() {
        //    public Atividades(String id, String dataString,String nome,String rua,String numero, String cidade, String Empreendimentos_idEmpreendimentos) {

        try {
            //JOptionPane.showMessageDialog(null, "UPDATE atividades SET Datas ='"+this.getData()+"',Nome='"+this.getNome()+"',Rua='"+this.getRua()+"',Numero='"+this.getNumero()+"', Cidade='"+getCidade()+"'  WHERE idAtividades="+this.getId()+";");
            String sql = "UPDATE atividades set Datas ='" + this.getData() + "' ,Nome='" + this.getNome() + "' ,Rua='" + this.getRua() + "' ,Numero='" + this.getNumero() + "', Cidade='" + getCidade() + "'  WHERE idAtividades="+this.getId() + ";";

            // String sql="UPDATE atividades SET Datas ='"+this.getData()+"',Nome='"+this.getNome()+"',Rua='"+this.getRua()+"',Numero='"+this.getNumero()+"', Cidade='"+getCidade()+"'  WHERE idAtividades="+this.getId()+";";
            // Conexao.executar(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "editar Atividades");
        }

    }

    public void excluir(String idAtividade) {
        String sql = "DELETE FROM atividades WHERE idAtividades= " + idAtividade;
        Conexao.executar(sql);
    }

    public static ArrayList<Atividades> getAtividades() {
        ArrayList<Atividades> lista = new ArrayList<>();
        String sql = "SELECT idAtividades, Datas,Nome,Rua,Numero,Cidade,Empreendimentos_idEmpreendimentos FROM atividades ORDER BY Datas";
        ResultSet rs = Conexao.consultar(sql);
        if (rs != null) {
            try {
                while (rs.next()) {
                    String idAtividades = rs.getString(0);
                    String datas = rs.getString(1);
                    String nome = rs.getString(2);
                    String rua = rs.getString(3);
                    String numero = rs.getString(4);
                    String cidade = rs.getString(5);
                    String empreendimentos_idEmpreendimentos = rs.getString(6);

                    Atividades atividades = new Atividades(idAtividades, datas, nome, rua, numero, cidade, empreendimentos_idEmpreendimentos);
                    lista.add(atividades);

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Array professor: " + e);

            }

        }
        return lista;

    }



    
}
*/