package com.fengmangbilu.microservice.support.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;

import com.fengmangbilu.domain.BaseEntity;

@Entity
@Table(name = "fengmangbilu_feedback")
public class Feedback extends BaseEntity {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	private String id;

	@NotBlank(message = "请输入反馈内容")
	@Size(min = 10, max = 500, message = "请填写10~500个字的描述")
	@Column(length = 600)
	private String content;

	@Column(length = 600)
	private String imgUrls;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImgUrls() {
		return imgUrls;
	}

	public void setImgUrls(String imgUrls) {
		this.imgUrls = imgUrls;
	}

}
