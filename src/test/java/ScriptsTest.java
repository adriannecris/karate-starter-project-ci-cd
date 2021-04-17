
import com.intuit.karate.junit5.Karate;

class ScriptsTest {

    @Karate.Test
    Karate testScripts() {
        return Karate.run().relativeTo(getClass());
    }

}
