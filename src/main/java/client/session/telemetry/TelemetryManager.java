package yarnwrap.client.session.telemetry;
public class TelemetryManager { public net.minecraft.client.session.telemetry.TelemetryManager wrapperContained; public TelemetryManager(net.minecraft.client.session.telemetry.TelemetryManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.atomic.AtomicInteger NEXT_WORKER_ID() { return wrapperContained.NEXT_WORKER_ID; }
// public java.util.concurrent.Executor EXECUTOR() { return wrapperContained.EXECUTOR; }
// public com.mojang.authlib.minecraft.UserApiService userApiService() { return wrapperContained.userApiService; }
// public yarnwrap.client.session.telemetry.PropertyMap propertyMap() { return new yarnwrap.client.session.telemetry.PropertyMap(wrapperContained.propertyMap); }
// public java.nio.file.Path logDirectory() { return wrapperContained.logDirectory; }
// public java.util.concurrent.CompletableFuture logManager() { return wrapperContained.logManager; }
// public java.util.function.Supplier lazySenderSupplier() { return wrapperContained.lazySenderSupplier; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
public java.nio.file.Path getLogManager() { return wrapperContained.getLogManager(); }
public yarnwrap.client.session.telemetry.WorldSession createWorldSession(boolean newWorld,java.time.Duration worldLoadTime,java.lang.String minigameName) { return new yarnwrap.client.session.telemetry.WorldSession(wrapperContained.createWorldSession(newWorld,worldLoadTime,minigameName)); }
// public yarnwrap.client.session.telemetry.TelemetrySender computeSender() { return new yarnwrap.client.session.telemetry.TelemetrySender(wrapperContained.computeSender()); }
public yarnwrap.client.session.telemetry.TelemetrySender getSender() { return new yarnwrap.client.session.telemetry.TelemetrySender(wrapperContained.getSender()); }

}