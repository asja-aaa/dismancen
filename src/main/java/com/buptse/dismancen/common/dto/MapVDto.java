package com.buptse.dismancen.common.dto;

import com.buptse.dismancen.entity.BasicEarthquake;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MapVDto
 * @Description TODO
 * @Author ASJA
 * @Date 2021/5/21 22:26
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
public class MapVDto {
    private String lnglat;

    private Integer depth;

    private Float magnitude;

    private String reportingUnit;

    private LocalDateTime date;

    public MapVDto(BasicEarthquake basicEarthquake){

        this.lnglat =String.valueOf(basicEarthquake.getLongitude()) + ","+ String.valueOf(basicEarthquake.getLatitude());
        this.depth = basicEarthquake.getDepth();
        this.magnitude = basicEarthquake.getMagnitude();
        this.reportingUnit = basicEarthquake.getReportingUnit();
        this.date = basicEarthquake.getDate();
    }

    public static List<MapVDto> mapVDtoList(List<BasicEarthquake> basicEarthquakeList){
        List<MapVDto> mapVDtoList = new ArrayList<MapVDto>();
        basicEarthquakeList.forEach(item->{
            mapVDtoList.add(new MapVDto(item));
        });
        return mapVDtoList;
    }


}
