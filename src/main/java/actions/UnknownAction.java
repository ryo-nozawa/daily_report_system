package actions;

import java.io.IOException;

import javax.servlet.ServletException;

import constants.ForwardConst;

//共通エラー画面「お探しのページはは見つかりませんでした。」の表示
public class UnknownAction extends ActionBase {

    //共通ページを表示する
    @Override
    public void process() throws ServletException, IOException{
        //引数で指定されたエラー表示のjspの呼び出しを行います
        forward(ForwardConst.FW_ERR_UNKNOWN);
    }

}
