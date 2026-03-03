package com.wanted.oop.b_encapsulation.problem3;

public class Monster {

    /* 몬스터의 이름, 몬스터의 체력 */
//    String name;
//    int hp;

    String kinds;
    int hp;

    /** 필드에 접근해서 값을 초기화 하게 되면
     * problem2 에서 확인한 것처럼 변수명을 바꾸었을 때
     * Application에서도 Error가 발생한다.
     * 그 문제를 해결하기 위해 hp를 설정할 때 method를 사용했던 것 처럼
     * name 관련 메서드도 만들 것이다.
     */

    // hp를 설정하는 메서드
    // 매개변수 전달 받은 hp 값을 변경해주는 메서드
    // 양수인 경우에는 전달 받은 값으로 세팅
    // 음수인 경우에는 0으로 변경
    public void setHp(int hp) {
        if (hp > 0) {
            System.out.println("정상적인 값 입니다. 몬스터 체력을 " + hp + "로 설정합니다.");
            /* this : 인스턴스가 생성 될 때, 자신의 주소를 저장하는 레퍼런스 변수이다.
            * 지역변수와 전역변수의 이름이 같을 때, 지역변수를 우선적으로 접근하기 때문이다.
            * 전역변수에 값을 대입하기 위해서는 this. 를 명시해야된다.
            * */
            this.hp = hp;
        } else {
            System.out.println("오류 발생 hp를 0으로 세팅합니다.");
            this.hp = 0;
        }
    }

    public void setName(String name) {
        this.kinds = name;
    }

    public String getInfo() {
        return "몬스터의 이름은" + this.kinds + "이며, 체력은 " + this.hp + "입니다.";
    }
}
