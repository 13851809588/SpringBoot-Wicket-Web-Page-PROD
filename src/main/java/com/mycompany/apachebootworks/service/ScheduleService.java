/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.apachebootworks.service;

import java.text.SimpleDateFormat;
import org.springframework.stereotype.Component;

/**
 *
 * @author Tommi
 */
@Component
public class ScheduleService {

    private SimpleDateFormat dateformat;
 
    public ScheduleService() {
        this.dateformat = new SimpleDateFormat("HH:mm:ss");
    }



}
