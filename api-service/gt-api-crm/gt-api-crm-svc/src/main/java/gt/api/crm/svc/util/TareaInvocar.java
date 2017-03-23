/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.api.crm.svc.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 * @author wesly
 */

public class TareaInvocar implements Job{
    @Override
    public void execute(JobExecutionContext jec) throws JobExecutionException {
        SimpleDateFormat formato = new SimpleDateFormat("hh:mm:ss");
        System.out.println( "Tarea invocada a la hora: " + formato.format(new Date()));
        SendMail mail = new SendMail();
        mail.sendEmail();
    }
}