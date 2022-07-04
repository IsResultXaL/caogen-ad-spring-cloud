package com.caogen.ad.search.vo.media;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-04 16:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Geo {

    private Float latitude;

    private Float Longitude;

    private String city;

    private String province;

}
