package com.gwd.domain.user;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="users")
public class User {
	@Id  
    @GeneratedValue  
    private Integer id;
	
    private String username;
    
    private String password;
    
    private Date birthday;
    
    private String email;
    
    private String phonenum;
    
    private String address;
    
    private String ipAddress;
    
    private String lastIpAddress;
    
    private Date lastLogTime;
    
    private String sex;
    
    private String realName;
    
    private String idNum;
    
    private byte[] imageBase64decode;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public String getLastIpAddress() {
        return lastIpAddress;
    }

    public void setLastIpAddress(String lastIpAddress) {
        this.lastIpAddress = lastIpAddress == null ? null : lastIpAddress.trim();
    }

    public Date getLastLogTime() {
        return lastLogTime;
    }

    public void setLastLogTime(Date lastLogTime) {
        this.lastLogTime = lastLogTime;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum == null ? null : idNum.trim();
    }

    public byte[] getImageBase64decode() {
        return imageBase64decode;
    }

    public void setImageBase64decode(byte[] imageBase64decode) {
        this.imageBase64decode = imageBase64decode;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", birthday=" + birthday
				+ ", email=" + email + ", phonenum=" + phonenum + ", address=" + address + ", ipAddress=" + ipAddress
				+ ", lastIpAddress=" + lastIpAddress + ", lastLogTime=" + lastLogTime + ", sex=" + sex + ", realName="
				+ realName + ", idNum=" + idNum + ", imageBase64decode=" + Arrays.toString(imageBase64decode) + "]";
	}
    
    
}