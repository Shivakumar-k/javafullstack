package com.xworkz.abstraction.link;

	public abstract class AbstractInfo {

		private String createdBy = "SK";
		private String updatedBy = "SHIVA";

		public AbstractInfo() {

		}

		public AbstractInfo(String createdBy, String updatedBy) {
			this.createdBy = createdBy;
			this.updatedBy = updatedBy;
		}

		@Override
		public String toString() {
			return "AbstractInfo [Created By=" + createdBy + ", Updated By=" + updatedBy + "]";
		}

	}


