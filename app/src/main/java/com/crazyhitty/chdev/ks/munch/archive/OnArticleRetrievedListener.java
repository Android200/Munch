package com.crazyhitty.chdev.ks.munch.archive;

import com.crazyhitty.chdev.ks.munch.models.FeedItem;

import java.util.List;

/**
 * Created by Kartik_ch on 12/9/2015.
 */
public interface OnArticleRetrievedListener {
    void onSuccess(List<FeedItem> feedItems);

    void onFailure(String message);
}
