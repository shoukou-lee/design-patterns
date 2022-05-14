# Factory Method

## Category

Creational Pattern

## Intent

객체 생성을 위한 인터페이스를 정의하지만, 어떤 클래스의 인스턴스를 생성할 지는 서브클래스가 결정하도록 한다. 팩토리 메서드는 클래스가 인스턴스화의 책임을 서브클래스에게 위임할 수 있다.

## Also Known As

Virtual Constructor

## Motivation

프레임워크는 객체 간 관계를 정의하고 유지하기 위해 추상 클래스를 사용한다. 프레임워크는 종종 이러한 객체를 생성할 책임을 갖는다.

다양한 종류의 문서를 보여줄 수 있는 애플리케이션을 위한 프레임워크를 떠올려보자. *Application*, *Document*라는 두 개의 추상 클래스(abstract class)를 고려할 수 있다. application-specific한 구현을 위해, 이들은 서브클래스를 통해 실체화되어야 한다. 예를 들어, 그림판 앱을 만들기 위해 *DrawingApplication*, *DrawingDocument*라는 구체 클래스(concrete class)를 정의해야 한다. *Application* 클래스는 여러 *Document* 클래스들을 관리할 책임이 있으며, 필요에 따라 -예: 메뉴바의 Open이나 New 탭을 클릭할 경우- 이를 생성할 수도 있어야 한다. 

어떤 *ConcreteDocument* 서브클래스를 인스턴스화 할 것인지는 application-specific한 문제이다. 위의 예시와 같이, *DrawingApplication*은 *DrawingDocument* 객체를 생성해야 한다. 그러나, 추상 *Application* 클래스는 인스턴스화 할 *ConcreteDocument* 서브클래스를 미리 알지 못한다. *Application* 클래스는 새 *Document*가 ‘어느 시점에’ 생성되어야 하는지는 알 수 있지만, ‘어떤 종류의’ *Document*가 생성되어야 하는지는 알 수 없기 때문이다. 프레임워크는 클래스를 인스턴스화 해야한다. 하지만 추상 클래스만으로는 인스턴스화 할 수 없다는 딜레마에 직면하게 된다.

팩토리 메서드 패턴은 이러한 문제에 해결책을 제공한다. 어떤 종류의 *ConcreteDocument* 서브클래스를 생성할지에 대한 정보를 캡슐화하고, 이를 프레임워크 외부로 전달한다.

