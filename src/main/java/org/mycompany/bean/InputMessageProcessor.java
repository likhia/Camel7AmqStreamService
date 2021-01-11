package org.mycompany.bean;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class InputMessageProcessor implements Processor {
	
	    public void process(Exchange exchange) throws Exception {
    	
            //Get input from exchange
            KafkaInputMessage inputMessage = (KafkaInputMessage) exchange.getIn().getBody(KafkaInputMessage.class);
            
            exchange.getOut().setBody(inputMessage.getMessage());
        }

}
