package demo;

public class SougoInput {
    private Client.AbstractSkin skin;

    public void setSkin(Client.AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        this.skin.display();
    }
}
