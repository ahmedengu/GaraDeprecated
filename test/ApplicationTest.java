import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ApplicationTest {

//    @Test
//    public void registerFail() {
//        Result result = callAction(
//                controllers.routes.ref.Application.register(),
//                fakeRequest().withFormUrlEncodedBody(ImmutableMap.of(
//                        "email", "bob@.",
//                        "password", "secret"))
//        );
//        assertEquals(400, status(result));
//    }
    @Test
    public void simpleCheck() {
        int a = 1 + 1;
        assertThat(a, equalTo(2));
    }
}
