# 1. Factory Method

## Category

Creational Pattern

## Intent

객체 생성을 위한 인터페이스를 정의하지만, 어떤 클래스의 인스턴스를 생성할 지는 서브클래스가 결정하도록 한다. 팩토리 메서드는 클래스가 인스턴스화의 책임을 서브클래스에게 위임할 수 있다.

## Also Known AsCancel changes

Virtual Constructor

## Motivation

프레임워크는 객체 간 관계를 정의하고 유지하기 위해 추상 클래스를 사용한다. 프레임워크는 종종 이러한 객체를 생성할 책임을 갖는다.

다양한 종류의 문서를 보여줄 수 있는 애플리케이션을 위한 프레임워크를 떠올려보자. *Application*, *Document*라는 두 개의 추상 클래스를 고려할 수 있다. application-specific한 구현을 위해, 이들은 subclass를 통해 실체화되어야 한다. 예를 들어, 그림판 앱을 만들기 위해 *DrawingApplication*, *DrawingDocument*라는 구체화된 클래스를 정의해야 한다. *Application* 클래스는 여러 *Document* 클래스들을 관리할 책임이 있으며, 필요에 따라 -예: 메뉴바의 Open이나 New 탭을 클릭할 경우- 이를 생성할 수도 있어야 한다.

어떤 Document subclass를 인스턴스화 할 것인지는 application-specific한 문제이다. 위의 예시와 같이, *DrawingApplication*은 *DrawingDocument* 객체를 생성해야 한다. 그러나, 추상 *Application* 클래스는 인스턴스화 할 Document subclass를 예측할 수 없다. *Application* 클래스는 새 *Document*가 ‘어느 시점에’ 생성되어야 하는지는 알 수 있지만, ‘어떤 종류의’ *Document*가 생성되어야 하는지는 알 수 없기 때문이다. 프레임워크는 클래스를 인스턴스화 해야한다. 하지만 추상 클래스만으로는 인스턴스화 할 수 없다는 딜레마에 직면하게 된다.

팩토리 메서드 패턴은 이러한 문제에 해결책을 제공한다. 어떤 종류의 Document subclass를 생성할지에 대한 정보를 캡슐화하고, 이를 프레임워크 외부로 전달한다.

