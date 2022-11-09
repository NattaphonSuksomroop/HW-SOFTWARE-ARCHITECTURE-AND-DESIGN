package edu.parinya.softarchdesign.structural;

import java.util.ArrayList;

public class HealthcareWorkerTeam implements HealthcareServiceable{
    private ArrayList<HealthcareServiceable> members =new ArrayList<HealthcareServiceable>() ;

    public void addMember(HealthcareServiceable newMember){
        members.add(newMember);
    }

    public void removeMember(HealthcareServiceable removeMember){
        members.remove(removeMember);
    }

    @Override
    public void service() {
        for (HealthcareServiceable member : members){
            member.service();
        }
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (HealthcareServiceable member : members){
            price += member.getPrice();
        }
        return price;
    }
}
