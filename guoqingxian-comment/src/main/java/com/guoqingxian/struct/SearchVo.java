/**
 * 作者:   郭青贤
 * 时间:   2020/7/27 9:25
 */
package com.guoqingxian.struct;

public class SearchVo {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SearchVo() {
    }

    public SearchVo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SearchVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
