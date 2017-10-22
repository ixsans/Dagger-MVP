package ixsans.com.dagger_mvp.data.component;

import javax.inject.Singleton;

import dagger.Component;
import ixsans.com.dagger_mvp.data.module.AppModule;
import ixsans.com.dagger_mvp.data.module.NetworkModule;
import retrofit2.Retrofit;

/**
 * Created by ikhsan on 22/10/17.
 */

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface NetworkComponent {
    // downstream components need these exposed with the return type
    // method name does not really matter
    Retrofit retrofit();
}
