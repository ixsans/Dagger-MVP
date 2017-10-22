package ixsans.com.dagger_mvp.data.component;

import dagger.Component;
import ixsans.com.dagger_mvp.data.CustomScope;
import ixsans.com.dagger_mvp.data.module.MainScreenModule;
import ixsans.com.dagger_mvp.data.module.NetworkModule;
import ixsans.com.dagger_mvp.ui.mainscreen.MainActivity;

/**
 * Created by ikhsan on 22/10/17.
 */

@CustomScope
@Component(dependencies = NetworkComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity activity);
}