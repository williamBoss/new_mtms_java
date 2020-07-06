package com.ruoyi.system.domain;

import java.util.List;

/**
 * 地区表 districts 树形结构
 *
 * @author ruoyi
 * @date 2018-12-19
 */
public class DistrictsTree {

    private static final long serialVersionUID = 1L;

    private Integer value;

    private String label;

    private List<DistrictsTree> children;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<DistrictsTree> getChildren() {
        return children;
    }

    public void setChildren(List<DistrictsTree> children) {
        this.children = children;
    }
}
