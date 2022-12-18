package tests;

import org.testng.annotations.Test;

public class CheckoutModule {

    @Test
    public void verifyUserCanCheckout() {
        System.out.println(">");
        System.out.println("Executing CheckoutModule.verifyUserCanCheckout()");
    }

    @Test
    public void verifyCardDeclineMessage() {
        System.out.println(">");
        System.out.println("Executing CheckoutModule.verifyCardDeclineMessage()");
    }

    @Test
    public void verifyItemTotal() {
        System.out.println(">");
        System.out.println("Executing CheckoutModule.verifyItemTotal()");
    }

    @Test
    public void verifyCheckoutCancellation() {
        System.out.println(">");
        System.out.println("Executing CheckoutModule.verifyCheckoutCancellation()");
    }
}