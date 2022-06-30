package com.caogen.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-30 18:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitRequest {

    private Long planId;
    private String unitName;

    private Integer positionType;
    private Long budget;

    public boolean createValidate() {
        return null != planId && !StringUtils.isEmpty(unitName)
                && positionType != null && budget != null;
    }
}
