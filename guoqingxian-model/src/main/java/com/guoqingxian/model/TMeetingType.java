package com.guoqingxian.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

@TableName(value = "t_meeting_type")
public class TMeetingType implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "tname")
    private String tname;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_TNAME = "tname";

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return tname
     */
    public String getTname() {
        return tname;
    }

    /**
     * @param tname
     */
    public void setTname(String tname) {
        this.tname = tname;
    }
}