import org.esgi.Artist;
import org.junit.*;
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
    public void should_test_my_bean_paul(){
        Artist paul = context.getBean("paul", Artist.class);
        assertThat(paul.perform()).contains("PLOP");
    }


    @Test
    public void should_test_my_bean_john(){
        Artist john = context.getBean("john", Artist.class);
        assertThat(john.perform()).contains("PLINK");
    }



    @Test
    public void should_throw_error_given_unknown_bean(){
        Assert.assertThrows(NoSuchBeanDefinitionException.class, () -> {
            Artist unknownArtist= (Artist) context.getBean("unknownArtist",Artist.class);
        });
    }

    @After
    public void onExit() {
        context.close();
    }

}
