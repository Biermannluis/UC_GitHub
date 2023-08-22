/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.AdicionarModel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author 180000B1Z
 */
public class AdicionarControler {

    public static void VerificarSeVazio(JTextField jTextFieldProduto, JSlider jSliderQuantidade) {
        if (jTextFieldProduto.getText() == "") {
            JOptionPane.showMessageDialog(null, "Favor especificar o Produto");
        } else {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm>:ss");
            String dataformatada = now.format(data);
            String horaformatada = now.format(hora);
            JOptionPane.showMessageDialog(null, dataformatada);
            JOptionPane.showMessageDialog(null, horaformatada);

           // AdicionarModel.adicionar(jTextFieldProduto, jSliderQuantidade);
        }

    }
}
