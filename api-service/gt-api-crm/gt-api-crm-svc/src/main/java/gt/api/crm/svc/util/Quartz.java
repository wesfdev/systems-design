/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.api.crm.svc.util;

import gt.api.crm.svc.util.Programacion;

/**
 *
 * @author wesly
 */

public class Quartz {
    public static void main(String[] args) {
        try {
            new Programacion().iniciarTarea();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
