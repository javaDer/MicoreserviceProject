package cn.wwtianmei.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2018-06-01
 */
@TableName("shipment_info")
public class ShipmentInfo implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 出发地
	 */
	@TableField(value="begin_city")
	private String beginCity;

	/**
	 * 到达地
	 */
	@TableField(value="end_city")
	private String endCity;

	/**
	 * 车长车型
	 */
	private String commander;

	/**
	 * 货物类型
	 */
	@TableField(value="cargo_type")
	private String cargoType;

	/**
	 * 体积
	 */
	private Integer volume;

	/**
	 * 
	 */
	private Integer weight;

	/**
	 * 备注
	 */
	private String remarks;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 装货时间
	 */
	@TableField(value="loading_time")
	private String loadingTime;

	/**
	 * 
	 */
	@TableField(value="choose_style")
	private Integer chooseStyle;

	/**
	 * 发布时间
	 */
	@TableField(value="release_date")
	private Date releaseDate;

	/**
	 * 
	 */
	private String telphone;

	/**
	 * 
	 */
	private String homeid;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBeginCity() {
		return beginCity;
	}

	public void setBeginCity(String beginCity) {
		this.beginCity = beginCity;
	}

	public String getEndCity() {
		return endCity;
	}

	public void setEndCity(String endCity) {
		this.endCity = endCity;
	}

	public String getCommander() {
		return commander;
	}

	public void setCommander(String commander) {
		this.commander = commander;
	}

	public String getCargoType() {
		return cargoType;
	}

	public void setCargoType(String cargoType) {
		this.cargoType = cargoType;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getLoadingTime() {
		return loadingTime;
	}

	public void setLoadingTime(String loadingTime) {
		this.loadingTime = loadingTime;
	}

	public Integer getChooseStyle() {
		return chooseStyle;
	}

	public void setChooseStyle(Integer chooseStyle) {
		this.chooseStyle = chooseStyle;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getHomeid() {
		return homeid;
	}

	public void setHomeid(String homeid) {
		this.homeid = homeid;
	}

}
