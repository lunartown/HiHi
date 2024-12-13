package {{package_name}}.application;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@RequiredArgsConstructor
@Service
public class {{project_name_camel_upper_case}}Service {
    @Value("${schedule.run}")
    private String scheduleRun;

    private boolean isNotRunnable() {
        return !"true".equals(scheduleRun);
    }

    public void executeBatch() {
        System.out.println("Batch executed at: " + LocalDateTime.now());
    }
}
