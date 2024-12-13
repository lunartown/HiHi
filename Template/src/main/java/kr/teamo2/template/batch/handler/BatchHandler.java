package {{package_name}}.batch.handler;

import org.springframework.cloud.function.adapter.aws.FunctionInvoker;

@SuppressWarnings("unused")
public class BatchHandler extends FunctionInvoker {
    private static final String BATCH_FUNCTION = "batchFunction";

    public BatchHandler() {
        super(BATCH_FUNCTION);
    }
}
