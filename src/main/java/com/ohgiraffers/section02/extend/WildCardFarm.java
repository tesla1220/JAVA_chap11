package com.ohgiraffers.section02.extend;

public class WildCardFarm {

    /* 필기 - 매개변수로 받는 토끼 농장을 구현할 때, 어떤 토끼든 상관 없음 */


    public void anyType(RabbitFarm<?> farm ) {

        farm.getAnimal().cry();

    }


    /* 필기 ▼ 토끼농장의 토끼는 Bunny 이거나 그의 후손(Subclass)만 가능 */
    public void extendsType(RabbitFarm<? extends Bunny> farm) {

        farm.getAnimal().cry();

    }

    /* 필기 ▼ 토끼농장의 토끼는 Bunny 이거나 그 부모 타입으로 만들어진(Super class) 토끼만 매개변수로 사용 가능 */
    public void superType(RabbitFarm<? super Bunny> farm) {

        farm.getAnimal().cry();
    }

}
