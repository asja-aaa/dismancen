package com.buptse.dismancen.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
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
