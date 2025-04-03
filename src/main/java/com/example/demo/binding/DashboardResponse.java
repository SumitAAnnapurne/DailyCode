package com.example.demo.binding;

public class DashboardResponse {

	private Integer totalEnquiriesCount;
	private Integer enrolledCnt;
	private Integer lostcnt;

	public Integer getTotalEnquiriesCount() {
		return totalEnquiriesCount;
	}

	public void setTotalEnquiriesCount(Integer totalEnquiriesCount) {
		this.totalEnquiriesCount = totalEnquiriesCount;
	}

	public Integer getEnrolledCnt() {
		return enrolledCnt;
	}

	public void setEnrolledCnt(Integer enrolledCnt) {
		this.enrolledCnt = enrolledCnt;
	}

	public Integer getLostcnt() {
		return lostcnt;
	}

	public void setLostcnt(Integer lostcnt) {
		this.lostcnt = lostcnt;
	}

	@Override
	public String toString() {
		return "DashboardResponse [totalEnquiriesCount=" + totalEnquiriesCount + ", enrolledCnt=" + enrolledCnt
				+ ", lostcnt=" + lostcnt + "]";
	}

}
