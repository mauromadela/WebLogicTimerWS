/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.local.webservice;

import static java.lang.Thread.sleep;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author mmadela
 */
@WebService
public class TimerWS {
    @WebMethod
    public String setTimer(int time) throws InterruptedException {
        System.out.printf("\nRequested to sleep for %d mili seconds...", (time));
        sleep(time); 
        System.out.printf("\nSleeped for %d mili seconds...", (time));
        return String.valueOf(time);
    }    
}
