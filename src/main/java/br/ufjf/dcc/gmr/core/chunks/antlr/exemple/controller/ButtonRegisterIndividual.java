/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr.exemple.controller;

import br.ufjf.dcc.gmr.core.chunks.antlr.exemple.view.DesktopIndividual;
import br.ufjf.dcc.gmr.core.chunks.antlr.exemple.view.JanelaAbas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DELL
 */
public class ButtonRegisterIndividual implements ActionListener {
    private JanelaAbas frame;
    private DesktopIndividual desktop;
  
    public ButtonRegisterIndividual(JanelaAbas frame, DesktopIndividual desktop) {
        this.frame = frame;
        this.desktop = desktop;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            this.desktop.addIndividual();
            
            this.frame.getLineNumber().setText("");
            this.frame.getLineStreet().setText("");
            this.frame.getLineNeighborhood().setText("");
            this.frame.getLineCep().setText("");
            this.frame.getLineCity().setText("");
            this.frame.getLineState().setText("");
            this.frame.getLineCountry().setText("");
            this.frame.getLinePersonName().setText("");
            this.frame.getLineSurname().setText("");
            this.frame.getLineEmail().setText("");
            this.frame.getLinePassword().setText("");
            this.frame.getLineDdd().setText("");
            this.frame.getLinePhoneNumber().setText("");
            
            this.desktop.getLineCpf().setText("");
            this.desktop.getLineRg().setText("");
            this.desktop.getLineBirth().setText("");
            
        } 
        catch (Exception ex) {
        }
    }
}
