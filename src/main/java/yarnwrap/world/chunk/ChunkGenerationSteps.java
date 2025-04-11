package yarnwrap.world.chunk;
public class ChunkGenerationSteps { public net.minecraft.world.chunk.ChunkGenerationSteps wrapperContained; public ChunkGenerationSteps(net.minecraft.world.chunk.ChunkGenerationSteps wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.chunk.ChunkGenerationSteps GENERATION() { return new yarnwrap.world.chunk.ChunkGenerationSteps(wrapperContained.GENERATION); }
// public void GENERATION(yarnwrap.world.chunk.ChunkGenerationSteps value) { wrapperContained.GENERATION = value.wrapperContained; }
public yarnwrap.world.chunk.ChunkGenerationSteps LOADING() { return new yarnwrap.world.chunk.ChunkGenerationSteps(wrapperContained.LOADING); }
// public void LOADING(yarnwrap.world.chunk.ChunkGenerationSteps value) { wrapperContained.LOADING = value.wrapperContained; }
public yarnwrap.world.chunk.ChunkGenerationStep get(yarnwrap.world.chunk.ChunkStatus status) { return new yarnwrap.world.chunk.ChunkGenerationStep(wrapperContained.get(status.wrapperContained)); }
// public Object method_60519(Object builder) { return wrapperContained.method_60519(builder); }
// public Object method_60520(Object builder) { return wrapperContained.method_60520(builder); }
// public Object method_60521(Object builder) { return wrapperContained.method_60521(builder); }
// public Object method_60522(Object builder) { return wrapperContained.method_60522(builder); }
// public Object method_60523(Object builder) { return wrapperContained.method_60523(builder); }
// public Object method_60524(Object builder) { return wrapperContained.method_60524(builder); }
// public Object method_60525(Object builder) { return wrapperContained.method_60525(builder); }
// public Object method_60526(Object builder) { return wrapperContained.method_60526(builder); }
// public Object method_60527(Object builder) { return wrapperContained.method_60527(builder); }
// public Object method_60528(Object builder) { return wrapperContained.method_60528(builder); }
// public Object method_60529(Object builder) { return wrapperContained.method_60529(builder); }
// public Object method_60530(Object builder) { return wrapperContained.method_60530(builder); }
// public Object method_60531(Object builder) { return wrapperContained.method_60531(builder); }
// public Object method_60532(Object builder) { return wrapperContained.method_60532(builder); }
// public Object method_60533(Object builder) { return wrapperContained.method_60533(builder); }
// public Object method_60534(Object builder) { return wrapperContained.method_60534(builder); }
// public Object method_60535(Object builder) { return wrapperContained.method_60535(builder); }
// public Object method_60536(Object builder) { return wrapperContained.method_60536(builder); }
// public Object method_60537(Object builder) { return wrapperContained.method_60537(builder); }
// public Object method_60538(Object builder) { return wrapperContained.method_60538(builder); }
// public Object method_60539(Object builder) { return wrapperContained.method_60539(builder); }
// public Object method_60540(Object builder) { return wrapperContained.method_60540(builder); }
// public Object method_60541(Object builder) { return wrapperContained.method_60541(builder); }
// public Object method_60542(Object builder) { return wrapperContained.method_60542(builder); }

}