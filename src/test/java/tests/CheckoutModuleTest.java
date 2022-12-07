package tests;

import org.testng.annotations.Test;

public class CheckoutModuleTest {

    @Test
    public void verifyUserCanCheckout() {
        System.out.println(">");
        System.out.println("Executing CheckoutModuleTest.verifyUserCanCheckout()");
    }

    @Test
    public void verifyCardDeclineMessage() {
        System.out.println(">");
        System.out.println("Executing CheckoutModuleTest.verifyCardDeclineMessage()");
    }

    @Test
    public void verifyItemTotal() {
        System.out.println(">");
        System.out.println("Executing CheckoutModuleTest.verifyItemTotal()");
    }

    @Test
    public void verifyCheckoutCancellation() {
        System.out.println(">");
        System.out.println("Executing CheckoutModuleTest.verifyCheckoutCancellation()");
    }
}