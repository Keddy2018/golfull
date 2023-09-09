//package com.softecnology.autocenter.model;
//
//import com.softecnology.autocenter.enumerate.TipoDeLuzEnum;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Getter
//@Setter
//public class LuzEntity implements Runnable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private String id;
//    private String name;
//    private Boolean stateOnOff;
//    private Long periodo;
//    private TipoDeLuzEnum tipoLuz;
//    private Integer intencidad;
//    private final Thread hilo;
//
//    public LuzEntity() {
//        this.hilo = new Thread();
//    }
//
//    public LuzEntity(String name, Boolean stateOnOff, Long periodo, TipoDeLuzEnum tipoLuz, Integer incencidad) {
//        this.name = name;
//        this.stateOnOff = stateOnOff;
//        this.periodo = periodo;
//        this.tipoLuz = tipoLuz;
//        this.intencidad = incencidad;
//        this.hilo = new Thread();
//    }
//
//    public void activarLuz(Boolean stateOnOff){
//        String msg = stateOnOff ? (name + " :  Pasando a estado - ALTO") : (name + " :  Pasando a estado - BAJO"  );
//        msg = msg + " -> Intencidad : " + intencidad;
//        System.out.println(msg);
//    }
//    public void baliza(Boolean stateOnOff){
//        this.stateOnOff = stateOnOff;
//        if(this.tipoLuz.equals(TipoDeLuzEnum.BALIZA)) hilo.run();
//    }
//
//    @Override
//    public void run() {
//        while(this.stateOnOff){
//            try {
//                System.out.println(name + " :  Pasando a estado - ALTO -> Incencidad : " + intencidad  );
//                hilo.sleep(this.periodo);
//                System.out.println(name + " :  Pasando a estado - BAJO -> Intencidad : " + intencidad  );
//                hilo.sleep(this.periodo);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
