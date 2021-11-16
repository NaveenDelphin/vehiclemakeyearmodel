package com.insurance.auto.model.vehicledetails.Response;

import java.util.Objects;

public class Model {
	private int mfrid;
	private String mfrname;
	private int makeid;
	private String makename;

	/*
	 * public Model(int mfrid, String mfrname, int makeid, String makename) {
	 * super(); this.mfrid = mfrid; this.mfrname = mfrname; this.makeid = makeid;
	 * this.makename = makename; }
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
	public String getMakename() {
		return makename;
	}
	public void setMakename(String makename) {
		this.makename = makename;
	}
	@Override
	public String toString() {
		return "Model [mfrid=" + mfrid + ", mfrname=" + mfrname + ", makeid=" + makeid + ", makename=" + makename + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(makeid, makename, mfrid, mfrname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Model other = (Model) obj;
		return makeid == other.makeid && Objects.equals(makename, other.makename) && mfrid == other.mfrid
				&& Objects.equals(mfrname, other.mfrname);
	}
}
