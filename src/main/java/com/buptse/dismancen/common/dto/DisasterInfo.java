package com.buptse.dismancen.common.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @ClassName DisasterInfo
 * @Description TODO
 * @Author ASJA
 * @Date 2021/5/15 15:59
 * @Version 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
@XStreamAlias(value = "disasterInfo")
public class DisasterInfo<T> {

    @XStreamImplicit(itemFieldName="info")
    private List<T> info;
}
