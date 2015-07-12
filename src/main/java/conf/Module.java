package conf;

import com.fizzed.ninja.rocker.NinjaRockerModule;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

@Singleton
public class Module extends AbstractModule {

    @Override
    protected void configure() {
        install(new NinjaRockerModule());
    }
    
}