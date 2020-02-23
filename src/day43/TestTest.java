package day43;

public class TestTest {

    String abc;

    public TestTest(){
        abc="okan";
    }

    public TestTest(String abc){
        this.abc=abc;
    }

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }


    @Override
    public String toString() {
        return "TestTest{" +
                "abc='" + abc + '\'' +
                '}';
    }
}
