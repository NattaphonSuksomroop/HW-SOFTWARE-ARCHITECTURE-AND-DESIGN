package edu.parinya.softarchdesign.structural;

public abstract class HealthcareWorkerDecorator extends HealthcareWorker{
    private HealthcareWorker worker = null;

    public HealthcareWorkerDecorator(HealthcareWorker wrapWorker){
        super(wrapWorker.getName(),wrapWorker.getPrice());
        worker = wrapWorker;

    }
    public void service(){
        worker.service();
    }
    public double getPrice(){
       return worker.getPrice();
    }
}
