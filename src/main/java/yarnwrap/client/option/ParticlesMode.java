package yarnwrap.client.option;
public class ParticlesMode { public net.minecraft.client.option.ParticlesMode wrapperContained; public ParticlesMode(net.minecraft.client.option.ParticlesMode wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public void BY_ID(java.util.function.IntFunction value) { wrapperContained.BY_ID = value; }
// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public java.lang.String translationKey() { return wrapperContained.translationKey; }
// public void translationKey(java.lang.String value) { wrapperContained.translationKey = value; }
// // public ParticlesMode(java.lang.String id,int translationKey) { this.wrapperContained = new net.minecraft.client.option.ParticlesMode(id,translationKey); }
public yarnwrap.client.option.ParticlesMode byId(int id) { return new yarnwrap.client.option.ParticlesMode(wrapperContained.byId(id)); }

}