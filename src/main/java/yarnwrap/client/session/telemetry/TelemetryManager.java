package yarnwrap.client.session.telemetry;
public class TelemetryManager { public net.minecraft.client.session.telemetry.TelemetryManager wrapperContained; public TelemetryManager(net.minecraft.client.session.telemetry.TelemetryManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.atomic.AtomicInteger NEXT_WORKER_ID() { return wrapperContained.NEXT_WORKER_ID; }
// public void NEXT_WORKER_ID(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.NEXT_WORKER_ID = value; }
// public static java.util.concurrent.atomic.AtomicInteger NEXT_WORKER_ID() { return net.minecraft.client.session.telemetry.TelemetryManager.NEXT_WORKER_ID; }
// public static void NEXT_WORKER_ID(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.client.session.telemetry.TelemetryManager.NEXT_WORKER_ID = value; }

// public java.util.concurrent.Executor EXECUTOR() { return wrapperContained.EXECUTOR; }
// public void EXECUTOR(java.util.concurrent.Executor value) { wrapperContained.EXECUTOR = value; }
// public static java.util.concurrent.Executor EXECUTOR() { return net.minecraft.client.session.telemetry.TelemetryManager.EXECUTOR; }
// public static void EXECUTOR(java.util.concurrent.Executor value, ) { net.minecraft.client.session.telemetry.TelemetryManager.EXECUTOR = value; }

// public com.mojang.authlib.minecraft.UserApiService userApiService() { return wrapperContained.userApiService; }
// public void userApiService(com.mojang.authlib.minecraft.UserApiService value) { wrapperContained.userApiService = value; }
// public static com.mojang.authlib.minecraft.UserApiService userApiService() { return net.minecraft.client.session.telemetry.TelemetryManager.userApiService; }
// public static void userApiService(com.mojang.authlib.minecraft.UserApiService value, ) { net.minecraft.client.session.telemetry.TelemetryManager.userApiService = value; }

// public yarnwrap.client.session.telemetry.PropertyMap propertyMap() { return new yarnwrap.client.session.telemetry.PropertyMap(wrapperContained.propertyMap); }
// public void propertyMap(yarnwrap.client.session.telemetry.PropertyMap value) { wrapperContained.propertyMap = value.wrapperContained; }
// public static yarnwrap.client.session.telemetry.PropertyMap propertyMap() { return new yarnwrap.client.session.telemetry.PropertyMap(net.minecraft.client.session.telemetry.TelemetryManager.propertyMap); }
// public static void propertyMap(yarnwrap.client.session.telemetry.PropertyMap value, ) { net.minecraft.client.session.telemetry.TelemetryManager.propertyMap = value.wrapperContained; }

// public java.nio.file.Path logDirectory() { return wrapperContained.logDirectory; }
// public void logDirectory(java.nio.file.Path value) { wrapperContained.logDirectory = value; }
// public static java.nio.file.Path logDirectory() { return net.minecraft.client.session.telemetry.TelemetryManager.logDirectory; }
// public static void logDirectory(java.nio.file.Path value, ) { net.minecraft.client.session.telemetry.TelemetryManager.logDirectory = value; }

// public java.util.concurrent.CompletableFuture logManager() { return wrapperContained.logManager; }
// public void logManager(java.util.concurrent.CompletableFuture value) { wrapperContained.logManager = value; }
// public static java.util.concurrent.CompletableFuture logManager() { return net.minecraft.client.session.telemetry.TelemetryManager.logManager; }
// public static void logManager(java.util.concurrent.CompletableFuture value, ) { net.minecraft.client.session.telemetry.TelemetryManager.logManager = value; }

// public java.util.function.Supplier lazySenderSupplier() { return wrapperContained.lazySenderSupplier; }
// public void lazySenderSupplier(java.util.function.Supplier value) { wrapperContained.lazySenderSupplier = value; }
// public static java.util.function.Supplier lazySenderSupplier() { return net.minecraft.client.session.telemetry.TelemetryManager.lazySenderSupplier; }
// public static void lazySenderSupplier(java.util.function.Supplier value, ) { net.minecraft.client.session.telemetry.TelemetryManager.lazySenderSupplier = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.session.telemetry.TelemetryManager.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.session.telemetry.TelemetryManager.client = value.wrapperContained; }

public TelemetryManager(yarnwrap.client.MinecraftClient client,com.mojang.authlib.minecraft.UserApiService userApiService,yarnwrap.client.session.Session session) { this.wrapperContained = new net.minecraft.client.session.telemetry.TelemetryManager(client.wrapperContained,userApiService,session.wrapperContained); }
// public java.lang.Thread method_38731(java.lang.Runnable runnable) { return wrapperContained.method_38731(runnable); }
// public static java.lang.Thread method_38731(java.lang.Runnable runnable, ) { return net.minecraft.client.session.telemetry.TelemetryManager.method_38731(runnable); }
public java.nio.file.Path getLogManager() { return wrapperContained.getLogManager(); }
// public static java.nio.file.Path getLogManager() { return net.minecraft.client.session.telemetry.TelemetryManager.getLogManager(); }
// public void method_47702(yarnwrap.client.session.telemetry.SentTelemetryEvent logger) { wrapperContained.method_47702(logger.wrapperContained); }
// public static void method_47702(yarnwrap.client.session.telemetry.SentTelemetryEvent logger, ) { net.minecraft.client.session.telemetry.TelemetryManager.method_47702(logger.wrapperContained); }
// public void method_47703(Object clientId) { wrapperContained.method_47703(clientId); }
// public static void method_47703(Object clientId, ) { net.minecraft.client.session.telemetry.TelemetryManager.method_47703(clientId); }
// public void method_47704(java.util.Optional manager) { wrapperContained.method_47704(manager); }
// public static void method_47704(java.util.Optional manager, ) { net.minecraft.client.session.telemetry.TelemetryManager.method_47704(manager); }
// public void method_47705(java.util.concurrent.CompletableFuture future,com.mojang.authlib.minecraft.TelemetrySession session,yarnwrap.client.session.telemetry.TelemetryEventType eventType,java.util.function.Consumer adder) { wrapperContained.method_47705(future,session,eventType.wrapperContained,adder); }
// public static void method_47705(java.util.concurrent.CompletableFuture future,com.mojang.authlib.minecraft.TelemetrySession session,yarnwrap.client.session.telemetry.TelemetryEventType eventType,java.util.function.Consumer adder, ) { net.minecraft.client.session.telemetry.TelemetryManager.method_47705(future,session,eventType.wrapperContained,adder); }
public yarnwrap.client.session.telemetry.WorldSession createWorldSession(boolean newWorld,java.time.Duration worldLoadTime,java.lang.String minigameName) { return new yarnwrap.client.session.telemetry.WorldSession(wrapperContained.createWorldSession(newWorld,worldLoadTime,minigameName)); }
// public static yarnwrap.client.session.telemetry.WorldSession createWorldSession(boolean newWorld,java.time.Duration worldLoadTime,java.lang.String minigameName, ) { return new yarnwrap.client.session.telemetry.WorldSession(net.minecraft.client.session.telemetry.TelemetryManager.createWorldSession(newWorld,worldLoadTime,minigameName)); }
// public yarnwrap.client.session.telemetry.TelemetrySender computeSender() { return new yarnwrap.client.session.telemetry.TelemetrySender(wrapperContained.computeSender()); }
// public static yarnwrap.client.session.telemetry.TelemetrySender computeSender() { return new yarnwrap.client.session.telemetry.TelemetrySender(net.minecraft.client.session.telemetry.TelemetryManager.computeSender()); }
// public void method_47708(Object xuid) { wrapperContained.method_47708(xuid); }
// public static void method_47708(Object xuid, ) { net.minecraft.client.session.telemetry.TelemetryManager.method_47708(xuid); }
// public java.util.concurrent.CompletionStage method_47709(java.util.Optional manager) { return wrapperContained.method_47709(manager); }
// public static java.util.concurrent.CompletionStage method_47709(java.util.Optional manager, ) { return net.minecraft.client.session.telemetry.TelemetryManager.method_47709(manager); }
public yarnwrap.client.session.telemetry.TelemetrySender getSender() { return new yarnwrap.client.session.telemetry.TelemetrySender(wrapperContained.getSender()); }
// public static yarnwrap.client.session.telemetry.TelemetrySender getSender() { return new yarnwrap.client.session.telemetry.TelemetrySender(net.minecraft.client.session.telemetry.TelemetryManager.getSender()); }

}