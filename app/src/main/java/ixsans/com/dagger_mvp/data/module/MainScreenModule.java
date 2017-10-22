package ixsans.com.dagger_mvp.data.module;

import dagger.Module;
import dagger.Provides;
import ixsans.com.dagger_mvp.data.CustomScope;
import ixsans.com.dagger_mvp.ui.mainscreen.MainScreenContract;

/**
 * Created by ikhsan on 22/10/17.
 */

@Module
public class MainScreenModule {
    private final MainScreenContract.View mView;


    public MainScreenModule(MainScreenContract.View mView) {
        this.mView = mView;
    }

    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView() {
        return mView;
    }
}
