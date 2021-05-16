package com.buptse.dismancen.common.dto;

import com.buptse.dismancen.entity.BasicEarthquake;
import lombok.*;
import lombok.experimental.Accessors;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
public class FileDto<T>{


    @XmlElement(name="disasterInfo")
    private DisasterInfo<T> disasterInfo;

}

