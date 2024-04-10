package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Ahsan Habib
 */
public class LoginFormTest 
{

    @Test
    public void testStudentIdentity() {
        String studentId = "220007878";
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Deepak Kumar Khatri";
        Assert.assertNotNull("Student name is null", studentName);
    }
    
    @Test
    public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode()
    {
        LoginStatus status = LoginForm.login(null, null);
        Assert.assertFalse("Empty username and empty password should fail", status.isLoginSuccess());
    }

    @Test
    public void testFailEmptyUsernameAndWrongPasswordAndDontCareValCode()
    {
        LoginStatus status = LoginForm.login(null, "xyz");
        Assert.assertFalse("Empty username and wrong password should fail", status.isLoginSuccess());
    }

    @Test
    public void testFailWrongUsernameAndWrongPasswordAndDontCareValCode()
    {
        LoginStatus status = LoginForm.login("abc", "xyz");
        Assert.assertFalse("Wrong username and wrong password should fail", status.isLoginSuccess());
    }

    @Test
    public void testFailCorrectUsernameAndEmptyPasswordAndDontCareValCode()
    {
        LoginStatus status = LoginForm.login("deep", null);
        Assert.assertFalse("Correct username and empty password should fail", status.isLoginSuccess());
    }

    @Test
    public void testFailCorrectUsernameAndWrongPasswordAndDontCareValCode()
    {
        LoginStatus status = LoginForm.login("deep", "xyz");
        Assert.assertFalse("Correct username and wrong password should fail", status.isLoginSuccess());
    }

    @Test
    public void testFailEmptyUsernameAndCorrectPasswordAndDontCareValCode()
    {
        LoginStatus status = LoginForm.login(null, "deep_pass");
        Assert.assertFalse("Empty username and correct password should fail", status.isLoginSuccess());
    }

    @Test
    public void testFailWrongUsernameAndCorrectPasswordAndDontCareValCode()
    {
        LoginStatus status = LoginForm.login("abc", "deep_pass");
        Assert.assertFalse("Wrong username and correct password should fail", status.isLoginSuccess());
    }

    @Test
    public void testSuccessCorrectUsernameAndPasswordAndDontCareValCode()
    {
        LoginStatus status = LoginForm.login("deep", "deep_pass");
        Assert.assertTrue("Correct username and password should succeed", status.isLoginSuccess());
    }

    @Test
    public void testFailEmptyCodeValidation()
    {
        Assert.assertFalse("Empty validation code should fail", LoginForm.validateCode(null));
    }

    @Test
    public void testFailWrongCodeValidation()
    {
        Assert.assertFalse("Wrong validation code should fail", LoginForm.validateCode("abcd"));
    }

    @Test
    public void testSuccessCorrectCodeValidation()
    {
        Assert.assertTrue("Correct validation code should succeed", LoginForm.validateCode("123456"));
    }

    @Test
    public void testFailEmptyUsernameAndEmptyPasswordAndCorrectValCode()
    {
        LoginStatus status = LoginForm.login(null, null);
        Assert.assertFalse("Empty username and empty password should fail", status.isLoginSuccess());
    }

    @Test
    public void testFailEmptyUsernameAndWrongPasswordAndCorrectValCode()
    {
        LoginStatus status = LoginForm.login(null, "xyz");
        Assert.assertFalse("Empty username and wrong password should fail", status.isLoginSuccess());
    }

    @Test
    public void testFailWrongUsernameAndWrongPasswordAndCorrectValCode()
    {
        LoginStatus status = LoginForm.login("abc", "xyz");
        Assert.assertFalse("Wrong username and wrong password should fail", status.isLoginSuccess());
    }

    @Test
    public void testFailCorrectUsernameAndEmptyPasswordAndCorrectValCode()
    {
        LoginStatus status = LoginForm.login("deep", null);
        Assert.assertFalse("Correct username and empty password should fail", status.isLoginSuccess());
    }

    @Test
    public void testFailCorrectUsernameAndWrongPasswordAndCorrectValCode()
    {
        LoginStatus status = LoginForm.login("deep", "xyz");
        Assert.assertFalse("Correct username and wrong password should fail", status.isLoginSuccess());
    }

    @Test
    public void testFailEmptyUsernameAndCorrectPasswordAndCorrectValCode()
    {
        LoginStatus status = LoginForm.login(null, "deep_pass");
        Assert.assertFalse("Empty username and correct password should fail", status.isLoginSuccess());
    }

    @Test
    public void testFailWrongUsernameAndCorrectPasswordAndCorrectValCode()
    {
        LoginStatus status = LoginForm.login("abc", "deep_pass");
        Assert.assertFalse("Wrong username and correct password should fail", status.isLoginSuccess());
    }

    @Test
    public void testSuccessCorrectUsernameAndPasswordAndCorrectValCode()
    {
        LoginStatus status = LoginForm.login("deep", "deep_pass");
        Assert.assertTrue("Correct username and password should succeed", status.isLoginSuccess());
    }
}
