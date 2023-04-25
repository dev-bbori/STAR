package com.star.report.domain;

public class ReportVO {
	private Long reportId;
	private String reportTitle;
	private Long userNumber;
	private String reportContent;
	private Long useNumber;

	public ReportVO() {;}

	public final Long getReportId() {
		return reportId;
	}

	public final void setReportId(Long reportId) {
		this.reportId = reportId;
	}

	public final String getReportTitle() {
		return reportTitle;
	}

	public final void setReportTitle(String reportTitle) {
		this.reportTitle = reportTitle;
	}

	public final Long getUserNumber() {
		return userNumber;
	}

	public final void setUserNumber(Long userNumber) {
		this.userNumber = userNumber;
	}

	public final String getReportContent() {
		return reportContent;
	}

	public final void setReportContent(String reportContent) {
		this.reportContent = reportContent;
	}

	public final Long getUseNumber() {
		return useNumber;
	}

	public final void setUseNumber(Long useNumber) {
		this.useNumber = useNumber;
	}

	@Override
	public String toString() {
		return "ReportVO [reportId=" + reportId + ", reportTitle=" + reportTitle + ", userNumber=" + userNumber
				+ ", reportContent=" + reportContent + ", useNumber=" + useNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reportId == null) ? 0 : reportId.hashCode());
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
		ReportVO other = (ReportVO) obj;
		if (reportId == null) {
			if (other.reportId != null)
				return false;
		} else if (!reportId.equals(other.reportId))
			return false;
		return true;
	}
	
	
}
