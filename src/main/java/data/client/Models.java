package yarnwrap.data.client;
public class Models { public net.minecraft.data.client.Models wrapperContained; public Models(net.minecraft.data.client.Models wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.data.client.Model PARTICLE() { return new yarnwrap.data.client.Model(wrapperContained.PARTICLE); }
public net.minecraft.data.client.Model[] STEM_GROWTH_STAGES() { return wrapperContained.STEM_GROWTH_STAGES; }
public yarnwrap.data.client.Model GENERATED_TWO_LAYERS() { return new yarnwrap.data.client.Model(wrapperContained.GENERATED_TWO_LAYERS); }
public yarnwrap.data.client.Model GENERATED_THREE_LAYERS() { return new yarnwrap.data.client.Model(wrapperContained.GENERATED_THREE_LAYERS); }
public yarnwrap.data.client.Model TEMPLATE_POTTED_FLOWERING_AZALEA_BUSH() { return new yarnwrap.data.client.Model(wrapperContained.TEMPLATE_POTTED_FLOWERING_AZALEA_BUSH); }
// public yarnwrap.data.client.Model block(java.lang.String parent,java.lang.String variant,net.minecraft.data.client.TextureKey[] requiredTextureKeys) { return new yarnwrap.data.client.Model(wrapperContained.block(parent,variant,requiredTextureKeys)); }
// public yarnwrap.data.client.Model block(java.lang.String parent,net.minecraft.data.client.TextureKey[] requiredTextureKeys) { return new yarnwrap.data.client.Model(wrapperContained.block(parent,requiredTextureKeys)); }
// public yarnwrap.data.client.Model make(net.minecraft.data.client.TextureKey[] requiredTextureKeys) { return new yarnwrap.data.client.Model(wrapperContained.make(requiredTextureKeys)); }
// public yarnwrap.data.client.Model item(java.lang.String parent,net.minecraft.data.client.TextureKey[] requiredTextureKeys) { return new yarnwrap.data.client.Model(wrapperContained.item(parent,requiredTextureKeys)); }

}