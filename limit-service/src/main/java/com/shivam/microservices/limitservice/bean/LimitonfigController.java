package com.shivam.microservices.limitservice.bean;

public class LimitonfigController {
		private int max;
		private int min;
		public int getMax() {
			return max;
		}
		public int getMin() {
			return min;
		}
		public LimitonfigController(int max, int min) {
			super();
			this.max = max;
			this.min = min;
		}
		
}
