package UserService;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import UserService.model.Users;



public class UsersTest {

    private Users user;

    @Before
    public void setUp() {
        // Initialize a Users object before each test method
        BigInteger userId = new BigInteger("1234567890");
        String userName = "Test User";
        String userPassword = "TestPassword";
        BigInteger userPhone = new BigInteger("1234567890");
        String userEmail = "test@example.com";
        String userType = "regular";
        user = Users.builder()
                .userType(userType)
                .userId(userId)
                .userName(userName)
                .userPassword(userPassword)
                .userPhone(userPhone)
                .userEmail(userEmail)
                .build();
    }

    @Test
    public void testGetUserType() {
        assertEquals("regular", user.getUserType());
    }

    @Test
    public void testGetUserId() {
        assertEquals(new BigInteger("1234567890"), user.getUserId());
    }

    @Test
    public void testGetUserName() {
        assertEquals("Test User", user.getUserName());
    }

    @Test
    public void testGetUserPassword() {
        assertEquals("TestPassword", user.getUserPassword());
    }

    @Test
    public void testGetUserPhone() {
        assertEquals(new BigInteger("1234567890"), user.getUserPhone());
    }

    @Test
    public void testGetUserEmail() {
        assertEquals("test@example.com", user.getUserEmail());
    }
}
