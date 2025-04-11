package yarnwrap.client.render.block.entity;
public class HangingSignBlockEntityRenderer { public net.minecraft.client.render.block.entity.HangingSignBlockEntityRenderer wrapperContained; public HangingSignBlockEntityRenderer(net.minecraft.client.render.block.entity.HangingSignBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String NORMAL_CHAINS() { return wrapperContained.NORMAL_CHAINS; }
// public void NORMAL_CHAINS(java.lang.String value) { wrapperContained.NORMAL_CHAINS = value; }
// public java.lang.String CHAIN_L1() { return wrapperContained.CHAIN_L1; }
// public void CHAIN_L1(java.lang.String value) { wrapperContained.CHAIN_L1 = value; }
// public java.lang.String CHAIN_L2() { return wrapperContained.CHAIN_L2; }
// public void CHAIN_L2(java.lang.String value) { wrapperContained.CHAIN_L2 = value; }
// public java.lang.String CHAIN_R1() { return wrapperContained.CHAIN_R1; }
// public void CHAIN_R1(java.lang.String value) { wrapperContained.CHAIN_R1 = value; }
// public java.lang.String CHAIN_R2() { return wrapperContained.CHAIN_R2; }
// public void CHAIN_R2(java.lang.String value) { wrapperContained.CHAIN_R2 = value; }
// public java.lang.String BOARD() { return wrapperContained.BOARD; }
// public void BOARD(java.lang.String value) { wrapperContained.BOARD = value; }
// public java.lang.String PLANK() { return wrapperContained.PLANK; }
// public void PLANK(java.lang.String value) { wrapperContained.PLANK = value; }
// public java.lang.String V_CHAINS() { return wrapperContained.V_CHAINS; }
// public void V_CHAINS(java.lang.String value) { wrapperContained.V_CHAINS = value; }
// public java.util.Map MODELS() { return wrapperContained.MODELS; }
// public void MODELS(java.util.Map value) { wrapperContained.MODELS = value; }
// public float MODEL_SCALE() { return wrapperContained.MODEL_SCALE; }
// public void MODEL_SCALE(float value) { wrapperContained.MODEL_SCALE = value; }
// public float TEXT_SCALE() { return wrapperContained.TEXT_SCALE; }
// public void TEXT_SCALE(float value) { wrapperContained.TEXT_SCALE = value; }
// public yarnwrap.util.math.Vec3d TEXT_OFFSET() { return new yarnwrap.util.math.Vec3d(wrapperContained.TEXT_OFFSET); }
// public void TEXT_OFFSET(yarnwrap.util.math.Vec3d value) { wrapperContained.TEXT_OFFSET = value.wrapperContained; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}