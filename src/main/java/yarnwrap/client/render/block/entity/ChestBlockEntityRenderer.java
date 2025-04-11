package yarnwrap.client.render.block.entity;
public class ChestBlockEntityRenderer { public net.minecraft.client.render.block.entity.ChestBlockEntityRenderer wrapperContained; public ChestBlockEntityRenderer(net.minecraft.client.render.block.entity.ChestBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart singleChestLid() { return new yarnwrap.client.model.ModelPart(wrapperContained.singleChestLid); }
// public void singleChestLid(yarnwrap.client.model.ModelPart value) { wrapperContained.singleChestLid = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart singleChestBase() { return new yarnwrap.client.model.ModelPart(wrapperContained.singleChestBase); }
// public void singleChestBase(yarnwrap.client.model.ModelPart value) { wrapperContained.singleChestBase = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart singleChestLatch() { return new yarnwrap.client.model.ModelPart(wrapperContained.singleChestLatch); }
// public void singleChestLatch(yarnwrap.client.model.ModelPart value) { wrapperContained.singleChestLatch = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart doubleChestLeftLid() { return new yarnwrap.client.model.ModelPart(wrapperContained.doubleChestLeftLid); }
// public void doubleChestLeftLid(yarnwrap.client.model.ModelPart value) { wrapperContained.doubleChestLeftLid = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart doubleChestLeftBase() { return new yarnwrap.client.model.ModelPart(wrapperContained.doubleChestLeftBase); }
// public void doubleChestLeftBase(yarnwrap.client.model.ModelPart value) { wrapperContained.doubleChestLeftBase = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart doubleChestLeftLatch() { return new yarnwrap.client.model.ModelPart(wrapperContained.doubleChestLeftLatch); }
// public void doubleChestLeftLatch(yarnwrap.client.model.ModelPart value) { wrapperContained.doubleChestLeftLatch = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart doubleChestRightLid() { return new yarnwrap.client.model.ModelPart(wrapperContained.doubleChestRightLid); }
// public void doubleChestRightLid(yarnwrap.client.model.ModelPart value) { wrapperContained.doubleChestRightLid = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart doubleChestRightBase() { return new yarnwrap.client.model.ModelPart(wrapperContained.doubleChestRightBase); }
// public void doubleChestRightBase(yarnwrap.client.model.ModelPart value) { wrapperContained.doubleChestRightBase = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart doubleChestRightLatch() { return new yarnwrap.client.model.ModelPart(wrapperContained.doubleChestRightLatch); }
// public void doubleChestRightLatch(yarnwrap.client.model.ModelPart value) { wrapperContained.doubleChestRightLatch = value.wrapperContained; }
// public java.lang.String BASE() { return wrapperContained.BASE; }
// public void BASE(java.lang.String value) { wrapperContained.BASE = value; }
// public java.lang.String LID() { return wrapperContained.LID; }
// public void LID(java.lang.String value) { wrapperContained.LID = value; }
// public java.lang.String LATCH() { return wrapperContained.LATCH; }
// public void LATCH(java.lang.String value) { wrapperContained.LATCH = value; }
// public boolean christmas() { return wrapperContained.christmas; }
// public void christmas(boolean value) { wrapperContained.christmas = value; }
// public ChestBlockEntityRenderer(Object ctx) { this.wrapperContained = new net.minecraft.client.render.block.entity.ChestBlockEntityRenderer(ctx); }
// public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,yarnwrap.client.model.ModelPart lid,yarnwrap.client.model.ModelPart latch,yarnwrap.client.model.ModelPart base,float openFactor,int light,int overlay) { wrapperContained.render(matrices.wrapperContained,vertices.wrapperContained,lid.wrapperContained,latch.wrapperContained,base.wrapperContained,openFactor,light,overlay); }
public yarnwrap.client.model.TexturedModelData getSingleTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getSingleTexturedModelData()); }
public yarnwrap.client.model.TexturedModelData getRightDoubleTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getRightDoubleTexturedModelData()); }
public yarnwrap.client.model.TexturedModelData getLeftDoubleTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getLeftDoubleTexturedModelData()); }

}