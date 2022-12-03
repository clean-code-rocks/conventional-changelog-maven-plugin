package rocks.cleancode.maven.plugin.conventionalchangelog;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "generate", aggregator = true, defaultPhase = LifecyclePhase.VALIDATE)
public class GenerateMojo {
}
