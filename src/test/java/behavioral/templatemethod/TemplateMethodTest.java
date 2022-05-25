package behavioral.templatemethod;

import behavioral.templatemethod.abstracts.FileProcessor;
import behavioral.templatemethod.abstracts.FileProcessorTemplateCallback;
import behavioral.templatemethod.concretes.LineMultiplyProcessor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TemplateMethodTest {

    @Test
    @DisplayName("템플릿 메서드로 파일의 모든 수 합을 구하는 예")
    void templateMethodTest() {

        // given
        FileProcessor fileProcessor = new LineMultiplyProcessor("src/main/java/behavioral/templatemethod/number.txt");
        // when
        int result = fileProcessor.process();
        // then
        assertThat(result).isEqualTo(120);
    }

    @Test
    @DisplayName("템플릿 콜백을 람다로 정의해 파일의 모든 수 중 가장 큰 값을 구하는 예")
    void templateCallbackTest() {
        // given
        FileProcessorTemplateCallback templateCallback = new FileProcessorTemplateCallback("src/main/java/behavioral/templatemethod/number.txt");
        // when
        int result = templateCallback.process((num1, num2) -> Math.max(num1, num2));
        System.out.println("process = " + result);
        // then
        assertThat(result).isEqualTo(5);
    }

}
