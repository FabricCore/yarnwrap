package yarnwrap.client.session.telemetry;
public class TelemetryLogManager { public net.minecraft.client.session.telemetry.TelemetryLogManager wrapperContained; public TelemetryLogManager(net.minecraft.client.session.telemetry.TelemetryLogManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.lang.String FILE_EXTENSION() { return wrapperContained.FILE_EXTENSION; }
// public int RETENTION_DAYS() { return wrapperContained.RETENTION_DAYS; }
// public yarnwrap.util.logging.LogFileCompressor compressor() { return new yarnwrap.util.logging.LogFileCompressor(wrapperContained.compressor); }
// public java.util.concurrent.CompletableFuture writer() { return wrapperContained.writer; }
public java.util.concurrent.CompletableFuture getLogger() { return wrapperContained.getLogger(); }
public java.util.concurrent.CompletableFuture create(java.nio.file.Path directory) { return wrapperContained.create(directory); }

}