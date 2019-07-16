import org.junit.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class SceneTest {

    private ClassPathXmlApplicationContext context;

    @Before
    public void onSetup() {
         context = new ClassPathXmlApplicationContext("beans.xml");

    }

    @Test
    public void should_test_my_bean(){

        //TODO

    }

    @After
    public void onExit() {
        context.close();
    }

}
