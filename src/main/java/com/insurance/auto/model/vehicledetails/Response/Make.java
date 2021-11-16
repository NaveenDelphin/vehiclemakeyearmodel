package com.insurance.auto.model.vehicledetails.Response;

import java.util.Objects;

public class Make {
	private int mfrid;
	private String mfrname;
	private int makeid;

	/*
	 * public Make(int mfrid, String mfrname, int makeid) { this.mfrid = mfrid;
	 * this.mfrname = mfrname; this.makeid = makeid; }
	 */
	public int getMfrid() {
		return mfrid;
	}
	public void setMfrid(int mfrid) {
		this.mfrid = mfrid;
	}
	public String getMfrname() {
		return mfrname;
	}
	public void setMfrname(String mfrname) {
		this.mfrname = mfrname;
	}
	public int getMakeid() {
		return makeid;
	}
	public void setMakeid(int makeid) {
		this.makeid = makeid;
	}
	@Override
	public String toString() {
		return "Make [mfrid=" + mfrid + ", mfrname=" + mfrname + ", makeid=" + makeid + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(makeid, mfrid, mfrname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Make other = (Make) obj;
		return makeid == other.makeid && mfrid == other.mfrid && Objects.equals(mfrname, other.mfrname);
	}
}
