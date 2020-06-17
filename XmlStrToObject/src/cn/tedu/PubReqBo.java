/*@(#)D2104ReqBo.java   2020-5-14 
 * Copy Right 2020 Bank of Communications Co.Ltd.
 * All Copyright Reserved
 */

package cn.tedu;
import javax.xml.bind.annotation.*;
import java.util.Objects;

/**
 * 第三方发起公共头信息
 * <p>
 * 
 * @version 1.0.0,2020-5-14
 * @author Sun
 * @since 1.0.0
 */
@XmlRootElement(name="HEAD")
@XmlAccessorType(XmlAccessType.FIELD)  
public class PubReqBo {
	/**
	 * 消息ID
	 */
	@XmlElement(name = "MSGID")
	private String msgid;
	/**
	 * 原消息ID
	 */
	@XmlElement(name = "ORGNLMSGID")
	private String orgnlmsgid;
	/**
	 * 交易码
	 */
	@XmlElement(name = "TRANSCODE")
	private String transcode;
	/**
	 * 发送日期
	 */
	@XmlElement(name = "SENDDATE")
	private String senddate;
	/**
	 * 发送时间
	 */
	@XmlElement(name = "SENDTIME")
	private String sendtime;
	/**
	 * 错误码
	 */
	@XmlElement(name = "ERRCODE")
	private String errcode;
	/**
	 * 错误信息
	 */
	@XmlElement(name = "ERRMSG")
	private String errmsg;

	@Override
	public String toString() {
		return "PubReqBo{" +
				"msgid='" + msgid + '\'' +
				", orgnlmsgid='" + orgnlmsgid + '\'' +
				", transcode='" + transcode + '\'' +
				", senddate='" + senddate + '\'' +
				", sendtime='" + sendtime + '\'' +
				", errcode='" + errcode + '\'' +
				", errmsg='" + errmsg + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PubReqBo pubReqBo = (PubReqBo) o;
		return Objects.equals(msgid, pubReqBo.msgid) &&
				Objects.equals(orgnlmsgid, pubReqBo.orgnlmsgid) &&
				Objects.equals(transcode, pubReqBo.transcode) &&
				Objects.equals(senddate, pubReqBo.senddate) &&
				Objects.equals(sendtime, pubReqBo.sendtime) &&
				Objects.equals(errcode, pubReqBo.errcode) &&
				Objects.equals(errmsg, pubReqBo.errmsg);
	}

	@Override
	public int hashCode() {
		return Objects.hash(msgid, orgnlmsgid, transcode, senddate, sendtime, errcode, errmsg);
	}
}
