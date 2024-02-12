package com.sysintelli.application.basic.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name="candidate_info")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CandidateInfo {
// @Override
// public String toString() {
// return "CandidateInfo [candidateId=" + candidateId + ", candidateName=" + candidateName + ", skills=" + skills
// + ", mobile=" + mobile + ", email=" + email + "]";
// }
//
// public Integer getCandidateId() {
// return candidateId;
// }
//
// public void setCandidateId(Integer candidateId) {
// this.candidateId = candidateId;
// }
//
// public String getCandidateName() {
// return candidateName;
// }
//
// public CandidateInfo() {
// super();
// }
//
// public CandidateInfo(Integer candidateId, String candidateName, String skills, String mobile, String email) {
// super();
// this.candidateId = candidateId;
// this.candidateName = candidateName;
// this.skills = skills;
// this.mobile = mobile;
// this.email = email;
// }
//
// public void setCandidateName(String candidateName) {
// this.candidateName = candidateName;
// }
//
// public String getSkills() {
// return skills;
// }
//
// public void setSkills(String skills) {
// this.skills = skills;
// }
//
// public String getMobile() {
// return mobile;
// }
//
// public void setMobile(String mobile) {
// this.mobile = mobile;
// }
//
// public String getEmail() {
// return email;
// }
//
// public void setEmail(String email) {
// this.email = email;
// }

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "candidate_id")
private Integer candidateId;

@Column(name = "recruiter_id")
private Integer recruiterId;

@Column(name = "profile_id")
private String profileId;

@Column(name = "initial_submission_to_client")
private String initialSubmissionToClient;

@Column(name = "submission_date")
private Date submissionDate;

@Column(name = "candidate_name")
private String candidateName;


@Column(name = "position")
private String position;


@Column(name = "skills")
private String skills;


@Column(name = "sub_skills")
private String subSkills;

@Column(name = "mobile_country_code")
private String mobileCountryCode;


@Column(name = "mobile")
private String mobile;

@Column(name = "alternate_mobile_country_code")
private String alternateMobileCountryCode;


@Column(name = "alternate_mobile")
private String alternateMobile;


@Column(name = "email_primary")
private String email;


@Column(name = "email_secondary")
private String alternateEmail;


@Column(name = "years_of_exp")
private String yearsOfExp;


@Column(name = "relevent_exp")
private String releventExp;


@Column(name = "present_ctc")
private Double pctc;


@Column(name = "expected_ctc")
private Double ectc;


@Column(name = "notice_period_in_months")
private String noticePeriod;

@Column(name = "last_working_day")
private Date lastWorkingDay;


@Column(name = "present_location")
private String presentLocation;


@Column(name = "prefered_location")
private String preferredLocation;


@Column(name = "original_source_of_profile")
private String originalSourceOfProfile;


@Column(name = "quality_of_profile")
private Integer qualityOfProfile;

@Column(name = "comments")
private String comments;


@Column(name = "linkdin_url")
private String linkdin;

@Column(name = "created_by_id")
private Integer createdById;

@Column(name = "updated_by_id")
private Integer updatedById;


@Column(name = "created_date")
private Date createdDate;


@Column(name = "updated_date")
private Date updatedDate;

@Column(name = "resume")
private String resume;

@Column(name = "profile_img")
private String profileImg;

@Column(name = "metastatus")
private Boolean metaStatus;

@Column(name = "company_id")
private Integer companyId;


@Column(name = "pan_number")
private String panNo;

@Column(name = "passport_number")
private String passportNo;


@Column(name = "aadhaar_number")
private String aadhaarNo;


@Column(name = "pctc_currency_code")
private String pctcCurrencyCode;


@Column(name = "ectc_currency_code")
private String ectcCurrencyCode;


}
