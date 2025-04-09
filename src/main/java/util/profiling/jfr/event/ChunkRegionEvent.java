package yarnwrap.util.profiling.jfr.event;
public class ChunkRegionEvent { public net.minecraft.util.profiling.jfr.event.ChunkRegionEvent wrapperContained; public ChunkRegionEvent(net.minecraft.util.profiling.jfr.event.ChunkRegionEvent wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String worldId() { return wrapperContained.worldId; }

}