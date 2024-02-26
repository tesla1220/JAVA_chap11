package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표 : extends 키워드를 이용해 특정 타입만 사용하도록 범위 제한 */

        /* 필기
        *   제네릭 클래스 작성 시 extends 키워드를 사용해 특정 타입만 사용하도록 제한 걸 수 있음
        *   토끼의 후손(subclass)이거나 토끼인 경우에만 타입으로 사용 가능 */


//        RabbitFarm<Animal> farm = new RabbitFarm<Animal>();    <= 안됨. Animal은 토끼의 super class이기 때문.
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<Mammal>();   <= 역시 안됨. Mammal 역시 토끼의 super class임.
//        RabbitFarm<Snake> farm3 = new RabbitFarm<Snake>();

        /* 필기 - 토끼 타입이거나 토끼 타입의 Subclass만 가능 */
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkBunny> farm6 = new RabbitFarm<>();

        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry();

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkBunny());
        farm6.getAnimal().cry();





    }
}
