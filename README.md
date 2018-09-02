# SukkiriRPG
## SukkiriRPG の作成理由

* スッキリわかるJava入門第2版読了後、本当に理解しているか確認したかった。

## 仕様
  * 登場人物
    *勇者（Hero）
    *剣士(Warrior) ... 味方
    *賢者(General) ... 味方
    *魔王(Devil)   ... 敵
  
  * 標準入力によって勇者、剣士、賢者の名前を入力
  
  * 行動パターンは生きているもの(HPが０でないもの)のみ行える。
  
  * 勇者のHPが0になった場合、ゲーム終了する。
  
  * 魔王のHPが0になった場合、ゲーム終了する。
  
  * 登場人物の特徴
    
    * 勇者(HP：100, 攻撃力：30)
    * 剣士(HP：150, 攻撃力：30)
    * 賢者(HP：200, 攻撃力：50)
    * 魔王(HP：500, 攻撃力：50)
  
  * 行動パターン(勇者、剣士、賢者)
  
       * 攻撃
          一斉に攻撃をする。　(HPが0でないものが行う。)
          攻撃をし、魔王を倒した場合はゲームを終了する。

       * 防御
          魔王からの攻撃を半減させることができる。
          魔王が攻撃して来なかった場合は、表記をする。

       * 寝る
          勇者、剣士、賢者の体力を全回復する。
      
      
   * 行動パターン(魔王)
   
      * 攻撃
        勇者、剣士、賢者に攻撃する。
        HPが0出ないものには攻撃をしない。
        勇者を攻撃し、HPを0にした場合はゲームを終了する。

      * 防御
        勇者、剣士、賢者たちの攻撃を半減させる。

   *  アクション終了後、勇者、剣士、賢者のHPを可視化する。
   
   * オブジェクト指向を意識し、コードを実装する。
   
## 振り返り(反省点)

* オブジェクト指向の理解が乏しい。
(改善) 入門書の読み直し(スッキリわかるJava入門)

* 行動パターンを選択の仕方自体がスマートでない。
（改善） コマンドライン引数など多用する。

* 何のファイルから手をつければ良いかわからない。
(改善)　情報収集する。　先輩方から。

これからもっといっぱいコードを書いて勉強重ねよう。
