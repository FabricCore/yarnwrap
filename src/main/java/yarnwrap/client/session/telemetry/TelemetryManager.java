package yarnwrap.client.session.telemetry;
public class TelemetryManager { public net.minecraft.client.session.telemetry.TelemetryManager wrapperContained; public TelemetryManager(net.minecraft.client.session.telemetry.TelemetryManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.atomic.AtomicInteger NEXT_WORKER_ID() { return wrapperContained.NEXT_WORKER_ID; }
// public void NEXT_WORKER_ID(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.NEXT_WORKER_ID = value; }
// public java.util.concurrent.Executor EXECUTOR() { return wrapperContained.EXECUTOR; }
// public void EXECUTOR(java.util.concurrent.Executor value) { wrapperContained.EXECUTOR = value; }
// public com.mojang.authlib.minecraft.UserApiService userApiService() { return wrapperContained.userApiService; }
// public void userApiService(com.mojang.authlib.minecraft.UserApiService value) { wrapperContained.userApiService = value; }
// public yarnwrap.client.session.telemetry.PropertyMap propertyMap() { return new yarnwrap.client.session.telemetry.PropertyMap(wrapperContained.propertyMap); }
// public void propertyMap(yarnwrap.client.session.telemetry.PropertyMap value) { wrapperContained.propertyMap = value.wrapperContained; }
// public java.nio.file.Path logDirectory() { return wrapperContained.logDirectory; }
// public void logDirectory(java.nio.file.Path value) { wrapperContained.logDirectory = value; }
// public java.util.concurrent.CompletableFuture logManager() { return wrapperContained.logManager; }
// public void logManager(java.util.concurrent.CompletableFuture value) { wrapperContained.logManager = value; }
// public java.util.function.Supplier lazySenderSupplier() { return wrapperContained.lazySenderSupplier; }
// public void lazySenderSupplier(java.util.function.Supplier value) { wrapperContained.lazySenderSupplier = value; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
public java.nio.file.Path getLogManager() { return wrapperContained.getLogManager(); }
public yarnwrap.client.session.telemetry.WorldSession createWorldSession(boolean newWorld,java.time.Duration worldLoadTime,java.lang.String minigameName) { return new yarnwrap.client.session.telemetry.WorldSession(wrapperContained.createWorldSession(newWorld,worldLoadTime,minigameName)); }
// public yarnwrap.client.session.telemetry.TelemetrySender computeSender() { return new yarnwrap.client.session.telemetry.TelemetrySender(wrapperContained.computeSender()); }
public yarnwrap.client.session.telemetry.TelemetrySender getSender() { return new yarnwrap.client.session.telemetry.TelemetrySender(wrapperContained.getSender()); }

}