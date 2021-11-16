package com.insurance.auto.model.vehicledetails.Response;

import java.util.Objects;

public class Year {
	private int mfrid;
	private String mfrname;

	/*
	 * public Year(int yearid, String makename) {
	 * 
	 * this.mfrid = yearid; this.mfrname = makename; }
	 */
	public int getYearid() {
		return mfrid;
	}
	public void setYearid(int yearid) {
		this.mfrid = yearid;
	}
	public String getMakename() {
		return mfrname;
	}
	public void setMakename(String makename) {
		this.mfrname = makename;
	}
	@Override
	public String toString() {
		return "Year [yearid=" + mfrid + ", makename=" + mfrname + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(mfrname, mfrid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Year other = (Year) obj;
		return Objects.equals(mfrname, other.mfrname) && mfrid == other.mfrid;
	}
}
