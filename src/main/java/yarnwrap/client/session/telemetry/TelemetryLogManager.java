package yarnwrap.client.session.telemetry;
public class TelemetryLogManager { public net.minecraft.client.session.telemetry.TelemetryLogManager wrapperContained; public TelemetryLogManager(net.minecraft.client.session.telemetry.TelemetryLogManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String FILE_EXTENSION() { return wrapperContained.FILE_EXTENSION; }
// public void FILE_EXTENSION(java.lang.String value) { wrapperContained.FILE_EXTENSION = value; }
// public int RETENTION_DAYS() { return wrapperContained.RETENTION_DAYS; }
// public void RETENTION_DAYS(int value) { wrapperContained.RETENTION_DAYS = value; }
// public yarnwrap.util.logging.LogFileCompressor compressor() { return new yarnwrap.util.logging.LogFileCompressor(wrapperContained.compressor); }
// public void compressor(yarnwrap.util.logging.LogFileCompressor value) { wrapperContained.compressor = value.wrapperContained; }
// public java.util.concurrent.CompletableFuture writer() { return wrapperContained.writer; }
// public void writer(java.util.concurrent.CompletableFuture value) { wrapperContained.writer = value; }
// public TelemetryLogManager(yarnwrap.util.logging.LogFileCompressor compressor) { this.wrapperContained = new net.minecraft.client.session.telemetry.TelemetryLogManager(compressor.wrapperContained); }
public java.util.concurrent.CompletableFuture getLogger() { return wrapperContained.getLogger(); }
public java.util.concurrent.CompletableFuture create(java.nio.file.Path directory) { return wrapperContained.create(directory); }
// public void method_47739(java.util.Optional writer) { wrapperContained.method_47739(writer); }
// public java.util.Optional method_47742(java.util.Optional writer) { return wrapperContained.method_47742(writer); }

}