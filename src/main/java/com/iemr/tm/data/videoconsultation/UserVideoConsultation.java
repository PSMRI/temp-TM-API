/*
* AMRIT – Accessible Medical Records via Integrated Technology
* Integrated EHR (Electronic Health Records) Solution
*
* Copyright (C) "Piramal Swasthya Management and Research Institute"
*
* This file is part of AMRIT.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see https://www.gnu.org/licenses/.
*/
package com.iemr.tm.data.videoconsultation;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

import com.google.gson.annotations.Expose;
import com.iemr.tm.utils.mapper.OutputMapper;


@Entity
@Table(name = "m_userswymedmapping")
public class UserVideoConsultation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Expose
	@Column(name = "UserSwymedMapID")
	private Long userVideoConsultationMapID;

	@Expose
	@Column(name = "userID")
	private Long userID;
	@Expose
	@Column(name = "SwymedID")
	private Long videoConsultationID;
	@Expose
	@Column(name = "SwymedPassword")
	private String videoConsultationPassword;
	
	@Expose
	@Column(name = "SwymedEmailID")
	private String videoConsultationEmailID;
	
	@Expose
	@Column(name = "SwymedDomain")
	private String videoConsultationDomain;

	@Expose
	@Column(name = "Deleted", insertable = false, updatable = true)
	private Boolean Deleted;
	private String CreatedBy;
	@Column(name = "CreatedDate", insertable = false, updatable = false)
	private Timestamp CreatedDate;
	private String ModifiedBy;
	@Column(name = "LastModDate", insertable = false, updatable = false)
	private Timestamp LastModDate;

	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UserID", insertable = false, updatable = false)
	@Expose
	private M_UserTemp user;
	
	@Transient
	private OutputMapper outputMapper = new OutputMapper();
	
	@Transient
	private String username ;

	@Override
	public String toString() {
		return outputMapper.gson().toJson(this);
	}

	
	public UserVideoConsultation(){
		
	}
	
	public UserVideoConsultation(UserVideoConsultation sw,String username){
		this.videoConsultationDomain=sw.getVideoConsultationDomain();
		this.videoConsultationPassword=sw.getVideoConsultationPassword();
		this.videoConsultationEmailID=sw.getVideoConsultationEmailID();
		this.username=username;
		
	}
	
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Long getUserVideoConsultationMapID() {
		return userVideoConsultationMapID;
	}

	public void setUserVideoConsultationMapID(Long userVideoConsultationMapID) {
		this.userVideoConsultationMapID = userVideoConsultationMapID;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public Long getVideoConsultationID() {
		return videoConsultationID;
	}

	public void setVideoConsultationID(Long videoConsultationID) {
		this.videoConsultationID = videoConsultationID;
	}

	public String getVideoConsultationPassword() {
		return videoConsultationPassword;
	}

	public void setVideoConsultationPassword(String videoConsultationPassword) {
		this.videoConsultationPassword = videoConsultationPassword;
	}

	public String getVideoConsultationEmailID() {
		return videoConsultationEmailID;
	}

	public void setVideoConsultationEmailID(String videoConsultationEmailID) {
		this.videoConsultationEmailID = videoConsultationEmailID;
	}

	public String getVideoConsultationDomain() {
		return videoConsultationDomain;
	}

	public void setVideoConsultationDomain(String videoConsultationDomain) {
		this.videoConsultationDomain = videoConsultationDomain;
	}

	public Boolean getDeleted() {
		return Deleted;
	}

	public void setDeleted(Boolean deleted) {
		Deleted = deleted;
	}

	public String getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		CreatedDate = createdDate;
	}

	public String getModifiedBy() {
		return ModifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		ModifiedBy = modifiedBy;
	}

	public Timestamp getLastModDate() {
		return LastModDate;
	}

	public void setLastModDate(Timestamp lastModDate) {
		LastModDate = lastModDate;
	}

	public M_UserTemp getUser() {
		return user;
	}

	public void setUser(M_UserTemp user) {
		this.user = user;
	}

	public OutputMapper getOutputMapper() {
		return outputMapper;
	}

	public void setOutputMapper(OutputMapper outputMapper) {
		this.outputMapper = outputMapper;
	}

	
}
