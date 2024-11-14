// ゲームメインクラス
public class GameMain
{
    public static void main(String[] args)
    {
        // 山札を生成
        Deck deck = new Deck();

        // 親がカードを引く
        Player parent = new Player();
        parent.Draw(deck);

        // 子がカードを引く
        Player child = new Player();
        child.Draw(deck);

        // ゲーム画面を生成
        new Display( parent, child );

        return;
    }
}