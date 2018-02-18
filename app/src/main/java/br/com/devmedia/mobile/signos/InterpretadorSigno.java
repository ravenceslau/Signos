package br.com.devmedia.mobile.signos;

import java.util.ArrayList;

/**
 * Created by RAV on 04/02/2018.
 */

public class InterpretadorSigno {

    private ArrayList<Signo> signos = new ArrayList<Signo>(){{
       add(new Signo(20,1,18,2,"Aquário","@drawable/aquario"));
       add(new Signo(19,2,20,3,"Peixes","@drawable/peixes"));
       add(new Signo(21,3,19,4,"Áries","@drawalable/aries"));
       add(new Signo(20,4,20,5,"Touro","@drawable/touro"));
       add(new Signo(21,5,20,6,"Gêmeos","@drawable/gemeos"));
       add(new Signo(21,6,22,7,"Câncer","@drawable/cancer"));
       add(new Signo(23,7,22,8,"Leão","@drawable/leao"));
       add(new Signo(23,8,22,9,"Virgens","@drawable/virgens"));
       add(new Signo(23,9,22,10,"Libra","@drawable/libra"));
       add(new Signo(23,10,21,11,"Escorpião","@drawable/escorpiao"));
       add(new Signo(22,11,21,12,"Sagitário","@drawable/sagitario"));
       add(new Signo(22,12,19,1,"Capricórnio","@drawable/capricornio"));
    }};


    public Signo interpretar(int dia, int mes){
       Signo signo = null;

       for(Signo s : signos){
          if(s.getMesInicio() == mes && dia >= s.getDiaInicio()){
             signo = s;
             break;
          }else if(s.getMesFim() == mes && dia <= s.getDiaFim()){
             signo = s;
             break;
          }
       }
       return signo;
    }

}