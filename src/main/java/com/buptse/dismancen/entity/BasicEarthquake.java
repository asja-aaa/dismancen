package com.buptse.dismancen.entity;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class BasicEarthquake implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer infoId;

    private String province;

    private String city;

    private String country;

    private String town;

    private String village;

    private String category;

    private LocalDateTime date;

    private String location;

    private Float longitude;

    private Float latitude;

    private Integer depth;

    private Float magnitude;

    private String reportingUnit;

    private String picture;


}
