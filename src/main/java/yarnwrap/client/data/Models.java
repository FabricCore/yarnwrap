package yarnwrap.client.data;
public class Models { public net.minecraft.client.data.Models wrapperContained; public Models(net.minecraft.client.data.Models wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.data.Model PARTICLE() { return new yarnwrap.client.data.Model(wrapperContained.PARTICLE); }
// public void PARTICLE(yarnwrap.client.data.Model value) { wrapperContained.PARTICLE = value.wrapperContained; }
public static yarnwrap.client.data.Model PARTICLE() { return new yarnwrap.client.data.Model(net.minecraft.client.data.Models.PARTICLE); }
// public static void PARTICLE(yarnwrap.client.data.Model value, ) { net.minecraft.client.data.Models.PARTICLE = value.wrapperContained; }

// public net.minecraft.client.data.Model[] STEM_GROWTH_STAGES() { return wrapperContained.STEM_GROWTH_STAGES; }
// public void STEM_GROWTH_STAGES(net.minecraft.client.data.Model[] value) { wrapperContained.STEM_GROWTH_STAGES = value; }
public static net.minecraft.client.data.Model[] STEM_GROWTH_STAGES() { return net.minecraft.client.data.Models.STEM_GROWTH_STAGES; }
// public static void STEM_GROWTH_STAGES(net.minecraft.client.data.Model[] value, ) { net.minecraft.client.data.Models.STEM_GROWTH_STAGES = value; }

// public yarnwrap.client.data.Model GENERATED_TWO_LAYERS() { return new yarnwrap.client.data.Model(wrapperContained.GENERATED_TWO_LAYERS); }
// public void GENERATED_TWO_LAYERS(yarnwrap.client.data.Model value) { wrapperContained.GENERATED_TWO_LAYERS = value.wrapperContained; }
public static yarnwrap.client.data.Model GENERATED_TWO_LAYERS() { return new yarnwrap.client.data.Model(net.minecraft.client.data.Models.GENERATED_TWO_LAYERS); }
// public static void GENERATED_TWO_LAYERS(yarnwrap.client.data.Model value, ) { net.minecraft.client.data.Models.GENERATED_TWO_LAYERS = value.wrapperContained; }

// public yarnwrap.client.data.Model GENERATED_THREE_LAYERS() { return new yarnwrap.client.data.Model(wrapperContained.GENERATED_THREE_LAYERS); }
// public void GENERATED_THREE_LAYERS(yarnwrap.client.data.Model value) { wrapperContained.GENERATED_THREE_LAYERS = value.wrapperContained; }
public static yarnwrap.client.data.Model GENERATED_THREE_LAYERS() { return new yarnwrap.client.data.Model(net.minecraft.client.data.Models.GENERATED_THREE_LAYERS); }
// public static void GENERATED_THREE_LAYERS(yarnwrap.client.data.Model value, ) { net.minecraft.client.data.Models.GENERATED_THREE_LAYERS = value.wrapperContained; }

// public yarnwrap.client.data.Model TEMPLATE_POTTED_FLOWERING_AZALEA_BUSH() { return new yarnwrap.client.data.Model(wrapperContained.TEMPLATE_POTTED_FLOWERING_AZALEA_BUSH); }
// public void TEMPLATE_POTTED_FLOWERING_AZALEA_BUSH(yarnwrap.client.data.Model value) { wrapperContained.TEMPLATE_POTTED_FLOWERING_AZALEA_BUSH = value.wrapperContained; }
public static yarnwrap.client.data.Model TEMPLATE_POTTED_FLOWERING_AZALEA_BUSH() { return new yarnwrap.client.data.Model(net.minecraft.client.data.Models.TEMPLATE_POTTED_FLOWERING_AZALEA_BUSH); }
// public static void TEMPLATE_POTTED_FLOWERING_AZALEA_BUSH(yarnwrap.client.data.Model value, ) { net.minecraft.client.data.Models.TEMPLATE_POTTED_FLOWERING_AZALEA_BUSH = value.wrapperContained; }

// public yarnwrap.client.data.Model block(java.lang.String parent,java.lang.String variant,net.minecraft.client.data.TextureKey[] requiredTextureKeys) { return new yarnwrap.client.data.Model(wrapperContained.block(parent,variant,requiredTextureKeys)); }
// public static yarnwrap.client.data.Model block(java.lang.String parent,java.lang.String variant,net.minecraft.client.data.TextureKey[] requiredTextureKeys, ) { return new yarnwrap.client.data.Model(net.minecraft.client.data.Models.block(parent,variant,requiredTextureKeys)); }
// public yarnwrap.client.data.Model block(java.lang.String parent,net.minecraft.client.data.TextureKey[] requiredTextureKeys) { return new yarnwrap.client.data.Model(wrapperContained.block(parent,requiredTextureKeys)); }
// public static yarnwrap.client.data.Model block(java.lang.String parent,net.minecraft.client.data.TextureKey[] requiredTextureKeys, ) { return new yarnwrap.client.data.Model(net.minecraft.client.data.Models.block(parent,requiredTextureKeys)); }
// public yarnwrap.client.data.Model make(net.minecraft.client.data.TextureKey[] requiredTextureKeys) { return new yarnwrap.client.data.Model(wrapperContained.make(requiredTextureKeys)); }
// public static yarnwrap.client.data.Model make(net.minecraft.client.data.TextureKey[] requiredTextureKeys, ) { return new yarnwrap.client.data.Model(net.minecraft.client.data.Models.make(requiredTextureKeys)); }
// public yarnwrap.client.data.Model method_25858(int stage) { return new yarnwrap.client.data.Model(wrapperContained.method_25858(stage)); }
// public static yarnwrap.client.data.Model method_25858(int stage, ) { return new yarnwrap.client.data.Model(net.minecraft.client.data.Models.method_25858(stage)); }
// public yarnwrap.client.data.Model item(java.lang.String parent,net.minecraft.client.data.TextureKey[] requiredTextureKeys) { return new yarnwrap.client.data.Model(wrapperContained.item(parent,requiredTextureKeys)); }
// public static yarnwrap.client.data.Model item(java.lang.String parent,net.minecraft.client.data.TextureKey[] requiredTextureKeys, ) { return new yarnwrap.client.data.Model(net.minecraft.client.data.Models.item(parent,requiredTextureKeys)); }
// public yarnwrap.client.data.Model openBundle(java.lang.String parent,java.lang.String variant,net.minecraft.client.data.TextureKey[] requiredTextureKeys) { return new yarnwrap.client.data.Model(wrapperContained.openBundle(parent,variant,requiredTextureKeys)); }
// public static yarnwrap.client.data.Model openBundle(java.lang.String parent,java.lang.String variant,net.minecraft.client.data.TextureKey[] requiredTextureKeys, ) { return new yarnwrap.client.data.Model(net.minecraft.client.data.Models.openBundle(parent,variant,requiredTextureKeys)); }

}