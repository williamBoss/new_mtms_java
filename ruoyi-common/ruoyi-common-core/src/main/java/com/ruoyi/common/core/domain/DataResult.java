package com.ruoyi.common.core.domain;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;

/**
 * @author KING
 */
public class DataResult<T> {

    public static <T> BaseResult<PageResult<T>> result(Page<?> page, List<T> list) {
        PageResult<T> pageResult = new PageResult<>();
        pageResult.setRecords(list);
        pageResult.setTotal(page.getTotal());
        pageResult.setPageNum(page.getCurrent());
        pageResult.setPageSize(page.getSize());
        return BaseResult.<PageResult<T>>success().data(pageResult);
    }

}
