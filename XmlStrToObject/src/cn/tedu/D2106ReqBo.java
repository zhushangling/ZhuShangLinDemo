/*@(#)D2106ReqBo.java   2020-5-14 
 * Copy Right 2020 Bank of Communications Co.Ltd.
 * All Copyright Reserved
 */

package cn.tedu;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * TODO Document D2106ReqBo
 * <p>
 * @version 1.0.0,2020-5-14
 * @author zhu
 * @since 1.0.0
 */
@XmlRootElement(name="BODY")
@XmlAccessorType(XmlAccessType.FIELD)
public class D2106ReqBo {
	@XmlElementWrapper(name="LIST")
    @XmlElement(name="ANN_INFO") //name表示对应的xml的标签节点，将<ANN_INFO>标签下的数据转为annInfo属性
	List<D2106AnnInfoReqBo> annInfo;

	public List<D2106AnnInfoReqBo> getAnnInfo() {
		return annInfo;
	}

	public void setAnnInfo(List<D2106AnnInfoReqBo> annInfo) {
		this.annInfo = annInfo;
	}


	@Override
	public String toString() {
		return "D2106ReqBo [annInfo=" + annInfo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((annInfo == null) ? 0 : annInfo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		D2106ReqBo other = (D2106ReqBo) obj;
		if (annInfo == null) {
			if (other.annInfo != null)
				return false;
		} else if (!annInfo.equals(other.annInfo))
			return false;
		return true;
	}
	

}