![image](https://user-images.githubusercontent.com/74892010/158022097-62106ca6-79c8-4ed0-aedc-c7672a1f3081.png)

위 그림은 팩토리 메소드 패턴의 구현 예를 보여준다. *Application*, *Documentation*는 추상 클래스(abstract class)이며, *MyApplication*, *MyDocument*는 이를 실제로 구현한 구체 클래스(concrete class)이다. 

*Application*의 CreateDocument() 라는 추상 메서드는 *MyApplication*에서 재정의되며, *MyDocument* 객체를 생성하고 리턴하는 기능을 수행한다. CreateDocument()와 같이, 객체를 ‘manufacturing’ 할 책임을 가지는 메서드를 ‘Factory method’라 한다. 비록 *MyDocument*에 대한 정보가 없더라도, *MyApplication* 객체를 통해 *MyDocument* 객체를 생성할 수 있다.

## Applicability

아래와 같은 상황에서 사용할 수 있다.

- 생성해야만 하는 객체의 클래스 정보를 미리 알지 못하는 경우
- 생성하고자 하는 객체를 서브클래스에서 구체화하고 싶은 경우
- 여러 서브클래스 중 하나에게 객체 생성 책임을 위임하며, 이때 어떤 서브클래스가 위임받는지에 대한 정보를 숨기고 싶은 경우

## Structure and Participants

![image](https://user-images.githubusercontent.com/74892010/158022100-8ef1b1a4-51e4-4a1e-9af9-9bdf337cd939.png)

- *Product* (→ *Document*)
    - 팩토리 메서드가 생성한 객체의 인터페이스를 정의한다.
- *ConcreteProduct* (→ *MyDocument*)
    - *Product*의 인터페이스를 구현한다.
- *Creator* (→ *Application*)
    - *Product* 타입의 객체를 리턴하는 팩토리 메서드를 선언한다.
    - 디폴트 *ConcreteProduct* 객체를 리턴하도록 하는 디폴트 구현이 정의될 수도 있다.
    - *Product* 객체를 만들기 위해 Factory method를 호출한다.
- *ConcreteCreator* (→ *MyApplication*)
    - *Creator*.FactoryMethod()를 오버라이딩하여 *ConcreteProduct* 객체를 리턴하는 메서드를 구현한다.

## Collaborations

*Creator*는 적절한 *ConcreteProduct* 객체를 리턴하는 팩토리 메서드를 정의하기 위해 *ConcreteCreator*에 의존한다.

## Consequences

팩토리 메서드는 application-specific한 클래스를 코드에 직접 바인딩할 필요가 없도록 해준다. 코드는 *Product* 인터페이스를 통해 어떠한 커스텀 *ConcreteProduct* 클래스와도 협력할 수 있다.

잠재적인 단점은, 클라이언트는 단지 특정 *ConcreteProduct* 객체를 얻기 위해서라도 *Creator*를 서브클래싱 해야한다는 것이다. 필요에 의해 *Creator*를 꼭 서브클래싱 해야만 하는 경우에야 어쩔 수 없지만, 그렇지 않다면 클라이언트는 또 다른 ‘point of evolution’을 다뤄야만 한다.

다음은 팩토리 메서드의 두가지 장점을 설명한다.

1. *Provides hooks for subclasses.*
    
    클래스 내부에서 팩토리 메서드로 객체를 생성하는 방법은 객체를 직접 생성하는 방법에 비해 더욱 유연하다. 팩토리 메서드는 객체의 확장 버전을 제공하기 위한 *hook*을 서브클래스에게 제공한다. (hook method: 슈퍼 클래스에서 디폴트 기능을 정의해두거나 비워뒀다가, 서브클래스에서 선택적으로 오버라이드할 수 있도록 만들어 둔 메서드 - _토비의 스프링 3.1 vol.1, pp.69_)
    
    다시 *Document* 예제를 보자. *Document* 클래스는 createFileDialog()라는 팩토리 메서드를 정의하고, 디폴트 *FileDialog* 객체를 생성하도록 구현할 수도 있다. 이 기능은 디스크에 저장된 문서를 열고 싶을 때 사용될 것이다. 물론 *ConcreteDocument* 서브클래스 또한 이 팩토리 메서드를 오버라이딩함으로써, application-specific *FileDialog* 객체를 생성하도록 정의할 수 있다. 이 경우, 팩토리 메서드는 추상적이라고 할 수 없지만, 합리적인 이유를 갖는 디폴트 구현을 제공한다.

    ![image](https://user-images.githubusercontent.com/74892010/158022104-0f9df114-f0ea-475b-97f0-1df5347a17d3.png)
    
2. *Connects parallel class hierarchies.*
    
    앞서, 팩토리 메서드가 *Creator*에 의해서만 호출되는 예제만을 살펴보았다. 하지만 꼭 그래야 할 이유는 없다. 특히 평행한 클래스 계층 구조에서, 클라이언트가 직접 팩토리 메서드를 호출하는 것이 유용할 수 있다.
    
    평행한 클래스 계층은 클래스가 자신의 책임을 다른 클래스에게 위임할 때 발생한다. 마우스를 통해 늘리기, 회전, 이동 등이 가능한 그래픽 이미지를 떠올려보자. 이러한 인터랙션을 구현하는 것은 쉽지 않다. 일정 시간마다 이미지의 상태를 저장하거나 업데이트해야 할 수도 있다. 이러한 상태 정보는 조작이 일어나는 동안에만 필요하기 때문에, *Figure* 객체는 이를 관리할 책임이 없다. 게다가, 서로 다른 *Figure*들은 사용자 조작에 대해 서로 다른 행동을 할 수도 있다. 예를 들어, *LineFigure*를 잡아당기는 조작을 수행하면, line은 화면의 끝에서 끝으로 늘어나는 행동을 할 수 있다. 반면, *TextFigure*를 잡아당기는 것은 글자 간격이 늘어나도록 변화할 수도 있다. 
    
    이러한 제약으로, 인터랙션을 구현하고 manipulation-specific한 상태를 추적하려면 *Manipulator* 객체를 따로 분리해 사용하는 것이 낫다. 개별 *Figure*는 특정 인터랙션을 핸들링하기 위해 서로 다른 *ConcreteManipulator* 서브클래스를 사용할 것이다. 그 결과, *Manipulator* 클래스 계층은 *Figure* 클래스 계층과 평행하게 놓여진다.

    ![image](https://user-images.githubusercontent.com/74892010/158022110-9a11727f-520b-49e7-8f37-9816a646e900.png)
    
    *Figure* 클래스는 CreateManipulator() 팩토리 메서드를 제공해 클라이언트가 *Figure*에 대응하는 *Manipulator*를 생성하도록 도와준다. *ConcreteFigure* 서브클래스는 *ConcreteManipulator* 객체를 리턴하도록 오버라이딩한다. 혹은, Figure 클래스는 *DefaultManipulator* 인스턴스를 생성하는 CreateManipulator() 메서드를 구현할 수도 있다. 이 경우, *ConcreteFigure* 서브클래스는 간단하게 DefaultManipulator를 상속받는다. 이렇게 하면 대응하는 *Manipulator* 클래스는 불필요하며, 부분적으로 평행한 계층 구조가 된다. 
    팩토리 메서드가 어떻게 두 클래스 계층 구조를 연결하는지를 주목하라. 이는 어떤 클래스가 함께 속해있는지에 대한 정보를 숨겨준다. 
    

## Implementation

팩토리 메서드 패턴을 적용할 때, 다음의 이슈들을 고려해야 한다.

1. *Two major varieties.*
    
    첫째는, (abstract) *Creator* 클래스가 팩토리 메서드를 선언할 뿐, 구현을 제공하지 않는 버전이다. 서브클래스들이 구현을 정의할 것을 요구한다. 미리 알지 못하는 클래스의 인스턴스화라는 딜레마를 해결한다.
    또 다른 버전은 Creator가 concrete class로써 팩토리 메서드의 기본 구현을 제공하는 것이다. (Creator가 abstract class로써 팩토리 메서드의 기본 구현을 정의할 수도 있지만, 이는 덜 일반적인 방법이다.) 이러한 경우는 팩토리 메서드의 유연성에 더욱 초점을 둔 경우이다. “서브클래스가 생성되는 방법을 오버라이딩 할수 있도록 객체 생성 과정을 분리된 작업으로 수행한다"는 룰을 따른다. 이 룰은 하위 클래스의 디자이너가 필요한 경우 상위 클래스가 인스턴스화하는 개체의 클래스를 바꿀 수 있도록 한다.
2. *Parameterized factory methods.* 
    
    패턴의 또 다른 변형은 팩토리 메서드가 여러 종류의 product를 생성할 수 있게 해준다. 팩토리 메서드가 생성하는 모든 객체는 *Product* 인터페이스를 공유한다. *Document*의 예시에서는, *Application*은 여러 종류의 *Document*를 지원해야 할 것이다. CreateDocument() 메서드에 추가적인 파라미터를 넘김으로써, 생성하고자 하는 *Document*의 종류를 특정할 수 있다.
    Unidraw라는 그래픽 편집 프레임워크는 디스크에 저장된 객체를 재구성하기 위해 이러한 접근법을 사용한다. Unidraw는 argument로 클래스 식별자를 필요로 하는 *Creator* 클래스와 Create() 팩토리 메서드를 정의한다. 클래스 식별자로부터 인스턴스화 할 객체를 특정할 수 있다. Unidraw가 객체를 디스크에 저장할 때, 클래스 식별자를 먼저 write한 후, 객체의 인스턴스 변수를 write 한다. 디스크에서 객체를 다시 불러올 때는 클래스 식별자를 먼저 읽는다. 그 후 프레임워크는 클래스 식별자를 파라미터로 Create() 메서드를 호출한다. Create 메서드는 클래스 식별자에 대응하는 클래스 생성자를 룩업하며, 객체를 인스턴스화한다. 마지막으로, Create는 디스크에 있는 인스턴스 변수를 마저 읽은 후, 객체를 초기화한다.
    
    파라미터화된  팩토리 메서드는 아래와 같은 정형화된 형식이 있다. *Product*의 서브클래스인 *MyProduct*, *YourProduct*를 보여준다.
    
    ```cpp
    class Creator { 
    	public:
    		virtual Product* Create(Productld); 
    };
    
    Product* Creator::Create (Productld id) {
    	if (id == MINE) return new MyProduct;
    	if (id == YOURS) return new YourProduct;
    	// repeat for remaining products ...
    	return 0; 
    }
    ```
    
    파라미터화된 팩토리 메서드를 오버라이딩하면 *Creator*가 제공하는 *Product*의 종류를 쉽고 선택적으로 확장/수정할 수 있게 해준다. 새로운 *Product*가 필요할 때, 새로운 ID를 추가하거나 기존 ID와 연결하면 된다. 예를 들어, *MyCreator*가 *MyProduct*와 *YourProduct*를 서로 스왑하고, *TheirProduct*를 새로 추가하고 싶다면 아래 코드처럼 수정할 수 있다. 
    
    ```cpp
    Product* MyCreator::Create (Productld id) { 
    	// N.B.: switched YOURS and MINE	
    	if (id == YOURS) return new MyProduct; 
    	if (id == MINE) return new YourProduct;
    	if (id == THEIRS) return new TheirProduct;
    	return Creator::Create(id); // called if all others fail 
    }
    ```
    
    마지막 코드라인은 상위 클래스의 Create() 메서드를 호출한 것이다. *MyCreator*::Create()는 YOURS, MINE, THEIRS만을 핸들링한다. 그 외의 *Product*를 생성할 책임은 갖지 않으며, 다시 부모에게 위임하는 것을 보여준다.
    
3. *Using templates to avoid subclassing.*

    앞에서도 언급했듯, 팩토리 메서드의 잠재적인 문제점은 *Product* 객체를 생성하기 위한 서브클래스 구성을 강제한다는 점이다. C++은 *Product* 클래스를 파라미터로 받는 *Creator*의 템플릿 서브클래스를 제공함으로써 이러한 문제를 해결한다. 이러한 템플릿에서, 클라이언트는 *Product* class만을 제공하면 되며, *Creator*를 서브클래싱할 필요가 없어진다.
    
    ```cpp
    class Creator { 
    	public:
    		virtual Product* CreateProduct() = 0 ; 
    };
    
    template <class TheProduct>
    class StandardCreator: public Creator { 
    	public:
    		virtual Product* CreateProduct(); 
    };
    
    template <class TheProduct>
    Product* StandardCreator<TheProduct>::CreateProduct () 
    {
    	return new TheProduct; 
    }
    ```
    
    ```cpp
    class MyProduct : public Product { 
    	public:
    		MyProduct(); // . . .
    };
    StandardCreator<MyProduct> myCreator;
    ```
    
4. *Naming conventions.*
    
    팩토리 메서드임을 명확하게 하기 위한 네이밍 컨벤션을 사용하는 것이 좋다. 예를 들어, 매킨토시 애플리케이션 프레임워크인 MacApp은 팩토리 메서드를 정의하기 위한 추상 오퍼레이션 이름을 *Class** DoMakeClass()로 선언했다. 여기서 *Class*는 *Product*의 이름이 들어간다.

## **Related Patterns**

- 추상 팩토리는 종종 팩토리 메서드로 구현된다. 추상 팩토리 패턴의 Motivation에 언급된 예제는 팩토리 메서드 또한 보여준다.

- 팩토리 메서드는 템플릿 메서드 내에서 호출되기도 한다. Motivation의 Document 예제에서, NewDocument는 템플릿 메서드이다.

- 프로토타입은 Creator를 서브클래싱할 필요가 없지만, 보통 Product 클래스를 초기화를 요구한다. Creator는 Initialize 메서드를 사용해 객체를 초기화한다. 반면, 팩토리 메서드는 이러한 오퍼레이션을 필요로 하지 않는다.


> Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides (1994). 
*Design Patterns: Elements of Reusable Object-Oriented Software, pp.107-116*
>
