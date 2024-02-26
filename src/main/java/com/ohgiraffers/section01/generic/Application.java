package com.ohgiraffers.section01.generic;

public class Application {

    public static void main(String[] args) {



    /* 수업목표 : 제네릭(generic)에 대한 이해 */
    /* 필기
    *   제네릭 (generic)
    *   제네릭의 사전적인 의미는 일반적인 이라는 의미
    *   자바에서 제네릭이란, 데이터 타입을 일반화 한다는 의미
    *
    * 필기
    *   제네릭 => 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시 지정하는 방법
    *   컴파일하기 전에 타입 검사를 할 경우 장점
    *       1) 클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높일 수 있음 (잘못된 타입인 경우 컴파일 에러 발생)
    *       2) 반환값에 대한 타입 변환 및 타입 검사에 들어가는 코드의 생략에 가능해짐 (instanceOf 비교 및 다운캐스팅 작성 불필요)
    *
    * 필기
    *   제네릭 프로그래밍
    *   데이터 형식에 의존하지 않고 하나의 값이 여러 다른 데이터 타입들을 가질 수 있는 기술에 중점을 둬 재사용성을 높일 수 있는 프로그램 */


        GenericTest<Integer> gt1 = new GenericTest<Integer>();

        gt1.setValue(new Integer(10));
        System.out.println(gt1.getValue());
        System.out.println(gt1.getValue() instanceof Integer);

        GenericTest<String> gt2 = new GenericTest<String>();
        gt2.setValue("홍길동");
        System.out.println(gt2.getValue());
        System.out.println(gt2.getValue() instanceof String);



    }
}
