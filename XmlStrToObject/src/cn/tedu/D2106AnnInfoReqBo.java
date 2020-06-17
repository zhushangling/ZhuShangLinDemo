/*@(#)D2106AnnInfoReqBo.java   2020-5-14 
 * Copy Right 2020 Bank of Communications Co.Ltd.
 * All Copyright Reserved
 */

package cn.tedu;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * TODO Document D2106AnnInfoReqBo
 * <p>
 * @version 1.0.0,2020-5-14
 * @author zhu
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class D2106AnnInfoReqBo {
	@XmlElement(name="ANN_CODE")
	String annCode;//中标公告编号
	@XmlElement(name="STATUS")
	String status;//公告有效标志
	@XmlElement(name="CONFIRM_TIME")
	String confirmTime;//中标公告日期
	@XmlElement(name="PROCUREMENT_TYPE")
	String procurementType;//采购方式
	@XmlElement(name="PLAN_NUMBER")
	String planNumber;//采购计划编号
	@XmlElement(name="PROJECT_NAME")
	String projectName;//采购项目名称
	@XmlElement(name="TOTAL")
	BigDecimal total;//金额
	@XmlElement(name="DEPARTMENT_NAME")
	String departmentName;//采购单位名称
	@XmlElement(name="AGENCY_NAME")
	String agencyName;//代理机构名称
	@XmlElement(name="SUPPLIER_NAME")
	String supplierName;//供应商名称
	@XmlElement(name="SUPPLIER_ID")
	String supplierId;//供应商ID
	@XmlElement(name="OBJ_TYPE")
	String objType;//采购标的类型
	@XmlElement(name="JAT_TPS_NUM")
	int jatTpsNum;//中标标段数量
	@XmlElement(name="MARK1")
	String mark1;//行政区划编码
	@XmlElement(name="MARK2")
	String mark2;//预留字段
	@XmlElement(name="MARK3")
	String mark3;//预留字段
	@XmlElement(name="MARK4")
	String mark4;//预留字段
	@XmlElement(name="MARK5")
	String mark5;//预留字段
	@XmlElementWrapper(name="LIST")
    @XmlElement(name="JAT_TP_INFO") 
	List<D2106JatTpInfoReqBo> jatTpInfo;
	/**
	 * @return  annCode
	 */
	public String getAnnCode() {
		return annCode;
	}
	/**
	 * @param  annCode
	 */
	public void setAnnCode(String annCode) {
		this.annCode = annCode;
	}
	/**
	 * @return  status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param  status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return  confirmTime
	 */
	public String getConfirmTime() {
		return confirmTime;
	}
	/**
	 * @param  confirmTime
	 */
	public void setConfirmTime(String confirmTime) {
		this.confirmTime = confirmTime;
	}
	/**
	 * @return  procurementType
	 */
	public String getProcurementType() {
		return procurementType;
	}
	/**
	 * @param  procurementType
	 */
	public void setProcurementType(String procurementType) {
		this.procurementType = procurementType;
	}
	/**
	 * @return  planNumber
	 */
	public String getPlanNumber() {
		return planNumber;
	}
	/**
	 * @param  planNumber
	 */
	public void setPlanNumber(String planNumber) {
		this.planNumber = planNumber;
	}
	/**
	 * @return  projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param  projectName
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return  total
	 */
	public BigDecimal getTotal() {
		return total;
	}
	/**
	 * @param  total
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	/**
	 * @return  departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * @param  departmentName
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 * @return  agencyName
	 */
	public String getAgencyName() {
		return agencyName;
	}
	/**
	 * @param  agencyName
	 */
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	/**
	 * @return  supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}
	/**
	 * @param  supplierName
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	/**
	 * @return  supplierId
	 */
	public String getSupplierId() {
		return supplierId;
	}
	/**
	 * @param  supplierId
	 */
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
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
	 * @return  jatTpsNum
	 */
	public Integer getJatTpsNum() {
		return jatTpsNum;
	}
	/**
	 * @param  jatTpsNum
	 */
	public void setJatTpsNum(Integer jatTpsNum) {
		this.jatTpsNum = jatTpsNum;
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
	 * @return  jatTpInfo
	 */
	public List<D2106JatTpInfoReqBo> getJatTpInfo() {
		return jatTpInfo;
	}
	/**
	 * @param  jatTpInfo
	 */
	public void setJatTpInfo(List<D2106JatTpInfoReqBo> jatTpInfo) {
		this.jatTpInfo = jatTpInfo;
	}
	/** 
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "D2106AnnInfoReqBo [annCode=" + annCode + ", status=" + status
				+ ", confirmTime=" + confirmTime + ", procurementType="
				+ procurementType + ", planNumber=" + planNumber
				+ ", projectName=" + projectName + ", total=" + total
				+ ", departmentName=" + departmentName + ", agencyName="
				+ agencyName + ", supplierName=" + supplierName
				+ ", supplierId=" + supplierId + ", objType=" + objType
				+ ", jatTpsNum=" + jatTpsNum + ", mark1=" + mark1 + ", mark2="
				+ mark2 + ", mark3=" + mark3 + ", mark4=" + mark4 + ", mark5="
				+ mark5 + ", jatTpInfo=" + jatTpInfo + "]";
	}
	/** 
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((agencyName == null) ? 0 : agencyName.hashCode());
		result = prime * result + ((annCode == null) ? 0 : annCode.hashCode());
		result = prime * result
				+ ((confirmTime == null) ? 0 : confirmTime.hashCode());
		result = prime * result
				+ ((departmentName == null) ? 0 : departmentName.hashCode());
		result = prime * result
				+ ((jatTpInfo == null) ? 0 : jatTpInfo.hashCode());
		result = prime * result + jatTpsNum;
		result = prime * result + ((mark1 == null) ? 0 : mark1.hashCode());
		result = prime * result + ((mark2 == null) ? 0 : mark2.hashCode());
		result = prime * result + ((mark3 == null) ? 0 : mark3.hashCode());
		result = prime * result + ((mark4 == null) ? 0 : mark4.hashCode());
		result = prime * result + ((mark5 == null) ? 0 : mark5.hashCode());
		result = prime * result + ((objType == null) ? 0 : objType.hashCode());
		result = prime * result
				+ ((planNumber == null) ? 0 : planNumber.hashCode());
		result = prime * result
				+ ((procurementType == null) ? 0 : procurementType.hashCode());
		result = prime * result
				+ ((projectName == null) ? 0 : projectName.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((supplierId == null) ? 0 : supplierId.hashCode());
		result = prime * result
				+ ((supplierName == null) ? 0 : supplierName.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
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
		D2106AnnInfoReqBo or = (D2106AnnInfoReqBo) obj;
		if (agencyName == null) {
			if (or.agencyName != null)
				return false;
		} else if (!agencyName.equals(or.agencyName))
			return false;
		if (annCode == null) {
			if (or.annCode != null)
				return false;
		} else if (!annCode.equals(or.annCode))
			return false;
		if (confirmTime == null) {
			if (or.confirmTime != null)
				return false;
		} else if (!confirmTime.equals(or.confirmTime))
			return false;
		if (departmentName == null) {
			if (or.departmentName != null)
				return false;
		} else if (!departmentName.equals(or.departmentName))
			return false;
		if (jatTpInfo == null) {
			if (or.jatTpInfo != null)
				return false;
		} else if (!jatTpInfo.equals(or.jatTpInfo))
			return false;
		if (jatTpsNum != or.jatTpsNum)
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
		if (planNumber == null) {
			if (or.planNumber != null)
				return false;
		} else if (!planNumber.equals(or.planNumber))
			return false;
		if (procurementType == null) {
			if (or.procurementType != null)
				return false;
		} else if (!procurementType.equals(or.procurementType))
			return false;
		if (projectName == null) {
			if (or.projectName != null)
				return false;
		} else if (!projectName.equals(or.projectName))
			return false;
		if (status == null) {
			if (or.status != null)
				return false;
		} else if (!status.equals(or.status))
			return false;
		if (supplierId == null) {
			if (or.supplierId != null)
				return false;
		} else if (!supplierId.equals(or.supplierId))
			return false;
		if (supplierName == null) {
			if (or.supplierName != null)
				return false;
		} else if (!supplierName.equals(or.supplierName))
			return false;
		if (total == null) {
			if (or.total != null)
				return false;
		} else if (!total.equals(or.total))
			return false;
		return true;
	}
	
	

}
