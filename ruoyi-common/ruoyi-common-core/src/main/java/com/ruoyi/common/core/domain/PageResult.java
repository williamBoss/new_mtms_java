package com.ruoyi.common.core.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author KING
 */
@Data
@ApiModel("分页返回数据")
public class PageResult<T> {

    @ApiModelProperty("列表，分页中的数据")
    private List<T> records;

    @ApiModelProperty("总数目")
    private Long total;

    @ApiModelProperty("当前第几页")
    private Long pageNum;

    @ApiModelProperty("每页的元素的数量")
    private Long pageSize;

}