import org.esgi.Guitarist;
import org.junit.*;
import org.junit.function.ThrowingRunnable;
import org.junit.rules.ExpectedException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
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

    Guitarist myGuitarist= (Guitarist) context.getBean("guitarist",Guitarist.class);

    assertThat(myGuitarist.howManyGuitars()).isEqualTo(2);

    }


    @Test
    public void should_throw_error_given_unknown_bean(){


        Assert.assertThrows(NoSuchBeanDefinitionException.class, () -> {
            Guitarist myGuitarist= (Guitarist) context.getBean("unknown guitarist",Guitarist.class);
        });

    }


    @After
    public void onExit() {
        context.close();
    }

}
