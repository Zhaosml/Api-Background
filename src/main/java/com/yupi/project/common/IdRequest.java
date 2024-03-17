package com.yupi.project.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 返回id
 */
@Data
public class IdRequest implements Serializable {
    private Long id;
    private static final long serialVersionUID = 1L;
}
