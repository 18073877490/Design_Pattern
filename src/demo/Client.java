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
    public abstract static class AbstractSkin {
        public abstract void display();
    }
    public static class DefaultSpecificSkin extends AbstractSkin {
        @Override
        public void display(){
            System.out.println("这是默认皮肤");
        }
    }
    public static class MySkin extends AbstractSkin {
        public void display() {
            System.out.println("这是我的皮肤");
        }
    }
    public static class SougoInput {
        private AbstractSkin skin;
        public void setSkin(AbstractSkin skin) {
            this.skin = skin;
        }
        public void display() {
            this.skin.display();
        }
    }
}
