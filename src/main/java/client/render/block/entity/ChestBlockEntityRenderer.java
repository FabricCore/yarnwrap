package yarnwrap.client.render.block.entity;
public class ChestBlockEntityRenderer { public net.minecraft.client.render.block.entity.ChestBlockEntityRenderer wrapperContained; public ChestBlockEntityRenderer(net.minecraft.client.render.block.entity.ChestBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart singleChestLid() { return new yarnwrap.client.model.ModelPart(wrapperContained.singleChestLid); }
// public yarnwrap.client.model.ModelPart singleChestBase() { return new yarnwrap.client.model.ModelPart(wrapperContained.singleChestBase); }
// public yarnwrap.client.model.ModelPart singleChestLatch() { return new yarnwrap.client.model.ModelPart(wrapperContained.singleChestLatch); }
// public yarnwrap.client.model.ModelPart doubleChestLeftLid() { return new yarnwrap.client.model.ModelPart(wrapperContained.doubleChestLeftLid); }
// public yarnwrap.client.model.ModelPart doubleChestLeftBase() { return new yarnwrap.client.model.ModelPart(wrapperContained.doubleChestLeftBase); }
// public yarnwrap.client.model.ModelPart doubleChestLeftLatch() { return new yarnwrap.client.model.ModelPart(wrapperContained.doubleChestLeftLatch); }
// public yarnwrap.client.model.ModelPart doubleChestRightLid() { return new yarnwrap.client.model.ModelPart(wrapperContained.doubleChestRightLid); }
// public yarnwrap.client.model.ModelPart doubleChestRightBase() { return new yarnwrap.client.model.ModelPart(wrapperContained.doubleChestRightBase); }
// public yarnwrap.client.model.ModelPart doubleChestRightLatch() { return new yarnwrap.client.model.ModelPart(wrapperContained.doubleChestRightLatch); }
// public java.lang.String BASE() { return wrapperContained.BASE; }
// public java.lang.String LID() { return wrapperContained.LID; }
// public java.lang.String LATCH() { return wrapperContained.LATCH; }
// public boolean christmas() { return wrapperContained.christmas; }
// public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,yarnwrap.client.model.ModelPart lid,yarnwrap.client.model.ModelPart latch,yarnwrap.client.model.ModelPart base,float openFactor,int light,int overlay) { wrapperContained.render(matrices.wrapperContained,vertices.wrapperContained,lid.wrapperContained,latch.wrapperContained,base.wrapperContained,openFactor,light,overlay); }
public yarnwrap.client.model.TexturedModelData getSingleTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getSingleTexturedModelData()); }
public yarnwrap.client.model.TexturedModelData getRightDoubleTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getRightDoubleTexturedModelData()); }
public yarnwrap.client.model.TexturedModelData getLeftDoubleTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getLeftDoubleTexturedModelData()); }

}