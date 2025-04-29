package yarnwrap.data.client;
public class Models { public net.minecraft.data.client.Models wrapperContained; public Models(net.minecraft.data.client.Models wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.client.Model PARTICLE() { return new yarnwrap.data.client.Model(wrapperContained.PARTICLE); }
// public void PARTICLE(yarnwrap.data.client.Model value) { wrapperContained.PARTICLE = value.wrapperContained; }
public static yarnwrap.data.client.Model PARTICLE() { return new yarnwrap.data.client.Model(net.minecraft.data.client.Models.PARTICLE); }
// public static void PARTICLE(yarnwrap.data.client.Model value, ) { net.minecraft.data.client.Models.PARTICLE = value.wrapperContained; }

// public net.minecraft.data.client.Model[] STEM_GROWTH_STAGES() { return wrapperContained.STEM_GROWTH_STAGES; }
// public void STEM_GROWTH_STAGES(net.minecraft.data.client.Model[] value) { wrapperContained.STEM_GROWTH_STAGES = value; }
public static net.minecraft.data.client.Model[] STEM_GROWTH_STAGES() { return net.minecraft.data.client.Models.STEM_GROWTH_STAGES; }
// public static void STEM_GROWTH_STAGES(net.minecraft.data.client.Model[] value, ) { net.minecraft.data.client.Models.STEM_GROWTH_STAGES = value; }

// public yarnwrap.data.client.Model GENERATED_TWO_LAYERS() { return new yarnwrap.data.client.Model(wrapperContained.GENERATED_TWO_LAYERS); }
// public void GENERATED_TWO_LAYERS(yarnwrap.data.client.Model value) { wrapperContained.GENERATED_TWO_LAYERS = value.wrapperContained; }
public static yarnwrap.data.client.Model GENERATED_TWO_LAYERS() { return new yarnwrap.data.client.Model(net.minecraft.data.client.Models.GENERATED_TWO_LAYERS); }
// public static void GENERATED_TWO_LAYERS(yarnwrap.data.client.Model value, ) { net.minecraft.data.client.Models.GENERATED_TWO_LAYERS = value.wrapperContained; }

// public yarnwrap.data.client.Model GENERATED_THREE_LAYERS() { return new yarnwrap.data.client.Model(wrapperContained.GENERATED_THREE_LAYERS); }
// public void GENERATED_THREE_LAYERS(yarnwrap.data.client.Model value) { wrapperContained.GENERATED_THREE_LAYERS = value.wrapperContained; }
public static yarnwrap.data.client.Model GENERATED_THREE_LAYERS() { return new yarnwrap.data.client.Model(net.minecraft.data.client.Models.GENERATED_THREE_LAYERS); }
// public static void GENERATED_THREE_LAYERS(yarnwrap.data.client.Model value, ) { net.minecraft.data.client.Models.GENERATED_THREE_LAYERS = value.wrapperContained; }

// public yarnwrap.data.client.Model TEMPLATE_POTTED_FLOWERING_AZALEA_BUSH() { return new yarnwrap.data.client.Model(wrapperContained.TEMPLATE_POTTED_FLOWERING_AZALEA_BUSH); }
// public void TEMPLATE_POTTED_FLOWERING_AZALEA_BUSH(yarnwrap.data.client.Model value) { wrapperContained.TEMPLATE_POTTED_FLOWERING_AZALEA_BUSH = value.wrapperContained; }
public static yarnwrap.data.client.Model TEMPLATE_POTTED_FLOWERING_AZALEA_BUSH() { return new yarnwrap.data.client.Model(net.minecraft.data.client.Models.TEMPLATE_POTTED_FLOWERING_AZALEA_BUSH); }
// public static void TEMPLATE_POTTED_FLOWERING_AZALEA_BUSH(yarnwrap.data.client.Model value, ) { net.minecraft.data.client.Models.TEMPLATE_POTTED_FLOWERING_AZALEA_BUSH = value.wrapperContained; }

// public yarnwrap.data.client.Model block(java.lang.String parent,java.lang.String variant,net.minecraft.data.client.TextureKey[] requiredTextureKeys) { return new yarnwrap.data.client.Model(wrapperContained.block(parent,variant,requiredTextureKeys)); }
// public static yarnwrap.data.client.Model block(java.lang.String parent,java.lang.String variant,net.minecraft.data.client.TextureKey[] requiredTextureKeys, ) { return new yarnwrap.data.client.Model(net.minecraft.data.client.Models.block(parent,variant,requiredTextureKeys)); }
// public yarnwrap.data.client.Model block(java.lang.String parent,net.minecraft.data.client.TextureKey[] requiredTextureKeys) { return new yarnwrap.data.client.Model(wrapperContained.block(parent,requiredTextureKeys)); }
// public static yarnwrap.data.client.Model block(java.lang.String parent,net.minecraft.data.client.TextureKey[] requiredTextureKeys, ) { return new yarnwrap.data.client.Model(net.minecraft.data.client.Models.block(parent,requiredTextureKeys)); }
// public yarnwrap.data.client.Model make(net.minecraft.data.client.TextureKey[] requiredTextureKeys) { return new yarnwrap.data.client.Model(wrapperContained.make(requiredTextureKeys)); }
// public static yarnwrap.data.client.Model make(net.minecraft.data.client.TextureKey[] requiredTextureKeys, ) { return new yarnwrap.data.client.Model(net.minecraft.data.client.Models.make(requiredTextureKeys)); }
// public yarnwrap.data.client.Model method_25858(int stage) { return new yarnwrap.data.client.Model(wrapperContained.method_25858(stage)); }
// public static yarnwrap.data.client.Model method_25858(int stage, ) { return new yarnwrap.data.client.Model(net.minecraft.data.client.Models.method_25858(stage)); }
// public yarnwrap.data.client.Model item(java.lang.String parent,net.minecraft.data.client.TextureKey[] requiredTextureKeys) { return new yarnwrap.data.client.Model(wrapperContained.item(parent,requiredTextureKeys)); }
// public static yarnwrap.data.client.Model item(java.lang.String parent,net.minecraft.data.client.TextureKey[] requiredTextureKeys, ) { return new yarnwrap.data.client.Model(net.minecraft.data.client.Models.item(parent,requiredTextureKeys)); }

}