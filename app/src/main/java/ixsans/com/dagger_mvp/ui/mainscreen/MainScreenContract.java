package ixsans.com.dagger_mvp.ui.mainscreen;

import java.util.List;

import ixsans.com.dagger_mvp.model.Post;

/**
 * Created by ikhsan on 22/10/17.
 */

public interface MainScreenContract {
    interface View {
        void showPosts(List<Post> posts);

        void showError(String message);

        void showComplete();
    }

    interface Presenter {
        void loadPost();
    }
}
