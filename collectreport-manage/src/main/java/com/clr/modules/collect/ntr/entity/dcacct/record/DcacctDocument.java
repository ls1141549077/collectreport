package com.clr.modules.collect.ntr.entity.dcacct.record;

import com.clr.modules.collect.ntr.entity.identify.record.IdentifyNormalRecord;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD) //属性映射成xml属性
@XmlRootElement(name="Document") //xml根节点
public class DcacctDocument {
    @XmlElement(name = "InBasInf")
    private IdentifyNormalRecord identifyNormalRecord;

}
