package tests;

import org.testng.annotations.Test;

public class LoginModule {

    @Test
    public void verifyUserCanLogin() {
        System.out.println(">");
        System.out.println("Executing LoginModule.verifyUserCanLogin()");
    }

    @Test
    public void verifyUserCanResetCredential() {
        System.out.println(">");
        System.out.println("Executing LoginModule.verifyUserCanResetCredential()");
    }

    @Test
    public void verifyUserLogout() {
        System.out.println(">");
        System.out.println("Executing LoginModule.verifyUserLogout()");
    }

}//end
