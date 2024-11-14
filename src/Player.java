// プレイヤークラス
public class Player
{
    // メンバ変数定義
    // プレイヤーが持っているカード情報
    private Card card_info;

    // コンストラクタ(初期化処理)
    public Player()
    {
        card_info = new Card(); // オブジェクトを生成

        // カード情報を初期化
        card_info.no = 0;   // 数字
        card_info.suit = 0; // マーク
    }
	
    // メソッド定義
    // カードを1枚ドロー
    public void Draw(Deck deck)
    {
        // ドローしたカード情報を取得
        card_info = deck.GetCard();
        return;
    }

    // プレイヤーが持っているカードの数字を取得
    public int GetNo()
    {
        return card_info.no;
    }
    // プレイヤーが持っているカードのマークを取得
    public int GetSuit()
    {
        return card_info.suit;
    }
}	
