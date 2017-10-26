/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.basica;

import java.util.Date;

/**
 *
 * @author User
 */
public class FluxoDeCaixa {

    private int id;
    private Date caixaData;
    private String tipo;
    private double valor;
    private int documento;

    private FluxoDeCaixa(){
    
    }
    @Override
    public String toString() {
        return "FluxoCaixa{" + "id=" + getId() + ", data=" + getCaixaData() + ", tipo=" + getTipo() + ", valor=" + getValor() + ", documento=" + getDocumento() + '}';
    }
    
       /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the caixaData
     */
    public Date getCaixaData() {
        return caixaData;
    }

    /**
     * @param caixaData the caixaData to set
     */
    public void setCaixaData(Date caixaData) {
        this.caixaData = caixaData;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the documento
     */
    public int getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(int documento) {
        this.documento = documento;
    }
}
