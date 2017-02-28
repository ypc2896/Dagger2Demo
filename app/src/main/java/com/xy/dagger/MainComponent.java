package com.xy.dagger;

import dagger.Component;

/**
 * Created by xy on 2017/2/28.
 */

@Component(modules = TestMoudle.class)
public interface MainComponent {

    void inject(MainActivity activity);
}
