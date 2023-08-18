/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.AdicionarModel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author 180000B1Z
 */
public class AdicionarControler {
    public static void VerificarSeVazio(JTextField jTextFieldProduto,JSlider jSliderQuantidade ){
        if (jTextFieldProduto.getText()==""){
            JOptionPane.showMessageDialog(null, "Favor especificar o Produto");            
        }else{
            AdicionarModel.Adicionar(jTextFieldProduto, jSliderQuantidade);
                    }
        
        
    }
}
