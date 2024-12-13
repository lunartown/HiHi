package {{package_name}}.batch.function;

import {{package_name}}.application.{{project_name_camel_upper_case}}Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.function.Function;

@RequiredArgsConstructor
@Component
public class BatchFunction implements Function<Object, Object> {
    private final {{project_name_camel_upper_case}}Service {{project_name_camel_lower_case}}Service;

    @Override
    public Object apply(Object o) {
        {{project_name_camel_lower_case}}Service.executeBatch();
        return o;
    }
}
