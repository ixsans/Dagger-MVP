package ixsans.com.dagger_mvp;

import android.app.Application;

import ixsans.com.dagger_mvp.constant.ApiEndpoint;
import ixsans.com.dagger_mvp.data.component.DaggerNetworkComponent;
import ixsans.com.dagger_mvp.data.component.NetworkComponent;
import ixsans.com.dagger_mvp.data.module.AppModule;
import ixsans.com.dagger_mvp.data.module.NetworkModule;

/**
 * Created by ikhsan on 22/10/17.
 */

public class App extends Application {

    private NetworkComponent networkComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        networkComponent = DaggerNetworkComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule(ApiEndpoint.BASE_URL))
                .build();
    }

    public NetworkComponent getNetworkComponent() {
        return networkComponent;
    }
}
