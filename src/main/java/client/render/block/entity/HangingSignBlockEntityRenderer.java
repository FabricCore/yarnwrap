package yarnwrap.client.render.block.entity;
public class HangingSignBlockEntityRenderer { public net.minecraft.client.render.block.entity.HangingSignBlockEntityRenderer wrapperContained; public HangingSignBlockEntityRenderer(net.minecraft.client.render.block.entity.HangingSignBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String NORMAL_CHAINS() { return wrapperContained.NORMAL_CHAINS; }
// public java.lang.String CHAIN_L1() { return wrapperContained.CHAIN_L1; }
// public java.lang.String CHAIN_L2() { return wrapperContained.CHAIN_L2; }
// public java.lang.String CHAIN_R1() { return wrapperContained.CHAIN_R1; }
// public java.lang.String CHAIN_R2() { return wrapperContained.CHAIN_R2; }
// public java.lang.String BOARD() { return wrapperContained.BOARD; }
// public java.lang.String PLANK() { return wrapperContained.PLANK; }
// public java.lang.String V_CHAINS() { return wrapperContained.V_CHAINS; }
// public java.util.Map MODELS() { return wrapperContained.MODELS; }
// public float MODEL_SCALE() { return wrapperContained.MODEL_SCALE; }
// public float TEXT_SCALE() { return wrapperContained.TEXT_SCALE; }
// public yarnwrap.util.math.Vec3d TEXT_OFFSET() { return new yarnwrap.util.math.Vec3d(wrapperContained.TEXT_OFFSET); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}