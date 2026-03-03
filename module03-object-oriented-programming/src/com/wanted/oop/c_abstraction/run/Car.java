package com.wanted.oop.c_abstraction.run;

/**
 * comment, 카레이서가 하는 명령 == (카레이서가 수신할 수 있는 메세지는 해야 할 일과 동일하다.)
 * 1. 시동을 걸어라.
 * 2. 엑셀을 밟아라.
 * 3. 브레이크를 밟아라.
 * 4. 시동을 꺼라.
 *
 * comment, 자동차 할 일 == (자동차가 수신할 수 있는 메세지는 자동차가 해야할 일과 동일하다.)
 * 1. 시동을 걸어라.
 * 2. 앞으로 가라
 * 3. 멈춰라.
 * 4. 시동을 꺼라.
 */

public class Car {

    /* 시동을 켜거나 끄거나, 앞으로 가거나 멈추거나 하는 행위는
    * 시동이 걸려있는 지 상태를 확인한 후 행동해야된다.
    *
     */

    private boolean isOn; // 시동 on / off 여부
    private int speed; // 자동차의 속력

    public void startUp() {

        if (isOn) {
            System.out.println("이미 시동이 걸려있습니다!");
        } else {
            this.isOn = true;
            System.out.println("시동 걸기 완료! 출발 준비 OK.");
        }
    }

    public void go() {
        if (isOn) {
            System.out.println("차가 출발합니다~~~ ");
            this.speed += 10;
            System.out.println("현재 차의 속력은 : " + this.speed + "(km/h)입니다!");
            if (this.speed >= 100) {
                System.out.println("으아아ㅏ 다 꼴아박아 범퍼카 범퍼카");
            }
        } else {
            System.out.println("시동이 꺼져있습니다. 시동을 켜주세요.");
        }
    }

    public void stop() {

        if (isOn) {

            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("차를 멈춥니다.");
            } else {
                System.out.println("차는 이미 멈춰있습니다.");
            }

        } else {
            System.out.println("시동이 꺼져있습니다. 시동을 켜주세요.");
        }
    }

    public void turnOff() {
        if (isOn) {
            if (this.speed == 0) {
                this.isOn = false;
                System.out.println("시동을 끕니다. 다시 운행하려면 시동을 켜주세요.");
            } else {
                System.out.println("차가 아직 달리고 있습니다. 장지 후 시동을 꺼주세요.");
            }
        } else {
            System.out.println("시동이 꺼져있습니다. 시동을 켜주세요.");
        }
    }
}
