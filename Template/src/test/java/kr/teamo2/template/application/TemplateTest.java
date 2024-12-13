package {{package_name}}.application;

import {{package_name}}.batch.function.BatchFunction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class {{project_name_camel_upper_case}}Test {
    @Autowired
    private BatchFunction batchFunction;

    @Test
    void testBatch() {
        batchFunction.apply(new Object());
    }
}
