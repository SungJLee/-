import java.util.Random;
 
public class Bus {
    private int card_coin=0;
    public boolean exit=true;
    //이미 충전되어있는 금액 셋팅하는 메서드
    public Bus(){
        //이미 충전되어있는 금액 랜덤함수로 구현 1000~10000원
        int cointemp=0;
        cointemp=(int)((Math.random()*1000)+1)*10;
        if(cointemp>=1000){
            card_coin=cointemp;
        }
    }
    //잔액확인
    public void Bus_coin_ok(){
        System.out.println("현재 잔액은"+this.card_coin+"원 입니다");
    }
    //종료
    public boolean Bus_charge_exit(String ex){
        if(ex.equals("Y")){
            this.exit=false;
        }
        return this.exit;
    }
    
    //사용자가 버스카드 요금을 금액을 입력하여 충전한다
    public int Bus_charge(int card_coin){
        //단 충전금액은 카드잔액이 최대50000원까지 충전이 가능함
            this.card_coin += card_coin;
        if(this.card_coin<=500000){
            System.out.println("고객님의 충전후의 잔액은"+this.card_coin+"원 입니다");
        }else{
            System.out.println("죄송합니다 충전가능금액을 초과하였습니다, 잔액이 50만원 까지만 충전가능합니다");
            this.card_coin = this.card_coin-card_coin;
        }
        return this.card_coin;
    }
 
}