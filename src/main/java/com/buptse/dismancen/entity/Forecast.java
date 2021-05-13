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
public class Forecast implements Serializable {

    private static final long serialVersionUID = 1L;

    private LocalDateTime date;

    private Integer grade;

    private Integer intensity;

    private Integer type;

    private String picture;


}
