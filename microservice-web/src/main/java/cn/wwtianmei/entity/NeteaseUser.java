package cn.wwtianmei.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2018-06-01
 */
@TableName("netease_user")
public class NeteaseUser implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 
	 */
	private String neteaseaccid;

	/**
	 * 
	 */
	private String phone;

	/**
	 * 
	 */
	private String nickname;

	/**
	 * 
	 */
	private Integer sex;

	/**
	 * 
	 */
	private String avatar;

	/**
	 * 
	 */
	private String title;

	/**
	 * 
	 */
	private String neteasetoken;

	/**
	 * 
	 */
	private String username;

	/**
	 * 
	 */
	private String password;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNeteaseaccid() {
		return neteaseaccid;
	}

	public void setNeteaseaccid(String neteaseaccid) {
		this.neteaseaccid = neteaseaccid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNeteasetoken() {
		return neteasetoken;
	}

	public void setNeteasetoken(String neteasetoken) {
		this.neteasetoken = neteasetoken;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
