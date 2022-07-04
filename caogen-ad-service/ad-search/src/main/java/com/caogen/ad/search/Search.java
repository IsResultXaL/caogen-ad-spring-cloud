package com.caogen.ad.search;

import com.caogen.ad.search.vo.SearchRequest;
import com.caogen.ad.search.vo.SearchResponse;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-04 16:26
 */
public interface Search {

    SearchResponse fetchAds(SearchRequest request);

}
