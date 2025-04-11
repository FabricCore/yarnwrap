package yarnwrap.client.render.block.entity;
public class CampfireBlockEntityRenderer { public net.minecraft.client.render.block.entity.CampfireBlockEntityRenderer wrapperContained; public CampfireBlockEntityRenderer(net.minecraft.client.render.block.entity.CampfireBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public float SCALE() { return wrapperContained.SCALE; }
// public void SCALE(float value) { wrapperContained.SCALE = value; }
// public yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.itemRenderer); }
// public void itemRenderer(yarnwrap.client.render.item.ItemRenderer value) { wrapperContained.itemRenderer = value.wrapperContained; }
// public CampfireBlockEntityRenderer(Object ctx) { this.wrapperContained = new net.minecraft.client.render.block.entity.CampfireBlockEntityRenderer(ctx); }

}