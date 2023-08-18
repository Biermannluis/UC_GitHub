/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author 180000B1Z
 */
public class AdicionarModel {

    public static void Adicionar(JTextField jTextFieldProduto, JSlider jSliderQuantidade) {
        JOptionPane.showMessageDialog(null, "POWW");
        JOptionPane.showMessageDialog(null, "Produto: "+ jTextFieldProduto.getText()+"\n Quantidade: "+jSliderQuantidade.getValue());

    }

}
