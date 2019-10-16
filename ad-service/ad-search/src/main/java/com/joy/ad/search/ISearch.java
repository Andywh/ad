package com.joy.ad.search;

import com.joy.ad.search.vo.SearchRequest;
import com.joy.ad.search.vo.SearchResponse;

/**
 * Created by SongLiang on 2019-10-14
 */
public interface ISearch {

    SearchResponse fetchAds(SearchRequest request);

}
