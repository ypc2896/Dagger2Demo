package com.xy.dagger;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xy on 2017/2/28.
 */

@Module
public class TestMoudle {

    @Provides
    public MainPresenter getMainPresenter(){
        return new MainPresenter();
    }
}
