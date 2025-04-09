package yarnwrap.client.option;
public class ParticlesMode { public net.minecraft.client.option.ParticlesMode wrapperContained; public ParticlesMode(net.minecraft.client.option.ParticlesMode wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public int id() { return wrapperContained.id; }
// public java.lang.String translationKey() { return wrapperContained.translationKey; }
public yarnwrap.client.option.ParticlesMode byId(int id) { return new yarnwrap.client.option.ParticlesMode(wrapperContained.byId(id)); }

}