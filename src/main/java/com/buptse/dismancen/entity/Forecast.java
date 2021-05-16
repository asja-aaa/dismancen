package com.buptse.dismancen.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.buptse.dismancen.common.util.DTZConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ASJA
 * @since 2021-05-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
@XStreamAlias(value="info")
public class Forecast implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer infoId;

    @XStreamConverter(DTZConverter.class)
    private LocalDateTime date;

    private Integer grade;

    private Integer intensity;

    private Integer type;

    private String picture;


}