![image](https://user-images.githubusercontent.com/74892010/156877622-24d03aac-3f87-4269-bd79-4ef64c579c99.png)

Fig. 1.  팩토리 메소드 패턴의 구현 예제

Fig. 1은 팩토리 메소드 패턴의 구현 예를 보여준다. *Application*, *Documentation*는 추상 클래스이며, *MyApplication*, *MyDocument*는 이들을 각각 구체화한 concrete class이다.

*Application*의 CreateDocument() 라는 추상 메서드는 *MyApplication*에서 재정의되며, *MyDocument* 객체를 생성하고 리턴하는 기능을 수행한다. CreateDocument()와 같이, 객체를 **‘manufacturing’** 할 책임을 가지는 메서드를 ‘Factory method’라 한다. 비록 *MyDocument*에 대한 정보가 없더라도, *MyApplication* 객체를 통해 *MyDocument* 객체를 생성할 수 있다.

## Applicability

아래와 같은 상황에서 사용할 수 있다.

- 생성해야만 하는 객체의 클래스 정보를 미리 알지 못하는 경우
- 생성하고자 하는 객체를 subclass에서 구체화하고 싶은 경우
- 여러 subclass 중 하나에게 객체 생성 책임을 위임함으로써, 어떤 subclass가 위임자 역할을 하는지에 대한 정보를 분류하고 싶을 경우

## Structure and Participants

![image](https://user-images.githubusercontent.com/74892010/156877679-082d0c7b-0097-4fd5-aa00-52b2e90d5b2e.png)

- *Product* (→ *Document*)
    - 팩토리 메서드가 생성한 객체의 인터페이스
- *ConcreteProduct* (→ *MyDocument*)
    - Product 인터페이스의 구현체
- *Creator* (→ *Application*)
    - *Product* 타입의 객체를 리턴하는 팩토리 메서드를 선언
    - default *ConcreteProduct* 객체를 리턴하도록 하는 default implementation이 정의될 수도 있음.
- *ConcreteCreator* (→ *MyApplication*)
    - *Creator*.FactoryMethod()를 오버라이딩하여 *ConcreteProduct*의 인스턴스를 리턴하는 메서드를 구현

## Collaborations

- 서브클래스는 적절한 *ConcreteProduct* 객체를 리턴하는 팩토리 메서드를 정의하며, *Creator* 클래스는 객체 생성을 위해 서브클래스에 의존한다.

## Consequences

팩토리 메서드는 application-specific한 클래스를 코드에 직접 바인딩할 필요가 없도록 해준다. 코드는 *Product* 인터페이스를 통해 어떠한 커스텀 *ConcreteProduct* 클래스와도 협력할 수 있다.

잠재적인 단점은, 클라이언트는 단지 특정 *ConcreteProduct* 객체를 얻기 위해서라도 *Creator*를 서브클래싱 해야한다는 것이다. 필요에 의해 *Creator*를 꼭 서브클래싱 해야만 하는 경우에야 어쩔 수 없지만, 그렇지 않다면 클라이언트는 또 다른 ‘point of evolution’을 다뤄야만 한다.

다음은 팩토리 메서드의 두가지 중요성을 설명한다.

1. **서브클래스를 위한 ‘hooks’을 제공한다.** 클래스 내부에서 팩토리 메서드로 객체를 생성하는 방법은, 객체를 직접 생성하는 방법에 비해 더욱 유연하다. 팩토리 메서드는 서브클래스에게 확장된 버전의 객체를 제공하기 위한 ‘hook’을 준다.

   다시 *Document* 예제를 보자. *Document* 클래스는 팩토리 메서드를 *createFileDialog*라고 정의하고, default *FileDialog* 객체를 생성하도록 구현할 수도 있다. 이 기능은 디스크에 저장된 문서를 열고 싶을 때 사용될 것이다. 물론 *Document* 서브클래스 또한 이 팩토리 메서드를 오버라이딩함으로써, application-specific *FileDialog* 객체를 생성하도록 정의할 수 있다. 이 경우, 팩토리 메서드는 추상적이라고 할 수 없지만, 합리적인 이유를 갖는 default implementation을 제공한다.

![image](https://user-images.githubusercontent.com/74892010/156877690-5d318239-fd5a-41fc-bf7b-84380fc9ff09.png)

   File Dialog

2. **같은 계층화 레벨에 놓인 클래스를 연결해준다.** 앞서, 팩토리 메서드가 Creator에 의해서만 호출되는 예제만을 살펴보았다. 하지만 꼭 그래야 할 이유는 없다. 특히 평행한 클래스 계층 구조에서, 클라이언트가 팩토리 메서드를 호출하는 것이 유용할 수 있다.

   평행한 클래스 계층은 클래스가 자신의 책임을 다른 클래스에게 위임할 때 발생한다. 마우스를 통해 늘리기, 회전, 이동 등이 가능한 그래픽 이미지를 떠올려보자. 이러한 인터랙션을 구현하는 것은 쉽지 않다. 일정 시간마다 이미지의 상태를 저장하거나 업데이트해야 할 수도 있다. 이러한 상태 정보는 조작이 일어나는 동안에만 필요하기 때문에, *Figure* 객체는 이를 관리할 책임이 없다. 게다가, 서로 다른 *Figure*들은 사용자 조작에 대해 서로 다른 행동을 할 수도 있다. 예를 들어, *LineFigure*를 잡아당기는 조작을 수행하면, line은 화면의 끝에서 끝으로 늘어지는 행동을 할 수 있다. 반면, *TextFigure*를 잡아당기는 것은 글자 간격이 늘어나도록 변화할 수도 있다.

   이러한 제약으로, 인터랙션을 구현하고 manipulation-specific한 상태를 추적하기 위해 *Manipulator* 객체를 따로 분리해 사용하는 것이 낫다. 개별 *Figure*는 특정 인터랙션을 핸들링하기 위해 서로 다른 *Manipulator* 서브클래스를 사용할 것이다. 그 결과, *Manipulator* 클래스 계층은 *Figure* 클래스 계층과 평행하게 놓여진다.

![image](https://user-images.githubusercontent.com/74892010/156877730-92217fa3-4e70-4583-951d-285004deffa1.png)


   Parallel class hierarchies

   Figure 클래스는 CreateManipulator 팩토리 메서드를 제공해 클라이언트가 Figure에 대응하는 Manipulator를 생성하도록 도와준다. Figure 서브클래스는 Manipulator 서브클래스 인스턴스를 리턴하도록 오버라이딩한다. 혹은, Figure 클래스는 CreateManipulator 메서드가 default Manipulator 인스턴스를 생성하게끔 구현할 수도 있다. 이 경우, Figure 서브클래스는 간단하게 default Manipulator를 상속받는다. 이렇게 하면 대응하는 Manipulator 클래스는 불필요하며, 부분적으로 평행한 계층 구조가 된다.

   팩토리 메서드가 어떻게 두 클래스 계층 구조를 연결하는지에 주목하라. 이는 어떤 클래스가 함께 속해있는지에 대한 정보를 구분한다.

- *Design Patterns: Elements of Reusable Object-Oriented Software, pp.107-116*
