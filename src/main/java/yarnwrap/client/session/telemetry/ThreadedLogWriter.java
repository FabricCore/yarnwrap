package yarnwrap.client.session.telemetry;
public class ThreadedLogWriter { public net.minecraft.client.session.telemetry.ThreadedLogWriter wrapperContained; public ThreadedLogWriter(net.minecraft.client.session.telemetry.ThreadedLogWriter wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.util.logging.LogWriter writer() { return new yarnwrap.util.logging.LogWriter(wrapperContained.writer); }
// public void writer(yarnwrap.util.logging.LogWriter value) { wrapperContained.writer = value.wrapperContained; }
// public yarnwrap.util.thread.TaskExecutor executor() { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.executor); }
// public void executor(yarnwrap.util.thread.TaskExecutor value) { wrapperContained.executor = value.wrapperContained; }
public yarnwrap.client.session.telemetry.TelemetryLogger getLogger() { return new yarnwrap.client.session.telemetry.TelemetryLogger(wrapperContained.getLogger()); }

}