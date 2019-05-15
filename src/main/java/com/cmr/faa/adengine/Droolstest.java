package com.cmr.faa.adengine;

import com.cmr.faa.pojo.Aircraft;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Droolstest {
    public static final void main(String[] args) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession("ksession-rules");

        Aircraft aircraft = new Aircraft()
                .withManufacturer("Mooney")
                .withModel("M20G")
                .withSerialNumber("690011");
        kieSession.insert(aircraft);
        kieSession.fireAllRules();
    }
}
