package yarnwrap.util.profiling.jfr;
public class FlightProfiler { public net.minecraft.util.profiling.jfr.FlightProfiler wrapperContained; public FlightProfiler(net.minecraft.util.profiling.jfr.FlightProfiler wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.profiling.jfr.FlightProfiler INSTANCE() { return new yarnwrap.util.profiling.jfr.FlightProfiler(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.util.profiling.jfr.FlightProfiler value) { wrapperContained.INSTANCE = value.wrapperContained; }
public java.nio.file.Path stop() { return wrapperContained.stop(); }
public boolean start(yarnwrap.util.profiling.jfr.InstanceType instanceType) { return wrapperContained.start(instanceType.wrapperContained); }
public boolean isProfiling() { return wrapperContained.isProfiling(); }
public void onTick(float tickTime) { wrapperContained.onTick(tickTime); }
public yarnwrap.util.function.Finishable startChunkGenerationProfiling(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.registry.RegistryKey world,java.lang.String targetStatus) { return new yarnwrap.util.function.Finishable(wrapperContained.startChunkGenerationProfiling(chunkPos.wrapperContained,world.wrapperContained,targetStatus)); }
public void onPacketReceived(yarnwrap.network.NetworkPhase state,yarnwrap.network.packet.PacketType type,java.net.SocketAddress remoteAddress,int bytes) { wrapperContained.onPacketReceived(state.wrapperContained,type.wrapperContained,remoteAddress,bytes); }
public void onPacketSent(yarnwrap.network.NetworkPhase state,yarnwrap.network.packet.PacketType type,java.net.SocketAddress remoteAddress,int bytes) { wrapperContained.onPacketSent(state.wrapperContained,type.wrapperContained,remoteAddress,bytes); }
public boolean isAvailable() { return wrapperContained.isAvailable(); }
public yarnwrap.util.function.Finishable startWorldLoadProfiling() { return new yarnwrap.util.function.Finishable(wrapperContained.startWorldLoadProfiling()); }
public void onChunkRegionRead(yarnwrap.world.storage.StorageKey key,yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.world.storage.ChunkCompressionFormat format,int bytes) { wrapperContained.onChunkRegionRead(key.wrapperContained,chunkPos.wrapperContained,format.wrapperContained,bytes); }
public void onChunkRegionWrite(yarnwrap.world.storage.StorageKey key,yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.world.storage.ChunkCompressionFormat format,int bytes) { wrapperContained.onChunkRegionWrite(key.wrapperContained,chunkPos.wrapperContained,format.wrapperContained,bytes); }

}