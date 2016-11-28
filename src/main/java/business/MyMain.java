package business;

import com.runningfun.iot.swarm.demo.rest.RestApplication;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

/**
 * Created by Herschbach.Stefan on 28.11.2016.
 */
public class MyMain {

    public static void main(String[] args) throws Exception {
        System.out.println("### Start main");
        Swarm swarm=new Swarm();
        JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
        deployment.addPackage(MyMain.class.getPackage());
        deployment.addPackage(RestApplication.class.getPackage());
//        deployment.addResource(org.apache.deltaspike.core.api.provider.BeanProvider.class); //-> not sufficient
        deployment.staticContent();
        System.out.println("### Start swarm");
        swarm.start();
        swarm.deploy(deployment);
        System.out.println("### Deployment finished");
    }

}
