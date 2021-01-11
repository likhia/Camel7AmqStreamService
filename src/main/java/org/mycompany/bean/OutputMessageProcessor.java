package org.mycompany.bean;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class OutputMessageProcessor implements Processor {
	
	    public void process(Exchange exchange) throws Exception {
    	
            KafkaOutcome outcome = new KafkaOutcome();
            
            outcome.setOutcome("success");
            //set output in exchange
            exchange.getOut().setBody(outcome);
        }

}
