package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표 : 와일드카드에 대한 이해 */
        /* 필기
         *   와일드카드(WildCard)
         *   제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
         *   그 객체의 타입 변수를 제한할 수 있음
         *   <?> : 제한 없음 (anyType)
         *   <? extends Type> : 와일드카드 상한제한(Type과 Type의 후손을 이용해 생성한 인스턴스만 가능)
         *   <? super Type> : 와일드카드 하한제한(Type과 Type의 부모를 이용해 생성한 인스턴스만 가능)
         *    */

        WildCardFarm wildCardFarm = new WildCardFarm();

//    wildCardFarm.anyType(new RabbitFarm<Mammal> new mammal()));
//        wildCardFarm.anyType((new RabbitFarm<Reptile>(new Reptile())));


        /* 어떠한 농장이던 상관없이 매개변수로 사용 가능 */
        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkBunny>(new DrunkBunny()));


        /* Bunny 이거나 Bunny의 SubClass들만 매개변수로 사용 가능 */
//        wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkBunny>(new DrunkBunny()));


        /* Bunny 이거나 Bunny의 부모들만 매개변수로 사용 가능 */
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkBunny>(new DrunkBunny())); <= super로 제한 걸어둬서 Bunny의 subclass인 DrunkBunny는 사용 불가




    }



}
