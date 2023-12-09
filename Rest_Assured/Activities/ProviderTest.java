package liveProject;


import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit.loader.PactUrl;
import au.com.dius.pact.provider.junit5.HttpTestTarget;
import au.com.dius.pact.provider.junit5.HttpsTestTarget;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@Provider("UserProvider")
@PactFolder("target/pacts") // when pact is available on local system
// the following options can also be used instead of just mentioning the folder
//@PactBroker(host = "ibm.pactflow.io") // when hosted on pactflow broker site
//@PactUrl(urls = "url") // when hosted on server or github repo
public class ProviderTest {
    @BeforeEach
    public void setUP(PactVerificationContext context){
        HttpTestTarget target = new HttpTestTarget("localhost", 8585); // we also have a https target, if we go that route, we have to have ssl and key store
        context.setTarget(target); // context details comes from the pact
    }

    @TestTemplate
    @ExtendWith(PactVerificationInvocationContextProvider.class)
    public void ProviderTest(PactVerificationContext context){
        context.verifyInteraction();
    }

    @State("Post Request")
    public void postTest(){
        // state name is taken from the pact builder we have written
        // this basically triggers the setup
        // since we already set the test template, it will take care of the verification
        // all we have to do is just leave it as it is, and the test template will take care of it
    }
}
