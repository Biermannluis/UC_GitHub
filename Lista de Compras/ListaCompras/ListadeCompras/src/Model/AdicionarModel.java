/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author 180000B1Z
 */
public class AdicionarModel {

    int quantidade;
    String item;
    Date data_inclusao, data_modificacao;
    Time hora_inclusao, hora_modificacao;

    public AdicionarModel() {
    }

    public AdicionarModel(int quantidade, String item, Date data_inclusao, Date data_modificacao, Time hora_inclusao, Time hora_modificacao) {
        this.quantidade = quantidade;
        this.item = item;
        DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat timeformat = new SimpleDateFormat("HH:mm:ss");
        Date data_inclusao = new Date();
        //this.data_inclusao = data_inclusao;
        this.data_modificacao = data_modificacao;
        this.hora_inclusao = hora_inclusao;
        this.hora_modificacao = hora_modificacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Date getData_inclusao() {
        return data_inclusao;
    }

    public void setData_inclusao(Date data_inclusao) {
        this.data_inclusao = data_inclusao;
    }

    public Date getData_modificacao() {
        return data_modificacao;
    }

    public void setData_modificacao(Date data_modificacao) {
        this.data_modificacao = data_modificacao;
    }

    public Time getHora_inclusao() {
        return hora_inclusao;
    }

    public void setHora_inclusao(Time hora_inclusao) {
        this.hora_inclusao = hora_inclusao;
    }

    public Time getHora_modificacao() {
        return hora_modificacao;
    }

    public void setHora_modificacao(Time hora_modificacao) {
        this.hora_modificacao = hora_modificacao;
    }

}
