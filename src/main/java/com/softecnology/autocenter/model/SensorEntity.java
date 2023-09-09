//package com.softecnology.autocenter.model;
//
//import com.softecnology.autocenter.enumerate.TipoDeLuzEnum;
//
//public class SensorEntity implements Runnable {
//    private String id;
//    private String name;
//    private Boolean stateOnOff;
//    private String unidadVariableFisica;
//    private String unidadVariableElectrica;
//    private Double valorFisicoMinimo;
//    private Double valorFisicoMaximo;
//    private Double valorElectricoMinimo;
//    private Double valorElectricoMaximo;
//    private Double valorFisico;
//    private Double valorElectrico;
//    private final Thread hilo;
//
//
//    public SensorEntity(String name, Boolean stateOnOff, String unidadVariableFisica, String unidadVariableElectrica, Double valorFisicoMinimo, Double valorFisicoMaximo, Double valorElectricoMinimo, Double valorElectricoMaximo, Double valorFisico, Double valorElectrico, Thread hilo) {
//        this.name = name;
//        this.stateOnOff = stateOnOff;
//        this.unidadVariableFisica = unidadVariableFisica;
//        this.unidadVariableElectrica = unidadVariableElectrica;
//        this.valorFisicoMinimo = valorFisicoMinimo;
//        this.valorFisicoMaximo = valorFisicoMaximo;
//        this.valorElectricoMinimo = valorElectricoMinimo;
//        this.valorElectricoMaximo = valorElectricoMaximo;
//        this.valorFisico = valorFisico;
//        this.valorElectrico = valorElectrico;
//        this.hilo = hilo;
//    }
//
//    public void sensado(Boolean stateOnOff){
//        this.stateOnOff = stateOnOff;
//    }
//
//
//    @Override
//    public void run() {
//        while(this.stateOnOff){
//            try {
//                System.out.println(name + " :  Pasando a estado - ALTO -> Incencidad : " + intencidad  );
////                hilo.sleep(this.periodo);
//                System.out.println(name + " :  Pasando a estado - BAJO -> Intencidad : " + intencidad  );
////                hilo.sleep(this.periodo);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
