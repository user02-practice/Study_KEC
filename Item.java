package sample09;

import java.time.LocalDate;

/**
 * 小テスト第1回 対策
 * 問題1〜4: Item クラス
 */
public class Item {
    // 問題1: フィールド変数（private）
    private String number;  // 型番
    private String name;    // 品名
    private int price;      // 価格
    private LocalDate date; // 発売日
    private boolean stock;  // 在庫の有無

    // 問題2: コンストラクタ・ゲッター・セッター
    public Item(String number, String name, int price, LocalDate date, boolean stock) {
        this.number = number;
        this.name   = name;
        this.price  = price;
        this.date   = date;
        this.stock  = stock;
    }

    public String getNumber()              { return number; }
    public void   setNumber(String number) { this.number = number; }
    public String getName()                { return name; }
    public void   setName(String name)     { this.name = name; }
    public int    getPrice()               { return price; }
    public void   setPrice(int price)      { this.price = price; }
    public LocalDate getDate()             { return date; }
    public void   setDate(LocalDate date)  { this.date = date; }
    public boolean isStock()               { return stock; }
    public void   setStock(boolean stock)  { this.stock = stock; }

    // 問題3: sougaku メソッド
    public int sougaku(int kosuu) {
        return /*this.*/price * kosuu;
    }

    // 問題4: toString メソッド
    @Override
    public String toString() {
        return "Item [number=" + number + ", name=" + name + ", price=" + price
                + ", date=" + date + ", stock=" + stock + "]";
    }
}
