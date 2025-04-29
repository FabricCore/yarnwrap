package yarnwrap.client.session.telemetry;
public class TelemetryLogManager { public net.minecraft.client.session.telemetry.TelemetryLogManager wrapperContained; public TelemetryLogManager(net.minecraft.client.session.telemetry.TelemetryLogManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.session.telemetry.TelemetryLogManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.session.telemetry.TelemetryLogManager.LOGGER = value; }

// public java.lang.String FILE_EXTENSION() { return wrapperContained.FILE_EXTENSION; }
// public void FILE_EXTENSION(java.lang.String value) { wrapperContained.FILE_EXTENSION = value; }
// public static java.lang.String FILE_EXTENSION() { return net.minecraft.client.session.telemetry.TelemetryLogManager.FILE_EXTENSION; }
// public static void FILE_EXTENSION(java.lang.String value, ) { net.minecraft.client.session.telemetry.TelemetryLogManager.FILE_EXTENSION = value; }

// public int RETENTION_DAYS() { return wrapperContained.RETENTION_DAYS; }
// public void RETENTION_DAYS(int value) { wrapperContained.RETENTION_DAYS = value; }
// public static int RETENTION_DAYS() { return net.minecraft.client.session.telemetry.TelemetryLogManager.RETENTION_DAYS; }
// public static void RETENTION_DAYS(int value, ) { net.minecraft.client.session.telemetry.TelemetryLogManager.RETENTION_DAYS = value; }

// public yarnwrap.util.logging.LogFileCompressor compressor() { return new yarnwrap.util.logging.LogFileCompressor(wrapperContained.compressor); }
// public void compressor(yarnwrap.util.logging.LogFileCompressor value) { wrapperContained.compressor = value.wrapperContained; }
// public static yarnwrap.util.logging.LogFileCompressor compressor() { return new yarnwrap.util.logging.LogFileCompressor(net.minecraft.client.session.telemetry.TelemetryLogManager.compressor); }
// public static void compressor(yarnwrap.util.logging.LogFileCompressor value, ) { net.minecraft.client.session.telemetry.TelemetryLogManager.compressor = value.wrapperContained; }

// public java.util.concurrent.CompletableFuture writer() { return wrapperContained.writer; }
// public void writer(java.util.concurrent.CompletableFuture value) { wrapperContained.writer = value; }
// public static java.util.concurrent.CompletableFuture writer() { return net.minecraft.client.session.telemetry.TelemetryLogManager.writer; }
// public static void writer(java.util.concurrent.CompletableFuture value, ) { net.minecraft.client.session.telemetry.TelemetryLogManager.writer = value; }

// public TelemetryLogManager(yarnwrap.util.logging.LogFileCompressor compressor) { this.wrapperContained = new net.minecraft.client.session.telemetry.TelemetryLogManager(compressor.wrapperContained); }
public java.util.concurrent.CompletableFuture getLogger() { return wrapperContained.getLogger(); }
// public static java.util.concurrent.CompletableFuture getLogger() { return net.minecraft.client.session.telemetry.TelemetryLogManager.getLogger(); }
// public java.util.concurrent.CompletableFuture create(java.nio.file.Path directory) { return wrapperContained.create(directory); }
// public static java.util.concurrent.CompletableFuture create(java.nio.file.Path directory, ) { return net.minecraft.client.session.telemetry.TelemetryLogManager.create(directory); }
// public void method_47739(java.util.Optional writer) { wrapperContained.method_47739(writer); }
// public static void method_47739(java.util.Optional writer, ) { net.minecraft.client.session.telemetry.TelemetryLogManager.method_47739(writer); }
// public java.util.Optional method_47742(java.util.Optional writer) { return wrapperContained.method_47742(writer); }
// public static java.util.Optional method_47742(java.util.Optional writer, ) { return net.minecraft.client.session.telemetry.TelemetryLogManager.method_47742(writer); }

}