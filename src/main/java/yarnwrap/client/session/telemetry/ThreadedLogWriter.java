package yarnwrap.client.session.telemetry;
public class ThreadedLogWriter { public net.minecraft.client.session.telemetry.ThreadedLogWriter wrapperContained; public ThreadedLogWriter(net.minecraft.client.session.telemetry.ThreadedLogWriter wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.session.telemetry.ThreadedLogWriter.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.session.telemetry.ThreadedLogWriter.LOGGER = value; }

// public yarnwrap.util.logging.LogWriter writer() { return new yarnwrap.util.logging.LogWriter(wrapperContained.writer); }
// public void writer(yarnwrap.util.logging.LogWriter value) { wrapperContained.writer = value.wrapperContained; }
// public static yarnwrap.util.logging.LogWriter writer() { return new yarnwrap.util.logging.LogWriter(net.minecraft.client.session.telemetry.ThreadedLogWriter.writer); }
// public static void writer(yarnwrap.util.logging.LogWriter value, ) { net.minecraft.client.session.telemetry.ThreadedLogWriter.writer = value.wrapperContained; }

// public yarnwrap.util.thread.SimpleConsecutiveExecutor executor() { return new yarnwrap.util.thread.SimpleConsecutiveExecutor(wrapperContained.executor); }
// public void executor(yarnwrap.util.thread.SimpleConsecutiveExecutor value) { wrapperContained.executor = value.wrapperContained; }
// public static yarnwrap.util.thread.SimpleConsecutiveExecutor executor() { return new yarnwrap.util.thread.SimpleConsecutiveExecutor(net.minecraft.client.session.telemetry.ThreadedLogWriter.executor); }
// public static void executor(yarnwrap.util.thread.SimpleConsecutiveExecutor value, ) { net.minecraft.client.session.telemetry.ThreadedLogWriter.executor = value.wrapperContained; }

public ThreadedLogWriter(java.nio.channels.FileChannel channel,java.util.concurrent.Executor executor) { this.wrapperContained = new net.minecraft.client.session.telemetry.ThreadedLogWriter(channel,executor); }
public yarnwrap.client.session.telemetry.TelemetryLogger getLogger() { return new yarnwrap.client.session.telemetry.TelemetryLogger(wrapperContained.getLogger()); }
// public static yarnwrap.client.session.telemetry.TelemetryLogger getLogger() { return new yarnwrap.client.session.telemetry.TelemetryLogger(net.minecraft.client.session.telemetry.ThreadedLogWriter.getLogger()); }
// public void method_47714(yarnwrap.client.session.telemetry.SentTelemetryEvent event) { wrapperContained.method_47714(event.wrapperContained); }
// public static void method_47714(yarnwrap.client.session.telemetry.SentTelemetryEvent event, ) { net.minecraft.client.session.telemetry.ThreadedLogWriter.method_47714(event.wrapperContained); }

}