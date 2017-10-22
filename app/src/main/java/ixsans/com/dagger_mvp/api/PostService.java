package ixsans.com.dagger_mvp.api;

import java.util.List;

import ixsans.com.dagger_mvp.model.Post;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by ikhsan on 22/10/17.
 */

public interface PostService {
    @GET("/posts")
    Observable<List<Post>> getPostList();
}
