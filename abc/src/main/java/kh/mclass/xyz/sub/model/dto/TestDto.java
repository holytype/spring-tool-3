package kh.mclass.xyz.sub.model.dto;


//@Component("testDto")
	public class TestDto {
		
		private String a1;
		private String a2;
		private TestFileDto testFileDto;
		public TestDto() {
			super();
		}
		public TestDto(String a1) {
			super();
			this.a1 = a1;
		}
		public TestDto(String a1, String a2, TestFileDto testFileDto) {
			super();
			this.a1 = a1;
			this.a2 = a2;
			this.testFileDto = testFileDto;
		}
		@Override
		public String toString() {
			return "TestDto [a1=" + a1 + ", a2=" + a2 + ", testFileDto=" + testFileDto + "]";
		}
		public String getA1() {
			return a1;
		}
		public void setA1(String a1) {
			this.a1 = a1;
		}
		public String getA2() {
			return a2;
		}
		public void setA2(String a2) {
			this.a2 = a2;
		}
		public TestFileDto getTestFileDto() {
			return testFileDto;
		}
		public void setTestFileDto(TestFileDto testFileDto) {
			this.testFileDto = testFileDto;
		}
		
}
