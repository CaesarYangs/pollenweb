package com.pollen.pollenweb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2022-01-28
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    @TableName("Files")
public class Files implements Serializable {

    private static final long serialVersionUID=1L;

      private String fileid;

    private String filename;

    private String fileaddress;

    private String filesize;

    private LocalDateTime uploadtime;

    private LocalDateTime maketime;

    private String area;

    private String username;

    private Integer userid;

    private String state;


}
