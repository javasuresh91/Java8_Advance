package com.pojo;

import java.util.List;

public class Detail {

	private int detailsId;

	private List<String> parts;

	/**
	 * @return the detailsId
	 */
	public int getDetailsId() {
		return detailsId;
	}

	/**
	 * @param detailsId
	 *            the detailsId to set
	 */
	public void setDetailsId(int detailsId) {
		this.detailsId = detailsId;
	}

	/**
	 * @return the parts
	 */
	public List<String> getParts() {
		return parts;
	}

	/**
	 * @param parts
	 *            the parts to set
	 */
	public void setParts(List<String> parts) {
		this.parts = parts;
	}

	public Detail(int detailsId, List<String> parts) {
		super();
		this.detailsId = detailsId;
		this.parts = parts;
	}

}
