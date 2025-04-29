package yarnwrap.client.render.block.entity;
public class TrialSpawnerBlockEntityRenderer { public net.minecraft.client.render.block.entity.TrialSpawnerBlockEntityRenderer wrapperContained; public TrialSpawnerBlockEntityRenderer(net.minecraft.client.render.block.entity.TrialSpawnerBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.entityRenderDispatcher); }
// public void entityRenderDispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value) { wrapperContained.entityRenderDispatcher = value.wrapperContained; }
// public static yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(net.minecraft.client.render.block.entity.TrialSpawnerBlockEntityRenderer.entityRenderDispatcher); }
// public static void entityRenderDispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value, ) { net.minecraft.client.render.block.entity.TrialSpawnerBlockEntityRenderer.entityRenderDispatcher = value.wrapperContained; }

// public TrialSpawnerBlockEntityRenderer(Object context) { this.wrapperContained = new net.minecraft.client.render.block.entity.TrialSpawnerBlockEntityRenderer(context); }

}