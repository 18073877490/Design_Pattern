package demo;

public class Client {
    public static void main(String[] args) {
//        1、创建搜狗输入法对象
        SougoInput input = new SougoInput();
//        2、创建需要的皮肤对象
        DefaultSpecificSkin defaultSpecificSkin = new DefaultSpecificSkin();
        MySkin mySkin = new MySkin();
//        3、选择需要的皮肤到输入法中
        input.setSkin(mySkin);
//        4、通过输入法对象展示皮肤
        input.display();
    }


}
