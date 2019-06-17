/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import dao.MascotaDao;
import org.hibernate.Session;
import utilitarios.HibernateUtil;

/**
 *
 * @author LeguiA
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Integer contar;

        Session sesion = HibernateUtil.getSessionFactory().openSession();
        MascotaDao mascotadao = new MascotaDao();
        contar = mascotadao.listCount(sesion);
        System.out.println(contar);
    }
}
