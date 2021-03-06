package com.us.ticketDSL;

/**
 * Created by yangyibo on 16/12/21.
 */
public class Customer {
    private String name;
    private String subscription;

    public Customer() {

    }

    public Customer(final String name,

                    final String subscription) {
        super();
        this.name = name;
        this.subscription = subscription;
    }

    public String getName() {
        return this.name;
    }

    public String getSubscription() {
        return this.subscription;
    }


    public String toString() {
        return "[Customer " + this.name + " : " + this.subscription + "]";
    }

}
