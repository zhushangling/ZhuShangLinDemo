/*@(#)D2106JatTpInfoReqBo.java   2020-5-14 
 * Copy Right 2020 Bank of Communications Co.Ltd.
 * All Copyright Reserved
 */

package cn.tedu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * TODO Document D2106JatTpInfoReqBo
 * <p>
 * @version 1.0.0,2020-5-14
 * @author zhu
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class D2106JatTpInfoReqBo {
	@XmlElement(name="JAT_TP_PRO_ID")
	String jatTpProId;//招标项目编号
	@XmlElement(name="JAT_TP_PRO_NAME")
	String jatTpProName;//招标项目名称
	@XmlElement(name="JAT_TPS_PRO_ID")
	String jatTpsProId;//招标标段编号
	@XmlElement(name="JAT_TPS_NAME")
	String jatTpsName;//标段名称
	@XmlElement(name="JAT_TPS_CONTENT")
	String jatTpsContent;//标段内容
	@XmlElement(name="JAT_TP_PEOPLE_NAME")
	String jatTpPeopleName;//中标人名称
	@XmlElement(name="JAT_TP_PEOPLE_ID")
	String jatTpPeopleId;//中标人供应商ID
	@XmlElement(name="JAT_WIN_PRICE")
	String jatWinPrice;//中标金额
	@XmlElement(name="JAT_WIN_TIME")
	String jatWinTime;//中标时间
	@XmlElement(name="OBJ_TYPE")
	String objType;//采购标的类型
	@XmlElement(name="MARK1")
	String mark1;//预留字段1
	@XmlElement(name="MARK2")
	String mark2;//预留字段2
	@XmlElement(name="MARK3")
	String mark3;//预留字段3
	@XmlElement(name="MARK4")
	String mark4;//预留字段4
	@XmlElement(name="MARK5")
	String mark5;//预留字段5

	/**
	 * @return  jatTpProId
	 */
	public String getJatTpProId() {
		return jatTpProId;
	}
	/**
	 * @param  jatTpProId
	 */
	public void setJatTpProId(String jatTpProId) {
		this.jatTpProId = jatTpProId;
	}
	/**
	 * @return  jatTpProName
	 */
	public String getJatTpProName() {
		return jatTpProName;
	}
	/**
	 * @param  jatTpProName
	 */
	public void setJatTpProName(String jatTpProName) {
		this.jatTpProName = jatTpProName;
	}
	/**
	 * @return  jatTpsProId
	 */
	public String getJatTpsProId() {
		return jatTpsProId;
	}
	/**
	 * @param  jatTpsProId
	 */
	public void setJatTpsProId(String jatTpsProId) {
		this.jatTpsProId = jatTpsProId;
	}
	/**
	 * @return  jatTpsName
	 */
	public String getJatTpsName() {
		return jatTpsName;
	}
	/**
	 * @param  jatTpsName
	 */
	public void setJatTpsName(String jatTpsName) {
		this.jatTpsName = jatTpsName;
	}
	/**
	 * @return  jatTpsContent
	 */
	public String getJatTpsContent() {
		return jatTpsContent;
	}
	/**
	 * @param  jatTpsContent
	 */
	public void setJatTpsContent(String jatTpsContent) {
		this.jatTpsContent = jatTpsContent;
	}
	/**
	 * @return  jatTpPeopleName
	 */
	public String getJatTpPeopleName() {
		return jatTpPeopleName;
	}
	/**
	 * @param  jatTpPeopleName
	 */
	public void setJatTpPeopleName(String jatTpPeopleName) {
		this.jatTpPeopleName = jatTpPeopleName;
	}
	/**
	 * @return  jatTpPeopleId
	 */
	public String getJatTpPeopleId() {
		return jatTpPeopleId;
	}
	/**
	 * @param  jatTpPeopleId
	 */
	public void setJatTpPeopleId(String jatTpPeopleId) {
		this.jatTpPeopleId = jatTpPeopleId;
	}
	/**
	 * @return  jatWinPrice
	 */
	public String getJatWinPrice() {
		return jatWinPrice;
	}
	/**
	 * @param  jatWinPrice
	 */
	public void setJatWinPrice(String jatWinPrice) {
		this.jatWinPrice = jatWinPrice;
	}
	/**
	 * @return  jatWinTime
	 */
	public String getJatWinTime() {
		return jatWinTime;
	}
	/**
	 * @param  jatWinTime
	 */
	public void setJatWinTime(String jatWinTime) {
		this.jatWinTime = jatWinTime;
	}
	/**
	 * @return  objType
	 */
	public String getObjType() {
		return objType;
	}
	/**
	 * @param  objType
	 */
	public void setObjType(String objType) {
		this.objType = objType;
	}
	/**
	 * @return  mark1
	 */
	public String getMark1() {
		return mark1;
	}
	/**
	 * @param  mark1
	 */
	public void setMark1(String mark1) {
		this.mark1 = mark1;
	}
	/**
	 * @return  mark2
	 */
	public String getMark2() {
		return mark2;
	}
	/**
	 * @param  mark2
	 */
	public void setMark2(String mark2) {
		this.mark2 = mark2;
	}
	/**
	 * @return  mark3
	 */
	public String getMark3() {
		return mark3;
	}
	/**
	 * @param  mark3
	 */
	public void setMark3(String mark3) {
		this.mark3 = mark3;
	}
	/**
	 * @return  mark4
	 */
	public String getMark4() {
		return mark4;
	}
	/**
	 * @param  mark4
	 */
	public void setMark4(String mark4) {
		this.mark4 = mark4;
	}
	/**
	 * @return  mark5
	 */
	public String getMark5() {
		return mark5;
	}
	/**
	 * @param  mark5
	 */
	public void setMark5(String mark5) {
		this.mark5 = mark5;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "D2106JatTpInfoReqBo [jatTpProId=" + jatTpProId
				+ ", jatTpProName=" + jatTpProName + ", jatTpsProId="
				+ jatTpsProId + ", jatTpsName=" + jatTpsName
				+ ", jatTpsContent=" + jatTpsContent + ", jatTpPeopleName="
				+ jatTpPeopleName + ", jatTpPeopleId=" + jatTpPeopleId
				+ ", jatWinPrice=" + jatWinPrice + ", jatWinTime=" + jatWinTime
				+ ", objType=" + objType + ", mark1=" + mark1 + ", mark2="
				+ mark2 + ", mark3=" + mark3 + ", mark4=" + mark4 + ", mark5="
				+ mark5 + "]";
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((jatTpPeopleId == null) ? 0 : jatTpPeopleId.hashCode());
		result = prime * result
				+ ((jatTpPeopleName == null) ? 0 : jatTpPeopleName.hashCode());
		result = prime * result
				+ ((jatTpProId == null) ? 0 : jatTpProId.hashCode());
		result = prime * result
				+ ((jatTpProName == null) ? 0 : jatTpProName.hashCode());
		result = prime * result
				+ ((jatTpsContent == null) ? 0 : jatTpsContent.hashCode());
		result = prime * result
				+ ((jatTpsName == null) ? 0 : jatTpsName.hashCode());
		result = prime * result
				+ ((jatTpsProId == null) ? 0 : jatTpsProId.hashCode());
		result = prime * result
				+ ((jatWinPrice == null) ? 0 : jatWinPrice.hashCode());
		result = prime * result
				+ ((jatWinTime == null) ? 0 : jatWinTime.hashCode());
		result = prime * result + ((mark1 == null) ? 0 : mark1.hashCode());
		result = prime * result + ((mark2 == null) ? 0 : mark2.hashCode());
		result = prime * result + ((mark3 == null) ? 0 : mark3.hashCode());
		result = prime * result + ((mark4 == null) ? 0 : mark4.hashCode());
		result = prime * result + ((mark5 == null) ? 0 : mark5.hashCode());
		result = prime * result + ((objType == null) ? 0 : objType.hashCode());
		return result;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		D2106JatTpInfoReqBo or = (D2106JatTpInfoReqBo) obj;
		if (jatTpPeopleId == null) {
			if (or.jatTpPeopleId != null)
				return false;
		} else if (!jatTpPeopleId.equals(or.jatTpPeopleId))
			return false;
		if (jatTpPeopleName == null) {
			if (or.jatTpPeopleName != null)
				return false;
		} else if (!jatTpPeopleName.equals(or.jatTpPeopleName))
			return false;
		if (jatTpProId == null) {
			if (or.jatTpProId != null)
				return false;
		} else if (!jatTpProId.equals(or.jatTpProId))
			return false;
		if (jatTpProName == null) {
			if (or.jatTpProName != null)
				return false;
		} else if (!jatTpProName.equals(or.jatTpProName))
			return false;
		if (jatTpsContent == null) {
			if (or.jatTpsContent != null)
				return false;
		} else if (!jatTpsContent.equals(or.jatTpsContent))
			return false;
		if (jatTpsName == null) {
			if (or.jatTpsName != null)
				return false;
		} else if (!jatTpsName.equals(or.jatTpsName))
			return false;
		if (jatTpsProId == null) {
			if (or.jatTpsProId != null)
				return false;
		} else if (!jatTpsProId.equals(or.jatTpsProId))
			return false;
		if (jatWinPrice == null) {
			if (or.jatWinPrice != null)
				return false;
		} else if (!jatWinPrice.equals(or.jatWinPrice))
			return false;
		if (jatWinTime == null) {
			if (or.jatWinTime != null)
				return false;
		} else if (!jatWinTime.equals(or.jatWinTime))
			return false;
		if (mark1 == null) {
			if (or.mark1 != null)
				return false;
		} else if (!mark1.equals(or.mark1))
			return false;
		if (mark2 == null) {
			if (or.mark2 != null)
				return false;
		} else if (!mark2.equals(or.mark2))
			return false;
		if (mark3 == null) {
			if (or.mark3 != null)
				return false;
		} else if (!mark3.equals(or.mark3))
			return false;
		if (mark4 == null) {
			if (or.mark4 != null)
				return false;
		} else if (!mark4.equals(or.mark4))
			return false;
		if (mark5 == null) {
			if (or.mark5 != null)
				return false;
		} else if (!mark5.equals(or.mark5))
			return false;
		if (objType == null) {
			if (or.objType != null)
				return false;
		} else if (!objType.equals(or.objType))
			return false;
		return true;
	}
	
}
