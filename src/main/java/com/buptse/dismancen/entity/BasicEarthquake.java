package com.buptse.dismancen.entity;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.buptse.dismancen.common.util.DTZConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import lombok.*;
import lombok.experimental.Accessors;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

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

    @XStreamConverter(DTZConverter.class)
    private LocalDateTime date;

    private String location;

    private Float longitude;

    private Float latitude;

    private Integer depth;

    private Float magnitude;

    private String reportingUnit;

    private String picture;


}
