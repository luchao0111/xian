package info.xiancloud.plugins.yy.log;

import info.xiancloud.core.*;
import info.xiancloud.core.message.UnitRequest;
import info.xiancloud.core.message.UnitResponse;
import info.xiancloud.core.test.TestGroup;
import info.xiancloud.core.util.LOG;

/**
 * @author happyyangyuan
 */
public class TestLogNullUnit implements Unit {
    @Override
    public String getName() {
        return "testLogNull";
    }

    @Override
    public UnitMeta getMeta() {
        return UnitMeta.create().setDocApi(false);
    }

    @Override
    public Input getInput() {
        return null;
    }

    @Override
    public void execute(UnitRequest msg, Handler<UnitResponse> handler) {
        long start = System.nanoTime();
        while (System.nanoTime() - start < 2 * 1000000L) {
            LOG.info(null);
        }
        handler.handle(UnitResponse.createSuccess());
    }

    @Override
    public Group getGroup() {
        return TestGroup.singleton;
    }
}
