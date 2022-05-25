## Summary (WIP)
- 알고리즘의 절차가 대부분 유사하고 작은 차이만 있을 경우 사용하기 좋음
- 공통된 로직을 abstract class의 hook method로 정의
- 차이점이 발생하는 스텝들을 abstract method로 분리 (Method extraction)
- Concrete class에서 스텝을 Override -> 로직 변경 필요시 새로운 concrete class 추가, 클라이언트와 abstract class의 코드는 유지 (OCP)
- Template Callback
  - Override해야 할 스텝이 하나일 때 유용한 패턴 
  - 템플릿은 스텝 로직을 처리하는 인터페이스를 DI받은 후, 스텝 처리 시 인터페이스에게 delegate
  - 클라이언트는 템플릿을 정의하며 구체적인 스텝 동작을 람다로 처리할 수 있음
  - 스텝이 여러개여도 되지만, 람다가 아니라 @Override 하는 메서드를 그때그때 재정의해줘야 하므로 차라리 concrete class를 따로 두는게 낫다

- Pros
  - 중복 코드를 템플릿화 하여 재사용
- Cons
  - LSP 위반 가능성 (자식은 부모의 동작을 똑같이 할수 있어야 함) -> 자식이 템플릿을 수정하지 못하도록 템플릿을 final로 둬서 해결할 수 있음

- 사용 예
  - 자바
    - HttpServlet.doSomething()
  - 스프링
    - WebSecurityConfiguererAdapter.init()
    - JdbcTemplate.execute(), query()
    - RestTemplate.exchange()